class TestVerden {
    static void sjekk (String hva, boolean test) {
	if (! test) {
	    System.out.println("Sjekken '" + hva + "' feilet!");
	    System.exit(1);
	}
    }

    private static void testKonstruktoer () {
	Verden verden = new Verden(4,5);
	sjekk("Verden: genNr skal vaere 0", verden.genNr == 0);
	
	System.out.println("konstruktør: Alt riktig!");
    }

    private static void testTegn () {
	Verden verden = new Verden(4,5);
	System.out.println("tegn(): Utskrift av en Verden:");
	verden.tegn();
	System.out.println("tegn(): Utskrift ferdig!");
	System.out.println("  Du maa selv sjekke om den ser riktig ut.");
    }

    private static void testOppdatering () {
	Verden verden = new Verden(3,3);
	System.out.println("oppdatering(): Tester metoden gjennom 3 generasjoner");
	verden.tegn();
	for (int i = 1;  i <= 3;  ++i) {
	    verden.oppdatering();
        verden.tegn();
	}
	sjekk("oppdatering(): genNr == 3", verden.genNr==3);
    
	System.out.println("oppdatering(): testet 3 generasjoner.");
	System.out.println("  Du maa selv sjekke om resultatet er korrekt.");
    }

    public static void main (String[] arg) {
	System.out.println("** Test Verden **");

	testKonstruktoer();
	testTegn();
	testOppdatering();

	System.out.println();
    }
}