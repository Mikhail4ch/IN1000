// datastrukturen (en samling av frekvenstabeller) med grunnleggende metoder

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Subsekvensregister  {
    private ArrayList<Frekvenstabell> register = new ArrayList<>();
    private static final int SUBSEKVENSLENGDE = 3;

    public void settInn(Frekvenstabell f){
        register.add(f);
    }
    public Frekvenstabell taUt(){
        Random random = new Random();
        // Fjerner og returnerer en vilkårlig frekvenstabell fra registeret.
        return register.remove(random.nextInt(register.size()));
    }
    public int antall(){
        return register.size();
    }
    public static Frekvenstabell les(String filnavn) {
    Frekvenstabell ft = new Frekvenstabell();
    HashSet<String> unikeSubsekvenser = new HashSet<>();
    try (Scanner scanner = new Scanner(new File(filnavn))) {
        while (scanner.hasNextLine()) {
            String linje = scanner.nextLine().trim();
            
            // Gå gjennom linjen og hent ut alle unike subsekvenser av lengde 3
            for (int i = 0; i <= linje.length() - SUBSEKVENSLENGDE; i++) {
                String subsekvens = linje.substring(i, i + SUBSEKVENSLENGDE);
                unikeSubsekvenser.add(subsekvens);  // lagre alle unike subsekvenser
            }
        }
    } catch (FileNotFoundException e) {
        System.err.println("Fant ikke filen: " + filnavn);
        e.printStackTrace();
    }
    // Hver unike subsekvens får frekvens 1 og setter in frekvenstabell
    for (String subsekvens : unikeSubsekvenser) {
        ft.put(subsekvens, 1);
    }
    return ft;
 }
}
