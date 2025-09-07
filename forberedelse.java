/* 
// Ha én klasse per fil til vanlig plis<3
abstract class Dyr{
    abstract public String art();
    abstract public int levetid();
    @Override
    public String toString(){
        return art() + " lever i opp til " + levetid() + " år.";
    }
}
// Elefant, zebra, gepard? Hva dere vil
abstract class Pattedyr extends Dyr{
    abstract int drektig();
    abstract int strKull();

    @Override
    public String toString(){
        return super.toString() + "\nEr drektig i " + drektig() + " måneder og får opp til " + strKull() + " barn hver gang.";
    }
}
// Amfibier (abstract) // eks antall egg de legger
// Salamander

class Gepard extends Pattedyr{
    @Override
    public String art(){
        return "Gepard";
    }
    @Override
    public int levetid(){
        return 12;
    }
    @Override
    int drektig(){
        return 3;
    }
    @Override
    int strKull(){
        return 5;
    }
}
class Elefant extends Pattedyr{
    @Override
    public String art(){
        return "Elefant";
    }
    @Override
    public int levetid(){
        return 70;
    }
    @Override
    int drektig(){
        return 22;
    }
    @Override 
    int strKull(){
        return 1;
    }
}
abstract class Amfibier extends Dyr{

}

class Salamander extends Amfibier{
    @Override
    public String art(){
        return "Salamander";
    }
    @Override
    public int levetid(){
        return 14;
    }
}

class Dyrehage{
    public static void main(String[] args){
        Dyr[] dyrene = {new Gepard(), new Elefant(), new Salamander()};
        
        for (Dyr d: dyrene){
            System.out.println(d);
        }
    }
}

import java.util.Scanner;

class StørstAv3 {
    public static void main (String[ ] args) {
        int maks = 0;
        Scanner tastatur = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            int tall = tastatur.nextInt();
            if (tall > maks){
                maks = tall;
            }
        }
        System.out.println("Største tall er: " + maks);

        int sum = 0;
        Scanner tastatur1 = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            int tall1 = tastatur.nextInt();
            sum += tall1;
        }
        System.out.println("Summen er: " + sum);
    }
}


class Dyr {
    void lagLyd() {
        System.out.println("Dyret lager en lyd.");
    }
}

// Hund arver fra Dyr
class Hund extends Dyr {
    void lagLyd() {
        System.out.println("Bjeff!");
    }
}

class Main {
    public static void main(String[] args) {
        Dyr h = new Hund();
        h.lagLyd(); // Skriver ut "Bjeff!"
    }
}


import java.util.*;
import java.util.concurrent.locks.*;
 class Garnnøste { // ikke en spennende klasse, dette har vi sett før

    public final String TYPE, FARGE, MERKE, PARTINUMMER;
    public final int LØPELENGDE, VEKT;

    public Garnnøste(String type, String farge, String merke, String partinummer, int løpelengde, int vekt) {
        TYPE = type;
        FARGE = farge;
        MERKE = merke;
        PARTINUMMER = partinummer;
        LØPELENGDE = løpelengde;
        VEKT = vekt;
    }

    @Override
    public String toString() {
        return  TYPE + ", " + FARGE; // kunne hatt med mer info her, litt ettersom hva man skal bruke informasjonen til
    }
}



 class Garnhandel {

    // vi bruker grensesnittene
    private List<Garnnøste> garnnøster;
    private Map<String, Integer> lagerbeholdning;
    private Lock lås;

    public Garnhandel(List<Garnnøste> garnnøster) {
        this.garnnøster = garnnøster;
        lagerbeholdning = new TreeMap<>(); // TreeMap vil holde nøklene våre sortert alfabetisk
        lås = new ReentrantLock(true); // "true" gir en rettferdig kømekanisme inni låsen
    }

    public void skrivLagerbeholdning() {
        System.out.println("\nGarnhandelens lagerbeholdning:\n");
        for (String type : lagerbeholdning.keySet()) {
            System.out.println(type + ", " + lagerbeholdning.get(type) + "\n");
        }
    }

    // vi vil ikke låse denne, for denne kan utføres i ekte parallell
    // dette fordi vi ikke manipulerer noen felles ressurser
    // trådene kan altså telle hver sin del av lista samtidig
    private void tell(int start, int slutt, Map<String, Integer> lokalMap) {
        for (int i = start; i < slutt; i++) {
            String type = garnnøster.get(i).TYPE; // vi kunne ha telt basert på andre egenskaper ved garnnøstene også!
            int antall = lokalMap.getOrDefault(type, 0);
            lokalMap.put(type, ++antall);
        }
    }

    // denne må vi låse, siden vi oppdaterer en global variabel (lagerbeholdning)
    private void oppdaterLagerbeholdning(Map<String, Integer> lokalMap) {
        lås.lock(); // i lås-objektet venter trådene på at det skal bli deres tur
        try {
            for (String type : lokalMap.keySet()) {
                int lokaltAntall = lokalMap.get(type);
                int globaltAntall = lagerbeholdning.getOrDefault(type, 0);
                lagerbeholdning.put(type, lokaltAntall + globaltAntall); // bare én tråd gjør dette av gangen
            }
        } finally {
            lås.unlock(); // nå er den nye globale tilstanden synlig for alle trådene, neste tråd slipper til
        }
    }

    public void varetelling(int antallHjelpere) {
        int n = garnnøster.size();

        if (antallHjelpere < 2) { // hvis brukeren ikke vil ha flere tråder, gjør vi oppgaven sekvensielt
            tell(0, n, lagerbeholdning); // da holder det å telle hele lista og sette den globale lagerbeholdningen
            return; // husk å gå ut av metoden i så fall
        }

        // hvis flere skal gjøre oppgaven, fordeler vi arbeidet på trådene ved å gi dem egne deler av lista
        int del = n / antallHjelpere;
        Thread[] tråder = new Thread[antallHjelpere]; // vi må lagre trådene for å vente på dem etterpå
        int j = 0; // holder rede på tråder-indeksene

        for (int i = 0; i < n; i += del) {
            int start = i;
            int slutt = i + del;

            if (j < antallHjelpere - 1) {
                Thread tråd = new Thread(new Hjelper(start, slutt));
                tråder[j] = tråd;
                tråd.start();
            } else { // her tar vi høyde for at antallet garnnøster ikke går helt opp i antallet tråder
                // så siste tråd får bare det som er igjen
                slutt = n;
                i = n; // for å komme oss ut av løkka
                Thread tråd = new Thread(new Hjelper(start, slutt)); // sånn lager vi en tråd
                tråder[j] = tråd;
                tråd.start();
            }
            j++;
        }

        // med denne løkka sørger vi for at hovedtråden venter til alle trådene den har startet er ferdige før den går ut av metoden
        for (Thread t : tråder) {
            try {
                t.join(); // venter til denne tråden dør, så går hovedtråden tilbake inn i løkka for å vente på neste
            } catch (InterruptedException e) {
                // System.out.println("Thread, interrupted"); // Dette er en filmreferanse for den rette generasjonen
                System.out.println(e.getMessage()); // skriv ut beskjeden heller, ikke vits.
                System.exit(1); // noe gitt galt, gå ut
            }
        }
    }

    // har tråden som en indre privat klasse i vårt eksempel
    // hvis denne var en klasse utenfor, måtte vi sendt med vår instans av Garnhandel
    private class Hjelper implements Runnable { // En enkel trådklasse
        
        private int start, slutt; // trådens del av lista, start- og sluttindekser
        private Map<String, Integer> lokalMap; // Holder rede på garntypene den har funnet og antallet deres

        Hjelper(int start, int slutt) {
            this.start = start;
            this.slutt = slutt;
            lokalMap = new HashMap<>();
        }

        @Override
        public void run() { // denne metoden utføres når vi sier tråd.start()
            tell(start, slutt, lokalMap); // teller sin del av lista og lagrer resultatet i den lokale mapen
            oppdaterLagerbeholdning(lokalMap); // legger resultatet til i den globale lagerbeholdningen
            // når dette er utført, terminerer tråden
        }
    }

}

 class Hovedprogram {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Bruk: java Hovedprogram <n> <t>");
            System.exit(1);
        }

        // her kunne vi ha fanga en NumberFormatException
        int n = Integer.parseInt(args[0]); // hvor mye garn vi vil ha
        int t = Integer.parseInt(args[1]); // hvor mange tråder vi vil ha
   
        List<Garnnøste> nøster = new ArrayList<>(n); // sender inn en initiell kapasitet til listen
        int frø = 1010; // se kommentar fra forrige uke
        Random random = new Random(frø); 

        // Lager tre forskjellige typer garnnøster bare for å teste litt, ideelt sett skulle vi lagd flere ulike typer osv.
        // En switch-statement er en litt slankere syntaks enn en rekke med if - else if - else osv.
        // Les om hvordan det funker før du bruker det
        for (int i = 0; i < n; i++) {
            Garnnøste nøste = null;
            switch (random.nextInt(3)) { // gir oss en random verdi som er 0, 1 eller 2
                case 0: // hvis 0, lager vi et sånt nøste osv .. 
                    nøste = new Garnnøste("Merino", "Støvet Artisjokk", "Knitting for Olive", "98496", 250, 50);
                    break; // break, ellers går den videre og sjekker neste case
                case 1:
                    nøste = new Garnnøste("Soft Silk Mohair", "Enhjørninglilla", "Knitting for Olive", "06738", 225, 25);
                    break;
                case 2:
                    nøste = new Garnnøste("Pure Silk", "Dis", "Knitting for Olive", "34798", 250, 50);
                    break;
            }
            nøster.add(nøste); // legger til i lista
        }

        
        Garnhandel garnhandel = new Garnhandel(nøster);
        garnhandel.varetelling(t); // Fordi vi bruker join() er vi sikre på at antallet er riktig når vi kommer ut her
        garnhandel.skrivLagerbeholdning(); // Gir en pen utskrift ordnet alfabetisk pga. TreeMap :-))
    }
}


import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

 class Innlevering {

    private String status;
    private int kvalitet;

    public Innlevering(double innsats) {
        status = "Ikke vurdert";
        kvalitet = (int) innsats * 100;
    }

    public void økKvalitet(double innsats) {
        kvalitet += (int) innsats * 100;
    }

    public int kvalitet() {
        return kvalitet;
    }

    public String hentStatus() {
        return status;
    }

    public void settStatus(String status) {
        this.status = status;
    }
}

class Devilry {
    final int antallStudenter;
    int antallRettet;
    boolean ferdig = false;
    Queue<Innlevering> innleveringer;
    Lock loos;
    Condition grøntLys;

    Devilry(int antallStudenter){
        this.antallStudenter = antallStudenter;
        innleveringer = new ArrayDeque<>();
        loos = new ReentrantLock(true);
        grøntLys = loos.newCondition();
    }

    public boolean erFerdig(){
        loos.lock();
        try{
            return ferdig;
        } finally {
            loos.unlock();
        }
    }

    public void leggTilInnlevering(Innlevering innlevering){
        loos.lock();
        try{
            innleveringer.offer(innlevering);
            grøntLys.signal();
        } finally {
            loos.unlock();
        }
    }

    public void økAntallRettet(){
        loos.lock();
        try{
            antallRettet++;
            if (antallRettet == antallStudenter){
                ferdig = true;
                grøntLys.signalAll();
            }
        } finally{
            loos.unlock();
        }
    }

    public Innlevering taUtInnlevering() {
        loos.lock();
        try{
            while (!ferdig && innleveringer.isEmpty()){
                try{
                    grøntLys.await();
                } catch (InterruptedException e){
                    System.out.println("GG");
                    return null;
                }
            }  
            return innleveringer.poll();
        } finally{
            loos.unlock();
        }
    }

    public void giTilbakemeldning(Innlevering innlevering){
        if(innlevering.kvalitet()<35){
            innlevering.settStatus("Ikke godkjent");
        } else if (innlevering.kvalitet()<75){
            innlevering.settStatus("Nytt forsøk");
        } else{
            innlevering.settStatus("Godkjent");
        }
    }
}

class Student implements Runnable {
    Innlevering innlevering;
    static Random random = new Random();
    Devilry devilry;
    CountDownLatch barriere;

    public Student (Devilry d, CountDownLatch b){
        double innsats = random.nextDouble();
        innlevering = new Innlevering(innsats); 
        devilry = d;
        barriere = b;
    }
    @Override
    public void run() {
        devilry.leggTilInnlevering(innlevering);
        while(innlevering.hentStatus().equals("Ikke vurdert")){
            try{
                Thread.sleep(5);
            } catch
                (InterruptedException e){
                    System.out.println("Ble forstyrret mens jeg sov");
                    devilry.økAntallRettet();
                    barriere.countDown();
                    return;
            }
        }
        if (innlevering.hentStatus().equals("Nytt forsøk")){
            innlevering.økKvalitet(random.nextDouble());
            devilry.leggTilInnlevering(innlevering);
        } 
        devilry.økAntallRettet();
        barriere.countDown();
    }  
}

class Retter implements Runnable{
    Devilry devilry;

    Retter(Devilry d){
        devilry = d;
    }
    @Override
    public void run() {
        while(!devilry.erFerdig()){
            Innlevering innlevering = devilry.taUtInnlevering();
            if (innlevering != null){
                devilry.giTilbakemeldning(innlevering);
            }
        }
    }
}

class hovedprogram{
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Bruk: java Testeprogram");
            System.exit(1);
        }

        int antallStudenter = 0;
        int antallRettere = 0;

        try{
            antallStudenter = Integer.parseInt(args[0]);
            antallRettere = Integer.parseInt(args[1]);
        } catch (NumberFormatException e){
            System.out.println("whatever");
            System.exit(2);
        }

        Devilry devilry = new Devilry(antallStudenter);
        CountDownLatch barriere = new CountDownLatch(antallStudenter);

        for (int i=0; i<antallStudenter; i++){
            Thread student = new Thread(new Student(devilry, barriere));
            student.start();
        }

        Thread[] rettere = new Thread[antallRettere];

        for (int i=0; i<antallRettere; i++){
            Thread retter = new Thread(new Retter(devilry));
            retter.start();
        }

        try{
            barriere.await();
            for (Thread tråd: rettere){
                tråd.join();
            }
        } catch (InterruptedException e){
            System.out.println("hva som helst");
        }
        System.out.println("Nå er vi ferdige med alle uhuuu!");
    }
}

class SumHeltall{
    public static void main(String[] args){
        int a;
        int b;
        a = 4;
        b = 5;
        System.out.println(a+b);   
    }
}


class SkattIRuritania{
    public static void main(String[] args){
        double income = Double.parseDouble(args[0]);
        double tax;
        if(income<10000){
            tax = income / 10;
        } else if(income==10000) {
            tax = Double.parseDouble("1000");
        } else{
            tax = (1000) + ((income-10000)/10*3);
        }
        System.out.println("With the income: " + income + "\nTax is: " + tax);
    }
}


import java.util.Scanner;

class SkattRuritania {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        double inntekt = 0.0;
        double skatt = 0.0;

        System.out.println("Tast inn din inntekt:");
        inntekt = Double.parseDouble(tastatur.nextLine());

        if(inntekt < 10000) {
            skatt = inntekt*0.1;
        }
        else {
            skatt = ((10000*0.1) + ((inntekt - 10000)*0.3));
        }

        System.out.println("Skatt: " + skatt);
        tastatur.close();
    }
}


class Sammenlign{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if(a>b){
            System.out.println(a + " er storre enn " + b);
        } else {
            System.out.println(a + " er ikke storre enn " + b);
        }
    }
}


import java.util.Scanner;

class Sammenlign{
    public static void main(String[] args){
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Tast inn a og b");
        int a = Integer.parseInt(tastatur.nextLine());
        int b = Integer.parseInt(tastatur.nextLine());

        if(a>b){
            System.out.println(a + " er storre enn " + b);
        } else {
            System.out.println(a + " er ikke storre enn " + b);
        }
        tastatur.close();
    }
}

import java.util.Scanner;

class MindreStorre{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tast in et tall:");
        int number = Integer.parseInt(keyboard.nextLine());
        if(number<10){
            System.out.println("Tallet er under 10");
        } else if(number>20){
            System.out.println("Tallet er over 20");
        } else{
            System.out.println("Tallet er mellom 10 og 20");
        }
    }
}


class Heltallsarray{
    public static void main(String[] args){
        int a = 0, b=1, c= 2,d= 3,e=4;

        System.out.println("Alle variablene: \n" + a + " " + b + " " + c + " " + d + " " + e);

        int[] array = new int[5];
        for(int i=0;i<5;i++){
            array[i] = i;
        }
        for(int i=0;i<5;i++){
            System.out.println(array[i]);
        }
    }
}

class Lokker{
    static public void main(String[] args){
        int teller = 0;
        while(teller<10){
            System.out.println(teller);
            teller++;
        }
    }
}

import java.util.Scanner;

class Handletur{
    public static void main(String[] args){
        Scanner tastatur = new Scanner(System.in);

        int totalHandel;
        int brød = 20;
        int melk = 15;
        int ost = 40;
        int yoghurt = 12;

        System.out.println("Hei! Velkommen til IFI-butikken");

        System.out.println("Hvor mange brød vil du ha?");
        int userInput1 = Integer.parseInt(tastatur.nextLine());
        System.out.println("Hvor mange melk vil du ha?");
        int userInput2 = Integer.parseInt(tastatur.nextLine());
        System.out.println("Hvor mange ost vil du ha?");
        int userInput3 = Integer.parseInt(tastatur.nextLine());
        System.out.println("Hvor mange yoghurt vil du ha?");
        int userInput4 = Integer.parseInt(tastatur.nextLine());

        totalHandel = brød*userInput1 + melk*userInput2 + ost*userInput3 + yoghurt*userInput4;

        System.out.println("Du skal betale: " + totalHandel + " kr");
    }
}


class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Bytte {
    public static void main(String[] args) {
        Pair pair = new Pair(3, 4);
        variabelBytte(pair);
        System.out.println(pair.x + " " + pair.y);  // Output: 4 3
    }

    public static void variabelBytte(Pair p) {
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
    }
}



import java.io.File;  
import java.util.Scanner;
import java.io.FileNotFoundException;

class FraFil{
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Usage: java FraFil <filename>");
            System.exit(1);
        }
        try {
            Scanner fileScanner = new Scanner(new File(args[0]));
            processFile(fileScanner);
        } catch (FileNotFoundException e) {
            System.out.println("WC: Cannot read file " + args[0]);
            System.exit(2);
        }
    }
    private static void processFile(Scanner file){
        while (file.hasNextLine()) {
            String line = file.nextLine();
            System.out.println(line);
            }
        file.close();
    }
}


import java.util.Scanner;
import java.io.File;

class FraFil {
    public static void main(String[] args) throws Exception {
        Scanner fil = new Scanner(new File("tekst.txt"));

        String linje = "";
        while(fil.hasNextLine()) {
            linje = fil.nextLine();
            System.out.println(linje);
        }
        fil.close();
    }
}

import java.util.HashMap;
class hashMap {
    public static void main(String[] args){
        HashMap<Integer,String> idTilTekst = new HashMap<>();

        for(int i=1;i<6;i++){
            idTilTekst.put(i, "Verdi " + i);
        }

        System.out.println("----- Par av nøkler og verdier -----");

        for(Integer id:idTilTekst.keySet()){
            System.out.println(id + ": " + idTilTekst.get(id));
        }
        System.out.println();
        System.out.println("----- Uthenting, endring og slettinger -----");

        System.out.println("Verdien til nøkkel 5: " + idTilTekst.get(5));
        System.out.println();

        idTilTekst.put(3, "Ny verdi");
        System.out.println("Etter endring: " + 3 + ": " + idTilTekst.get(3));
        System.out.println();

        String fjernetVerdi = idTilTekst.remove(1);
        System.out.println("Første sletting returnerte: " + fjernetVerdi);
        fjernetVerdi = idTilTekst.remove(1);
        System.out.println("Andre sletting returnerte: " + fjernetVerdi);
        System.out.println();

        System.out.println("----- Nøkler på to måter -----");
        for (Integer id : idTilTekst.keySet()) {
            System.out.println(id);
        }
        System.out.println();
        for (HashMap.Entry<Integer, String> entry : idTilTekst.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println();

        System.out.println("----- Verdier på to måter -----");
        for (String tekst : idTilTekst.values()) {
            System.out.println(tekst);
        }
        System.out.println();
        for (HashMap.Entry<Integer, String> entry : idTilTekst.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println();
    }
}


import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Persona{
    String navn;
    Persona(String n){
        navn = n;
    }
    public String hentNavn(){
        return navn;
    }
}

class Hund {
    String navn;
    Hund(String n){
        navn = n;
    }
    public String hentNavn(){
        return navn;
    }
}

class hovedprogram{
    public static void main(String[] args) throws Exception{
        List<Persona> personer = new ArrayList<>();
        List<Hund> hunder = new ArrayList<>();

        Scanner fil = new Scanner(new File("navn.txt"));

        while(fil.hasNextLine()){
            String line = fil.nextLine();
            String[] delt = line.split(" ");
            if(delt[0].equals("H")){
                Hund hund = new Hund(delt[1]);
                hunder.add(hund);
            } else if(delt[0].equals("P")){
                String navn = "";
                for(int i=1; i<delt.length;i++){
                    navn+=delt[i] + " ";
                }
                Persona p = new Persona(navn);
                personer.add(p);
            } else{
                System.out.println("Feil format!");
            }
        }
        System.out.println("Personer:");
        for(Persona person:personer){
            System.out.println(person.hentNavn());
        }

        System.out.println("Hunder:");
        for(Hund hund:hunder){
            System.out.println(hund.hentNavn());
        }
        
    }
}


class Baat {
    private static int antProd = 0;
    private int prodnr;
    private String merke;

    public Baat(String mrk) {
        prodnr = antProd;
        antProd++;
        merke = mrk;
    }

    public String hentInfo() {
        return "Produksjonsnummer: " + prodnr + ", merke: " + merke;
    }
}

class Baathus{
    Baat[] båter;
    int maksAntall;
    Baathus(int antall){
        maksAntall = antall;
        båter = new Baat[maksAntall];
    }

    public void settInn(Baat båt){
        int ledigPlasser = 0;
        for(int i=0;i<maksAntall;i++){
            if(båter[i]==null){
                båter[i]=båt;
                ledigPlasser++;
                break;
            }
        } if(ledigPlasser==0){
            System.out.println("det er ikke ledig plass");
        }
    }
    public void skrivBaater(){
        for(int i=0;i<maksAntall;i++){
            Baat båt = båter[i];
            System.out.println(båt.hentInfo());
        }
    }
}

class TestBaathus{
    public static void main(String[] args){
        Baathus hub = new Baathus(3);
        Baat båt1 = new Baat("Volvo");
        Baat båt2 = new Baat("BMW");
        Baat båt3 = new Baat("Hundai");
        hub.settInn(båt1);
        hub.settInn(båt2);
        hub.settInn(båt3);
        hub.skrivBaater();
        Baat båt4 = new Baat("Dziguli");
        hub.settInn(båt4);
    }
}


import java.util.HashMap;
import java.util.Scanner;

class Telefonbok{
    public static void main(String[] args){
        HashMap<String,String> telefonbok = new HashMap<>();
        telefonbok.put("Arne", "22334455");
        telefonbok.put("Lisa", "95959595");
        telefonbok.put("Jonas", "97959795");
        telefonbok.put("Peder", "12345678");

        Scanner in = new Scanner(System.in);

        int input = 0;
                    
        while(input != 1) {
            System.out.println("Meny:\n0: Soek etter person\n1: Avslutt");
            input = Integer.parseInt(in.nextLine());

            if (input == 0) {
                System.out.println("Hvem vil du ha nummeret til?");
                String navn = in.nextLine();


                if (telefonbok.containsKey(navn)) {
                    String tlf = telefonbok.get(navn);
                    System.out.println("Navn: " + navn + ", tlf: " + tlf);
                } else {
                    System.out.println("Fant ikke " + navn + ".");
                }
            }
        }

        System.out.println("Oversikt:");
        for (String navnekey : telefonbok.keySet()) {
            System.out.println("Navn: " + navnekey + ", tlf: " + telefonbok.get(navnekey));
        }
        in.close();
    }
}


import java.util.ArrayList;
import java.util.Scanner;

class KoLapp{
    int nummer;

    //Konstruktor
    public KoLapp(int n){
        nummer = n;
    }

    //Returnerer et tildelt nummer paa kolappen.    
    public int hentNummer(){
        return nummer;
    }
}

class KoSystem{
    ArrayList<KoLapp> koLapper = new ArrayList<>();
    static int ID = 0;
    //Lager et nytt objekt av KoLapp, printer ut informasjon om den og legger den til i listen over koLapper.     
    public void trekkKoLapp(){
        KoLapp lapp = new KoLapp(ID);
        System.out.println("Det er Lapp nummer: " + lapp.hentNummer());
        System.out.println();
        koLapper.add(lapp);
        ID++;
    }

    //Henter ut, printer ut informasjon og fjerner den forste kolappen i lista. Gir feilmelding dersom ingen kunder staar i ko.
    public void betjenKunde(){
        if(!koLapper.isEmpty()){
            KoLapp fjernet = koLapper.remove(0);
            System.out.println("Kunden med lappen nummber: " + fjernet.hentNummer() + " var betjenet");
            System.out.println();
        } else{
            System.out.println("køen er tom - ha det!");
        }
    }

    //Returnerer antall kunder som er i ko.
    public int antKunder(){
        return koLapper.size();
    }

    //Printer alle kunder i ko
    public void printKunderIKo(){
        System.out.println("Det er kunder som fremdeles i køen: ");
        System.out.println();
        for(KoLapp kunden:koLapper){
            System.out.println("kunden med lappen nummer: " + kunden.hentNummer());
            System.out.println();
        }
    }
}

class KoProgram{
    public static void main(String[] args){
        KoSystem system = new KoSystem();
        Scanner input = new Scanner(System.in);
        Boolean utføre = true;

        while(utføre==true){
            System.out.println("**MENY FOR BILLETTSYSTEM**" + "\n1 - Trekk ny kolapp" + "\n2 - Betjen kunde" + "\n3 - Print antall kunder i kø" + "\n4 - Avslutt");
            System.out.println();
            int valg = Integer.parseInt(input.nextLine());
            if(valg==1){
                system.trekkKoLapp(); 
            } else if(valg==2){
                system.betjenKunde();
            } else if(valg==3){
                System.out.println("Det finnes " + system.antKunder() + " kunder i kø");
                System.out.println();
            } else if(valg==4){
                utføre=false;
            } else{
                System.out.println("Ugyldig input - prøv på nytt");
            }
        }
        input.close();
    }
}


import java.io.*;
import java.util.Scanner;

class Skattekart {
    private char[][] skattekart;
    private int hoyde;
    private int bredde;
    private boolean funnet = false;

    private Skattekart(char[][] kart, int rader, int kolonner) {
        skattekart = kart;
        this.hoyde = rader;
        this.bredde = kolonner;
    }

    static Skattekart lesInn(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);

        String[] str = sc.nextLine().split(" ");
        int antR = Integer.parseInt(str[0]);
        int antK = Integer.parseInt(str[1]);

        char[][] kart = new char[antR][antK];

        for (int rad = 0; rad < antR; rad++) {
            String linje = sc.nextLine();

            for (int kol = 0; kol < antK; kol++) {
                kart[rad][kol] = linje.charAt(kol);
            }
        }

        Skattekart sk = new Skattekart(kart, antR, antK);

        return sk;
    }

    public void skrivUt() {
        for (int i = 0; i < skattekart.length; i++) {
            for (int j = 0; j < skattekart[i].length; j++) {
                if (funnet) {
                    System.out.print(skattekart[i][j]);
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public boolean sjekk(int kol, int rad) {
        if (skattekart[rad][kol] == 'X') {
            funnet = true;
        }
        return funnet;
    }
}

class Hovedprogram {

    public static void main(String[] args) {
        Skattekart skattekart = null;

        try {
            File fil = new File(args[0]);
            skattekart = Skattekart.lesInn(fil);

        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen!");
        }

        skattekart.skrivUt();
        Scanner brukerinput = new Scanner(System.in);

        System.out.println("\nFinn skatten! Gjett koordinater paa formatet (kol rad) (a for aa avslutte):");
        String inn = brukerinput.nextLine();

        int antForsoek = 0;

        while (!inn.equals("a")) {
            String[] l = inn.split(" ");

            try {
                int kol = Integer.parseInt(l[0]);
                int rad = Integer.parseInt(l[1]);

                if (skattekart.sjekk(kol, rad)) {
                    System.out.println("\nDu fant skatten!");
                    inn = "a";

                } else {
                    antForsoek ++;
                    System.out.println("\nIngen skatt der! Gjett igjen:");
                    inn = brukerinput.nextLine();
                }

                skattekart.skrivUt();

            } catch (NumberFormatException e) {

                System.out.println("UGYLDIGE KOORDINATER!");
            }
        }
    }
}


class Bygning {
    double bruttoAreal;
    Bygning(double b){
        bruttoAreal = b;
        System.out.println("Trum tower");
    }
}

class Skyskraper extends Bygning{
    int antallEtasjer;
    Skyskraper(double b, int a){
        super(b);
        antallEtasjer = a;
        System.out.println("Make America great again!");;
    }
}

class Bygninger{
    public static void main(String[] args){
        Skyskraper skyskraper = new Skyskraper(4.4,3);
    }
}


abstract class Figur{
    public abstract double areal();
}

class Trekant extends Figur{

    private double hoyde;
    private double grunnlinje;

    public Trekant(double h, double g){
        hoyde = h;
        grunnlinje = g;
    }

    public double areal(){
        return (grunnlinje*hoyde)/2;
    }
}

class Sirkel extends Figur{

    private double radius;

    public Sirkel(double r){
        radius = r;
    }

    public double areal(){
        return radius*radius*Math.PI;
    }
}

class Rektangel extends Figur{

    private double bredde;
    private double hoyde;

    public Rektangel(double b, double h){
        bredde = b;
        hoyde = h;
    }

    public double areal(){
        return hoyde*bredde;
    }
}

class Kvadrat extends Figur{

    double side;

    public Kvadrat(double s){
        side = s;
    }

    public double areal(){
        return side*side;
    }
}

class FigurTest {
public static void main(String[] args) {
Figur[] figurliste = new Figur[4];

    figurliste[0] = new Trekant(2, 3);
    figurliste[1] = new Sirkel(3);
    figurliste[2] = new Rektangel(3, 7);
    figurliste[3] = new Kvadrat(4);

    double areal = 0;

    for (int i = 0; i < figurliste.length; i++) {
        areal += figurliste[i].areal();
    }

    System.out.println(areal);
}
}


class LikeStrenger{
    public static void main(String [] args){
        String navn1 = new String("Maria");
        String navn2 = new String("Maria");

        if(navn1.equals(navn2)){
            System.out.println("Navnene er like!");
        } else {
            System.out.println("Navnene er ikke like!");
        }
    }
}

import java.util.Scanner;

class kjøretøy{
    String Registreringsnummer;
    String Fabrikkmerke ;
    String eiersNavn;

    kjøretøy(String R,String F,String e){
        Registreringsnummer = R;
        Fabrikkmerke = F;
        eiersNavn = e;
    }
    void skrivInfo() {
        System.out.println("Kjøretøy:" + Registreringsnummer + "\nMerke: " + Fabrikkmerke + "\nEier: " + eiersNavn);
    }
    public String hentRegistreringsnummer(){
        return Registreringsnummer;
    }
    public String hentFabrikkmerke(){
        return Fabrikkmerke;
    }
    public String henteiersNavn(){
        return eiersNavn;
    }
}

class Busser extends kjøretøy{
    int antallSitteplasser;
    Busser(String R, String F, String e, int a){
        super(R, F, e);
        antallSitteplasser = a;
    }
    @Override
    void skrivInfo() {
        System.out.println("Buss:" + Registreringsnummer + "\nMerke: " + Fabrikkmerke + "\nEier: " + eiersNavn + "\nPlasser: " + antallSitteplasser);
    }
}
class Personbiler extends kjøretøy{
    int antallSitteplasser;
    Personbiler(String R, String F, String e, int a){
        super(R, F, e);
        antallSitteplasser = a;
    }
    double hentAarsavgift(){
        return 3000.0;
    }
    @Override
    void skrivInfo() {
        System.out.println("Bil:" + Registreringsnummer + "\nMerke: " + Fabrikkmerke + "\nEier: " + eiersNavn + "\nPlasser: " + antallSitteplasser);
    }
}

class Varebiler extends kjøretøy{
    int maxLastevekt;
    Varebiler(String R, String F, String e, int m){
        super(R, F, e);
        maxLastevekt = m;
    }
    double hentAarsavgift(){
        return 4 * maxLastevekt;
    }
    @Override
    void skrivInfo() {
        System.out.println("Bil:" + Registreringsnummer + "\nMerke: " + Fabrikkmerke + "\nEier: " + eiersNavn + "\nMaksimal lastevekt: " + maxLastevekt);
    }
}

class hoved{
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        boolean flag = false;
        while(flag!=true){
            System.out.println("Register nytt kjøretøy!");
            System.out.println("Hvilken typen?\nFor busser press - 1\nFor personbiller press - 2\nFor varebiller press - 3");
            System.out.println();
            int typen = Integer.parseInt(input1.nextLine());
            System.out.println();
            System.out.println("Skriv registreringsnummet: ");
            String nummer = input1.nextLine();
            System.out.println();
            System.out.println("Skriv navnet ditt: ");
            String navnet = input1.nextLine();
            System.out.println();
            System.out.println("Skriv navnet fabrikkMerke: ");
            String merke = input1.nextLine();
            System.out.println();
            if(typen==1){
                System.out.println("Skriv antall sittePlasser: ");
                int sittePlasser = Integer.parseInt(input1.nextLine());
                System.out.println();
                kjøretøy buss = new Busser(nummer,merke,navnet,sittePlasser);
                buss.skrivInfo();
                System.out.println();
            } else if(typen==2){
                System.out.println("Skriv antall sittePlasser: ");
                int sittePlasser = Integer.parseInt(input1.nextLine());
                System.out.println();
                kjøretøy bill = new Personbiler(nummer,merke,navnet,sittePlasser);
                bill.skrivInfo();
                System.out.println();
            } else if(typen==3){
                System.out.println("Skriv maxLastevekt: ");
                int maxLastevekt = Integer.parseInt(input1.nextLine());
                System.out.println();
                kjøretøy varebil = new Varebiler(nummer,merke,navnet,maxLastevekt);
                varebil.skrivInfo();;
                System.out.println();
            } else{
                System.out.println("Ugyldig input\nPrøv på nytt!");
                System.out.println();
            }
            System.out.println("Hvis du vil stoppe press 0\nFor å fortsette hvilket som helst annet tall :)");
            int fortsette = Integer.parseInt(input1.nextLine());
            if(fortsette==0){
                flag = true;
            }
        }
        input1.close();
    }
}


interface rovdyr {
    public void jakte();
}

interface planteetere{
    public void beskytte();
}

class Bjorn implements rovdyr{
    @Override
    public void jakte() {
        System.out.println("Jeg er Bjorn\nJeg jakteeee");
    }
}
class Ulv implements rovdyr{
    @Override
    public void jakte(){
        System.out.println("Jeg er Ulv\nJeg jakteeee");
    }
}
class Elg implements planteetere{
    @Override
    public void beskytte() {
        System.out.println("Jeg er Elg\nLeave me alone");
    }
}
class Sau implements planteetere{
    @Override
    public void beskytte() {
        System.out.println("Jeg er Sau\nLeave me alone");
    }
}

class hoved{
    public static void main(String[] args){
        rovdyr[] rovdyrs = new rovdyr[2];
        planteetere[] planteeteres = new planteetere[2];

        Bjorn bjorn = new Bjorn();
        Ulv ulv = new Ulv();
        rovdyrs[0] = bjorn;
        rovdyrs[1] = ulv;
        Elg elg = new Elg();
        Sau sau = new Sau();
        planteeteres[0] = elg;
        planteeteres[1] = sau;

        rovdyrs[0].jakte();
        rovdyrs[1].jakte();
        planteeteres[0].beskytte();
        planteeteres[1].beskytte();
    }
}


interface Figur{
    double beregnAreal();
    double beregnOmkrets();
}

class Rektangel implements Figur{
    private double hoyde;
    private double bredde;

    Rektangel(double h,double b){
        hoyde = h;
        bredde = b;
    }
    @Override
    public double beregnAreal() {
        return hoyde * bredde;
    }
    @Override
    public double beregnOmkrets(){
        return 2*(hoyde+bredde);
    }
}

class Sirkel implements Figur{
    private double radius;
    Sirkel(double r){
        radius = r;
    }
    public double beregnAreal(){
        return radius * radius * Math.PI;
    }
     public double beregnOmkrets(){
        return radius * 2 * Math.PI;
    }
}


class Personok{
    String navn;
    String gjenstand;
    Personok neste;
    Personok(String n,String g){
        navn = n;
        gjenstand = g;
    }
    @Override
    public String toString() {
        return navn + " kjøper " + gjenstand +"\n- Hade bra!";
    }
}

class Butikk{
    Personok first;

    public void entreButikk(Personok p){
        Personok aktuellPerson = first;
        if(aktuellPerson==null){
            first = p;
        } else{
            while(aktuellPerson.neste!=null){
                aktuellPerson = aktuellPerson.neste;
            }
            aktuellPerson.neste = p;
        }
    }
    public void kassa(){
        Personok aktuellPerson = first;
        if(aktuellPerson==null){
            System.out.println("Ingen flere kunder. Vi stenger butikken for i dag.");
        } else{
            first = aktuellPerson.neste;
            aktuellPerson.neste = null;
            System.out.println(aktuellPerson);
        }
    }
}

class hoved{
    public static void main(String[] args){
        Butikk butikk = new Butikk();

        Personok person1 = new Personok("Niels Henrik Abel","kladdebok med ruter");
        Personok person2 = new Personok("Vilhelm Bjerknes","termometer");
        Personok person3 = new Personok("Sheldon Cooper","lego");

        butikk.entreButikk(person3);
        butikk.entreButikk(person2);
        butikk.entreButikk(person1);

        butikk.kassa();
        butikk.kassa();
        butikk.kassa();
        butikk.kassa();
    }
}

import java.util.ArrayList;
class Katt implements Comparable<Katt> {
    private String navn;
    private int alder;

    public Katt(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public int compareTo (Katt annen) {
        return this.alder - annen.alder;
    }

    public String toString() {
            return "Katten " + navn + ", alder: " + alder;
    }
}



class SammenlignKatt {
        public static void main(String[] args) {

        ArrayList<Katt> katteliste = new ArrayList<>();

        Katt anne = new Katt("Anne", 4);
        Katt liss = new Katt("Liss", 8);
        Katt beate = new Katt("Beate", 3);

        katteliste.add(anne);
        katteliste.add(liss);
        katteliste.add(beate);

        Katt eldst = katteliste.get(0);
        for (Katt k : katteliste) {
            if (k.compareTo(eldst) > 0) {
                eldst = k;
            }
        }

        System.out.println(eldst);
    }
}

import java.util.ArrayList;
class resultat implements Comparable<resultat>{
    int verdi;
    resultat(int v){
        verdi=v;
    }
    @Override
    public int compareTo(resultat o) {
        return this.verdi - o.verdi;
    }
}


class GraadigBeholder <T extends Comparable<T>> {
T mittElement;

    public T settInn (T ny) {
        if (mittElement == null) {
            mittElement = ny;
            return null;

        } else if (ny.compareTo(mittElement) >= 0) {
            T midlertidig = mittElement;
            mittElement = ny;
            return midlertidig;

        } else {
            return null;
        }
    }

    public T seInnhold() {
        return mittElement;
    }
}


class SammenlignResultater{
        public static void main(String[] args) {

        GraadigBeholder<resultat> beholder = new GraadigBeholder<>();

        resultat result1 = new resultat(4);
        resultat result2 = new resultat(7);
        resultat result3 = new resultat(9);
        resultat result4 = new resultat(2);

        beholder.settInn(result1);
        beholder.settInn(result2);
        beholder.settInn(result3);
        beholder.settInn(result4);

        System.out.println(beholder.seInnhold().verdi);
        
    }
}

class DobbelLenke<T>{
    Node starte;

    private class Node{
        T data;
        Node neste;
        Node forrige;
        Node(T d){
            data = d;
        }
    }

    public void settInn(T element){
        Node nyNode = new Node(element);
        Node midlertidig = starte;
        if(midlertidig==null){
            starte = nyNode;
        } else{
            while(midlertidig.neste!=null){
                midlertidig = midlertidig.neste;
            }
            midlertidig.neste = nyNode;
            nyNode.forrige = midlertidig;
        }
    }
}

import java.util.Iterator;

class EnkelArrayListe implements Iterable<String>{
    String[] array;
    int maksAntall;
    int størrelse = 0;

    EnkelArrayListe(int m){
        maksAntall = m;
        array = new String[maksAntall];
    }
    public void leggTill(String string){
        if(størrelse>=maksAntall){
            throw new IllegalStateException("Ikke plass til flere");
        }
        array[størrelse++] = string;
    }

    public Iterator<String> iterator(){
        return new ListeIterator();
    }

    private class ListeIterator implements Iterator<String>{
        private int indeks = 0;

        public boolean hasNext(){
            return indeks<størrelse;
        }
        public String next(){
            return array[indeks++];
        }
    }
}

import java.util.ArrayList;

class Katt implements Comparable<Katt> {
    private String navn;
    private int alder;

    public Katt(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public int compareTo (Katt annen) {
        return this.alder - annen.alder;
    }

    public String toString() {
            return "Katten " + navn + ", alder: " + alder;
    }
}
class SortertArrayList<T extends Comparable<T>>{
    ArrayList<T> list = new ArrayList<>();

    public void settInn(T data){
        for(int i=0;i<list.size();i++){
            if(list.get(i).compareTo(data)>0){
                list.add(i,data);
                return;
            }
        }
        list.add(data);
    }
    public T hentFørst(){
        return list.remove(0);
    }
}


class Hovedprogram {
    public static void main(String[] args) {
        SortertArrayList<Katt> katter = new SortertArrayList<>();
        katter.settInn(new Katt("a", 5));
        katter.settInn(new Katt("b", 3));
        katter.settInn(new Katt("c", 1));
        katter.settInn(new Katt("d", 10));
        for (int i = 0; i < 4; i++) {
            System.out.println(katter.hentFørst());
        }
    }
}


import java.util.Scanner;

class Klokke implements Runnable {
    private volatile boolean running = true;
    public void run () {
        int tid = 0;
        while (running) {
            System.out.println(tid + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            tid++;
        }
    }
    public void Stop() {
        running = false;
    }
}

class Stoppeklokke1 {
    public static void main (String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Trykk Return for å starte...");
        tastatur.nextLine();
        
        Klokke klokkeRunnable = new Klokke();
        Thread klokkeThread = new Thread(klokkeRunnable);
        klokkeThread.start();

        System.out.println("Trykk Return for å stoppe...");
        tastatur.nextLine();
        klokkeRunnable.Stop();
        klokkeThread.interrupt();
        System.out.println("Takk for nå");
        tastatur.close();
    }
}



import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock; 
import java.util.concurrent.locks.ReentrantLock;


class Barista implements Runnable{

    private Bord bord;
    private int id; 
    private final String[] drikker = {"Americano", "Café au lait", "Caffè latte", "Caffè mocca", "Espresso", "Cortado"}; 

    public Barista(Bord b, int id){
        bord = b; 
        this.id = id; 
    }
    @Override
    public void run(){
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int indeks = random.nextInt(drikker.length);
            String drikke = drikker[indeks]; 
            bord.serverKaffe(drikke);
            System.out.println("Barista "+ id + " sererverer en " + drikke);
            try {
                Thread.sleep(500); // Simulate coffee prep time (200–500ms)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Barista " +id + " er ferdig. ");

    }
}

class Kaffedrikker implements Runnable {
    private Bord bord;
    private int id;
    
    public Kaffedrikker(Bord b, int i){
        bord = b;
        id = i;
    }
    @Override
    public void run() {
         int antKaffe = 0;
         try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
         try {
            String kaffe;
            while ((kaffe = bord.hentKaffe()) != null){
                System.out.println("Kaffedrikker " + id + " drikker en " + kaffe);
                antKaffe++;
            }
         } catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Kaffedrikker " + id + "ble avbrutt.");
         } finally{
            System.out.println("Kaffedrikker " + id + " har drukket "+ antKaffe + " kopper kaffe.");
         }
    }
}

class Bord{
    private ArrayList<String> kopper = new ArrayList<>();
    private Lock lås = new ReentrantLock();
    private Condition ikkeTomt = lås.newCondition();
    private int totaltAntallKopper;
    
    public Bord(int ant) {
        totaltAntallKopper = ant;
    }

    public void serverKaffe(String kopp){
        lås.lock();
        try{
            kopper.add(kopp);
            totaltAntallKopper--;
            ikkeTomt.signalAll();
        } finally{
            lås.unlock();
        }
    }
    public String hentKaffe() throws InterruptedException{
        lås.lock();
        try{
            while(kopper.isEmpty() && totaltAntallKopper > 0){
                ikkeTomt.await();
            }
            if (!kopper.isEmpty()){
                return kopper.remove(0);
            }
            return null;
        } finally{
            lås.unlock();
        }
    }
}

class Hovedprogram {
    public static void main(String[] args) {
        int antBaristaer = 2;
        int kaffePerBarista = 10;
        int antKaffedrikkere = 10;

        // Totalt antall kopper kaffe som vil bli laget
        int totaltKaffe = antBaristaer * kaffePerBarista;

        Bord bord = new Bord(totaltKaffe);

        // Start baristaer
        Thread barista1 = new Thread(new Barista(bord, 1));
        Thread barista2 = new Thread(new Barista(bord, 2));
        barista1.start();
        barista2.start();

        // Start kaffedrikkere
        Thread[] drikkere = new Thread[antKaffedrikkere];
        for (int i = 0; i < antKaffedrikkere; i++) {
            drikkere[i] = new Thread(new Kaffedrikker(bord, i + 1));
            drikkere[i].start();
        }
        System.out.println("Alle baristaer og kaffedrikkere er ferdige.");
    }
}



import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock; 
import java.util.concurrent.locks.ReentrantLock;

class Banke{
    int pengebeløp = 100;
    private Lock loos = new ReentrantLock();
    private Condition ikkeTomt = loos.newCondition();

    public void ta(int belop) throws InterruptedException {
        loos.lock();
        try{
            while(belop>pengebeløp){
                ikkeTomt.await();
            }
            pengebeløp-=belop;
        } finally {
            loos.unlock();
        }
    }

    public void gi(int belop){
        loos.lock();
        try{
            pengebeløp+=belop;
            ikkeTomt.signalAll();
        } finally{
            loos.unlock();
        }
    }

    public int saldo(){
        loos.lock();
        try {
            return pengebeløp;
        }
        finally {
            loos.unlock();
        }
    }
}

class bruker implements Runnable{
    Banke monitor;
    bruker(Banke m){
        monitor = m;
    }
    @Override
    public void run(){
        Random random = new Random();
        for(int i=0;i<10;i++){
            int belop = random.nextInt(100);
            try{
                monitor.ta(belop);
            } catch (InterruptedException e){
            }
            monitor.gi(belop);
            System.out.println(monitor.saldo());
        }
    }
}


class hovedP{
    public static void main(String[] args){
        Banke monitor = new Banke();
        for(int i=0;i<25;i++){
            Thread thread = new Thread(new bruker(monitor));
            thread.start();
        }
    }
}



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Tallmonitor{
  private int detMinste = Integer.MIN_VALUE;
  private int detStorste = Integer.MAX_VALUE;
  private Lock laas = new ReentrantLock();

  public boolean settMinste(int nyMinste){
    laas.lock();
    try{
      if(detStorste <= nyMinste) return false;
      detMinste = nyMinste;
      return true;
    }
    finally{
      laas.unlock();
    }
  }

  public boolean settStorste(int nyStorste){
    laas.lock();
    try{
      if(nyStorste <= detMinste) return false;
      detStorste = nyStorste;
      return true;
    }
    finally{
      laas.unlock();
    }
  }
}

class Nedover implements Runnable{
  private Tallmonitor monitor;
  private int tall;
  private boolean minMindreEnnStorst = true;

  public Nedover(Tallmonitor monitor){
    this.monitor = monitor;
    tall = 100;
  }

  public void run(){
      while(monitor.settStorste(tall)){
        tall--;
      }
      System.out.println("STOPP! Tallet er ikke lenger størst: " + tall);
    }
}

class Oppover implements Runnable{
  private Tallmonitor monitor;
  private int tall;
  private boolean minMindreEnnStorst = true;

  public Oppover(Tallmonitor monitor){
    this.monitor = monitor;
    tall = 10;
  }

  public void run(){
      while(monitor.settMinste(tall)){
        tall++;
      }
      System.out.println("STOPP! Tallet er ikke lenger minst: " + tall);
    }
}

class TestTallmonitor{
  public static void main(String[] args) {
    Tallmonitor tm = new Tallmonitor();
    Thread traad1 = new Thread(new Nedover(tm));
    Thread traad2 = new Thread(new Oppover(tm));
    traad1.start();
    traad2.start();
  }
}


import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock; 
import java.util.concurrent.locks.ReentrantLock;

class metodeRun implements Runnable{
    int n;
    int start;
    int maks;
    Monitorik monitor;
    metodeRun(int n,int s,int m,Monitorik mo){
        this.n = n;
        start = s;
        maks = m;
        monitor = mo;
    }
    @Override
    public void run(){
        try{
            while(start<=maks){
            monitor.taTall(start);
            start+=n;
        }
        } catch (InterruptedException e){
        }

    }
}

class Monitorik{
    private Lock laas = new ReentrantLock();
    Condition ikkjeNeste = laas.newCondition();
    int currentTall=-1;

    public void taTall(int tall) throws InterruptedException{
        laas.lock();
        try{
            while(tall-1!=currentTall){
                ikkjeNeste.await();
            }
            currentTall = tall;
            System.out.println(currentTall);
            ikkjeNeste.signalAll();
        } finally{
            laas.unlock();
        }
    }
}

class hoved{
    public static void main(String[] args){
        Monitorik monitor = new Monitorik();
        for(int i=0;i<10;i++){
            Thread thread = new Thread(new metodeRun(10,i,100,monitor));
            thread.start();
        }
    }
}

import java.util.Iterator;

class Fly{
    int MTOW;
    int antalMotorer;
    int trekkraft;
    String ID;
    Fly neste;
    Fly(int M,int a,int t,String ID){
        MTOW = M;
        antalMotorer = a;
        trekkraft = t;
        this.ID = ID;
    }
    
    String hentId(){
        return ID;
    }
    int hentMotorAntall(){
        return antalMotorer;
    }
    int hentMTOW(){
        return MTOW;
    }
}

class Seilfly extends Fly{
    int minSynHast;
    
    Seilfly(int M,int a,int t,String ID,int mSH){
        super(M,0,0,ID);
        minSynHast = mSH;
    }
}

interface Motordrevet{
    public int trekkraft();
}

class MotorFly extends Fly implements Motordrevet{
    MotorFly(int M,int a,int t,String ID){
        super(M,a,t,ID);
    }
    @Override
    public int trekkraft(){
        return trekkraft;
    }
}

class LasteFly extends MotorFly{
    int maksTillLaste;
    LasteFly(int M,int a,int t,String ID,int mTL){
        super(M,a,t,ID);
        maksTillLaste = mTL;
    }
}

class PassasjerFly extends MotorFly{
    int maksAntPass;
    PassasjerFly(int M,int a,int t,String ID,int mAP){
        super(M,a,t,ID);
        maksAntPass = mAP;
    }
}



class Flyformasjon implements Iterable<Fly>{
    Fly foerste;
    PassasjerFly[] arrayMed;
    Flyformasjon(){
    }
    
    void leggTil(Fly nyFly){
        Fly midlertidig = foerste;
        if(midlertidig==null){
            foerste = nyFly;
        } else{
            while(midlertidig.neste!=null){
                midlertidig = midlertidig.neste;
            }
            midlertidig.neste = nyFly;
        }
    }
    
    boolean erMed(String Id){
        Fly midlertidig = foerste;
        while(midlertidig!=null){
            if(midlertidig.hentId().equals(Id)){
                return true;
            }
             midlertidig = midlertidig.neste;
        }
        return false; 
    }
    
    Fly taUt(String Id){
        Fly midlertidig = foerste;
        Fly forrige = null;
        
        while(midlertidig!=null){
            if(midlertidig.hentId().equals(Id)){
                if(forrige==null){
                    foerste = midlertidig.neste;;
                } else{
                    forrige.neste = midlertidig.neste;
                }
                return midlertidig;
            }
            forrige = midlertidig;
            midlertidig = midlertidig.neste;
        }
        return null; 
    }
    
    @Override
    public Iterator<Fly> iterator() {
        return new flyIterator();
    }
    
    private class flyIterator implements Iterator<Fly> {
        Fly midlertidig = foerste;

        @Override
        public boolean hasNext(){
            return midlertidig!=null;
        }
        @Override
        public Fly next(){
            Fly forReturn = midlertidig;
            midlertidig = midlertidig.neste; 
            return forReturn;
        }
    }
    
    PassasjerFly[] hentPassasjerFly(){
        int antall = 0;
        Fly midlertidig = foerste;
        
        while(midlertidig!=null){
            if(midlertidig instanceof PassasjerFly){
                antall++;
            }
            midlertidig = midlertidig.neste;
        }
        
        arrayMed = new PassasjerFly[antall];
        
        midlertidig = foerste; 
        antall = 0;
        
        while(midlertidig!=null){
            if(midlertidig instanceof PassasjerFly){
                arrayMed[antall] = (PassasjerFly)midlertidig;
                antall++;
            }
            midlertidig = midlertidig.neste;
        }
        return arrayMed;
    }
    
    int totalVekt(){
        int total = 0;
        for(Fly etFly:this){
            total+= etFly.hentMTOW();
        }
        return total;
    }
    
    int maksVekt(){
        Fly midlertidig = foerste;
        return rekursivMaksVekt(0,midlertidig);
    }
    
    int rekursivMaksVekt(int maksVekt, Fly midlertidig){
        if(midlertidig==null){
            return maksVekt;
        }
        if(midlertidig.hentMTOW()>maksVekt){
            maksVekt = midlertidig.hentMTOW();
        }
        return rekursivMaksVekt(maksVekt, midlertidig.neste);
    }
    
}


class hovedprogram {
    public static void main(String[] args){
        triangel(1,8);
    }

    static void triangel(int m, int n){
        if(m==n){
            System.out.println("*".repeat(m));
            return;
        } else {
            System.out.println("*".repeat(m));
            triangel(m+1, n);
            System.out.println("*".repeat(m));
        }
      }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PanelAsCentralComponent {
    public static void main(String[] args) {
        // Create the main frame (window)
        JFrame frame = new JFrame("Panel as Central Component");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 220);

        // Create the main panel and set its layout
        JPanel mainPanel = new JPanel(new BorderLayout(5, 5)); // 5px gaps

        // CENTER: Add a text field in the center
        JTextField textField = new JTextField();
        mainPanel.add(textField, BorderLayout.CENTER);

        // SOUTH: Add a panel with both the label and button
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("Panel-based GUI Example");
        JButton button = new JButton("Click Me!");
        southPanel.add(label);
        southPanel.add(button);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        // WEST: Add a colored panel on the left
        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.CYAN);
        westPanel.setPreferredSize(new Dimension(40, 0));
        mainPanel.add(westPanel, BorderLayout.WEST);

        // EAST: Add a colored panel on the right
        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.PINK);
        eastPanel.setPreferredSize(new Dimension(40, 0));
        mainPanel.add(eastPanel, BorderLayout.EAST);

        // Add action to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "Button pressed!";
                textField.setText(msg);
                label.setText("You pressed the button!");
                JOptionPane.showMessageDialog(mainPanel, msg);
            }
        });

        // Add the central panel to the frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}


import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

abstract class Seilfly{
    String Id;
    int glidetall;
    int vingeSpennet;
    Seilfly neste;
    Seilfly forrige;
    Seilfly(String I,int g,int v){
        Id = I;
        glidetall = g;
        vingeSpennet = v;
    }
    abstract String hentId();
    abstract int HentGlidetall();
    abstract int hentVingespenn();
}

class EkteSeilfly extends Seilfly{
    EkteSeilfly(String I,int g,int v){
        super(I,g,v);
    }
    @Override
    public String hentId() {
        return Id;
    }
    @Override
    public int HentGlidetall() {
        return glidetall;
    }
    @Override
    public int hentVingespenn() {
        return vingeSpennet;
    }   
}

interface Motordrevet{
    int trekkraft();
    String motortype();
}

class MotorSeilfly extends Seilfly implements Motordrevet{
    String motorType;
    int trekKraft;
    MotorSeilfly(String I,int g,int v,String m,int t){
        super(I,g,v);
        motorType = m;
        trekKraft = t;
    }
    @Override
    public String hentId() {
        return Id;
    }
    @Override
    public int HentGlidetall() {
        return glidetall;
    }
    @Override
    public int hentVingespenn() {
        return vingeSpennet;
    }
    @Override
    public int trekkraft(){
        return trekKraft;
    }
    @Override
    public String motortype() {
        return motorType;
    }
}

class TMG extends MotorSeilfly{
    TMG(String I,int g,int v,String m,int t){
        super(I,g,v,m,t);
    }
}
class SLG extends MotorSeilfly{
    SLG(String I,int g,int v,String m,int t){
        super(I,g,v,m,t);
    }
}
class SSG extends MotorSeilfly{
    SSG(String I,int g,int v,String m,int t){
        super(I,g,v,m,t);
    }
}

class Konkurransegruppe implements Iterable<Seilfly>{
    private final Node HODE;
    Seilfly[] arrayMedEkteSeilfly;
    int[] histogram;
    Konkurransegruppe(){
        HODE = new Node(null);
        HODE.forrige=HODE.neste=HODE;
    }
    private class Node{
        Seilfly fly;
        Node neste;
        Node forrige;
        Node(Seilfly f){
            fly = f;
        }
    }

    public boolean erTom() {
        return HODE.neste==HODE;
    }

    void leggTillEtter(Node currentNode, Seilfly fly){
        Node nyNode = new Node(fly);
        nyNode.forrige = currentNode;
        nyNode.neste = currentNode.neste;
        nyNode.neste.forrige = nyNode;
        currentNode.neste = nyNode;
    }
    void leggTillBak(Seilfly fly){
        leggTillEtter(HODE.forrige,fly);
    }
    boolean erMed(String Id){
        Node current = HODE.neste;
        while(current!=HODE){
            if(current.fly.Id.equals(Id)){
                return true;
            }
            current = current.neste;
        } return false;
    }
    void taUtDenne(Node denne){
        denne.forrige.neste = denne.neste;
        denne.neste.forrige = denne.forrige;
    }
    Seilfly taUt(String Id){
        Node current = HODE.neste;
        while(current!=HODE){
            if(current.fly.Id.equals(Id)){
                taUtDenne(current);
                return current.fly;
            }
            current = current.neste;
        } return null;
    }

    @Override
    public Iterator<Seilfly> iterator() {
        return new dobbleListeIterator();
    }
    private class dobbleListeIterator implements Iterator<Seilfly>{
        Node current = HODE.neste;

        @Override
        public boolean hasNext(){
            return current!=HODE;
        }
        @Override
        public Seilfly next(){
            Seilfly flyForReturn = current.fly;
            current = current.neste; 
            return flyForReturn;
        }
    }

    Seilfly[] hentEkteSeilfly(){
        int arrayStoerlse = 0;
        Node current = HODE.neste;

        while(current!=HODE){
            if(current.fly instanceof EkteSeilfly){
                arrayStoerlse++;
            }
            current = current.neste;
        }

        arrayMedEkteSeilfly = new Seilfly[arrayStoerlse];
        int index = 0;
        current = HODE.neste;
        while(current!=HODE){
            if(current.fly instanceof EkteSeilfly){
                arrayMedEkteSeilfly[index] = current.fly;
                index++;
            }
            current = current.neste;
        }

        return arrayMedEkteSeilfly;
    }    

    int besteGlidetall(){
        int besteTall = 0;
        for(Seilfly fly:this){
            if(fly.glidetall>besteTall){
                besteTall = fly.glidetall;
            }
        } return besteTall;
    }

    int størstSpennvidde(){
        Node current = HODE.neste;
        int maxSpenn = 0;
        return rekursivStørstSpennvidde(maxSpenn,current);
    }

    int rekursivStørstSpennvidde(int maxSpenn, Node current){
        if(current==HODE){
            return maxSpenn;
        }
        if(current.fly.vingeSpennet>maxSpenn){
            maxSpenn = current.fly.vingeSpennet;
        }
        return rekursivStørstSpennvidde(maxSpenn, current.neste);
    }

    int[] histogramSpennvidde(){
        histogram = new int[100];
        for (Seilfly fx: this) {
            int spenn = fx.hentVingespenn();
            if (spenn >= 10 && spenn <= 99)
                histogram[spenn]+=1;
        }   
        return histogram;
    }
}

class KlarTilStart {
    ArrayList<Seilfly> klareSeilfly = new ArrayList<>();
    Lock laas = new ReentrantLock();
    Condition venterPåSeilfly = laas.newCondition();

    void seilflyklar (Seilfly f) {
        laas.lock();
        try {
            klareSeilfly.add(f);
            venterPåSeilfly.signalAll();
        } finally {
            laas.unlock();
        }
    }

    Seilfly nesteSeilfly () {
        laas.lock();
        try {
            while (klareSeilfly.size() == 0)
            venterPåSeilfly.await();
            return klareSeilfly.remove(0);
        } catch (InterruptedException e) {
            return null;
        } finally {
            laas.unlock();
        }
    }
}

class Plassjef implements Runnable {
    KlarTilStart monitor;
    Konkurransegruppe konkGruppe;
    int antSlepefly;
    Plassjef (int antFly, Konkurransegruppe gruppe, KlarTilStart mon) {
    antSlepefly = antFly; konkGruppe = gruppe; monitor = mon;
    }
    @Override
    public void run () {
    // Opprett slepeflyene:
        for (int i = 1; i <= antSlepefly; i++) {
            SlepePilot p = new SlepePilot(monitor);
            new Thread(p).start();
        }
            // Gjør alle seilflyene klare til sleping:
        for (Seilfly f: konkGruppe)
            monitor.seilflyklar(f);
        }
    }

class SlepePilot implements Runnable {
    KlarTilStart monitor;
    SlepePilot (KlarTilStart mon) {
    monitor = mon;
    }
    @Override
    public void run () {
        while (true) {
            Seilfly f = monitor.nesteSeilfly();
        try {
            Thread.sleep(6 * 60 * 1000); // Sov 6 minutter.
        } catch (InterruptedException e) { return; }
        }
    }
}
*/

import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

abstract class Skinnegående{
    String Id;
    int sporvidde;
    Skinnegående neste;
    Skinnegående forrige;
    Skinnegående(String I,int s){
        Id = I;
        sporvidde = s;
    }
    abstract String hentId();
    abstract int hentSporvidde();
}

interface Motordrevet{
    boolean fossilt();
    int trekkraft();
}

class Lokomotiv extends Skinnegående implements Motordrevet{
    boolean fossilt;
    int antallTrekkraft;
    Lokomotiv(String I,int s,boolean f,int a){
        super(I, s);
        fossilt = f;
        antallTrekkraft = a;
    }
    String hentId(){
        return Id;
    }
    int hentSporvidde(){
        return sporvidde;
    }
    @Override
    public boolean fossilt() {
        return fossilt;
    }
    @Override
    public int trekkraft() {
        return antallTrekkraft;
    }
}

abstract class Vogn extends Skinnegående{
    int lengde;
    Vogn(String I,int s,int l){
        super(I,s);
        lengde = l;
    }
}

class Godsvogn extends Vogn{
    int maksLaste;
    Godsvogn(String I,int s,int l,int m){
        super(I, s, l);
        maksLaste = m;
    }
    String hentId(){
        return Id;
    }
    int hentSporvidde(){
        return sporvidde;
    }
}

class Passasjervogn extends Vogn{
    int maksAntallPass;
    Passasjervogn(String I,int s,int l,int maks){
        super(I, s, l);
        maksAntallPass = maks;
    }
    String hentId(){
        return Id;
    }
    int hentSporvidde(){
        return sporvidde;
    }
}

class Tog implements Iterable<Skinnegående>{
    Node HODE;
    Skinnegående føreste;
    Skinnegående siste;
    Tog(){
        HODE = new Node(null);
        HODE.neste=HODE.forrige=HODE;
    }

    class Node{
    Skinnegående object;
    Node neste;
    Node forrige;
    Node(Skinnegående o){
        object = o;
    }
    }

    void leggTilEtter(Node aktuell,Skinnegående object){
        Node nyNode = new Node(object);
        nyNode = aktuell.neste;
        nyNode.forrige = aktuell;
        aktuell.neste.forrige = nyNode;
        aktuell.neste = nyNode;
    }
    void leggTilBak(Skinnegående object){
        leggTilEtter(HODE.forrige,object);
    }
    void taUtDenne(Node denne){
        denne.neste.forrige = denne.forrige;
        denne.forrige.neste = denne.neste;
    }
    Skinnegående taUt(Skinnegående object){
        Node current = HODE.neste;
        while(current!=HODE){
            if(current.object.Id.equals(object.Id)){
                taUtDenne(current);
                return current.object;
            }
            current = current.neste;
        } return null;
    }
    Skinnegående finnOgTaUt(String Id){
        Node current = HODE.neste;
        while(current!=HODE){
            if(current.object.Id.equals(Id)){
                taUtDenne(current);
                return current.object;
            }
            current = current.neste;
        } return null;
    }
    void leggTilForan(Skinnegående object){
        leggTilEtter(HODE,object);
    }
    @Override
    public Iterator<Skinnegående> iterator() {
        return new togIterator();
    }
    class togIterator implements Iterator<Skinnegående>{
        Node current = HODE.neste;

        @Override
        public boolean hasNext() {
            return current!=HODE;
        }
        @Override
        public Skinnegående next() {
            Skinnegående forReturn = current.object;
            current = current.neste;
            return forReturn;
        }
    }
    Passasjervogn[] hentPassasjervogner(){
        Passasjervogn[] pasVognArr;
        int antall = 0;
        Node current = HODE.neste;

        while(current!=HODE){
            if(current.object instanceof Passasjervogn){
                antall++;
            }
            current = current.neste;
        }

        pasVognArr = new Passasjervogn[antall];
        current = HODE.neste;
        int index = 0;

        while(current!=HODE){
            if(current.object instanceof Passasjervogn){
                pasVognArr[index] = (Passasjervogn)current.object;
                index++;
            }
            current = current.neste;
        }
        return pasVognArr;
    }

    class FeilSporvidde extends RuntimeException {}

    void sjekkSporvidde() {
        if(HODE==HODE.neste){
            return;
        }
        int sporvidde = HODE.neste.object.sporvidde;
        for(Skinnegående object:this){
            if(object.sporvidde!=sporvidde){
                throw new FeilSporvidde();
            }
        }
    }
    void leggTilSikker(Skinnegående object){
        leggTilEtter(HODE.forrige,object);
        sjekkSporvidde();
    }
    void sjekkSporviddeTo(){
        Node aktuell = HODE.neste;
        int sporvidde = aktuell.object.sporvidde;
        sjekkSporviddeRekursiv(aktuell,sporvidde);
    }
    void sjekkSporviddeRekursiv(Node aktuell, int sporvidde){
        if(aktuell==HODE){
            return;
        }
        if(aktuell.object.sporvidde!=sporvidde){
            throw new FeilSporvidde();
        }
        sjekkSporviddeRekursiv(aktuell.neste,sporvidde);
    }
}


class Leter implements Runnable{
    Tog toget;
    Monitor monitor;
    String objectLetteEtte;
    Leter(Tog t,Monitor m,String o){
        toget = t;
        monitor = m;
        objectLetteEtte = o;
    }

    @Override
    public void run() {
        for(Skinnegående object:toget){
            if(object.Id.startsWith(objectLetteEtte)){
                monitor.leggTil(object);
            }
        }
        monitor.ferdiLeting();
    }
}

class Resultat implements Runnable{
    Monitor monitor;
    Resultat(Monitor m){
        monitor = m;
    }
    @Override
    public void run() {
        Skinnegående object = monitor.hentNeste();
        while(object!=null){
            System.out.println(object.Id);
            object = monitor.hentNeste();
        }
        return;
    }
}

class Monitor{
    int antallLeter;
    int antallFerdiLeter;
    ArrayList<Skinnegående> arrayMedSkinne = new ArrayList<>();
    Lock laas = new ReentrantLock();
    Condition venterPåNySkinne = laas.newCondition();
    Monitor(int a){
        antallLeter = a;
    }

    void leggTil(Skinnegående object){
        laas.lock();
        try{
            arrayMedSkinne.add(object);
            venterPåNySkinne.signal();
        } finally{
            laas.unlock();
        }
    }
    Skinnegående hentNeste(){
        laas.lock();
        try{
            if(antallLeter==antallFerdiLeter) return null;
            while(arrayMedSkinne.isEmpty()) venterPåNySkinne.await();
            return arrayMedSkinne.remove(0);
        } catch (InterruptedException e) {
            return null;
        } finally{
            laas.unlock();
        }
    }
    void ferdiLeting(){
        laas.lock();
        try{
            antallFerdiLeter++;
        } finally{
            laas.unlock();
        }
    }
}