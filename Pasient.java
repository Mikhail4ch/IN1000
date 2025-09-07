import java.util.ArrayList;

public class Pasient {
    String navn;
    String fødselsnummer;
    int ID;
    static int idTeller = 0;
    ArrayList<Resepter> resepter;

    Pasient(String n, String f){
        navn = n;
        fødselsnummer = f;
        ID = idTeller++;
        resepter = new ArrayList<>();
    }

    public void leggResept(Resepter resept){
        resepter.add(resept);
    }

    public int hentId() {
        return ID;
    }

    public String hentNavn() {
        return navn;
    }

    public String hentFodselsnummer() {
        return fødselsnummer;
    }
    @Override
    public String toString() {
        return "Pasient: " + navn + 
        "\nFødselsnummer: " + fødselsnummer + 
        "\nID: " + ID + 
        "\nResepter: " + resepter.size();
    }
}
