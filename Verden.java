public class Verden {
    private int antallRader;
    private int antallKolonner;
    private int genNr;
    private Rutenett rutenett;

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
        for (int i = 0; i < this.antallRader; i++) { 
            for (int k = 0; k < this.antallKolonner; k++) { 
                Celle celle = this.rutenett.hentCelle(i, k);
                celle.tellLevendeNaboer();
            }
        }
        for (int i = 0; i < this.antallRader; i++) { 
            for (int k = 0; k < this.antallKolonner; k++) { 
                Celle celle = this.rutenett.hentCelle(i, k);
                celle.oppdaterStatus();
            }
        }
        this.genNr++;
    }
}
