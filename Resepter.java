abstract class Resepter {
    public final int ID;
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    Pasient pasient;
    int reit;
    int pris;
    String farge;

    Resepter(Legemiddel legemiddel,Lege utskrivendeLege,Pasient pasient,int reit) {
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasient = pasient;
        this.reit = reit;
        this.ID = behandleId();
        this.pris = prisÅBetale();
        this.farge = farge();
        pasient.leggResept(this);
    }
    abstract int behandleId();
    abstract public String farge();
    abstract public int prisÅBetale();

    public int hentId() {
        return ID;
    }
    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }
    public Lege hentLege() {
        return utskrivendeLege;
    }
    public Pasient hentPasient() {
        return pasient;
    }
    public int hentReit() {
        return reit;
    }
    public boolean bruk() {
        if (reit>0){
            reit--;
            return true;
        }
        return false;
    }
    public String toString() {
        return "\nLege: " + utskrivendeLege + "\nnavn: " + legemiddel.navn + 
        "\npris: " + prisÅBetale() + "\npasientId: " + pasient +
        "\nreit: " + reit;
    }
}

class Hvite extends Resepter {     //ikke abstract fordi det må være mulig å opprette instanser av Hvite
    private static int counter = 0;
    Hvite(Legemiddel legemiddel,Lege utskrivendeLege,Pasient pasient,int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
    }
    @Override
    protected int behandleId() {
        return counter++;
    }
    @Override
    public int prisÅBetale() {  //jeg fant ikke instruksjon for denne metoden bare antok at det skulle være sånn
        return legemiddel.hentPris();
    }
    @Override
    public String farge() {
        return "Hvite";
    }
    public String toString() {
        return "Det er " + farge() + " resept" + super.toString();
    }
}

class MilitærResept extends Hvite {
    private static int counter = 0;
    MilitærResept(Legemiddel legemiddel,Lege utskrivendeLege,Pasient pasient) {
        super(legemiddel, utskrivendeLege, pasient, 3);
    }
    @Override
    protected int behandleId() {
        return counter++;
    }
    @Override
    public int prisÅBetale() {
        return 0;
    }
    public String toString() {
        return "MilitærResept: \n" + super.toString();
    }
}

class PResept extends Hvite {
    private static int counter = 0;
    PResept(Legemiddel legemiddel,Lege utskrivendeLege,Pasient pasient,int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
    }
    @Override
    protected int behandleId() {
        return counter++;
    }
    @Override
    public int prisÅBetale() {
        if(legemiddel.hentPris() >= 108) {
            return legemiddel.hentPris() - 108;
        }
        return 0;
    }
    public String toString() {
        return "PResept: \n" + super.toString();
    }
}

class Blå extends Resepter {
    private static int counter = 0;
    Blå(Legemiddel legemiddel,Lege utskrivendeLege,Pasient pasient,int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
    }
    @Override
    protected int behandleId() {
        return counter++;
    }
    @Override
    public String farge() {
        return "Blå";
    }
    @Override
    public int prisÅBetale() {
        return (int) Math.round(legemiddel.hentPris() * 0.25);
    }
    public String toString() {
        return "Det er " + farge() + " resept" + super.toString();
    }
}

