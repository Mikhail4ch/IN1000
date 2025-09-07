// Å erklære Legemiddel som abstrakt forhindrer direkte instansiering av klassen og vi trenger det
// for å tilfredsstille dette kravet "det ikke skal være mulig å opprette en instans av klassen Legemiddel"

abstract class Legemiddel {
    public final int ID;
    public final String navn;
    public int pris;
    public final double mengdeVirkestoff;

    Legemiddel(String navn,int pris,double mengdeVirkestoff) {
        this.navn = navn;
        this.pris = pris;
        this.mengdeVirkestoff = mengdeVirkestoff;
        this.ID = behandleId();
    }
    abstract int behandleId(); // denne abstract klassen muliggjør polymorfisme for riktig ID behandlingen 

    public int hentPris() {
        return pris;
    }
    public void settNyPris(int pris) {
        this.pris = pris;
    }
    public String hentNavn(){
        return navn;
    }
    public String toString() {
        return "\nnavn: " + navn + 
        "\npris: " + pris + "\nmengdeVirkestoff: " + mengdeVirkestoff;
    }
}

class Narkotisk extends Legemiddel {
    private static int counter = 0; // static - counter øker bare hvis vi oppretter en ny instanser av klassen
    public final int styrke;

    Narkotisk(String navn,int pris,double mengdeVirkestoff,int styrke) {
        super(navn, pris, mengdeVirkestoff);
        this.styrke = styrke;
    }
    @Override
    protected int behandleId() {
        return counter++;
    }
    public String toString() {
        return "Narkotisk legemiddel" +
        "\nID: " + ID + "\nStyrke: " + styrke +
        super.toString();
    }
}

class Vanedannende extends Legemiddel {
    private static int counter = 0;
    public final int styrke;

    Vanedannende(String navn,int pris,double mengdeVirkestoff,int styrke) {
        super(navn, pris, mengdeVirkestoff);
        this.styrke = styrke;
    }
    @Override
    protected int behandleId() {
        return counter++;
    }
    public String toString() {
        return "Vanedannende legemiddel" +
        "\nID: " + ID + "\nStyrke: " + styrke +
        super.toString();
    }
}

class Vanlig extends Legemiddel {
    private static int counter = 0;
    Vanlig(String navn,int pris,double mengdeVirkestoff) {
        super(navn, pris, mengdeVirkestoff);
    }
    @Override
    protected int behandleId() {
        return counter++;
    }
    public String toString() {
        return "Vanlig legemiddel" 
        + "\nID: " + ID +
        super.toString();
    }
}


