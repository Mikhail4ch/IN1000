import java.io.*;
import java.util.Scanner;

public class Legesystem {

    IndeksertListe<Pasient> pasienter = new IndeksertListe<>();
    IndeksertListe<Legemiddel> legemidler = new IndeksertListe<>();
    IndeksertListe<Lege> leger = new IndeksertListe<>();
    IndeksertListe<Resepter> resepter = new IndeksertListe<>();

    public static void main(String[] args) {
        Legesystem system = new Legesystem();
        system.lesFraFil(args[0]);
        system.hovedMeny();
    }

    void lesFraFil(String filnavn) {
        try (Scanner sc = new Scanner(new File(filnavn))) {
            String type = "pasienter";
            while (sc.hasNextLine()) {
                String linje = sc.nextLine().trim();
                if (linje.startsWith("#")) {
                    if (linje.contains("Legemidler")) type = "legemidler";
                    else if (linje.contains("Leger")) type = "leger";
                    else if (linje.contains("Resepter")) type = "resepter";
                    continue;
                }
                if (linje.isEmpty()) continue;
                String[] d = linje.split(",");
                try {
                    switch (type) {
                        case "pasienter" -> pasienter.leggTil(new Pasient(d[0], d[1]));
                        case "legemidler" -> legemidler.leggTil(
                            d[1].equals("narkotisk") ? new Narkotisk(d[0], Integer.parseInt(d[2]), Double.parseDouble(d[3]), Integer.parseInt(d[4])) :
                            d[1].equals("vanedannende") ? new Vanedannende(d[0], Integer.parseInt(d[2]), Double.parseDouble(d[3]), Integer.parseInt(d[4])) :
                            new Vanlig(d[0], Integer.parseInt(d[2]), Double.parseDouble(d[3])));
                        case "leger" -> leger.leggTil(d[1].equals("0") ? new Lege(d[0]) : new Spesialist(d[1], d[0]));
                        case "resepter" -> {
                            Legemiddel lm = legemidler.hent(Integer.parseInt(d[0]));
                            Lege lg = finnLege(d[1]);
                            Pasient p = pasienter.hent(Integer.parseInt(d[2]));
                            Resepter r = switch (d[3]) {
                                case "hvit" -> lg.skrivHvitResept(lm, p, Integer.parseInt(d[4]));
                                case "blaa" -> lg.skrivBlaaResept(lm, p, Integer.parseInt(d[4]));
                                case "militaer" -> lg.skrivMilResept(lm, p);
                                case "p" -> lg.skrivPResept(lm, p, Integer.parseInt(d[4]));
                                default -> null;
                            };
                            resepter.leggTil(r);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Feil ved linje: " + linje + " Feilmelding: " + e);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen: " + e.getMessage());
        }
    }

    Lege finnLege(String navn) {
        for (Lege l : leger) if (l.hentNavnet().equals(navn)) return l;
        return null;
    }

    void hovedMeny() {
        Scanner sc = new Scanner(System.in);
        int valg;
        do {
            System.out.println("0.Avslutt 1.Vis data 2.Statistikk 3.Legg til lege 4.Legg til legemiddel 5.Legg til pasient 6.Legg til resept 7.Bruk resept 8.Lagre");
            valg = Integer.parseInt(sc.nextLine());
            switch (valg) {
                case 1 -> skrivOversikt();
                case 2 -> skrivStatistikk();
                case 3 -> leggTilLege(sc);
                case 4 -> leggTilLegemiddel(sc);
                case 5 -> leggTilPasient(sc);
                case 6 -> leggTilResept(sc);
                case 7 -> brukResept(sc);
                case 8 -> lagreTilFil(sc);
            }
        } while (valg != 0);
    }

    void skrivOversikt() {
        for (Pasient p : pasienter) System.out.println(p);
        for (Legemiddel l : legemidler) System.out.println(l);
        for (Lege l : leger) System.out.println(l);
        for (Resepter r : resepter) System.out.println(r);
    }

    void skrivStatistikk() {
        int narkotisk = 0, vanedannende = 0;
        for (Resepter r : resepter) {
            if (r.hentLegemiddel() instanceof Narkotisk) narkotisk++;
            else if (r.hentLegemiddel() instanceof Vanedannende) vanedannende++;
        }
        System.out.println("Totalt narkotiske resepter: " + narkotisk);
        System.out.println("Totalt vanedannende resepter: " + vanedannende);
    }

    void leggTilLege(Scanner sc) {
        System.out.print("Navn på lege: ");
        String navn = sc.nextLine();
        System.out.print("Kontroll-id (0 hvis vanlig lege): ");
        String kontrollId = sc.nextLine();
        Lege nyLege = kontrollId.equals("0") ? new Lege(navn) : new Spesialist(kontrollId, navn);
        leger.leggTil(nyLege);
        System.out.println("Lege lagt til: " + nyLege);
    }

    void leggTilLegemiddel(Scanner sc) {
        try {
            System.out.print("Navn: "); String navn = sc.nextLine();
            System.out.print("Pris: "); int pris = Integer.parseInt(sc.nextLine());
            System.out.print("Virkestoff: "); double virkestoff = Double.parseDouble(sc.nextLine());

            System.out.println("Type (0=vanlig, 1=narkotisk, 2=vanedannende): ");
            int type = Integer.parseInt(sc.nextLine());

            Legemiddel lm;
            if (type == 0) lm = new Vanlig(navn, pris, virkestoff);
            else {
                System.out.print("Styrke: ");
                int styrke = Integer.parseInt(sc.nextLine());
                lm = (type == 1) ? new Narkotisk(navn, pris, virkestoff, styrke) : new Vanedannende(navn, pris, virkestoff, styrke);
            }
            legemidler.leggTil(lm);
            System.out.println("Legemiddel lagt til: " + lm);
        } catch (NumberFormatException e) { System.out.println("Ugyldig tallformat."); }
    }

    void leggTilPasient(Scanner sc) {
        System.out.print("Navn: "); String navn = sc.nextLine();
        System.out.print("Fødselsnummer: "); String fnr = sc.nextLine();
        Pasient nyPasient = new Pasient(navn, fnr);
        pasienter.leggTil(nyPasient);
        System.out.println("Pasient lagt til: " + nyPasient);
    }

    void leggTilResept(Scanner sc) {
        try {
            System.out.print("Legemiddelnavn: ");
            String legemiddelNavn = sc.nextLine();
            Legemiddel lm = null;
            for (Legemiddel l : legemidler) if (l.hentNavn().equals(legemiddelNavn)) lm = l;

            System.out.print("Lege navn: ");
            Lege lg = finnLege(sc.nextLine());

            System.out.print("Pasient ID: ");
            Pasient p = pasienter.hent(Integer.parseInt(sc.nextLine()));

            System.out.println("Type resept (0=hvit, 1=blaa, 2=militaer, 3=p): ");
            int type = Integer.parseInt(sc.nextLine());
            int reit = (type != 2) ? Integer.parseInt(sc.nextLine()) : 0;

            Resepter r = switch (type) {
                case 0 -> lg.skrivHvitResept(lm, p, reit);
                case 1 -> lg.skrivBlaaResept(lm, p, reit);
                case 2 -> lg.skrivMilResept(lm, p);
                case 3 -> lg.skrivPResept(lm, p, reit);
                default -> null;
            };
            resepter.leggTil(r);
            System.out.println("Resept lagt til: " + r);
        } catch (Exception e) { System.out.println("Kunne ikke opprette resept: " + e.getMessage()); }
    }

    void brukResept(Scanner sc) {
        System.out.print("Resept ID: ");
        int id = Integer.parseInt(sc.nextLine());
        Resepter r = resepter.hent(id);
        if (r.bruk()) System.out.println("Resept brukt, resterende reit: " + r.hentReit());
        else System.out.println("Ingen gjenstående reit.");
    }

    void lagreTilFil(Scanner sc) {
        // Implementer lagring til fil (likt som innlesingsformat)
        System.out.println("Implementasjon mangler for filskriving.");
    }
}

