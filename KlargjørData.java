/**
 * leser metadata, fordeler dataene til to grupper (smittet / ikke smittet),
 * starter tråder for å behandle filene parallelt,
 * fletter frekvenstabeller og skriver resultatene til fil.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KlargjørData {

    private static final int ANTALL_TRÅDER = 8;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Du må oppgi filstien til metadata.csv som argument.");
            return;
        }

        String filnavn = args[0];
        File metadataFil = new File(filnavn);
        String mappe = metadataFil.getParent() + "/";

        Monitor smittetMonitor = new Monitor();
        Monitor ikkeSmittetMonitor = new Monitor();
        
        ArrayList<Thread> lesetråder = new ArrayList<>();

        try (Scanner scanner = new Scanner(metadataFil)) {
            while (scanner.hasNextLine()) {
                String linje = scanner.nextLine().trim();
                if (linje.isEmpty()) {
                    continue;
                }
                // Valider og parse linje av filen
                String[] deler = linje.split(",");
                if (deler.length != 2) {
                    System.err.println("Ugyldig linje i metadata: " + linje);
                    continue;
                }
                String datafil = deler[0];
                boolean erSmittet = Boolean.parseBoolean(deler[1]);

                String path = mappe + datafil;
                Monitor valgtMonitor = erSmittet ? smittetMonitor : ikkeSmittetMonitor;

                Thread t = new Thread(new Lesetråd(path, valgtMonitor));
                lesetråder.add(t);
                t.start();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Fant ikke metadatafilen: " + filnavn);
            e.printStackTrace();
            return;
        }

        // Vent på at alle lesetråder er ferdige
        for (Thread t : lesetråder) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.err.println("Lesetråd ble avbrutt.");
            }
        }

        ArrayList<Thread> flettetråder = new ArrayList<>();

        for (int i = 0; i < ANTALL_TRÅDER; i++) {
            Thread smittet = new Thread(new Flettetråd(smittetMonitor));
            Thread ikkeSmittet = new Thread(new Flettetråd(ikkeSmittetMonitor));
            flettetråder.add(smittet);
            flettetråder.add(ikkeSmittet);
            smittet.start();
            ikkeSmittet.start();
        }

        // Vent på at alle flettetråder er ferdige
        for (Thread t : flettetråder) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.err.println("Flettetråd ble avbrutt.");
            }
        }
        // henter og lagrer sluttresultatet fra hver gruppe
        try {
            Frekvenstabell smittetResultat = smittetMonitor.taUt();
            Frekvenstabell ikkeSmittetResultat = ikkeSmittetMonitor.taUt();

            if (smittetResultat != null) {
                smittetResultat.skrivTilFil("smittet");
            } else {
                System.err.println("Ingen resultat-tabell for smittet.");
            }

            if (ikkeSmittetResultat != null) {
                ikkeSmittetResultat.skrivTilFil("ikke_smittet");
            } else {
                System.err.println("Ingen resultat-tabell for ikke smittet.");
            }

        } catch (Exception e) {
            System.err.println("Feil ved henting eller skriving av sluttresultat.");
            e.printStackTrace();
        }
        System.out.println("Klargjøring fullført. Programmet er ferdig!");
    }
}
