public class Bil3 {
    private String bilnummer;
    public Bil3(String bilnummer) {
        this.bilnummer = bilnummer;
    }
    public void skrivBil () {
        System.out.println("Jeg er en bill\nmed nummer: " + this.bilnummer);
    }
    public String hentNummer () {
        return this.bilnummer;
    }
}
