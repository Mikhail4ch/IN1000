class TestRutenett {
    private static void sjekk (String hva, boolean test) {
	if (! test) {
	    System.out.println("Sjekken '" + hva + "' feilet!");
	    System.exit(1);
	}
    }

    private static void testKonstruktoerUtenRutenett() {
	Rutenett testRutenett = new Rutenett(3, 5);

	sjekk("testRutenett.antRader==3", testRutenett.antRader==3);
	sjekk("testRutenett.antKolonner==5", testRutenett.antKolonner==5);
    
	System.out.println("testKonstruktoerUtenRutenett(): Alt riktig!");
    }

    private static void testFyllMedTilfeldigeCeller () {
	Rutenett testRutenett = new Rutenett(10, 5);
	testRutenett.fyllMedTilfeldigeCeller();

	int antLev = 0, antDoed = 0;
	for (int rx = 0;  rx < testRutenett.antRader;  ++rx) {
	    for (int kx = 0;  kx < testRutenett.antKolonner;  ++kx) {
		sjekk("fyllMedTilfeldigeCeller: rutene["+rx+"]["+kx+"]!=null",
		      testRutenett.rutene[rx][kx] != null);
		if (testRutenett.rutene[rx][kx].erLevende())
		    ++antLev;
		else
		    ++antDoed;
	    }
	}
	// NB! Det er mulig at det tilfeldigvis lages bare levende eller bare
	// doede celler, men sjansen for det er usedvanlig liten.
	sjekk("fyllMedTildigeCeller: ingen doede!", antDoed>0);
	sjekk("fyllMedTildigeCeller: ingen levende!", antLev>0);

	System.out.println("testFyllMedTilfeldigeCeller(): Alt riktig!");
    }

    private static void testHentCelle () {
	Rutenett testRutenett = new Rutenett(3, 5);
	testRutenett.fyllMedTilfeldigeCeller();
	
	for (int rx = -1;  rx < testRutenett.antRader+1;  ++rx) {
	    for (int kx = -1;  kx < testRutenett.antKolonner+1;  ++kx) {
		Celle c = testRutenett.hentCelle(rx, kx);
		if (c != null) {
		    sjekk("hentCelle["+rx+"]["+kx+"] er riktig",
			  c == testRutenett.rutene[rx][kx]);
		}
	    }
	}
                
	System.out.println("testHentCelle(): Alt riktig!");
    }

    private static void testTegnRutenett () {
	Rutenett testRutenett = new Rutenett(4, 4);
	testRutenett.fyllMedTilfeldigeCeller();
	System.out.println("testTegnRutenett(): Slik ser et 4x4 rutenett ut:");
	testRutenett.tegnRutenett();
	System.out.println("testTegnRutenett(): Utskrift ferdig!");
	System.out.println("  Naa kan du selv sjekke om den ser riktig ut.");
    }

    private static void testSettNaboer () {
	Rutenett testRutenett = new Rutenett(3, 3);
	testRutenett.fyllMedTilfeldigeCeller();

	testRutenett.settNaboer(0,0);
	sjekk("testSettNaboer(): et hjørne skal ha 3 naboer",
	      testRutenett.hentCelle(0,0).antNaboer==3);
	
	testRutenett.settNaboer(1,1);
	sjekk("testSettNaboer(): en indre celle skal ha 8 naboer",
	      testRutenett.hentCelle(1,1).antNaboer==8);
	
	testRutenett.settNaboer(2,1);
	sjekk("testSettNaboer(): en kantcelle skal ha 5 naboer",
	      testRutenett.hentCelle(2,1).antNaboer==5);
    
	System.out.println("testSettNaboer(): Alt riktig!");
    }

    private static void testKobleAlleCeller () {
	Rutenett testRutenett = new Rutenett(2, 2);  // 2 x 2 rutenett
	testRutenett.fyllMedTilfeldigeCeller();
	testRutenett.kobleAlleCeller();
    
	int totaltAntallNaboer = 0;
	for (int rx = 0;  rx < testRutenett.antRader;  ++rx) {
	    for (int kx = 0;  kx < testRutenett.antKolonner;  ++kx) {
		totaltAntallNaboer += testRutenett.hentCelle(rx,kx).antNaboer;
	    }
	}
	sjekk("antall naboer i 2x2-rutenett skal være 12", totaltAntallNaboer==12);

	testRutenett = new Rutenett(3, 3);  // 3 x 3 rutenett
	testRutenett.fyllMedTilfeldigeCeller();
	testRutenett.kobleAlleCeller();
    
	totaltAntallNaboer = 0;
	for (int rx = 0;  rx < testRutenett.antRader;  ++rx) {
	    for (int kx = 0;  kx < testRutenett.antKolonner;  ++kx) {
		totaltAntallNaboer += testRutenett.hentCelle(rx,kx).antNaboer;
	    }
	}
	sjekk("antall naboer i 3x3-rutenett skal være 40", totaltAntallNaboer==40);

	System.out.println("testKobleCeller(): Alt riktig!");
    }

    private static void testAntallLevende () {
	// Lag et tomt rutenett:
	Rutenett testRutenett = new Rutenett(3, 3);
	for (int rx = 0;  rx < testRutenett.antRader;  ++rx) {
	    for (int kx = 0;  kx < testRutenett.antKolonner;  ++kx) {
		testRutenett.rutene[rx][kx] = new Celle();
	    }
	}

	// Angi hvilke som skal vaere levende:
	testRutenett.hentCelle(0,0).settLevende();
	testRutenett.hentCelle(2,1).settLevende();
	testRutenett.hentCelle(0,2).settLevende();
	int antallLevende = testRutenett.antallLevende();
	sjekk("antallLevende(): antall levende skal være 3",
    antallLevende==3);
    
	System.out.println("testAntallLevende(): Alt riktig!");
    }

    public static void main (String[] arg) {
	System.out.println("** Test Rutenett **");

	testKonstruktoerUtenRutenett();
	testFyllMedTilfeldigeCeller();
	testHentCelle();
	testTegnRutenett();
	testSettNaboer();
	testKobleAlleCeller();
	testAntallLevende();
    }
}
