// Klassen Flettetråd representerer en tråd som henter ut to frekvenstabeller fra Monitor,
// fletter dem sammen, og setter det flettede resultatet tilbake i Monitor.

public class Flettetråd implements Runnable{
    private Monitor monitor;
    Flettetråd(Monitor m){
        monitor = m;
    } 
    @Override
    public void run() {
        try {
            while (true) {
                Frekvenstabell[] par = monitor.taUtTo();
                if (par == null) break; // kan ikke slå sammen lenger, ikke nok frekvenstabeller
                Frekvenstabell flettet = Frekvenstabell.flett(par[0], par[1]);
                monitor.settInnFlettet(flettet);
            }
        } catch (Exception e) {
            System.err.println("Flettetråd ble avbrutt: " + e.getMessage());
        }
    }
}
