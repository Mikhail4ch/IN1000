class TestPrioritetskø {
    private static void info (int nr, String tekst) {
	System.out.print("Test " + nr + " " + tekst + " ... ");
    }
    
    private static boolean test (int nr, String tekst, Prioritetskø<String> k, String[] fasit) {
	info(nr, tekst);
	int fLen = fasit.length;
	int kLen = k.størrelse();
	if (kLen != fLen) {
	    p("størrelse() gir " + kLen + " og ikke " + fLen);
	    return false;
	}
	
	for (int i = 0;  i < fLen;  ++i) {
	    String fElem = fasit[i];
	    String kElem = k.fjern();
	    if (kElem == null) {
		p("fjern() gir null for element nr " + i);
		return false;
	    }
	    if (! fElem.equals(kElem)) {
		p("fjern() for element nr " + i + " gir \"" + kElem +
		  "\" og ikke \"" + fElem + "\"");
		return false;
	    }
	}

	kLen = k.størrelse();
	if (kLen != 0) {
	    p("størrelse() etter fjerning gir " + kLen + " og ikke 0");
	    return false;
	}
	return true;
    }

    private static void p (String s) {
	System.out.println(s);
    }

    public static void main (String[] arg) {
	int antOK = 0, antFeil = 0;

	// Test 1
	Prioritetskø<String> k = new Prioritetskø<>();
	String[] f = new String[] {};
	if (test(1, "Tom Prioritetskø", k, f)) {
	    p("OK");  ++antOK;
	} else {
	    ++antFeil;
	}

	// Test 2
	k = new Prioritetskø<>();
	k.leggTil("Anne");  k.leggTil("Berit");  k.leggTil("Chris");
	f = new String[] {"Anne", "Berit", "Chris"};
	if (test(2, "Prioritetskø med 3 elementer", k, f)) {
	    p("OK");  ++antOK;
	} else {
	    ++antFeil;
	}

	// Test 3
	k = new Prioritetskø<String>();
	k.leggTil("Omega");  k.leggTil("Theta");  k.leggTil("Beta");
	k.leggTil("Alfa");  k.leggTil("Gamma");
	f = new String[] {"Alfa", "Beta", "Gamma", "Omega", "Theta"};
	if (test(3, "Prioritetskø med 5 elementer", k, f)) {
	    p("OK");  ++antOK;
	} else {
	    ++antFeil;
	}

	// Test 4
	k = new Prioritetskø<>();
	k.leggTil("B");  k.leggTil("D");  k.leggTil("C");  k.leggTil("A");
	k.leggTil("Z");  k.leggTil("X");
	k.fjern();
	String h1 = k.hent();
	info(4, "Bruk av hent()");
	if (h1.equals("B")) {
	    p("OK");  ++antOK;
	} else {
	    p("hent() fra {\"B\", \"C\", \"D\", \"X\", \"Z\"} ga \"" + h1 + 
	      "\" og ikke \"B\"");
	    ++antFeil;
	}
	    
	// Test 5
	k = new Prioritetskø<>();
	k.leggTil("Z");  k.leggTil("Y");
	k.fjern();  k.fjern();
	k.leggTil("W");  k.leggTil("V");  k.leggTil("X");  k.leggTil("U");
	if (test(5, "Innsetting og fjerning", k, new String[] {"U", "V", "W", "X"})) {
	    p("OK");  ++antOK;
	} else {
	    ++antFeil;
	}

	// Test 6
	k = new Prioritetskø<>();
	k.leggTil("Noe");  k.fjern();
	info(6, "Fjerning fra tom liste");
	try {
	    k.fjern();
	    p("Feilen ble ikke oppdaget");
	    ++antFeil;
	} catch (UgyldigListeindeks e) {
	    p("OK");  ++antOK;
	}

	// Oppsummering
	if (antFeil == 0) {
	    p("Alt gikk bra!");
	} else {
	    p("I alt gikk " + antOK + " tester bra, men " + antFeil +
	      " inneholdt feil."); 
	}
    }
}
