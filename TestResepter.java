class Lege {
    String navn;
    public Lege(String navn) {
        this.navn = navn;
    }
    @Override
    public String toString() {
        return navn;
    }
}

class TestResepter {
    public static void main(String[] args) {
        Legemiddel dummyMedsin = new Narkotisk("Noenting", 250, 8.4, 5);

        Lege dummyLege = new Lege("Dr. Dre");

        Hvite hviteResept = new Hvite(dummyMedsin, dummyLege, 1, 2);     
        MilitærResept militaryResept = new MilitærResept(dummyMedsin, dummyLege, 3); 
        PResept pResept = new PResept(dummyMedsin, dummyLege, 3, 4);        
        Blå blåResept = new Blå(dummyMedsin, dummyLege, 4, 1);            

        System.out.println("Testing Hvite resept:");
        if (hviteResept.farge().equals("Hvite") && hviteResept.prisÅBetale() == dummyMedsin.hentPris()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("Testing MilitærResept:");
        if (militaryResept.farge().equals("Hvite") && militaryResept.prisÅBetale() == 0 && militaryResept.hentReit() == 3) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("Testing PResept:");
        int expectedPPris = 250 - 108;
        if (pResept.farge().equals("Hvite") && pResept.prisÅBetale() == expectedPPris) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("Testing Blå resept:");
        int expectedBPris = (int) Math.round(dummyMedsin.hentPris() * 0.25);
        if (blåResept.farge().equals("Blå") && blåResept.prisÅBetale() == expectedBPris) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("Testing 'bruk' metoden av Blå resept:");
        if (blåResept.bruk()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        if (blåResept.bruk() == false) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}


