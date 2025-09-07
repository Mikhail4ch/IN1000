// representerer en tråd som leser inn data fra én fil,
// oppretter en frekvenstabell for denne, og setter den inn i et monitorobjekt

public class Lesetråd implements Runnable {
    private String filnavn;
    private Monitor monitor;
    Lesetråd(String f,Monitor m){
        filnavn = f;
        monitor = m;
    }    
    @Override
    public void run() {
        Frekvenstabell frekvenstabell = Monitor.les(filnavn);
        monitor.settInn(frekvenstabell);
    }
}
