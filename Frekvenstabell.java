// Klassen Frekvenstabell representerer en frekvenstabell for DNA-subsekvenser.

import java.util.Map;
import java.util.TreeMap;
import java.io.FileWriter;
import java.io.IOException;

public class Frekvenstabell extends TreeMap<String, Integer> {
    // Returnerer innholdet i frekvenstabellen
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : this.entrySet()) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public static Frekvenstabell flett(Frekvenstabell f1, Frekvenstabell f2) {
        Frekvenstabell flettet = new Frekvenstabell();
        // Legg inn alle subsekvenser fra f1
        for (Map.Entry<String, Integer> entry : f1.entrySet()) {
            flettet.put(entry.getKey(), entry.getValue());
        }
        // Legg inn alle fra f2, og summer hvis de finnes fra før ved å bruke
        // flettet.getOrDefault(entry.getKey(), 0) + entry.getValue()
        for (Map.Entry<String, Integer> entry : f2.entrySet()) {
            flettet.put(entry.getKey(), flettet.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return flettet;
    }
    // Skriver frekvenstabellen til en fil.
    public void skrivTilFil(String filnavn) {
        try (FileWriter skriveFil = new FileWriter(filnavn)) {
            skriveFil.write(this.toString());
        } catch (IOException e) {
            System.err.println("Feil. Kunne ikke skrive til fil: " + filnavn);
            e.printStackTrace();
        }
    }
}

