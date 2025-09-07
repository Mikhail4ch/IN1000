public class Verden {
    public int antallRader;
    public int antallKolonner;
    public int genNr;
    public Rutenett rutenett;

    public Verden(int antallRader, int antallKolonner) {
        this.antallRader = antallRader;
        this.antallKolonner = antallKolonner;
        this.genNr = 0;
        this.rutenett = new Rutenett(antallRader, antallKolonner);
        this.rutenett.fyllMedTilfeldigeCeller();
        this.rutenett.kobleAlleCeller();
    }

    public void tegn () {
        this.rutenett.tegnRutenett();
        System.out.println("Generasjon nummeret er: " + this.genNr);
        System.out.println("Antall levende celler er: " + this.rutenett.antallLevende());
    }

    public void oppdatering () {
        for (int r = 0; r < this.antallRader; r++) { 
            for (int k = 0; k < this.antallKolonner; k++) { 
                Celle celle = this.rutenett.hentCelle(r, k);
                celle.tellLevendeNaboer();
            }
        }
        for (int r = 0; r < this.antallRader; r++) { 
            for (int k = 0; k < this.antallKolonner; k++) { 
                Celle celle = this.rutenett.hentCelle(r, k);
                celle.oppdaterStatus();
            }
        }
        this.genNr++;
    }
}
