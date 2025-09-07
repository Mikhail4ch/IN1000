class Lege implements Comparable<Lege> {
    String navn;
    IndeksertListe<Resepter>utskrevneResepter;
    Lege(String navn) {
        this.navn = navn;
        this.utskrevneResepter = new IndeksertListe<>();
    }
    public String hentNavnet() {
        return navn;
    }
    public String toString() {
        return "Legen heter " + navn;
    }
    @Override
    public int compareTo(Lege annenLege) {
        return this.navn.compareTo(annenLege.navn);
    }
    public IndeksertListe<Resepter> hentUtskrevneResepter() {
        return utskrevneResepter;
    }
    public void leggTilResept(Resepter resept) {
        utskrevneResepter.leggTil(resept);
    }
    public Hvite skrivHvitResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }
        Hvite resept = new Hvite(legemiddel, this, pasient, reit);
        leggTilResept(resept);
        return resept;
    }
    public MilitærResept skrivMilResept(Legemiddel legemiddel, Pasient pasient) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }
        MilitærResept resept = new MilitærResept(legemiddel, this, pasient);
        leggTilResept(resept);
        return resept;
    }
    public PResept skrivPResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }
        PResept resept = new PResept(legemiddel, this, pasient, reit);
        leggTilResept(resept);
        return resept;
    }
    public Blå skrivBlaaResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }
        Blå resept = new Blå(legemiddel, this, pasient, reit);
        leggTilResept(resept);
        return resept;
    }
}

class Spesialist extends Lege implements Godkjenningsfritak {
    String kontrollkode;
    Spesialist (String kontrollkode,String navn) {
        super(navn);
        this.kontrollkode = kontrollkode;
    }
    @Override
    public String hentKontrollkode() {
        return kontrollkode;
    }
    public String toString() {
        return super.toString() + "\nkontrollkode til legen er: " +
        kontrollkode;
    }
    public Blå skrivBlaaResept(Legemiddel legemiddel, Pasient pasient, int reit) {
        Blå resept = new Blå(legemiddel, this, pasient, reit);
        leggTilResept(resept);
        return resept;
    }
}

class UlovligUtskrift extends Exception {
    UlovligUtskrift(Lege l, Legemiddel lm) {
        super("Legen "+ l.hentNavnet() + " har ikke lov til å skrive ut " + lm.hentNavn());
    }
}






