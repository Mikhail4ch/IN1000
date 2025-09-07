/**
Sørger for trådsikker tilgang til et Subsekvensregister.
Den beskytter lesing og skriving med en ReentrantLock, slik at flere tråder
kan samarbeide uten datakonflikter
 */
import java.util.concurrent.locks.ReentrantLock;

public class Monitor {
    private final Subsekvensregister subsekvensregister;
    private final ReentrantLock lock;

    Monitor(){
        this.subsekvensregister = new Subsekvensregister();
        this.lock = new ReentrantLock();
    }
    public void settInn(Frekvenstabell f){
        lock.lock();
        try{
            subsekvensregister.settInn(f);
        } finally{
            lock.unlock();
        }
    }
    public Frekvenstabell taUt(){
        lock.lock();
        try{
            return subsekvensregister.taUt();
        } finally{
            lock.unlock();
        }
    }
    public int antall(){
        lock.lock();
        try{
            return subsekvensregister.antall();
        } finally {
            lock.unlock();
        }
    }
    // Metoden er trådsikker siden den ikke opererer på delte ressurser.
    public static Frekvenstabell les(String filnavn) {
        return Subsekvensregister.les(filnavn);
    }
    public Frekvenstabell[] taUtTo() {
        lock.lock();
        try{
            // sammenslåing skal bare kjøres når det er minst to forekomster av Frekvenstabeller
            if (subsekvensregister.antall() < 2) {
                return null;  
            }
            Frekvenstabell[] frekvenstabeller = new Frekvenstabell[2];
            frekvenstabeller[0] = subsekvensregister.taUt();
            frekvenstabeller[1] = subsekvensregister.taUt();
            return frekvenstabeller;
        } finally{
            lock.unlock();
        }
    }
    // Gjør det tydelig at denne tabellen kommer fra fletting (ikke lesing)
    public void settInnFlettet(Frekvenstabell f) {
        lock.lock();
        try {
            subsekvensregister.settInn(f);   
        } finally {
            lock.unlock();
        }
    }
}
