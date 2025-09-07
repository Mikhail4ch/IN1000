/*
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void skriv() {
        System.out.println(this.name + " " + this.age);
    }

    public void bursdag() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Person person = new Person(name,age);
        person.skriv();
        person.bursdag();
        System.out.println("After your birthday:");
        person.skriv();
        scanner.close();
    }
}


class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("Counting using for loop:");
        for (int i = 1; i <= 5; i++) { // Initialization; condition; increment
            System.out.println("Count: " + i); // Print the count
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Variables and data types");
        int age = 22;
        System.out.println("My age is " + age + " years old");
        String za1 = "zA";
        String za2 = "zA";
        System.out.println("And I don't like " + za1 + za2 + " anymore");
        boolean isHappy = true;
        if (isHappy == true) {
            System.out.println("I am happy person from here on out");
        } else {
            System.out.println("I am unhappy person");
        }
    }
}

class Teller {
    private int verdi = 0;
    public void tell () {
        verdi = verdi + 1;
    }
    public int hentVerdi () {
        return verdi;
    }
}

class TestTeller {
    public static void main (String [] args) {
        Teller tell1 = new Teller();
        tell1.tell();
        tell1.tell();
        int svar = tell1.hentVerdi();
        if (svar == 2) System.out.println("OK føreste test");
        else System.out.println("Feiler føreste test");
    }
}

class Teller {
    private static int totalAnt = 0;
    private int verdi = 0;
    public void tell () {
        verdi++;
        totalAnt++;
    }
    public int hentVerdi () {
        return verdi;
    }
    public static int hentTotAnt () {
        return totalAnt;
    }
}

class TestTeller {
    public static void main (String [] args) {
        Teller tell1 = new Teller();
        Teller tell2 = new Teller();
        tell1.tell();
        tell2.tell();
        tell2.tell();
        System.out.println("Teller en er " + tell1.hentVerdi());
        System.out.println("Teller to er " + tell2.hentVerdi());
        System.out.println("Tellerene totalt " + Teller.hentTotAnt());
    }
}

class Teller {
    private int verdi = 0;

    public void tell (int antall) {
        verdi = verdi + antall;
    }
    public int hentVerdi () {
        return verdi;
    }
}  

class TestTeller {
    public static void main (String [] args) {
        Teller boardingTeller = new Teller();
        boardingTeller.tell(3);
        System.out.println(boardingTeller.hentVerdi());
    }
}
    
import java.io.File;  
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("eclipse.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(myFile);
            writer.write("Hello, this is the content of the file.\n");
            writer.write("ECLIPSE EVERYTHING");
            writer.close();

            System.out.println("Successfully wrote to the file.");

            System.out.println("Reading the file content");
            System.out.println("--------------------------");
        
            Scanner fileReader = new Scanner(myFile);
            processFile(fileReader);
        }   catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
    private static void processFile(Scanner scanner) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            lineCount ++;
            charCount += line.length();
            wordCount += line.split("\\s+ ").length;
        }
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Small statistics");
        System.out.println("Lines: " + lineCount);
        System.out.println("Lines: " + wordCount);
        System.out.println("Lines: " + charCount);
        scanner.close();
    }
}


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class WC {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WC <filename>");
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

    private static void processFile(Scanner scanner) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        System.out.println("---------------------------------");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            lineCount++;
            wordCount += line.split("\\s+").length;
            charCount += line.length();
        }
        System.out.println("---------------------------------");
        System.out.println("Statistics:\n");
        System.out.println("Lines: " + lineCount);
        System.out.println("Lines: " + wordCount);
        System.out.println("Lines: " + charCount);
        
        scanner.close();
    }
}

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = scan.nextLine();
        System.out.println("Hi, " + username + "\n");
        System.out.print("What is your age fam? ");
        int num1 = scan.nextInt();
        System.out.println("You are " + num1 + " yo" + "\n");   
    }
}

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = scan.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Result:");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);
    }
}

class Person {
    String navn;
    int tlfnr;

    boolean gyldigTlfnr() {
        return tlfnr >= 10000000 && tlfnr <= 99999999;
    }
}

class Student extends Person {
    String program;

    void byttProgram(String nytt) {
        program = nytt;
    }
}

class Ansatt extends Person {
    int lønnstrinn;
    int antallTimer;

    void lønnstillegg (int tilleg) {
        lønnstrinn += tilleg;
    }
}

class Main{
    public static void main(String[] args) {
        Student stud = new Student();
        boolean ok = stud.gyldigTlfnr();
        System.out.println(ok);
    }
}

import java.util.ArrayList;
import java.util.List;

class Payment {
    int amount;
    Payment(int amount) {
        this.amount = amount;
    }
    public void pay() {
        System.out.println("Processing a payment of $" + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;
    CreditCardPayment(int amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    public void validateCard() {
        System.out.println("Validating Credit Card: " + cardNumber);
    }
}

class PayPalPayment extends Payment {
    String email;
    PayPalPayment(int amount, String email) {
        super(amount);
        this.email = email;
    }
    public void sendReceipt() {
        System.out.println("Sending PayPal receipt to: " + email);
    }
}

class PaymentProcessor {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();
        payments.add(new CreditCardPayment(100, "1234-5678-9876-5432"));
        payments.add(new PayPalPayment(150, "mihamakarevi426@gmail.com"));

        for (Payment payment : payments) {
            payment.pay(); // Upcasting
            if (payment instanceof CreditCardPayment) {
                CreditCardPayment ccPayment = (CreditCardPayment) payment; // Downcasting
                ccPayment.validateCard();
                System.out.println();
            } else if (payment instanceof PayPalPayment) {
                PayPalPayment ppPayment = (PayPalPayment) payment; // Downcasting
                ppPayment.sendReceipt();
                System.out.println();
            }
        }
    }
}
 
import java.util.ArrayList;
class Kjoretoy {
    final String id;
    String merke;
    String modell;
    int år;
    Kjoretoy(String id,String merke,String modell,int år) {
        this.id = id;
        this.merke = merke;
        this.modell = modell;
        this.år = år;
    }
    public String hentId() {
        return id;
    }
    public String hentMerke(){
        return merke;
    }
    public String hentModell(){
        return modell;
    }
    public int hentAr(){
        return år;
    }
    public void settMerke(String ny){
        merke = ny;
    }
    public void settModell(String ny){
        modell = ny;
    }
    public void settAr(int ny){
        år = ny;
    }
}

class Bil extends Kjoretoy {
    int seter;
    Bil(String id,String merke,String modell,int år, int seter) {
        super(id, merke, modell, år);
        this.seter = seter;
    }
    public void settSeter(int ny) {
        this.seter = ny;
    }
    public int hentSeter() {
        return seter;
    }
}

class Motorsykkel extends Kjoretoy {
    String motortype;
    Motorsykkel(String id,String merke,String modell,int år,String motortype) {
        super(id, merke, modell, år);
        this.motortype = motortype;
    }
    public void settMotortype(String motortype) {
        this.motortype = motortype;
    }
    public String hentMotortype() {
        return motortype;
    }
}

class Vei {
    public static void main(String[] args) {
        ArrayList<Kjoretoy> kjoretoy = new ArrayList<>();
        kjoretoy.add(new Bil("AE 13578", "Nissan", "Leaf", 2011, 5));
        kjoretoy.add(new Bil("YT 11111", "Opel", "Zafira", 2005, 7));
        kjoretoy.add(new Motorsykkel("AA 1234", "Harley Davidson", "Ny", 2025, "Stor"));
        kjoretoy.add(new Motorsykkel("BB 2344", "Yamaha", "bra", 2017, "ganske bra"));
        System.out.println();

        for (Kjoretoy k : kjoretoy) {
            System.out.println(k.hentId());
            System.out.println(k.hentMerke());
            System.out.println(k.hentModell());
            System.out.println(k.hentAr());


            if (k instanceof Bil) {
                Bil hentBil = (Bil) k;
                System.out.println(hentBil.hentSeter());
                System.out.println();
            }
            if (k instanceof Motorsykkel) {
                Motorsykkel hentMotorsykkel = (Motorsykkel) k;
                System.out.println(hentMotorsykkel.hentMotortype());
                System.out.println();
            }
        }
    }
}

abstract class Dyr{
    String type; 
    String navn;
    int alder;
    
    // metode uten innhold som må implementeres i subklassene
    abstract void lagLyd();

    // metode uten innhold som må implementeres i subklassene
    abstract void bevegelse();
}

class Fugl extends Dyr{

    // Vi trenger ikke å kalle på superklassens konstruktør fordi den ikke gjør noe, den er implisitt
    Fugl(String navn, int alder){
        type = "Fugl";
        this.navn = navn;
        this.alder = alder;
    }

    // implementerer superklassens abstrakte klasse
    public void bevegelse(){
        System.out.println(navn + " flyr!");
    }

    // implementerer superklassens abstrakte klasse
    public void lagLyd(){
        System.out.println("Kvitre");
    }
}
 

abstract class Payment {
    double amount;
    public Payment(double amount) {
        this.amount = amount;
    }
    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment of $" + amount + " using card " + cardNumber);
    }
}

class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }
    @Override
    void processPayment() {
        System.out.println("Processing PayPal Payment of $" + amount + " using PayPal account " + email);
    }
}

class BitcoinPayment extends Payment {
    private String walletAddress;

    public BitcoinPayment(double amount, String walletAddress) {
        super(amount);
        this.walletAddress = walletAddress;
    }
    @Override
    void processPayment() {
        System.out.println("Processing Bitcoin Payment of $" + amount + " using wallet " + walletAddress);
    }
}

class PaymentSystem {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(100, "1234-5678-9876-5432");
        Payment payment2 = new PayPalPayment(50.0, "user@example.com");
        Payment payment3 = new BitcoinPayment(200.0, "1A2b3C4d5E6f7G");

        payment1.processPayment();
        payment2.processPayment();
        payment3.processPayment();
    }
}


import java.time.LocalDateTime;

class Logger {
    public void log(String message) {
        System.out.println("[INFO] " + message);
    }
    // Log with message and timestamp
    public void log(String message, LocalDateTime timestamp) {
        System.out.println("[INFO] " + timestamp + " - " + message);
    }
    // Log with message and log level
    public void log(String level, String message) {
        System.out.println("[" + level.toUpperCase() + "] " + message);
    }
    // Log with message, level, and timestamp
    public void log(String level, String message, LocalDateTime timestamp) {
        System.out.println("[" + level.toUpperCase() + "] " + timestamp + " - " + message);
    }
}

class PaymentSystem {
    public static void main(String[] args) {
        Logger logger = new Logger();
        LocalDateTime now = LocalDateTime.now();
        logger.log("System started");
        logger.log("Database connection established", now);
        logger.log("WARNING", "Low disk space");
        logger.log("ERROR", "Failed to save file", now);
    }
}

class Vehicle {
    void startEngine() {
        System.out.println("Starting vehicle engine...");
    }

    // Overloaded method: Start engine with fuel check
    void startEngine(boolean checkFuel) {
        if (checkFuel) {
            System.out.println("Checking fuel... Engine started.");
        } else {
            System.out.println("Engine started without fuel check.");
        }
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting car engine with key ignition...");
    }
}

// Subclass 2: Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting motorcycle engine with self-start...");
    }
}

// Subclass 3: Truck
class Truck extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting truck engine with heavy-duty ignition...");
    }

    // Overloaded method: Start truck engine with pre-heating option
    void startEngine(boolean checkFuel, boolean preHeat) {
        if (preHeat) {
            System.out.println("Pre-heating engine... Checking fuel... Truck engine started.");
        } else {
            startEngine(checkFuel);
        }
    }
}

class VehicleSystem {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Motorcycle();
        Vehicle myTruck = new Truck();

        myCar.startEngine();   // Overriding
        myBike.startEngine();  // Overriding
        myTruck.startEngine(); // Overriding

        System.out.println("--- Method Overloading in Action ---");
        myTruck.startEngine(true);       // Overloading
        ((Truck) myTruck).startEngine(true, true); // Overloading (Truck-specific)
    }
}


// Class Engine (Part of a Car)
class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

// Car class HAS-A Engine
class Car {
    private Engine engine;  // Composition

    // Constructor to initialize Engine
    Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();  // Delegating work to Engine
        System.out.println("Car is starting...");
    }
}

class Main {
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        Car myCar = new Car(myEngine);
        myCar.startCar();
    }
}

class kjoretoyen {
    String sjafor;
    String registerNum;
    kjoretoyen(String sjafor,String registerNum) {
        this.sjafor = sjafor;
        this.registerNum = registerNum;
    }
    public void skrivUt(){
        System.out.println("Sjaafoer: " + sjafor + "\nRegistreringsnummer: " + registerNum);
    }
}

class motorsykkel extends kjoretoyen{
    motorsykkel(String sjafor,String registerNum) {
        super(sjafor, registerNum);
    }
    public void skrivUt(){
        super.skrivUt();
        System.out.println("\n**MOTORSYKKEL**");
    }
}

class bilen extends kjoretoyen {
    int antallPassenger;
    bilen(String sjafor,String registerNum,int antallPassenger) {
        super(sjafor,registerNum);
        this.antallPassenger = antallPassenger;
    }
    public void skrivUt(){
        super.skrivUt();
        System.out.println("\n**BIL**");
        System.out.println("Antall plasser: " + antallPassenger);
    }
}

class parkeringshus {
    int maxPlasser;
    int antallPlasser = 0;
    kjoretoyen[] plasser;

    parkeringshus(int maxPlasser) {
        plasser = new kjoretoyen[maxPlasser];
        this.maxPlasser = maxPlasser;
    }
    void settIn(kjoretoyen ny, int indeks) {
        if(indeks >= 0 && indeks < maxPlasser) {
            if (plasser[indeks] == null) {
                plasser[indeks] = ny;
                antallPlasser++;
            }
            else {
                System.out.println("Plassen " + indeks + " er opptatt.");}
                if (antallPlasser == maxPlasser){
                    System.out.println("Parkeringshuset er fullt.");
                }
        } else {
            System.out.println("Ugylding indeks: " + indeks);
        }
    }
    public kjoretoyen taUt(int indeks) {
        try {
            if (plasser[indeks] != null) {
                kjoretoyen midl = plasser[indeks];
                plasser[indeks] = null;
                antallPlasser --;
                return midl;
            }
            if (antallPlasser == 0) {
                System.out.println("Parkeringshuset er tomt.");
            }
            return null;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Ugyldig indeks: " + indeks);
        }
        return null;
    }
    public void skrivInformasjon() {
        for(kjoretoyen k:plasser){
            if (k!=null){
                k.skrivUt();
            }
        }
    }
}


// Payment strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete strategy classes
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Context class using the strategy interface
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart(new CreditCardPayment());
        cart1.checkout(100); // Outputs: Paid 100 using Credit Card.

        ShoppingCart cart2 = new ShoppingCart(new PayPalPayment());
        cart2.checkout(250); // Outputs: Paid 250 using PayPal.
    }
}

import java.util.*;
class Kapittel {
    private String tittel = "Ukjent tittel";
    private Kapittel neste;
    private String tekst = "Ingen tekst";

    public Kapittel() {
    }
    public Kapittel(String tittel) {
        this.tittel = tittel;
    }
    public Kapittel hentNeste() {
        return neste;
    }
    public void settNeste (Kapittel kapittel) {
        neste = kapittel;
    }
    public void oppdaterTittel(String ny) {
        tittel = ny;
    }
    public void oppdaterTekst(String ny) {
        tekst = ny;
    }
    public String toString() {
        return "Tittel: " + tittel + "\n" + "Tekst: " + tekst;
    }
}

class UgyldigKapittelUnntak extends RuntimeException{
    public UgyldigKapittelUnntak(String feilMelding) {
        super(feilMelding);
    }
}

class Tuppel implements Comparable<Tuppel>{
    public final String FORFATTER;
    public final int UTVIGELSEÅR;

    public Tuppel(String forfatter, int utvigelseår) {
        FORFATTER = forfatter;
        UTVIGELSEÅR = utvigelseår;
    }
//X.compareTo (Y) gir et positivt tall hvis X>T, negativt hvis X<Y, ellers
    @Override
    public int compareTo(Tuppel tuppel) {
      //  if (FORFATTER.equals(tuppel.FORFATTER)) {
      //      if (UTVIGELSEÅR > tuppel.UTVIGELSEÅR) {
      //          return 1;
      //      }
      //      else if (UTVIGELSEÅR < tuppel.UTVIGELSEÅR) {
      //          return -1;
      //      }
      //      return 0;
      //  }
      if (FORFATTER.equals(tuppel.FORFATTER)) {
        return UTVIGELSEÅR - tuppel.UTVIGELSEÅR;
      } 
      return FORFATTER.compareTo(tuppel.FORFATTER);
    }
}

class Bok implements Comparable<Bok> {

    private Kapittel første, siste = null;
    private int antallKapitler = 0;
    public final Tuppel TUPPEL;
    private String tittel = "Ukjent tittel";
    public final String ISBN;  // I ISBN-systemet har hver boktittel en egen unik ISBN-kode for hver variasjon eller utgave av boka.

    public Bok(String ISBN, String forfatter, int utgivelsesår) {
        this.ISBN = ISBN;
        TUPPEL = new Tuppel(forfatter, utgivelsesår);
    }

    public Bok(String ISBN, String forfatter, int utgivelsesår, String tittel) {
        this(ISBN, forfatter, utgivelsesår);
        this.tittel = tittel;
    }

    @Override
    public int compareTo(Bok bok) {
	// (ISBN.compareTo(bok.ISBN) != 0) er ekvivalent med (!ISBN.equals(bok.ISBN)) --> Takk til Larissa for kommentaren!
        if (ISBN.compareTo(bok.ISBN) != 0 && TUPPEL.compareTo(bok.TUPPEL) == 0) {
            return ISBN.compareTo(bok.ISBN);
        }
        return TUPPEL.compareTo(bok.TUPPEL);
    }

    public void leggTilKapittel(Kapittel kapittel) { // Legger til på slutten
        if (antallKapitler == 0) {
            første = siste = kapittel;
        }
        else {
            siste.settNeste(kapittel);
            siste = kapittel;
        }
        antallKapitler++;
    }

    public void leggTilKapittel(Kapittel kapittel, int kapittelnummer) {
        if (kapittelnummer <= 0 || kapittelnummer > antallKapitler + 1) { // Første kapittel er på posisjon 1, ikke 0, slik vi er vant til med lister
            throw new UgyldigKapittelUnntak("Ugyldig kapittelnummer!");
        }

        if (antallKapitler == 0 || kapittelnummer == antallKapitler + 1) {
            leggTilKapittel(kapittel); // Håndterer her det enkle tilfellet ved å bruke metoden vi har definert over
            return;
        }

        Kapittel ståsted = første;

        if (kapittelnummer == 1) { // Neste uke skal vi se hvordan vi kan unngå denne
            kapittel.settNeste(ståsted);
            første = kapittel;
            antallKapitler++;
            return;
        }

        // Vil lande på kapittelet før innsettingsstedet, derfor kapittelnummer - 1
        for (int i = 1; i < kapittelnummer - 1; i++) {
            ståsted = ståsted.hentNeste();
        }

        Kapittel neste = ståsted.hentNeste();
        kapittel.settNeste(neste);
        ståsted.settNeste(kapittel);
        antallKapitler++;
    }

    public Kapittel fjernKapittel(int kapittelnummer) { // Vil returnere kapittelet vi fjerner 
        if (kapittelnummer <= 0 || kapittelnummer > antallKapitler) {
            throw new UgyldigKapittelUnntak("Ugyldig kapittelnummer!");
        }
	
        // Nå vet vi at vi har minst ett kapittel
        Kapittel ståsted = første;
        Kapittel kapittel;

        if (kapittelnummer == 1) { // Neste uke skal vi se hvordan vi kan unngå denne
            kapittel = ståsted;
            første = ståsted.hentNeste();
            antallKapitler--;
            return kapittel;
        }

        for (int i = 1; i < kapittelnummer - 1; i++) {
            ståsted = ståsted.hentNeste();
        }

        // Nå er ståsted kapittelet før det kapittelet vi ønsker å fjerne
        kapittel = ståsted.hentNeste();
        ståsted.settNeste(kapittel.hentNeste());

        if (ståsted.hentNeste() == null) { // Hvis vi fjerna siste
            siste = ståsted;
        }

        antallKapitler--;

	// Vi skrev en sjekk her under fellesøvelsen som vi ikke trenger, så den er fjernet! Spør hvis du lurer på hvorfor :-))
	
        return kapittel;
    }

    public Kapittel fjernKapittel() { // Fjerner fra slutten og kan da bruke metoden vi allerede har definert
        return fjernKapittel(antallKapitler);
    }

    public int antallKapitler() {
        return antallKapitler;
    }

    public Kapittel hentFørste() {
        return første;
    }

    public String hentTittel() {
	return tittel;
    }}

class Main {
    public static void main(String[] args) {
        Bok bok = new Bok("0238484938465", "Bushra og Lennard", 2025);

        Kapittel kap1 = new Kapittel("Kapittel 1");
        Kapittel kap2 = new Kapittel("Kapittel 2");
        Kapittel kap3 = new Kapittel("Kapittel 3");
        Kapittel kap4 = new Kapittel("Kapittel 4");
        Kapittel kap5 = new Kapittel("Kapittel 5");

        bok.leggTilKapittel(kap1);
        bok.fjernKapittel(1);
        bok.leggTilKapittel(kap2);
        bok.leggTilKapittel(kap3, 2);
        bok.leggTilKapittel(kap4, 1);
        bok.leggTilKapittel(kap5, 4);


        Kapittel ståsted = bok.hentFørste();
        while (ståsted != null) {
            System.out.println(ståsted);
            ståsted = ståsted.hentNeste();
        }

        System.out.println(bok.antallKapitler());
        System.out.println(bok.fjernKapittel());
        System.out.println(bok.fjernKapittel());
        System.out.println(bok.antallKapitler());
        System.out.println(bok.fjernKapittel());
        System.out.println(bok.fjernKapittel());
        //bok.fjernKapittel();
        // bok.leggTilKapittel(new Kapittel("Ugyldig Kapittel"), -1);
        // bok.leggTilKapittel(new Kapittel("Ugyldig Kapittel"), 2);

        Bok bok2 = new Bok("0238484268465", "Bushra og venner", 2024);
        Bok bok3 = new Bok("0238984938465", "Bushra og Lennard", 2025);

        List<Bok> bøker = new ArrayList<>();
        bøker.add(bok);
        bøker.add(bok2);
        bøker.add(bok3);

        Collections.sort(bøker);

            for (Bok b : bøker) {
            System.out.println(b.TUPPEL.FORFATTER + ", " + b.ISBN);
	}

    }
}

interface Rovdyr {
    void jakt();
}

interface Planteeter {
    void beskyttDeg();
}

class Ulv implements Rovdyr {
    public void jakt() {
        System.out.println("Ulv jakter på byttedyr.");
    }
}

class Elg implements Planteeter {
    public void beskyttDeg() {
        System.out.println("Elg løper vekk fra rovdyr.");
    }
}

class Sau implements Planteeter {
    public void beskyttDeg() {
        System.out.println("Sau løper i flokk for beskyttelse.");
    }
}

class Bjørn implements Rovdyr, Planteeter {
    public void jakt() {
        System.out.println("Bjørn jakter på fisk og smådyr.");
    }
    
    public void beskyttDeg() {
        System.out.println("Bjørn forsvarer seg med klør.");
    }
}

class Næringskjede {
    public static void main(String[] args) {
        Rovdyr ulv = new Ulv();
        Planteeter elg = new Elg();
        Planteeter sau = new Sau();
        Bjørn bjørn = new Bjørn(); // Implements both interfaces

        Rovdyr[] rovdyr = {ulv, bjørn}; 

        Planteeter[] planteetere = {elg, sau, bjørn}; 

        System.out.println("Rovdyr:");
        for (Rovdyr r : rovdyr) {
            r.jakt();
        }

        System.out.println("\nPlanteetere:");
        for (Planteeter p : planteetere) {
            p.beskyttDeg();
        }
    }     
}

public class SinglyLinkedList {

    // Node class for a singly linked list
    static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Head of the list

    // Method to add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display all nodes in the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); 
    }
}

class Node {
    String verdi; 
    Node neste;

    Node(String v){
        verdi = v;
    }

    public static void main(String[] args){
        // Lager en lenkeliste som blir setningen: "Jeg liker kaffe"
        Node forste = new Node("Jeg");
        forste.neste = new Node("liker");
        forste.neste.neste = new Node("kaffe");

        // printer ut hele listen
        Node peker = forste;
        while (peker != null){
            System.out.println(peker.verdi);
            peker = peker.neste;
        }

        // legger til ! på slutten av setningen
        peker = forste;
        while (peker.neste != null){
            peker = peker.neste;
        }
        peker.neste = new Node("!");

        peker = forste;
        while (peker != null){
            System.out.print(peker.verdi + " ");
            peker = peker.neste;
        }
        System.out.println();

        peker = forste;
        while (peker.verdi!="liker") {
            peker = peker.neste;
        }
        Node nyNoden = new Node("ikke");
        Node sisteNoden = peker.neste;
        peker.neste = nyNoden;
        nyNoden.neste = sisteNoden;

        peker = forste;
        while (peker != null){
            System.out.print(peker.verdi + " ");
            peker = peker.neste;
        }
        System.out.println();

        Node nyNode1 = new Node("Du");
        Node nyNode2 = forste.neste;
        forste = nyNode1;
        nyNode1.neste = nyNode2;

        peker = forste;
        while (peker != null){
            System.out.print(peker.verdi + " ");
            peker = peker.neste;
        }
    }
}


// Implementert som en kø, prøv gjerne å implementere den som en stack!

class Lenkeliste{

    Listenode start;

    private class Listenode{
        public String verdi;
        public Listenode neste;

        Listenode(String tekst){
            verdi = tekst;
        }
    }
    public void leggTil(String tekst){
        if (start == null){
            start = new Listenode(tekst);
        }
        else{
            Listenode peker = start;
            while (peker.neste != null){
                peker = peker.neste;
            }
            peker.neste = new Listenode(tekst);
        }
    }
    // metode for å fjerne fra starten av listen
    public String fjern(){
        if (start == null){
            return null;
        }
        Listenode midl = start;
        start = start.neste;
        return midl.verdi;
    }
    public String fjernReverse() {
        if (start == null) {
            return null; // List is empty, nothing to remove
        }
        
        // If there is only one node
        if (start.neste == null) {
            String value = start.verdi;
            start = null; // The list is now empty
            return value;
        }
        
        // Traverse the list to find the second-to-last node
        Listenode peker = start;
        while (peker.neste != null && peker.neste.neste != null) {
            peker = peker.neste;
        }
        
        // Now `peker` is the second-to-last node
        String value = peker.neste.verdi; // The value of the last node
        peker.neste = null; // Remove the last node by setting the second-to-last node's next to null
        return value;
    }

    // metode for å skrive ut
    public void skrivUt(){
        Listenode peker = start;
        while (peker != null){
            System.out.print(peker.verdi + " ");
            peker = peker.neste;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Lenkeliste liste = new Lenkeliste();
        liste.leggTil("Hei");
        liste.leggTil("på");
        liste.leggTil("deg!");
        
        liste.skrivUt();

        System.out.println(liste.fjernReverse());
        System.out.println(liste.fjernReverse());
        System.out.println(liste.fjernReverse());

        
    }
}


class Person {
    String navn;
    String gjenstand ;
    Person nestePerson;

    public Person(String navn, String gjenstand) {
        this.navn = navn;
        this.gjenstand = gjenstand;
    }
    public void settNeste (Person p) {
        nestePerson = p;
    }
    public Person hentNeste () {
        return this.nestePerson;
    }
    public String hentNavn() {
        return navn;
    }
    public String toString() {
        return navn + " med gjenstand " + gjenstand;
    }
}

class Butikk {
    Person forste;
    
    public void entreButikk(Person p) {
        Person person = forste;
        if (forste == null) {
            forste = p;
        } else {
            while (person.nestePerson != null) {
                person = person.nestePerson; 
            }
            person.nestePerson = p;
        }
    }
    public void kassa() {
        if (forste == null) {
            System.out.println("Det er ingen å betjene!");
            return; 
        }
        if (forste.nestePerson == null) {
            System.out.println(forste.navn + " kjoper " + forste.gjenstand + "\nDet var siste klient\nHade bra!");
            forste = null;
        } else {
            System.out.println(forste.navn + " kjoper " + forste.gjenstand + "\nHade bra!");
            forste = forste.nestePerson;
        }
    }
}

class Handling {
    public static void main(String[] args) {
        Person Miha = new Person("Miha", "Ethereum");
        Person Nikita = new Person("Nikita", "Bitcoin");
        Person Arsenij = new Person("Arsenij", "Balenciaga");
        Person Leha = new Person("Leha", "Hash");
        
        Butikk butikk = new Butikk();
        butikk.entreButikk(Miha);
        butikk.entreButikk(Nikita);
        butikk.entreButikk(Arsenij);
        butikk.entreButikk(Leha);
    
        // Process all persons in the queue
        butikk.kassa(); // Miha
        butikk.kassa(); // Nikita
        butikk.kassa(); // Arsenij
        butikk.kassa(); // Leha
        butikk.kassa(); // Should print "Det er ingen å betjene!"
    }
}

class Kvadrat {
    int lengde;
    Kvadrat(int lengde) {
        this.lengde = lengde;
    }
    public double areal(){
        return lengde*lengde;
      }
    
      public double omkrets(){
        return 4*lengde;
      }
}

class KvadratStabel{
    private Node start;

    private class Node{
        public Kvadrat verdi;
        public Node neste;

        Node (Kvadrat verdi){
            this.verdi = verdi;
        }
    }
    public boolean erTom(){
        return start == null;
      }
    public void leggPoo (Kvadrat k) {
        if(erTom()) {
            start = new Node(k);
        } else {
            Node midl = start;
            start = new Node(k);
            start.neste = midl;
        }
    }
    public Kvadrat taAv() {
        if(erTom()) {
            return null;
        } 
        Node midl = start;
        start = start.neste;
        return midl.verdi;
    }
}

class TestKvadratStabel {
    public static void main(String[] args) {
        KvadratStabel stabel = new KvadratStabel();
        stabel.leggPoo(new Kvadrat(1));
        stabel.leggPoo(new Kvadrat(2));
        stabel.leggPoo(new Kvadrat(3));
        stabel.leggPoo(new Kvadrat(4));
        stabel.leggPoo(new Kvadrat(5));
        stabel.leggPoo(new Kvadrat(6));
        double sum = 0, siste = 0;
        while (!stabel.erTom()){
            Kvadrat k = stabel.taAv();
            sum += k.areal();
            siste = k.areal();
        }
        System.out.println("Summen av kvadratenes areal er "
                           + sum);
        System.out.println("Det siste kvadratet i stabelen har areal: " 
                           + siste);
    }
}

abstract class Hest {
    String navn;
    int alder;

    public Hest(String n, int a) {
        navn = n;
        alder = a;
    }

    public void skritt() {
        System.out.println(navn + " gaar fremover.");
    }

    public void trav() {
        System.out.println(navn + " 'jogger' med hoyre fremben og venstre bakben, deretter motsatt.");
    }

    public void galopp() {
        System.out.println(navn + " beveger seg raskt med beina i tretakt.");
    }
}

class EngelskFullblodshest extends Hest {
    EngelskFullblodshest(String n, int a){
        super(n,a);
    }
}

interface KanToelte  {
    public void toelt();
}
interface KanPasse  {
    public void pass();
}

class PasoFino extends Hest implements KanToelte {
    PasoFino(String n,int a){
        super(n, a);
    }
    @Override
    public void toelt() {
        System.out.println("Hesten gjør TOELTE");
    }
}

class Islandshest extends Hest implements KanPasse, KanToelte {
    Islandshest(String n,int a) {
        super(n,a);
    }
    @Override
    public void toelt() {
        System.out.println("Hesten gjør TOELTE"); 
    }
    @Override
    public void pass() {
        System.out.println("Hesten gjør PASS");
    }
}

class Main {
    public static void main(String[] args) {
        Hest Hest1 = new EngelskFullblodshest("Loshad", 5);
        Hest Hest2 = new PasoFino("Leonardo", 9);
        Hest Hest3 = new PasoFino("Lolichka", 4);

        Hest array[] = new Hest[3];
        array[0] = Hest1;
        array[1] = Hest2;
        array[2] = Hest3;

        for (Hest hest:array) {
            hest.skritt();
        }
    }
}


class Bok {
    private String tittel;

    public Bok (String t) {
        tittel = t;
    }

    public String toString() {
        return tittel;
    }
}

class Bokhylle {
    private Bok[] boeker;

    public Bokhylle (int antPlasser) {
        boeker = new Bok[antPlasser];
    }

    //Forsoeker aa sette inn en bok paa foerste ledige plass i bokhyllen
    public void settInn(Bok b) throws DuplikatException, IkkeMerPlassException {

        for (int i = 0; i < boeker.length; i++) {

            //Boken ligger alt inne
            if (boeker[i] != null && boeker[i].toString().equals(b.toString())) {
                throw new DuplikatException(b.toString());
            }

            if (boeker[i] == null) {

                boeker[i] = b;
                return;
            }
        }

        //Vi har kommet gjennom lista uten aa finne noen ledig plass
        throw new IkkeMerPlassException(b.toString());
    }

    public void skrivBoeker() {
        for (Bok b: boeker) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }
}

class IkkeMerPlassException extends Exception {

    public IkkeMerPlassException(String boktittel) {
        super("Det er ikke mer plass i bokhyllen til boken med tittel: " + boktittel);
    }
}

class DuplikatException extends Exception {
    public DuplikatException (String id) {
        super("Duplikat: " + id);
    }
}

class TestBokhylle {

    public static void main(String[] args) {

        Bokhylle bokhylle = new Bokhylle(3);
        System.out.println("Setter inn boeker:");

        String[] titler = {"De doedes tjern", "Doppler", "Doppler", "Misery", "Gone with the Wind"};

        for (int i = 0; i < titler.length; i++) {

            try {
                bokhylle.settInn(new Bok(titler[i]));

            } catch (DuplikatException de) {
                System.out.println(de.getMessage());

            } catch (IkkeMerPlassException impe) {
                System.out.println(impe.getMessage());
            }
        }

        System.out.println("\nSkriver ut boeker:");
        bokhylle.skrivBoeker();
    }
}

class FeilTest {
    public static void main(String[] args) {

        //Oppretter en array med noen strenger
        String[] tallstrenger = {"10", "1", "32", "hei", "14", "11"};

        //Forsoeker aa konvertere strengene til heltall og skrive ut
        for (int i = 0; i < tallstrenger.length; i++) {
            try {
                int tmp = Integer.parseInt(tallstrenger[i]);
                System.out.println("Tallet er: " + tmp);
            }
            catch (NumberFormatException e) {
                System.out.println("Formateringsfeil! '" + tallstrenger[i] + "' er ikke et tall.");
            }
        }
    }
}

class Kvadrat {
    int lengde;
    Kvadrat(int lengde) {
        this.lengde = lengde;
    }
    public double areal(){
        return lengde*lengde;
      }
    
      public double omkrets(){
        return 4*lengde;
      }
}

class Sirkel {
    int radius;
    Sirkel(int radius) {
        this.radius = radius;
    }
    public double areal(){
        return radius*radius;
      }
    
      public double omkrets(){
        return 4*radius;
      }
}

class KvadratBeholder {
    private Kvadrat kvadrat;

    public void settInn(Kvadrat kvadrat) {
        this.kvadrat = kvadrat;
    }

    public Kvadrat taUt() {
        return this.kvadrat;
    }
}

class Beholder <E> {
    private E element;

    public void settInn(E element) {
        this.element = element;
    }

    public E taUt() {
        return this.element;
    }
}

class TestBeholder {
    public static void main(String[] args) {
        Beholder<Sirkel> sirkelbeholder = new Beholder<>();
        sirkelbeholder.settInn(new Sirkel(10));
       // sirkelbeholder.settInn(new Kvadrat(2)); //Ikke lov!
    }
}


class Bil {
    String  registreringsnummer;
    int antallPassasjerseter;
    Bil(String  registreringsnummer,int antallPassasjerseter){
        this.registreringsnummer =registreringsnummer;
        this.antallPassasjerseter =antallPassasjerseter;
    }
    public String toString() {
        return "Det er bilen";
    }
}
class Motorsykkel {
    String  registreringsnummer;
    int motorstørrelse ;
    Motorsykkel(String  registreringsnummer,int motorstørrelse ){
        this.registreringsnummer =registreringsnummer;
        this.motorstørrelse =Math.round(motorstørrelse);
    }
    public String toString() {
        return "Det er motorsykkel";
    }
}

class Parkeringsplass <T> {
    public T kjøretøyet;
    public void parkere(T kj){
        kjøretøyet = kj;
    }
    public T ut(){
        T tmp = kjøretøyet;
        if(kjøretøyet==null){
            System.out.println("Det finnes ikke noe kjøretøyet på plass");
            return null;
        } else{
            System.out.println(kjøretøyet + " forlater parkeringsplassen!");
            kjøretøyet = null;
            return tmp;
        }
    }
}

class Parkeringshus {
    static Parkeringsplass[] etasje1 = new Parkeringsplass[10];
    static Parkeringsplass[] etasje2 = new Parkeringsplass[10];

    public static void main(String[] args) {
        Bil bil1 = new Bil("AH842397", 5);
        Bil bil2 = new Bil("KJ193287", 8);
        Bil bil3 = new Bil("JD873495", 3);
        Motorsykkel motorsykkel1 = new Motorsykkel("IW43298", 345);
        Motorsykkel motorsykkel2 = new Motorsykkel("UK82748", 500);
        Motorsykkel motorsykkel3 = new Motorsykkel("OI82344", 245);

        etasje1[4] = new Parkeringsplass();
        etasje1[4].parkere(bil1);

        etasje2[4] = new Parkeringsplass();
        etasje2[4].parkere(bil2);

        etasje1[5] = new Parkeringsplass();
        etasje1[5].parkere(bil3);

        etasje2[8] = new Parkeringsplass();
        etasje2[8].parkere(motorsykkel1);

        etasje1[2] = new Parkeringsplass();
        etasje1[2].parkere(motorsykkel2);

        etasje2[5] = new Parkeringsplass();
        etasje2[5].parkere(motorsykkel3);

        for (int i = 0; i < 10; i++) {
            if (etasje1[i] != null) {
                etasje1[i].ut();
                etasje1[i] = null;
            }
            if (etasje2[i] != null) {
                etasje2[i].ut();
                etasje2[i] = null;
            }
        }
    }
}


class GraadigBeholder < T extends Comparable <T>> {
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

class Main {
    public static void main(String[] args) {
        GraadigBeholder<Integer> beholder = new GraadigBeholder<>();

        System.out.println(beholder.settInn(10));  // Outputs: null (was empty)
        System.out.println("Innhold: " + beholder.seInnhold()); // Outputs: 10

        System.out.println(beholder.settInn(5));   // Outputs: null (5 < 10, not inserted)
        System.out.println("Innhold: " + beholder.seInnhold()); // Outputs: 10

        System.out.println(beholder.settInn(15));  // Outputs: 10 (10 replaced by 15)
        System.out.println("Innhold: " + beholder.seInnhold()); // Outputs: 15

        System.out.println(beholder.settInn(12));  // Outputs: null (12 < 15, not inserted)
        System.out.println("Innhold: " + beholder.seInnhold()); // Outputs: 15
    }
}

class Katt implements Comparable <Katt>{
    String navn;
    int alder;
    Katt(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Det er en katt som heter" + navn +"\nsom er " + alder + " år gammel";
    }
    @Override
    public int compareTo(Katt andreKatt) {
        if (this.alder < andreKatt.alder){
            return -1;
        } else if (this.alder > andreKatt.alder) {
            return 1;
        } else {
            return 0;
        }
        //return this.alder - annen.alder;
    }
}

class katter {
    public static void main(String[] args){
        Katt cat1 = new Katt("Tima", 11);
        Katt cat2 = new Katt("Ben", 10);
        Katt cat3 = new Katt("Leva", 4);
        Katt cat4 = new Katt("Philipp", 2);

        Katt[] array = new Katt[4];
        array[0] = cat1;
        array[1] = cat2;
        array[2] = cat3;
        array[3] = cat4;

        Katt eldst = array[3];
        for (Katt k : array) {
            if (k.compareTo(eldst) > 0) {
                eldst = k;
            }
        }

        System.out.println(eldst);
    }
}


class DobbelLenke <T> {
    private Node forste;
    class Node{
        T data;
        Node forrige = null;
        Node neste = null;
        Node (T data){
            this.data = data;
        }
    }
    public void settInn(T element){
        Node ny = new Node(element);
    
        if (forste == null){
            forste = ny;
        } else {
            Node aktuell = forste;
            while(aktuell.neste != null){
                aktuell = aktuell.neste;
            }
            aktuell.neste = ny;
            ny.forrige = aktuell;
        }
    }
    public void skrivUt() {
        Node node = forste;
        while (node != null) {
          System.out.println(node.data);
          node = node.neste;
        }
    }
}


import java.util.Iterator;

class EnkelArrayListe implements Iterable<String> {
    private String[] arr;
    private int maksStorrelse;
    private int storrelse = 0;

    @SuppressWarnings("unchecked")
    public EnkelArrayListe(int maksStorrelse) {
        this.maksStorrelse = maksStorrelse;
        arr = new String[maksStorrelse];
    }

    public void leggTil(String strengen) {
        if (storrelse >= maksStorrelse) {
            throw new IllegalStateException("Ikke plass til flere");
        }
        arr[storrelse++] = strengen;
    }

    public Iterator<String> iterator() {
        return new ListeIterator();
    }

    private class ListeIterator implements Iterator<String> {
        private int gjeldendeIndeks = 0;

        public String next() {
            return arr[gjeldendeIndeks++];
        }

        public boolean hasNext() {
            return gjeldendeIndeks < storrelse;
        }
    }
}

import java.util.ArrayList;
class Katt implements Comparable <Katt>{
    String navn;
    int alder;
    Katt(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Det er en katt som heter" + navn +"\nsom er " + alder + " år gammel";
    }
    @Override
    public int compareTo(Katt andreKatt) {
        if (this.alder < andreKatt.alder){
            return -1;
        } else if (this.alder > andreKatt.alder) {
            return 1;
        } else {
            return 0;
        }
        //return this.alder - annen.alder;
    }
}

class sortertArrayList <T extends Comparable<T>>{
    ArrayList<T> list = new ArrayList<>();

    public void settInn(T data){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).compareTo(data)>0){
                list.add(i,data);
                return;
            }
        }
        list.add(data);
    }
    public T hentFørste(){
        return list.remove(0);
    }
}

class Hovedprogram {
    public static void main(String[] args) {
        sortertArrayList<Katt> katter = new sortertArrayList<>();
        katter.settInn(new Katt("Tima", 11));
        katter.settInn(new Katt("Ben", 10));
        katter.settInn(new Katt("Leva", 4));
        katter.settInn(new Katt("Philipp", 2));
        for (int i = 0; i < 4; i++) {
            System.out.println(katter.hentFørste());
        }
    }
}


import java.util.Iterator;

class Person {
    String navn;
    String gjenstand ;
    Person nestePerson;

    public Person(String navn, String gjenstand) {
        this.navn = navn;
        this.gjenstand = gjenstand;
    }
    public void settNeste (Person p) {
        nestePerson = p;
    }
    public Person hentNeste () {
        return this.nestePerson;
    }
    public String hentNavn() {
        return navn;
    }
    public String toString() {
        return navn + " med gjenstand " + gjenstand;
    }
}

class Butikk implements Iterable<Person>{
    Person forste;
    
    public void entreButikk(Person p) {
        Person person = forste;
        if (forste == null) {
            forste = p;
        } else {
            while (person.nestePerson != null) {
                person = person.nestePerson; 
            }
            person.nestePerson = p;
        }
    }
    public void kassa() {
        if (forste == null) {
            System.out.println("Det er ingen å betjene!");
            return; 
        }
        if (forste.nestePerson == null) {
            System.out.println(forste.navn + " kjoper " + forste.gjenstand + "\nDet var siste klient\nHade bra!");
            forste = null;
        } else {
            System.out.println(forste.navn + " kjoper " + forste.gjenstand + "\nHade bra!");
            forste = forste.nestePerson;
        }
    }
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }
    class PersonIterator implements Iterator<Person>{
        Person aktuell = forste;
        public boolean hasNext() {
            return aktuell != null;
        }
        public Person next() {
            Person imidler = aktuell;
            aktuell = aktuell.nestePerson;
            return imidler;
        }
    }
}

class TestButikk {
    public static void main(String[] args) {
        Butikk butikken = new Butikk();

        butikken.entreButikk(new Person("Stig", "Sitronsaft"));
        butikken.entreButikk(new Person("Hedda", "Engangskopper"));
        butikken.entreButikk(new Person("Jawad", "Pasta"));
        butikken.entreButikk(new Person("Henrik", "Kaffe"));
        butikken.entreButikk(new Person("Mathias", "Tomatsuppe"));

        System.out.println("BUTIKK-KØ: ");
        for(Person p : butikken){
          System.out.println(p);
        }
    }
}

import java.util.*;
import java.io.*;
class CDAlbum implements Comparable<CDAlbum>{
    String Artistnavn;
    String Albumnavn;
    int Utgivelsesår;
    CDAlbum(String Artistnavn,String Albumnavn,int Utgivelsesår){
        this.Artistnavn = Artistnavn;
        this.Albumnavn = Albumnavn;
        this.Utgivelsesår = Utgivelsesår;
    }
    public String hentNavn(){
        return Artistnavn;
    }
    @Override
    public String toString() {
        return "Informasjon om albumet: artistnavn er " + Artistnavn + ". Albumnavn er " + Albumnavn + ". Utgivelsesår er " + Utgivelsesår;
    }
    @Override
    public int compareTo(CDAlbum annet) {
        return Artistnavn.compareTo(annet.Artistnavn);
    }
}


class CDSamling {
    public static void main(String[] args) {
        ArrayList<CDAlbum> cds = lesFraFil("cdliste.txt");
        if (cds == null) return;

        System.out.println("Sortert CD-samling:");
        for (CDAlbum cd : cds) {
            System.out.println(cd);
        }

        // Lagre sortert liste til fil:
        lagreTilFil(cds, "sortertListe.txt");
    }

    public static ArrayList<CDAlbum> lesFraFil(String filnavn) {
        ArrayList<CDAlbum> liste = new ArrayList<>();
        try (Scanner fscan = new Scanner(new File(filnavn))) {
            while (fscan.hasNextLine()) {
                String[] deler = fscan.nextLine().split(",");
                String artist = deler[0].trim();
                String album = deler[1].trim();
                int aar = Integer.parseInt(deler[2].trim());

                CDAlbum nytt = new CDAlbum(artist, album, aar);

                int i = 0;
                while (i < liste.size() && nytt.compareTo(liste.get(i)) >= 0) {
                    i++;
                }
                liste.add(i, nytt);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen " + filnavn);
        }
        return liste;
    }

    public static void lagreTilFil(ArrayList<CDAlbum> liste, String filnavn) {
        try (PrintWriter pw = new PrintWriter(filnavn)) {
            for (CDAlbum cd : liste) {
                pw.println(cd);
            }
            System.out.println("Lagret sortert liste til " + filnavn);
        } catch (FileNotFoundException e) {
            System.out.println("Feil ved skriving til fil: " + e.getMessage());
        }
    }
}

import java.util.*;

interface TosidiKø<T> extends Iterable<T>{
    public boolean erTom();
    public void settInnForan(T elem);
    public void settInnbak(T elem);
    public T taUtFørste();
    public T taUtSiste();
}

class DobbelLenkeListe <T> implements TosidiKø<T>{
    private final Node HODE;
    public DobbelLenkeListe(){
        HODE = new Node(null);
        HODE.forrige=HODE.neste=HODE;
    }
    
    private class Node{
        T element;
        Node forrige,neste;

        Node(T element){
            this.element = element;
        }
    }

    @Override
    public boolean erTom() {
        return HODE.neste==HODE;
    }

    private void settInnEtter(Node n, T element){
        Node ny = new Node(element);
        ny.forrige = n;
        ny.neste = n.neste;
        n.neste.forrige = ny;
        n.neste = ny;
    }

    @Override
    public void settInnForan(T elem) {
        settInnEtter(HODE, elem);
        //Node ny = new Node(elem);
        //ny.forrige = HODE;
        //ny.neste = HODE.neste;
        //HODE.forrige.neste = ny;
        //HODE.neste = ny;
    }
    @Override
    public void settInnbak(T elem) {
        settInnEtter(HODE.forrige, elem);
        //Node ny = new Node(elem);
        //ny.neste = HODE;
        //ny.forrige = HODE.forrige;
        //HODE.forrige.neste = ny;
        //HODE.forrige = ny;
    }
    private void taUtDenne(Node denne){
        denne.forrige.neste = denne.neste;
        denne.neste.forrige = denne.forrige;
    }

    @Override
    public T taUtFørste() {
        if(erTom()){
            throw new NoSuchElementException();
        }
        Node foerste = HODE.neste;
        taUtDenne(foerste);
        return foerste.element;
    }
    @Override
    public T taUtSiste() {
        if(erTom()){
            throw new NoSuchElementException();
        }
        Node siste = HODE.forrige;
        taUtDenne(siste);
        return siste.element;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListeIterator();
    }

    private class ListeIterator implements Iterator<T>{
        Node ståsted = HODE;

        public boolean hasNext(){
            return ståsted.neste != HODE;
        }
        public T next(){
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            ståsted = ståsted.neste;
            return ståsted.element;
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


class Buffer {
    private boolean available = false;

    synchronized void produce() throws InterruptedException {
        while (available) wait();
        System.out.println("Producing...");
        Thread.sleep(500); // Simulate time taken to produce
        available = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) wait();
        System.out.println("Consuming...");
        Thread.sleep(500); // Simulate time taken to consume
        available = false;
        notify();
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                buffer.produce();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                buffer.consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

import java.util.Scanner;

class Klokke implements Runnable {
    @Override
    public void run() {
        int tid = 0;
        while (true){
            System.out.println(tid + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {return;}
            tid++;
        }
    }
}

class Stoppeklokke2 {
    public static void main (String[] args){
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Trykk Return for å starte... ");
        tastatur.nextLine();

        Thread klokke = new Thread(new Klokke());
        klokke.start();

        System.out.print("Trykk Return for å stoppe... \n");
        tastatur.nextLine();
        klokke.interrupt();
        System.out.println("Takk for nå");
    }
}

import java.util.Scanner;

class Klokke implements Runnable {
    boolean stop = false;
    @Override
    public void run() {
        int tid = 0;
        while (!stop){
            System.out.println(tid + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {return;}
            tid++;
        }
    }
}

class Stoppeklokke2 {
    public static void main (String[] args){
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Trykk Return for å starte... ");
        tastatur.nextLine();

        Klokke minKlokke = new Klokke();
        Thread klokke = new Thread(minKlokke);
        klokke.start();

        System.out.print("Trykk Return for å stoppe... \n");
        tastatur.nextLine();
        minKlokke.stop = true;
        System.out.println("Takk for nå");
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

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock; 
import java.util.concurrent.locks.ReentrantLock;

class Bank {
    static public Lock lås = new ReentrantLock();
    static public Condition ikkeTomt = lås.newCondition();
    static public int pengebeløp=500;
}

class TarGi implements Runnable{
    Bank bank;
    int penger;
    TarGi(int amount){
        penger = amount;
    }

    public void ta(){
        Bank.lås.lock();
        try {
            Bank.pengebeløp = Bank.pengebeløp - penger;
            System.out.println("saldo er " + this.saldo());
            Bank.ikkeTomt.signalAll();
        } finally {
            Bank.lås.unlock();
        }
    }
    public void gi () throws InterruptedException {
        Bank.lås.lock();
        try{
            while(Bank.pengebeløp==500){
                Bank.ikkeTomt.await();
            }
            Bank.pengebeløp = Bank.pengebeløp + penger + 1;
        } finally {
            Bank.lås.unlock();
        }
    }
    public int saldo(){
        return Bank.pengebeløp;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            this.ta();
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            try { this.gi();
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
             }
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("saldo er " + this.saldo());
        }
    }
}
class Hovedprogram{
    public static void main(String[] args){
        int amount = 100;
        for (int i = 0; i<25; i++){
            Thread newThread = new Thread(new TarGi(amount++));
            newThread.run();
        }
    }
}

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock; 
import java.util.concurrent.locks.ReentrantLock;
class Bank {
    int pengebelop = 100;
    Lock laas = new ReentrantLock();
    Condition pengerIBanken = laas.newCondition();

    public void ta(int belop) throws InterruptedException {
        laas.lock();
        try {
            while(pengebelop < belop) {
                pengerIBanken.await();
            }
            pengebelop -= belop;
        }
        finally {
            laas.unlock();
        }
    }

    public void gi(int belop){
        laas.lock();
        try {
            pengebelop += belop+1;
            pengerIBanken.signalAll();
        }
        finally {
            laas.unlock();
        }
    }

    public int saldo(){
        laas.lock();
        try {
            return pengebelop;
        }
        finally {
            laas.unlock();
        }
    }
}

class GiOgTa implements Runnable{
    int belop;
    Bank bank;
    public GiOgTa(int belop, Bank bank){
        this.belop = belop;
        this.bank = bank;
    }
    public void run(){
        for (int i = 0; i < 5; i++){
            try {
                bank.ta(belop);
            } catch(InterruptedException e) {
                System.err.println("Avbrudd ved uttak av: " + belop);
            }
            bank.gi(belop);
            System.out.println(bank.saldo());
        }
    }
}
class Hovedprogram{
    public static void main(String[] args){
        Bank bank = new Bank();

        for (int i = 1; i <= 10; i++){
            GiOgTa giOgTa = new GiOgTa(95+i, bank);
            Thread giOgTaTraad = new Thread(giOgTa);
            giOgTaTraad.start();
        }
    }
}

import java.util.concurrent.locks.Lock; 
import java.util.concurrent.locks.ReentrantLock;
class Tallmonitor{
    Lock laas = new ReentrantLock();
    private int detMinste = Integer.MIN_VALUE;
    private int detStorste = Integer.MAX_VALUE;

    public boolean settMinste (int nyMinste){
        laas.lock();
        try{
            if(detStorste <= nyMinste) return false;
            detMinste = nyMinste;
            return true;
        } finally{
            laas.unlock();
        }
    }

    public boolean settStorste(int nyStorste){
        laas.lock();
        try{
            if(nyStorste<=detMinste) return false;
            detStorste = nyStorste;
            return true;
        } finally{
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
    tall = Integer.MAX_VALUE;
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
      tall = Integer.MIN_VALUE;
    }
  
    public void run(){
        while(monitor.settMinste(tall)){
          tall++;
        }
        System.out.println("STOPP! Tallet er ikke lenger minst: " + tall);
      }
  }

class Hovedprogram{
    public static void main(String[] args){
        Tallmonitor tm = new Tallmonitor();
        Thread traad1 = new Thread(new Nedover(tm));
        Thread traad2 = new Thread(new Oppover(tm));
        traad1.start();
        traad2.start();
    }
}

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Tallmonitor {
    Lock laas = new ReentrantLock();
    private int detMinste = 0;
    private int detStorste = 20;

    public boolean settMinste(int nyMinste) {
        laas.lock();
        try {
            if (detStorste <= nyMinste) return false;
            detMinste = nyMinste;
            return true;
        } finally {
            laas.unlock();
        }
    }

    public boolean settStorste(int nyStorste) {
        laas.lock();
        try {
            if (nyStorste <= detMinste) return false;
            detStorste = nyStorste;
            return true;
        } finally {
            laas.unlock();
        }
    }
}

class Nedover implements Runnable {
    private Tallmonitor monitor;
    private int tall;

    public Nedover(Tallmonitor monitor) {
        this.monitor = monitor;
        tall = 40; // Start from a higher number
    }

    public void run() {
        try {
            while (monitor.settStorste(tall)) {
                System.out.println("Nedover: " + tall);
                tall--;
                Thread.sleep(5);
            }
            System.out.println("STOPP! Tallet er ikke lenger størst: " + tall);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Oppover implements Runnable {
    private Tallmonitor monitor;
    private int tall;

    public Oppover(Tallmonitor monitor) {
        this.monitor = monitor;
        tall = -40; // Start from a lower number
    }

    public void run() {
        try {
            while (monitor.settMinste(tall)) {
                System.out.println("Oppover: " + tall);
                tall++;
                Thread.sleep(5);
            }
            System.out.println("STOPP! Tallet er ikke lenger minst: " + tall);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

 class hovedprogram {
    public static void main(String[] args) {
        Tallmonitor tm = new Tallmonitor();
        Thread traad1 = new Thread(new Nedover(tm));
        Thread traad2 = new Thread(new Oppover(tm));
        traad1.start();
        traad2.start();
    }
}

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Tiende implements Runnable{
    public int tall = 5;
    public void run() {
        while(tall<=1000){
            System.out.println(tall);
            tall+=10;
        } System.out.println("Over!");
    }
}

class Monitor{
    Lock laas = new ReentrantLock();

    public void skrivUt(int tall){
        laas.lock();
        try{
            System.out.println(tall);
        } finally{
            laas.unlock();
        }
    }

}

class StartToMaks implements Runnable{
    int start;
    int nde;
    int maks;
    Monitor monitor;
    StartToMaks (int s, int m, int n, Monitor mo){
        start = s;
        nde = n;
        maks = m;
        monitor = mo;
    }
    public void run() {
        while(start<=maks){
            monitor.skrivUt(start);
            start+=nde;  
        } System.out.println("Over!");
    };

}

class hovedprogram {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        for (int i = 0; i<10; i++){
            Thread tred = new Thread(new StartToMaks(0,100,4,monitor));
            tred.start();
        }
    }
}

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class NteTall{
    Condition ikkjeNeste;
    Condition provIgjen;
    Lock talLaas;

   NteTall(){
     talLaas = new ReentrantLock();
     ikkjeNeste = talLaas.newCondition();
     provIgjen = talLaas.newCondition();
     NteMonitor m = new NteMonitor();

     for(int i = 0; i<10; i++){
       new Thread(new MinRun(i, 0, 1001, m)).start();
     }

   }
  public static void main(String[] args){
    new NteTall();

  }

  class NteMonitor{
      int tal = -1; //neste tal som skal skrivast ut

      public void skrivUt(int i){
        talLaas.lock();
        try{
          while(i-1 != tal){
            // Viss tråden gir frå seg eit tal som ikkje er den neste i rekkja, sei at den må vente
            ikkjeNeste.await();
          }

          // Tråd gir frå seg talet som er den neste i rekkja:
          tal = i;
          System.out.println(tal);
          ikkjeNeste.signalAll();

        }
        catch(InterruptedException e){
          System.out.println("feil");
        }
        finally{
          talLaas.unlock();
        }

    }
  }
}


 class MinRun implements Runnable{
  private final int SLUTT;
  private final int START;
  private final int N;
  private int teller = 0;
  private final NteTall.NteMonitor monitor;

  private final Lock lock = new ReentrantLock();

  public MinRun(int n, int start, int slutt, NteTall.NteMonitor m){
    this.SLUTT = slutt;
    this.START = start;
    this.N = n;
    this.monitor = m;
  }

  public void run(){
    lock.lock();
    try{
      while(teller < SLUTT){
        if(teller % 10 == N){
          monitor.skrivUt(teller);
        }
        teller++;
        }
      }finally{
        lock.unlock();
      }
    }
  }

class MyRunnable implements Runnable {
    public void run() {
        try {
                System.out.println(1);
                Thread.sleep(1000);
                System.out.println(2);
            } catch (InterruptedException e) {
                System.out.println(3);
            }
        System.out.println(4);
    }
}
class AvbrytTraaden {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
        t.interrupt();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        try {
                System.out.println(1);
                Thread.sleep(1000);
                System.out.println(2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(3);
            }

        if(!Thread.interrupted()) {
            System.out.println(4);
        }
    }
}

 class hovedprogram {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
        t.interrupt();
    }
}

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.Random;

class Brusautomaten {
    Lock laas = new ReentrantLock();
    Condition fylle = laas.newCondition();
    Condition tomt = laas.newCondition();
    int brusbosker = 50;
    final int kapasitet = 50;

    public void refill() throws InterruptedException {
        laas.lock();
        try{
            while(brusbosker!=0){
                tomt.await();
        }
        brusbosker=kapasitet;
        System.out.println("✅ Brusmaskinen er fylt opp til " + brusbosker + " bokser!");
        fylle.signalAll();
        } finally{
            laas.unlock();
        }
    }

    public void kjopBrus() throws InterruptedException {
        laas.lock();
        try{
            while(brusbosker==0){
                tomt.signalAll();
                fylle.await();
            }
            brusbosker--;
            System.out.println("🍹 En brus er kjøpt, igjen: " + brusbosker);
        } finally {
            laas.unlock();
        }
    }
}

class Maskinfyller implements Runnable {
    Brusautomaten monitor;

    Maskinfyller(Brusautomaten m){
        monitor = m;
    }
    @Override
    public void run() {
        try {
            while(true){
                monitor.refill();
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Brusdrikker implements Runnable {
    Brusautomaten monitor;
    int plannen;
    Random random = new Random();

    Brusdrikker(int p, Brusautomaten m){
        plannen = p;
        monitor = m;
    }

    @Override
    public void run() {
        try {
            while(plannen>0){
                monitor.kjopBrus();
                plannen--;
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class hovedprogram{
    public static void main(String[] args){
        Brusautomaten monitor = new Brusautomaten();

        Maskinfyller maskin = new Maskinfyller(monitor);
        Thread maskinThread = new Thread(maskin);

        Brusdrikker drikkerEn = new Brusdrikker(9, monitor);
        Thread en = new Thread(drikkerEn);
        Brusdrikker drikkerTo = new Brusdrikker(15, monitor);
        Thread to = new Thread(drikkerTo);
        Brusdrikker drikkerTre = new Brusdrikker(14, monitor);
        Thread tre = new Thread(drikkerTre);
        Brusdrikker drikkerFire = new Brusdrikker(12, monitor);
        Thread fire = new Thread(drikkerFire);
        Brusdrikker drikkerFem = new Brusdrikker(13, monitor);
        Thread fem = new Thread(drikkerFem);

        maskinThread.start();
        en.start();
        to.start();
        tre.start();
        fire.start();
        fem.start();
    }
}


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.LinkedList;

class Sykehus{
    LinkedList<Integer> queue = new LinkedList<>();
    Lock laas = new ReentrantLock();
    Condition ikkeTomt = laas.newCondition();
    int antallPasienter = 50;
    static int pasidentId=0;
    private boolean allePasienterLagtTil = false;

    public void leggTilPasient() {
        laas.lock();
        try{
            int id = pasidentId;
            queue.add(id);
            pasidentId++;
            antallPasienter--;
            System.out.println("pasient med ID " + id + " var added!");
            if(antallPasienter==0){
                signaliserAllePasienterLagtTil();
            }
            ikkeTomt.signalAll();
        } finally{
            laas.unlock();
        }
    }

    public void behandlePasient() throws InterruptedException {
        laas.lock();
        try{
            while (queue.isEmpty()) {
                if (allePasienterLagtTil){
                    return;
                }
                ikkeTomt.await();
            }
            int pasient = queue.removeFirst();
            System.out.println("pasient med ID " + pasient + " var behandlet...");
        } finally {
            laas.unlock();
        }
    }

    public void signaliserAllePasienterLagtTil() {
        laas.lock();
        try {
            allePasienterLagtTil = true;
        } finally {
            laas.unlock();
        }
    }

    public boolean behandlingFerdig() {
        laas.lock();
        try {
            return allePasienterLagtTil && queue.isEmpty();
        } finally {
            laas.unlock();
        }
    }
}

class Motta implements Runnable{
    Sykehus monitor;
    Motta(Sykehus m){
        monitor = m;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            monitor.leggTilPasient();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Behandle implements Runnable{
    Sykehus monitor;
    Behandle(Sykehus m){
        monitor = m;
    }
    @Override
    public void run() {
        try {
            while (!monitor.behandlingFerdig()) {
                monitor.behandlePasient();
            }
            Thread.sleep(2000);
            System.out.println("🏥 All behandling ferdig. Sykehuset stenger.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }  
}

class hovedprogram{
    public static void main(String[] args) {
        Sykehus sykehus = new Sykehus();

        Motta motta = new Motta(sykehus);
        Behandle behandle = new Behandle(sykehus);

        Thread thread1 = new Thread(motta);
        Thread thread2 = new Thread(behandle);

        thread2.start();
        thread1.start();
    }
}


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CountDownLatch;

// Skrevet av Stein Gjessing 2017 - 2025

class Minst {
   public static void main(String[ ] args) {
      int [ ] tabell;
      MinstMonitor monitor;
      Runnable runAbl;
      final int ANTTRÅD = 14;
      final int ANTPERTRÅD = 1000;
      CountDownLatch bariere = new CountDownLatch(ANTTRÅD);
      tabell = new int[ANTTRÅD * ANTPERTRÅD];
      for (int in = 0; in < ANTTRÅD * ANTPERTRÅD; in++)
        tabell[in] = (int)Math.round(Math.random()*Integer.MAX_VALUE);
      monitor = new MinstMonitor();
      for (int i = 0; i< ANTTRÅD; i++)  {
            runAbl = new MinstRun(tabell,i*ANTPERTRÅD,
                            ((i+1)*ANTPERTRÅD)-1,monitor,bariere);
            new Thread(runAbl).start();
      }
      try {
          bariere.await();
          System.out.println("Minste verdi var: "
                                   + monitor.hentMinste());
      }
      catch (InterruptedException ex){
          System.out.println(" Uventet avbrudd "); System.exit(1);
      }
   }
}
class MinstMonitor {
    private Lock lås = new ReentrantLock();
    int minstTilNå = Integer.MAX_VALUE;
    int antallFerdigeSubtråder = 0;
    public void giMinsteVerdi (int minVerdi) {
       lås.lock();
       try {
          if (minstTilNå > minVerdi) minstTilNå = minVerdi;
       }
       finally {
          lås.unlock();
       }
    }
    public int hentMinste () {return minstTilNå;}  //Trenger ikke laases
                                       // fordi alle andre operasjoner er ferdige
}
class MinstRun implements Runnable {
    int [ ] tab; int startInd, endInd;
    MinstMonitor mon;
    CountDownLatch bariere;
    MinstRun(int [ ] tb, int st, int en,
             MinstMonitor m, CountDownLatch bariere) {
        tab = tb; startInd = st; endInd = en;
        mon = m; this.bariere = bariere;
    }
    public void run(){
        int minVerdi = Integer.MAX_VALUE;
        for (int ind = startInd; ind <= endInd; ind++)
            if(tab[ind] < minVerdi) minVerdi = tab[ind];
        mon.giMinsteVerdi(minVerdi);
        bariere.countDown();
    }
}


import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Program som viser at vranglas (deadlock) kan oppstå.
// Skrevet av Stein Gjessing 2017 - 2025
// Refaktorert versjon

class Bil implements Runnable {
   private Veistump enVei, toVei;
   private int ind;
   public Bil (Veistump en, Veistump to, int i) {
        enVei = en;  toVei = to;
        ind = i;
   }
   public void run() {
        System.out.println(" Bil nr " + ind +
          " venter på å passere "+ enVei.del +" veistykke");
        enVei.taVei();
        // Det tar litt tid å kjøre dette veistykket:
        try {Thread.sleep(10);}
           catch (InterruptedException e)
             {System.out.println("FEIL1"); System.exit(1);}
        System.out.println(" Bil nr " + ind +
          " venter på å passere "+ toVei.del +" veistykke");
        toVei.taVei();
        enVei.friVei();
        // Det tar litt tid å kjøre dette veistykket:
        try {Thread.sleep(10);}
           catch (InterruptedException e)
            {System.out.println("FEIL2"); System.exit(1);}
        toVei.friVei();
        System.out.println(" Bil nr " + ind +
               " har passert hele den smale veien ");
        System.out.println();
    }
}
class Veistump  {
   private Lock lås = new ReentrantLock();
   private Condition ledig = lås.newCondition();
   private boolean veiLedig = true;
   final String del;
   public Veistump (String hvilken) {
       del = hvilken;
   }
   public void taVei() {
       lås.lock();
       try {
           while (!veiLedig) {ledig.await();}
           // Nå er veien ledig , den er min
           veiLedig = false;
        }
        catch (InterruptedException e)
            {System.out.println("FEIL3"); System.exit(1);}
        finally {lås.unlock();}
    }
    public void friVei() {
        lås.lock();
        try{
           veiLedig= true;
           ledig.signalAll();
        }
        finally {lås.unlock();}
  }
}
class SmaltVeistykkeV2 {
   public static void main (String[] args) {
      Random ran = new Random();
      System.out.println(" ");
      System.out.println(" Main starter ");
      Veistump venstre = new Veistump(" venstre " );
      Veistump hoyre   = new Veistump(" høyre ");
      for (int ind = 1; ind <= 20; ind ++) {
          try {Thread.sleep((int)(ran.nextFloat()*1000));}
             catch (InterruptedException e)
               {System.out.println("FEIL4"); System.exit(1);}
          Bil  bilen1 = new Bil(venstre,hoyre,ind*2-1);
          new Thread(bilen1).start();
          try {Thread.sleep((int)(ran.nextFloat()*1000));}
             catch (InterruptedException e)
               {System.out.println("FEIL5"); System.exit(1);}
          Bil  bilen2 = new Bil(hoyre,venstre, ind*2);
          new Thread(bilen2).start();
      }
      System.out.println(" 40 biler er startet ");
      System.out.println(" Main er ferdig ");
  }
}


// 1) Når bruke .join()? 
// Når du har et lite antall tråder og du enkelt kan kalle join() på hver.
// Når du ikke trenger mer avansert synkronisering, bare vil vente på at en annen tråd er ferdig.

// 2)
// Når du har flere tråder som må fullføre før én tråd fortsetter.
// Når du trenger en startport (barrier) hvor flere tråder skal vente til en hendelse
// I parallell behandling hvor du venter på at alle tråder fullfører sine oppgaver før du fortsetter

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

 class OppgaveTeller {
    private static final AtomicInteger teller = new AtomicInteger(0);

    public static void utførOppgave() {
        int antall = teller.incrementAndGet();
        // Skriv ut hver femte gang
        if (antall % 5 == 0) {
            System.out.println("Oppgave nummer " + antall + " er utført!");
        }
    }
}


 class MainProgram {
    public static void main(String[] args) {
        int antallOppgaver = 20;

        // Oppretter en trådpool med 4 tråder
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Sender oppgaver til executor
        for (int i = 0; i < antallOppgaver; i++) {
            executor.submit(() -> {
                OppgaveTeller.utførOppgave();
            });
        }

        // Stenger executor og venter til alle oppgaver er ferdige
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Noen oppgaver tok for lang tid – prøver tvungen nedstenging...");
                executor.shutdownNow(); // Prøv å tvinge nedstenging hvis det tok for lang tid
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Alle oppgaver er ferdige.");
    }
}


import java.util.concurrent.CountDownLatch;
class Hi implements Runnable{
    CountDownLatch barriere;
    CountDownLatch barriere2;
    Hi(CountDownLatch b, CountDownLatch b2){
        barriere = b;
        barriere2 = b2;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Hei første gang");
        barriere.countDown();
        try{
            barriere.await();
        } catch (InterruptedException e){
            System.out.println("hva som helst");
        }
        System.out.println(Thread.currentThread().getName() + ": Hei andre gang");
        barriere2.countDown();
        try{
            barriere2.await();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + ": Hei tredje gang");
    }
}

class hovedprogram{
    public static void main(String[] args){
        CountDownLatch barriere = new CountDownLatch(8);
        CountDownLatch barriere2 = new CountDownLatch(8);
        for(int i=0;i<8;i++){
            Thread thread = new Thread(new Hi(barriere, barriere2));
            thread.start();
            try {
                Thread.sleep((long)(Math.random() * 200));
            } catch (InterruptedException e) {
            }
        }
    }
}

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class konkuranse{
    int biggestNumber = 0;
    Lock loos = new ReentrantLock();

    public void compete(int number){
        loos.lock();
        try{
            if (number>biggestNumber){
                biggestNumber = number;
            }
        } finally{
            loos.unlock();
        }
    }

    public int returnWinner(){
        return biggestNumber;
    }
}

class Deltaker implements Runnable{
    konkuranse monitor;
    CountDownLatch barriere;
    Random random = new Random();

    Deltaker(konkuranse m,CountDownLatch b){
        monitor = m;
        barriere = b;
    }

    @Override
    public void run() {
        int indeks = random.nextInt(1000);
        System.out.println(Thread.currentThread().getName() + " sent number: " + indeks);
        monitor.compete(indeks);
        barriere.countDown();
        try {
            barriere.await();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        int vinnerNumber = monitor.returnWinner();
        if(indeks==vinnerNumber){
            System.out.println(Thread.currentThread().getName() + " I am winner and the biggest number is: " + vinnerNumber);
        }
    }
}

class hovedprogram {
    public static void main(String[] args){
        List<Thread> deltakere = new ArrayList<>();
        int numberOfCompetitors = 10;
        konkuranse monitor = new konkuranse();
        CountDownLatch barriere = new CountDownLatch(numberOfCompetitors);
        for(int i=0;i<numberOfCompetitors;i++){
            Thread thread = new Thread(new Deltaker(monitor, barriere));
            deltakere.add(thread);
            thread.start();
        }

        for(Thread deltaker:deltakere){
            try{
                deltaker.join();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Konkuranse er over");
    }
}


import java.util.concurrent.CountDownLatch;
import java.util.ArrayList;
import java.util.List;

class Pasient {
    String navn;
    public Pasient(String navn) {
        this.navn = navn;
    }
}

class RøntgenAvdeling implements Runnable {
    private final Pasient pasient;
    private final CountDownLatch ferdigMedRøntgen;

    public RøntgenAvdeling(Pasient pasient, CountDownLatch latch) {
        this.pasient = pasient;
        this.ferdigMedRøntgen = latch;
    }

    @Override
    public void run() {
        System.out.println(pasient.navn + " er i røntgenavdelingen...");
        try {
            Thread.sleep(1000 + (long)(Math.random() * 1000)); // Simuler behandlingstid
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(pasient.navn + " er ferdig med røntgen.");
        ferdigMedRøntgen.countDown(); // Signal at røntgen is done
    }
}

class OperasjonsAvdeling implements Runnable {
    private final Pasient pasient;
    private final CountDownLatch ferdigMedRøntgen;

    public OperasjonsAvdeling(Pasient pasient, CountDownLatch latch) {
        this.pasient = pasient;
        this.ferdigMedRøntgen = latch;
    }

    @Override
    public void run() {
        try {
            ferdigMedRøntgen.await(); // Wait for røntgen to complete
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(pasient.navn + " starter operasjon.");
    }
}

class hovedprogram {
    public static void main(String[] args) {
        String[] pasientNavn = {"Anna", "Bjørn", "Celine", "David", "Ella"};
        List<Thread> alleTråder = new ArrayList<>();

        for (String navn : pasientNavn) {
            Pasient p = new Pasient(navn);
            CountDownLatch røntgenFerdig = new CountDownLatch(1);

            Thread røntgen = new Thread(new RøntgenAvdeling(p, røntgenFerdig));
            Thread operasjon = new Thread(new OperasjonsAvdeling(p, røntgenFerdig));

            alleTråder.add(røntgen);
            alleTråder.add(operasjon);

            røntgen.start();
            operasjon.start();
        }

        // Vent på at alle tråder er ferdige
        for (Thread t : alleTråder) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Alle pasienter er behandlet.");
    }
}


// import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class TacoTruck {
    public static final int TOTAL_TACOS = 50;
    public static final int NR_CUSTOMERS = 25;
    public static final int MAX_TACOS_ON_COUNTER = 2;
    public static final int TACO_MAKING_TIME_MS = 1000;


    private final Lock lock = new ReentrantLock();
    private final Condition counterIsFull = lock.newCondition();
    private final Condition counterIsEmpty = lock.newCondition();
    private int tacosOnCounter = 0;


    public void makeTaco() throws InterruptedException {
        lock.lock();
        try {
            while (tacosOnCounter >= MAX_TACOS_ON_COUNTER) {
                counterIsFull.await();
            }
            tacosOnCounter++;
            System.out.println("Chef made a taco. Tacos on counter: " + tacosOnCounter);
            counterIsEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }


    public void consumeTaco(int customerID) throws InterruptedException {
        lock.lock();
        try {
            while (tacosOnCounter == 0) {
                counterIsEmpty.await();
            }
            tacosOnCounter--;
            System.out.println("Customer " + customerID + " consumed a taco. Tacos left on counter: " + tacosOnCounter);
            counterIsFull.signalAll();
        } finally {
            lock.unlock();
        }
    }
}


class Chef implements Runnable {
    private final TacoTruck tacoTruck;
    public Chef(TacoTruck tacoTruck) {
        this.tacoTruck = tacoTruck;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < TacoTruck.TOTAL_TACOS; i++) {
                Thread.sleep(TacoTruck.TACO_MAKING_TIME_MS);
                tacoTruck.makeTaco();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Chef was interrupted and stops making tacos.");
        }
    }
}


class Customer implements Runnable {
    private final TacoTruck tacoTruck;
    private final int customerID;
    private final CountDownLatch latch;
    public Customer(TacoTruck tacoTruck, int customerID, CountDownLatch latch) {
        this.tacoTruck = tacoTruck;
        this.customerID = customerID;
        this.latch = latch;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(1000 + customerID*1000);
            tacoTruck.consumeTaco(customerID);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Customer " + customerID + " was interrupted before consuming a taco.");
        } finally {
            latch.countDown();
        }
    }
}

 class KjorTacoTruck {
    public static void main(String[] args) {
        TacoTruck tacoTruck = new TacoTruck();
        CountDownLatch customerLatch = new CountDownLatch(TacoTruck.NR_CUSTOMERS);
        Thread chefThread1 = new Thread(new Chef(tacoTruck));
        Thread chefThread2 = new Thread(new Chef(tacoTruck));

        Thread[] customerThreads = new Thread[TacoTruck.NR_CUSTOMERS];
        for (int i = 0; i < TacoTruck.NR_CUSTOMERS; i++) {
            customerThreads[i] = new Thread(new Customer(tacoTruck, i + 1, customerLatch));
        }

        chefThread1.start();
        chefThread2.start();
        for (Thread customerThread : customerThreads) {
            customerThread.start();
        }

        try {
            customerLatch.await();
            chefThread1.interrupt(); chefThread2.interrupt();
            chefThread1.join(); chefThread2.join();
        } catch (InterruptedException e) {
            System.err.println("The main thread was interrupted while waiting for the customers. Program exits.");
            System.exit(1);
        }
        System.out.println("All customers are served. The foodtruck is closing!");
    }
}


import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CountDownLatch;

class BokstavTeller implements Runnable {
    Monitor monitor;
    private final CountDownLatch latch;

    BokstavTeller(Monitor m, CountDownLatch l){
        latch = l;
        monitor =m;
    }

    @Override
    public void run() {
        String ord;
        char bokstav = monitor.bokstav;
        while ((ord = monitor.hentOrd()) != null) {
            int antall = 0;
            String ordLower = ord.toLowerCase();
            for (int i = 0; i < ordLower.length(); i++) {
                if (ordLower.charAt(i) == bokstav) {
                    antall++;
                }
            }
            System.out.println("Det er " + antall + " '" + bokstav + "'" + " i ord: " + ord);
        }
        latch.countDown();
    }
}

class Monitor {
    private final Lock lock = new ReentrantLock();
    ArrayList<String> ordList;
    char bokstav;
    Monitor(ArrayList<String> o,char b){
        ordList = o;
        bokstav = b;
    }
    public String hentOrd(){
        lock.lock();
        try{
            if(ordList.isEmpty()){
                return null;
            }
            return ordList.removeLast();
        } finally {
            lock.unlock();
        }
    }
}

class hovedprogram {
    public static void main(String[] args){
        ArrayList<String> arrayL = new ArrayList<>();
        CountDownLatch ordLatch = new CountDownLatch(3);
        arrayL.add("electronico");
        arrayL.add("obladat");
        arrayL.add("buda");
        arrayL.add("og");
        arrayL.add("maverick");
        Monitor monitor = new Monitor(arrayL,'o');
        Thread thread1 = new Thread(new BokstavTeller(monitor,ordLatch));
        Thread thread2 = new Thread(new BokstavTeller(monitor,ordLatch));
        Thread thread3 = new Thread(new BokstavTeller(monitor,ordLatch));
        Thread thread4 = new Thread(new BokstavTeller(monitor,ordLatch));
        Thread thread5 = new Thread(new BokstavTeller(monitor,ordLatch));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        try {
            ordLatch.await();
        } catch (InterruptedException e) {
        }
        System.out.println("Programmet er ferdig!!");

    }
}


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CountDownLatch;

class ordMonitor{
    int antall =0;
    Lock laas = new ReentrantLock();

    public void fantOrdet(int antallFunn){
        laas.lock();
        try{
            antall+=antallFunn;
        } finally{
            laas.unlock();
        }
    }

    public int hentAntall(){
        return antall;
    }
}

class OrdFinner implements Runnable{
    String[] listeMedOrd;
    String ordSomSkalFinnes;
    ordMonitor monitor;
    CountDownLatch count;
    int startIndeks;
    int sluttIndeks;

    OrdFinner(String[] lm, int stI, int slI, String ord, ordMonitor m, CountDownLatch c){
        listeMedOrd = lm;
        startIndeks = stI;
        sluttIndeks = slI;
        ordSomSkalFinnes = ord;
        monitor = m;
        count = c;
    }

    @Override
    public void run() {
        int antallFunn = 0;
        for (int i=startIndeks;i<sluttIndeks;i++){
            if(listeMedOrd[i].strip().replaceAll("[^a-zA-Z]", "").equalsIgnoreCase(ordSomSkalFinnes)){
                antallFunn++;
            }
        }
        monitor.fantOrdet(antallFunn);
        count.countDown();
    }
}

class hovedprogram{
    public static void main(String[] args){

        if (args.length < 3) {
            System.err.println("Bruk: java hovedprogram <ord> <filnavn> <antall_tråder>");
            return;
        }
        
        String ordSomSkalFinnes = args[0];
        String filnavn = args[1];
        int antallTraader = Integer.parseInt(args[2]);

        Scanner fil = null;
        try{
            fil = new Scanner(new File(filnavn));
        } catch (FileNotFoundException e){
            System.err.println("Filen ble ikke funnet.");
            return;
        }
        int antallLinjer = fil.nextInt();
        fil.nextLine();

        String[] listeOrd = new String[antallLinjer];

        int indeks = 0;
        while(fil.hasNextLine()){
            String ord = fil.nextLine();
            listeOrd[indeks] = ord;
            indeks++;
        }
        fil.close();

        CountDownLatch count = new CountDownLatch(antallTraader);
        ordMonitor monitor = new ordMonitor();
        int ordPaaHverTraad = antallLinjer / antallTraader;
        indeks = 0;

        for (int i = 0; i < antallTraader; i++){

            // Hvor mange ord skal traaden lete etter?
            int antallOrd;
            if (i == antallTraader - 1) 
                antallOrd = antallLinjer - indeks;
            else antallOrd = ordPaaHverTraad;

            // Finner start og sluttindeks for den enkelte traaden
            int startIndeks = indeks;
            int sluttIndeks = indeks + antallOrd;
            indeks+= antallOrd;

            OrdFinner o = new OrdFinner(listeOrd, startIndeks, sluttIndeks, ordSomSkalFinnes, monitor, count);
            Thread t = new Thread(o);
            t.start();
        }

        // Etter at alle traadene er opprettet maa main-traaden vente paa at de alle blir ferdige.
        try {
            count.await();
        }
        catch (InterruptedException e){
            System.err.println("Main-traaden ble avbrutt i paavente av ordfinnerne. Avslutter.");
            System.exit(1);
        }

        System.out.println("Ordet forekom " + monitor.hentAntall() + " gang(er) i filen.");
    }
}

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CountDownLatch;
import java.util.*;

class Monitor {
    private int forGrøt;
    private int forPannekaker;
    private Lock laas = new ReentrantLock();

    public void stemme(boolean stemme){
        laas.lock();
        try{
            if(stemme){
                forGrøt++;
            } else {
                forPannekaker++;
            }
        } finally {
            laas.unlock();
        }
    }

    public String hentResulatater() {
        if(forGrøt>forPannekaker){
            return "Grøt har vant i denne avstemmingen!";
        } else if(forGrøt<forPannekaker){
            return "Pannekaker har vant i denne avstemmingen!";
        } else{
            return "Ingen har vant i denne avstemmingen\nGjennomføre et nytt avstemmingen!";
        }
    }
}

class Student implements Runnable{
    Monitor monitor;
    CountDownLatch count;
    Random random = new Random();
    int ID;

    Student(CountDownLatch c, int I, Monitor m){
        monitor =m;
        count =c;
        ID = I;
    }
    @Override
    public void run() {
        boolean stemme = random.nextBoolean();
        monitor.stemme(stemme);
        System.out.println("Student med ID: " + ID + " stemte på " + (stemme ? "Grøt" : "Pannekaker") + ".");
        count.countDown();
    }
}

class hovedprogram{
    public static void main(String[] args){
        
        if (args.length < 1) {
            System.err.println("Bruk: java hovedprogram <antallStudenter>");
            return;
        }
        
        int antallStudenter = Integer.parseInt(args[0]);
        CountDownLatch count = new CountDownLatch(antallStudenter);
        Monitor monitor = new Monitor();
        for(int i=0;i<antallStudenter;i++){
            Thread thread = new Thread(new Student(count, i, monitor));
            thread.start();
        }
        try{
            count.await();
        } catch (InterruptedException e){
            System.err.println("Main-traaden ble avbrutt. Avslutter.");
            System.exit(1);
        }
        System.out.println();
        System.out.println(monitor.hentResulatater());
    }
}

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;

class Post{
    String beskrivelse;
    String mottaker;
    Post(String b,String m){
        beskrivelse = b;
        mottaker = m;
    }
    public String hentBeskrivelse() {
        return beskrivelse;
    }
    public String hentMottaker() {
        return mottaker;
    }
    public String toString(){
        return "Mottaker: " + mottaker + " - Beskrivelse: " + beskrivelse;
    }
  }

  class Brev extends Post {

    public Brev(String beskrivelse, String mottaker){
        super(beskrivelse, mottaker);
    }

    public String toString(){
        return "Mottaker: " + mottaker + " - POST-Beskrivelse: " + beskrivelse;
    }
}

class Pakke extends Post {

    public Pakke(String beskrivelse, String mottaker){
        super(beskrivelse, mottaker);
    }

    public String toString(){
        return "Mottaker: " + mottaker + " - PAKKE-Beskrivelse: " + beskrivelse;
    }
}

class Postmann implements Runnable{
    Postkontor monitor;
    Postmann(Postkontor m){
        monitor = m;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i % 2 == 0){
                Post pakke = new Post("Hei. Pls respond", "Henrik");
                monitor.leverPost(pakke);
            } else{
                Post pakke = new Post("Hei. U w0t m8", "Margrethe");
                monitor.leverPost(pakke);
            }
        }
    }
}

class Kunde implements Runnable{
    Postkontor monitor;
    String navn;
    Kunde(Postkontor m, String n){
        monitor = m;
        navn = n;
    }
    @Override
    public void run() {
        while(true){
            Post pakke = monitor.hentPost(navn);
            if(pakke!=null){
                System.out.println(pakke);
            }
        }
    }
}

class Postkontor{
    private Post[] queue = new Post[10] ;
    private Lock laas = new ReentrantLock();
    private Condition ikkeFull = laas.newCondition();
    private Condition ikkeTom = laas.newCondition();

    public int storrelse(){
        int storrelse = 0;
        for (int i = 0; i < queue.length; i++){
            if (queue[i] != null){
                storrelse++;
            }
        }
        return storrelse;
    }
    
    public void leverPost(Post p){
        laas.lock();
        try{
            if(storrelse() == 10){
                ikkeFull.await();
            }
            for (int i = 0; i < queue.length; i++){
                if (queue[i] == null){
                    queue[i] = p;
                    ikkeTom.signalAll();
                    return;
                }
            }
        } catch (InterruptedException e){
            System.out.println(e);
        } finally {
            laas.unlock();
        }
    }

    public Post hentPost(String mottaker){
        laas.lock();
        try{
            if (storrelse()==0){
                ikkeTom.await();
            } 
            for (int i = 0; i < queue.length; i++){
                if (queue[i] != null){
                    if (queue[i].hentMottaker().equals(mottaker)){
                        Post p = queue[i];
                        queue[i] = null;
                        ikkeFull.signalAll();
                        return p;
                    }
                }
            } 
        } catch (InterruptedException e){
            System.out.println(e);
        } finally {
            laas.unlock();
        }
        return null;
    }
}

class Hovedprogram{
    public static void main(String[] args) {

        Postkontor postkontor = new Postkontor();

        Postmann postmann = new Postmann(postkontor);
        Thread traad = new Thread(postmann);
        traad.start();

        Kunde kunde1 = new Kunde(postkontor,"Henrik");
        traad = new Thread(kunde1);
        traad.start();

        Kunde kunde2 = new Kunde(postkontor, "Margrethe");
        traad = new Thread(kunde2);
        traad.start();
    }
}

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CountDownLatch;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

class Kniv{
}

class Saks{
    Kniv[] kniver= new Kniv[2];

    Saks(Kniv k1,Kniv k2){
        kniver[0] = k1;
        kniver[1] = k2;
    }
}

class KnivMonitor{
    ArrayList<Kniv> arrayL = new ArrayList<>();
    private Lock laas = new ReentrantLock();
    private final Condition minstToKniver = laas.newCondition();
    private boolean ferdigProdusert = false;

    public void setteIn(Kniv kniv){
        laas.lock();
        try{
            arrayL.add(kniv);
            if(arrayL.size()>=2){
                minstToKniver.signal();
            }
        } finally {
            laas.unlock();
        }
    }
    public Kniv[] taUtKniver() throws InterruptedException{
        laas.lock();
        try{
            while (arrayL.size() < 2) {
                if (ferdigProdusert) return null; // No more knives coming
                minstToKniver.await(); // wait for more knives
            } 
            Kniv[] kniver = new Kniv[2];
            kniver[0] = arrayL.remove(0);
            kniver[1] = arrayL.remove(0);
            return kniver;
        } finally {
            laas.unlock();
        }
    }
    public void settFerdig() {
        laas.lock();
        try {
            ferdigProdusert = true;
            minstToKniver.signalAll(); // wake up all waiting threads
        } finally {
            laas.unlock();
        }
    }
    public int antallKniver() {
        laas.lock();
        try {
            return arrayL.size();
        } finally {
            laas.unlock();
        }
    }
}

class KnivProdusent implements Runnable{
    CountDownLatch count;
    KnivMonitor monitor;
    int antallKniver;

    KnivProdusent(KnivMonitor m,int a,CountDownLatch c ){
        monitor = m;
        antallKniver = a;
        count = c;
    }
    @Override
    public void run() {
        for(int i=0;i<antallKniver;i++){
            Kniv kniv = new Kniv();
            monitor.setteIn(kniv);
            count.countDown();
        }
        monitor.settFerdig();
    }
}

class saksMonitor {
    ArrayList<Saks> arrayL = new ArrayList<>();
    private Lock laas = new ReentrantLock();

    public void setteIn(Saks saks){
        laas.lock();
        try{
            arrayL.add(saks);
        } finally {
            laas.unlock();
        }
    }
    public int henteAntall(){
        return arrayL.size();
    }
}

class SaksProdesent implements Runnable{
    KnivMonitor knivMonitor;
    saksMonitor saksMonitor;
    SaksProdesent(KnivMonitor k,saksMonitor s){
        knivMonitor = k;
        saksMonitor = s;
    }
    @Override
    public void run() {
        while (true) {
            Kniv[] kniver;
            try {
                kniver = knivMonitor.taUtKniver();
                if (kniver == null) break; // no more knives coming
                Saks nySaks = new Saks(kniver[0], kniver[1]);
                saksMonitor.setteIn(nySaks);
            } catch (InterruptedException e) {
                System.err.println("Saks-produksjon ble avbrutt.");
                break;
            }
        }
    }
}

class hovedprogram{
    public static void main(String[] args){
        int knivAntall = 309;
        CountDownLatch count = new CountDownLatch(knivAntall);
        KnivMonitor knivMonitor = new KnivMonitor();
        saksMonitor saksMonitor = new saksMonitor();

        Thread knivProduction = new Thread(new KnivProdusent(knivMonitor, knivAntall, count));
        Thread saksProduction = new Thread(new SaksProdesent(knivMonitor, saksMonitor));

        knivProduction.start();
        saksProduction.start();

        try{
            count.await();
        } catch (InterruptedException e) {
            System.err.println("Main-traaden ble avbrutt. Avslutter.");
            System.exit(1);
        }
        System.out.println("Kniv produksjon er ferdig!");

        try {
            saksProduction.join();
        } catch (InterruptedException e) {
            System.err.println("Main-traaden ble avbrutt. Avslutter.");
            System.exit(1);
        }

        System.out.println("\nDer var produsert " + saksMonitor.henteAntall() + " sakser!");
    }
}


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CountDownLatch;

class ordMonitor{
    int antall =0;
    Lock laas = new ReentrantLock();

    public void fantOrdet(int antallFunn){
        laas.lock();
        try{
            antall+=antallFunn;
        } finally{
            laas.unlock();
        }
    }

    public int hentAntall(){
        return antall;
    }
}

class OrdFinner implements Runnable{
    String[] listeMedOrd;
    String ordSomSkalFinnes;
    ordMonitor monitor;
    CountDownLatch count;
    int startIndeks;
    int sluttIndeks;

    OrdFinner(String[] lm, int stI, int slI, String ord, ordMonitor m, CountDownLatch c){
        listeMedOrd = lm;
        startIndeks = stI;
        sluttIndeks = slI;
        ordSomSkalFinnes = ord;
        monitor = m;
        count = c;
    }

    @Override
    public void run() {
        int antallFunn = 0;
        for (int i=startIndeks;i<sluttIndeks;i++){
            if(listeMedOrd[i].strip().replaceAll("[^a-zA-Z]", "").equalsIgnoreCase(ordSomSkalFinnes)){
                antallFunn++;
            }
        }
        monitor.fantOrdet(antallFunn);
        count.countDown();
    }
}

class hovedprogram{
    public static void main(String[] args){

        if (args.length < 3) {
            System.err.println("Bruk: java hovedprogram <ord> <filnavn> <antall_tråder>");
            return;
        }
        
        String ordSomSkalFinnes = args[0];
        String filnavn = args[1];
        int antallTraader = Integer.parseInt(args[2]);

        Scanner fil = null;
        try{
            fil = new Scanner(new File(filnavn));
        } catch (FileNotFoundException e){
            System.err.println("Filen ble ikke funnet.");
            return;
        }
        int antallLinjer = fil.nextInt();
        fil.nextLine();

        String[] listeOrd = new String[antallLinjer];

        int indeks = 0;
        while(fil.hasNextLine()){
            String ord = fil.nextLine();
            listeOrd[indeks] = ord;
            indeks++;
        }
        fil.close();

        CountDownLatch count = new CountDownLatch(antallTraader);
        ordMonitor monitor = new ordMonitor();
        int ordPaaHverTraad = antallLinjer / antallTraader;
        indeks = 0;

        for (int i = 0; i < antallTraader; i++){

            // Hvor mange ord skal traaden lete etter?
            int antallOrd;
            if (i == antallTraader - 1) 
                antallOrd = antallLinjer - indeks;
            else antallOrd = ordPaaHverTraad;

            // Finner start og sluttindeks for den enkelte traaden
            int startIndeks = indeks;
            int sluttIndeks = indeks + antallOrd;
            indeks+= antallOrd;

            OrdFinner o = new OrdFinner(listeOrd, startIndeks, sluttIndeks, ordSomSkalFinnes, monitor, count);
            Thread t = new Thread(o);
            t.start();
        }

        // Etter at alle traadene er opprettet maa main-traaden vente paa at de alle blir ferdige.
        try {
            count.await();
        }
        catch (InterruptedException e){
            System.err.println("Main-traaden ble avbrutt i paavente av ordfinnerne. Avslutter.");
            System.exit(1);
        }

        System.out.println("Ordet forekom " + monitor.hentAntall() + " gang(er) i filen.");
    }
}


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

class SortMonitor {
    private final Queue<String[]> queue = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private String[] finalResult = null;

    public void leggTilSortert(String[] sorted) {
        lock.lock();
        try {
            queue.add(sorted);

            // If exactly one sorted array is the final one
            if (queue.size() == 1 && sorted.length == Sort.antOrd) {
                finalResult = sorted;
                return;
            }

            // If we have at least two arrays, spawn a merge thread
            if (queue.size() >= 2) {
                String[] first = queue.poll();
                String[] second = queue.poll();
                Thread mergeThread = new Thread(new MergeThread(first, second, this));
                mergeThread.start();
            }
        } finally {
            lock.unlock();
        }
    }

    public String[] hentResultat() {
        while (true) {
            lock.lock();
            try {
                if (finalResult != null) return finalResult;
            } finally {
                lock.unlock();
            }

            try { Thread.sleep(10); } catch (InterruptedException e) {}
        }
    }
}

class MergeThread implements Runnable {
    private final String[] a;
    private final String[] b;
    private final SortMonitor monitor;

    MergeThread(String[] a, String[] b, SortMonitor monitor) {
        this.a = a;
        this.b = b;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        String[] result = merge(a, b);
        monitor.leggTilSortert(result);
    }

    private String[] merge(String[] a, String[] b) {
        String[] merged = new String[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) <= 0) merged[k++] = a[i++];
            else merged[k++] = b[j++];
        }
        while (i < a.length) merged[k++] = a[i++];
        while (j < b.length) merged[k++] = b[j++];

        return merged;
    }
}

class Sorter implements Runnable {
    private final String[] ordListe;
    private final SortMonitor monitor;
    private final CountDownLatch latch;

    Sorter(String[] ordListe, SortMonitor monitor, CountDownLatch latch) {
        this.ordListe = ordListe;
        this.monitor = monitor;
        this.latch = latch;
    }

    @Override
    public void run() {
        Arrays.sort(ordListe); // Invariant: this part of the array is sorted.
        monitor.leggTilSortert(ordListe);
        latch.countDown();
    }
}

 class Sort {
    public static int antOrd = 0;

    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java Sort <antall_tråder> <inputfil> <outputfil>");
            return;
        }

        int antallTraader;
        String inputFil, outputFil;

        try {
            antallTraader = Integer.parseInt(args[0]);
            inputFil = args[1];
            outputFil = args[2];
            if (antallTraader < 1 || antallTraader > 500) {
                throw new IllegalArgumentException("antall_tråder må være mellom 1 og 500");
            }
        } catch (Exception e) {
            System.err.println("Feil med argumenter: " + e.getMessage());
            return;
        }

        String[] ordListe;

        try (Scanner scanner = new Scanner(new File(inputFil))) {
            antOrd = Integer.parseInt(scanner.nextLine());
            ordListe = new String[antOrd];
            for (int i = 0; i < antOrd; i++) {
                if (scanner.hasNextLine()) {
                    ordListe[i] = scanner.nextLine();
                } else {
                    throw new RuntimeException("Filen har færre ord enn forventet.");
                }
            }
        } catch (Exception e) {
            System.err.println("Feil ved lesing: " + e.getMessage());
            return;
        }

        CountDownLatch latch = new CountDownLatch(antallTraader);
        SortMonitor monitor = new SortMonitor();

        int ordPaaHverTraad = antOrd / antallTraader;
        int indeks = 0;

        for (int i = 0; i < antallTraader; i++) {
            int antallOrd;
            if (i == antallTraader - 1)
                antallOrd = antOrd - indeks;  // last thread gets the rest
            else
                antallOrd = ordPaaHverTraad;

            int startIndeks = indeks;
            int sluttIndeks = indeks + antallOrd;
            indeks += antallOrd;

            String[] del = new String[antallOrd];
            System.arraycopy(ordListe, startIndeks, del, 0, antallOrd);

            Thread t = new Thread(new Sorter(del, monitor, latch));
            t.start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            System.err.println("Main ble avbrutt.");
            return;
        }

        String[] sortert = monitor.hentResultat();

        // Valider
        if (sortert.length != antOrd || sortert[antOrd - 1] == null) {
            System.err.println("Feil i sortert resultat.");
            return;
        }

        for (int i = 1; i < sortert.length; i++) {
            if (sortert[i - 1].compareTo(sortert[i]) > 0) {
                System.err.println("Listen er ikke sortert.");
                return;
            }
        }

        // Skriv til utfil
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFil))) {
            for (String ord : sortert) {
                writer.write(ord);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Feil ved skriving: " + e.getMessage());
        }

        System.out.println("Sortering fullført! Resultat skrevet til " + outputFil);
    }
}


// Designmønster bidrar til å forbedre kodens lesbarhet, vedlikeholdbarhet og skalerbarhet
// 1) Behavioral Patterns. Disse omhandler hvordan objekter samhandler og hvordan ansvar er fordelt mellom dem
// Bruk Behavioral Patterns når du trenger å kontrollere flyten til et program, endre atferd under kjøring eller koble avsendere fra mottakere
// 2) Creational Patterns Disse omhandler objektskapingsmekanismer. De bidrar til å gjøre et system uavhengig av hvordan dets objekter er 
// opprettet, sammensatt og representert. Bruk Creational Patterns når logikken for opprettelse av objekter er kompleks eller når du vil
// kontrollere hvordan og når objekter opprettes
// 3) Structural Patterns. Disse er opptatt av hvordan klasser og objekter er sammensatt for å danne større strukturer.
// og bidra til å sikre at hvis en del av et system endres, trenger ikke hele strukturen det
// Bruk strukturelle mønstre når du trenger å forenkle relasjoner mellom enheter (som inheritance)

import java.util.Iterator;
import java.util.NoSuchElementException;

class Tilskuer {
    private String navn;

    public Tilskuer(String navn) {
    this.navn = navn;
    }
    @Override
    public String toString() {
    return "* Tilskuer " + navn;
    }
}
// Enkeltlenket liste: Tilskuerliste
class Tilskuerliste implements Iterable<Tilskuer> {
    private Node forste, siste;
    private int storrelse;
    
    class Node {
    Tilskuer data; Node neste;
    Node(Tilskuer data) {
    this.data = data;
    }}
// Legger til et element i slutten av listen
public void add(Tilskuer tilskuer) {
    Node nyNode = new Node(tilskuer);
    if(forste == null) {
    forste = siste = nyNode;
    } else {
    siste.neste = nyNode; siste = nyNode;
    }
    storrelse++;
    }
    // Returnerer en ny iterator som starter fra starten av listen
    @Override
    public Iterator<Tilskuer> iterator() {
        return new ForsteTilMidtenIterator(this.forste, this.storrelse);
    }
    // Iterator-klasse for å iterere fra starten av listen til midten
    class ForsteTilMidtenIterator implements Iterator<Tilskuer> {
        private Node denne; private int stoppIndeks, denneIndeks;
        ForsteTilMidtenIterator(Node forste, int storrelse) {
        this.denne = forste;
        this.stoppIndeks = storrelse / 2; //Stopper iterasjonen etter midten
        this.denneIndeks = 0;
    }
        @Override
        public boolean hasNext() {
            return denne != null && denneIndeks < stoppIndeks;
        }
        @Override
        public Tilskuer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements.");
            }
            Tilskuer data = denne.data;
            denne = denne.neste;
            denneIndeks++;
            return data;
        }
      }
    }

import java.util.ArrayList;

interface Investor {
    public void uppdate();  
}

class KonkretInvestor implements Investor {
    String navn;
    KonkretInvestor(String n){
        navn = n;
    }
    @Override
    public void uppdate() {
        System.out.println("\nOMG! " + navn + "\nPrisen var endret!");
    }
}

class Aksje {
    String navn;
    int pris;
    ArrayList<KonkretInvestor> investors = new ArrayList<>();

    Aksje(String n, int p){
        navn = n;
        pris = p;
    }
    public void addInvestor(KonkretInvestor i){
        investors.add(i);
    }
    public void prisEndringen(int nyPris){
        System.out.println("Aksje heter: " + navn + "\nOld price er: " + pris + "\nNy price er:" + nyPris);
        for(KonkretInvestor investor:investors){
            investor.uppdate();
        }
    }
}

class AksjemarkedMonitor{
    public static void main(String[] args){
        Aksje apple = new Aksje("Apple", 100);
        Aksje tesla = new Aksje("Tesla", 500);
        Aksje openai = new Aksje("OpenAi", 310);

        KonkretInvestor miha = new KonkretInvestor("Miha");
        KonkretInvestor nikita = new KonkretInvestor("Nikita");
        KonkretInvestor pasha = new KonkretInvestor("Pasha");

        apple.addInvestor(nikita);
        apple.addInvestor(miha);
        apple.addInvestor(pasha);
        tesla.addInvestor(nikita);
        tesla.addInvestor(miha);

        apple.prisEndringen(90);
        System.out.println();
        tesla.prisEndringen(305);
    }
}


interface Hamburger {
    public int pris();
    public String navnet();
}
class HamburgerBasis implements Hamburger{
    @Override
    public int pris() {
        return 50;
    }
    @Override
    public String navnet() {
        return "Hamburger";
    }
}

class HamburgerDecorator implements Hamburger{
    Hamburger decoratedHam;
    HamburgerDecorator(Hamburger h){
        decoratedHam = h;
    }
    @Override
    public int pris() {
        return decoratedHam.pris();
    }
    @Override
    public String navnet() {
        return decoratedHam.navnet();
    }
}

class HamburgerMedOst extends HamburgerDecorator{
    HamburgerMedOst(Hamburger h){
        super(h);
    }
    @Override
    public int pris() {
        return super.pris() + 10;
    }
    @Override
    public String navnet() {
        return super.navnet() + ", med ost";
    }
}

class HamburgerUtenAgurk extends HamburgerDecorator{
    HamburgerUtenAgurk(Hamburger h){
        super(h);
    }
    @Override
    public int pris() {
        return super.pris() - 5;
    }
    @Override
    public String navnet() {
        return super.navnet() + ", uten agurk";
    }
}

class hamburgerBar{
    public static void printInfo(Hamburger h){
        System.out.println("Kostnad: " + h.pris() + "; Ingredienser: " + h.navnet());
    }
    public static void main(String[] args){
        Hamburger h = new HamburgerBasis();
        printInfo(h);
        h = new HamburgerMedOst(h);
        printInfo(h);
        h = new HamburgerUtenAgurk(h);
        printInfo(h);
    }
}


final class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        // privat konstruktør hindrer ekstern instansiering
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); // Lazy initialization
                }
            }
        }
        return instance;
    }
}


import java.util.Iterator;

class MyLinkedList implements Iterable<String> {
    private Node head;
    private Node tail;

    private class Node {
        String data;
        Node next;
        Node prev;

        public Node(String data) {
            this.data = data;
        }
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {
        private Node current = tail;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String data = current.data;
            current = current.prev;
            return data;
        }
    }
}


import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Observer interface
interface Observer {
    void update(double temperature);
}

// WeatherStation class
class WeatherStation implements Subject {
    private List<Observer> observers;
    private double temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

// TemperatureDisplay class
class TemperatureDisplay implements Observer {
    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + temperature);
    }
}

class hovedprogram {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
    
        // Create two temperature displays
        TemperatureDisplay temperatureDisplay1 = new TemperatureDisplay();
        TemperatureDisplay temperatureDisplay2 = new TemperatureDisplay();
    
        // Register the displays with the weather station
        weatherStation.registerObserver(temperatureDisplay1);
        weatherStation.registerObserver(temperatureDisplay2);
    
        // Update the temperature
        weatherStation.setTemperature(25.5);
    }
}

class Fakultet1 {
    static long fak (int n) {
        long res = 1;
        for (int i = 1; i <= n; i++)
            res = res * i;
        return res;
    }
public static void main (String[] args) {
    int nPar = Integer.parseInt(args[0]);
    for (int i = 1; i <= nPar; i++)
        System.out.println(i + "! = " + fak(i));
    }
}


class Fibonacci2 {
    static int fib (int n) {
        if (n <= 2) return 1;
        else return fib(n-1) + fib(n-2);
    }
    public static void main (String[] args) {
        int antall = Integer.parseInt(args[0]);
        for (int i = 1; i <= antall; i++)
        System.out.println("Fib(" + i + ") = " + fib(i));
    }
 }


// Generic singly linked list with reverse and print functionality
class Lenkeliste<T> {

    // Inner Node class
    class Node {
        Node neste = null;
        T data;

        Node(T x) {
            data = x;
        }

        // Recursive reverse function
        void reverse(Node pre) {
            if (neste == null) {
                start = this;
            } else {
                neste.reverse(this);
            }
            neste = pre;
        }
    }

    private Node start = null;

    // Add element to the end of the list
    public void leggTil(T x) {
        Node ny = new Node(x);
        if (start == null) {
            start = ny;
        } else {
            Node current = start;
            while (current.neste != null) {
                current = current.neste;
            }
            current.neste = ny;
        }
    }

    // Reverse the entire list
    public void reverse() {
        if (start != null) {
            start.reverse(null);
        }
    }

    // Convert list to string for printing
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = start;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.neste;
        }
        sb.append("null");
        return sb.toString();
    }

    // Main method to test the list
}

class hovedprogram {
    public static void main(String[] args) {
        Lenkeliste<Integer> liste = new Lenkeliste<>();

        // Add some numbers
        liste.leggTil(1);
        liste.leggTil(2);
        liste.leggTil(3);
        liste.leggTil(4);
        liste.leggTil(5);

        System.out.println("Original list:");
        System.out.println(liste);

        // Reverse the list
        liste.reverse();

        System.out.println("Reversed list:");
        System.out.println(liste);
    }
}


 class SkrivUtArrayIterativt {
    public static void main(String[] args) {
        String[] strenger = {"IN1010", "er", "verdens", "beste", "fag!"};
        gaaGjennomArrayRek(strenger, 0);
    }

    public static void gaaGjennomArray(String[] arr){
        gaaGjennomArrayRek(arr, 0);
    }

    private static void gaaGjennomArrayRek(String[] arr, int i){
        if(i>=arr.length){
            return;
        }
        System.out.println(arr[i] + " ");

        gaaGjennomArrayRek(arr, i+1);
    }
}


class hovedprogram {
    public static void main(String[] args) {
        rekursivUtskrift(1);
    }

    public static void rekursivUtskrift(int i) {
        if (i > 10) {
            return;
        }
        System.out.println(i + " ");
        rekursivUtskrift(i + 1);
    }
}


import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class Lenkeliste<E> implements Liste<E> {
    Node starten;

    class Node{
        E element;
        Node forrige = null;
        Node neste = null;
        Node(E element){
            this.element = element;
        }
    }

    @Override
    public int størrelse() {
        return countNodes(starten);
    }
    
    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.neste);
        }
    }


    @Override
    public void leggTil(E element) {
        if (starten == null) {
            starten = new Node(element);
        } else {
            leggTilRekursivt(starten, element);
        }
    }
    
    private void leggTilRekursivt(Node aktuell, E element) {
        if (aktuell.neste == null) {
            Node ny = new Node(element);
            aktuell.neste = ny;
            ny.forrige = aktuell;
        } else {
            leggTilRekursivt(aktuell.neste, element);
        }
    }

    public String toString() {
        String output = "";
        Node aktuell = starten;
        while(aktuell != null){
            output += aktuell.element;
            aktuell = aktuell.neste;
        }
        return "Streng av elementene i listen er:\n" + output.trim();
     }

     public String printAll() {
        return "Streng av elementene i listen er:\n" + printAllRekursivt(starten);
    }
    
    public String printAllRekursivt(Node aktuell) {
        if (aktuell == null) {
            return "";
        }
        return aktuell.element + " " + printAllRekursivt(aktuell.neste);
    }
}


class EnkelListe {
    private Node start;

    public void settInnForan(String nyttInnhold) {
        Node ny = new Node(nyttInnhold);
        ny.neste = start;
        start = ny;
    }

    private void skrivUtBaklengs(Node aktuell) {
        if (aktuell == null) return;
        skrivUtBaklengs(aktuell.neste);
        System.out.println(aktuell.innhold);
    }

    public void skrivUt() {
        Node tmp = start;
        skrivUtBaklengs(tmp);
    }

    private class Node {
        private String innhold;
        private Node neste;

        Node(String s) {
            innhold = s;
        }
    }
}

class TestEnkelListe {
    public static void main(String[] args) {

        EnkelListe eliste = new EnkelListe();
        eliste.settInnForan("Hei");
        eliste.settInnForan("paa");
        eliste.settInnForan("deg");
        eliste.settInnForan("din");
        eliste.settInnForan("gamle");
        eliste.settInnForan("sei!");

        eliste.skrivUt();
    }
}


class hovedprogram {
    public static void main(String[] args){
        skrivUtBinaer(7);
    }

    static void skrivUtBinaer(int n){
        if(n == 0){
          System.out.print(0);
        }
        else {
          if(n > 1){
            skrivUtBinaer(n/2);
          }
          System.out.print(n%2);
        }
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


class hovedprogram {
    public static void main(String[] args){
        triangel(1,8);
    }

    static void triangel(int m, int n) {
        System.out.println("*".repeat(m));
        if (m < n) {
            triangel(m + 1, n);
            System.out.println("*".repeat(m));
        }
    }
}


class Person implements Comparable<Person>{
    String navn;
    int fødselsår;
    Person mor;
    Person far;

    Person(String n,int f,Person m,Person fa){
        navn = n;
        fødselsår = f;
        mor = m;
        far = fa;
    }
    public Person finnEldsteKjenteForfader(){
        if(mor == null){
          if(far == null)
            return this;
          else
            return far.finnEldsteKjenteForfader();
        }
    
        if(far == null){
          return mor.finnEldsteKjenteForfader();
        }
    
        Person morside = mor.finnEldsteKjenteForfader();
        Person farside = far.finnEldsteKjenteForfader();
    
        if(morside.compareTo(farside) < 0)
          return morside;
        else
          return farside;
      }

    public String hentNavn(){
        return navn;
    }
    public int hentFødselsår(){
        return fødselsår;
    }
    public Person hentMor(){
        return mor;
    }
    public Person hentFar(){
        return far;
    }
    @Override
    public String toString() {
        return navn;
    }
    @Override
    public int compareTo(Person annenPerson){
        return fødselsår-annenPerson.hentFødselsår();
      }
}

class TestPerson{
    public static void main(String[] args) {
        Person p1 = new Person("Inga", 1672, null, null);
        Person p2 = new Person("Karsten", 1690, p1, null );
        Person p3 = new Person("Petra", 1694, null, null);
        Person p4 = new Person("Ole", 1715, p3, p2);
        Person p5 = new Person("Ingeborg", 1718, null, null);
        Person p6 = new Person("Knut", 1738, p5, p4);
        Person p7 = new Person("Kai", 1715, null, null);
        Person p8 = new Person("Kari", 1740, null, p7);
        Person p9 = new Person("Sigrid", 1761, p8, p6);
  
      System.out.println("Sigrids eldste forfader er " + p9.finnEldsteKjenteForfader());
      //Sigrids eldste forfader er Inga.
      System.out.println("Riktig? " + (p9.finnEldsteKjenteForfader() == p1));
      System.out.println();
  
      System.out.println("Karis eldste forfader er " + p8.finnEldsteKjenteForfader());
      //Karis eldste forfader er Kai.
      System.out.println("Riktig? " + (p8.finnEldsteKjenteForfader() == p7));
      System.out.println();
  
      System.out.println("Ingas eldste forfader er " + p1.finnEldsteKjenteForfader());
      //Ingas eldste forfader er Inga selv.
      System.out.println("Riktig? " + (p1.finnEldsteKjenteForfader() == p1));
      System.out.println();
    }
  }


class hovedprogram {
    public static void main(String[] args){
        System.out.println(teddy(350));
    }

    static boolean teddy(int n) {
        if(n==42){
            return true;
        } 
        if (n < 42) {
            return false;
        }
        boolean possible = false;
        if (n%2==0) {
            possible |= teddy(n/2);
        } 
        if (n%3==0||n%4==0){
            int product=(n%10)*((n%100)/10);
            if (product != 0) {
                possible |= teddy(n-product);
            }
        } 
        if (n%5==0){
            possible |= teddy(n-42);
        } 
        return possible;
    }
}


class GCD {
    public static void main(String[] args) {

        System.out.println(gcd(20, 30));

        System.out.println(gcdIterativ(20, 30));
    }

    public static int gcd (int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }

        int c = a % b;

        if (c == 0) {
            return b;
        } else {
            return gcd(b, c);
        }
    }

    public static int gcdIterativ (int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }

        int c = a % b;

        while (c != 0) {
            a = b;
            b = c;

            c = a % b;
        }

        return b;
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FullGUIExample {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Full GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a label, text field, and button
        JLabel label = new JLabel("Skriv noe:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Trykk for å oppdatere");

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Layout manager

        // Add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Define what happens when the button is clicked
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                textField.setText("Du skrev: " + input);
            }
        });

        // Make the window visible
        frame.setVisible(true);
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class JavaSteps {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Advanced GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 250);

        // Create components
        JLabel label = new JLabel("Skriv noe:");
        JTextField textField = new JTextField(20);

        JButton updateButton = new JButton("Oppdater");
        JButton clearButton = new JButton("Tøm");
        JButton exitButton = new JButton("Avslutt");

        // Create a panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20)); // spacing between components

        // Add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(updateButton);
        panel.add(clearButton);
        panel.add(exitButton);

        // Add panel to frame
        frame.add(panel);

        // Action for "Update" button
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                textField.setText("Du skrev: " + input);
            }
        });

        // Action for "Clear" button
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(""); // Empty the text field
            }
        });

        // Action for "Exit" button
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Closes the application
            }
        });

        // Make the window visible
        frame.setVisible(true);
    }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class HilseKnapp {
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e) {System.exit(1);}
        JFrame vindu = new JFrame("Hilsevindu");
        vindu.setSize(450, 250);
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        vindu.add(panel);

        JLabel hilse = new JLabel();
        panel.add(hilse);

        JButton hilseKnapp = new JButton("Hilseknapp");
        class Javehilse implements ActionListener {
            private boolean hilst = false;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!hilst) {
                    hilse.setText("Hei paa deg!");
                    hilst = true;
                } else {
                    hilse.setText("Ha det bra!");
                    hilst = false; 
                }
            }
        }
        hilseKnapp.addActionListener(new Javehilse());
        panel.add(hilseKnapp);

        // vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
 }
}


import java.awt.*; import java.awt.event.*; import javax.swing.*;
import java.time.LocalTime;

class Klokke {
    private static JLabel klokkeslett = new JLabel(naa());

    private static String naa(){
        //Henter den lokale tiden naa paa format "12:34:56"
        LocalTime t = LocalTime.now();
        return String.format("%02d:%02d:%02d",
            t.getHour(), t.getMinute(), t.getSecond());
    }

    private static class Sekundteller implements Runnable {
        @Override
        public void run() {
            boolean fortsett = true;
            while(fortsett) {
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    fortsett = false;
                }
                // klokkeslett.setText(naa());
                SwingUtilities.invokeLater(() -> klokkeslett.setText(naa()));
            }
        }
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { System.exit(1); }
        JFrame vindu = new JFrame("Klokke");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        vindu.add(panel);

        JButton klokkeKnapp = new JButton("Switch");
        class javaSwith implements ActionListener {
            private boolean status = false;
            private Thread sekundteller;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!status) {
                    sekundteller = new Thread(new Sekundteller());
                    sekundteller.start();
                    status = true;
                } else{
                    sekundteller.interrupt();
                    status = false;
                }
            }
        }
        klokkeKnapp.addActionListener(new javaSwith());

        panel.add(klokkeslett);
        panel.add(klokkeKnapp);
        vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class endrerOpp {
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e) {System.exit(1);}
        JFrame vindu = new JFrame("Text oppdatering");
        vindu.setSize(300, 150);
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        vindu.add(panel);

        JLabel hilse = new JLabel("ikke endret");
        panel.add(hilse);

        JTextField textFiled = new JTextField(20);
        
        JButton hilseKnapp = new JButton("Oppdater");
        class Javehilse implements ActionListener {
            private boolean hilst = false;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!hilst) {
                    String input = textFiled.getText();
                    hilse.setText(input);
                    hilst = true;
                } else {
                    hilse.setText("Skriv noe nytt");
                    hilst = false; 
                }
            }
        }

        hilseKnapp.addActionListener(new Javehilse());
        panel.add(hilseKnapp);
        panel.add(textFiled);

        // vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
 }
}


import javax.swing.*; import java.awt.*; import java.awt.event.*;
import java.util.Random;

 class Fargeendring {
    public static void main(String[] args) {
    Color[] farger = {Color.BLUE, Color.ORANGE, Color.YELLOW};
    Random tilfeldig = new Random();
    JFrame vindu = new JFrame("Endre farge paa JFrame med entertasten");

    vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vindu.setSize(500, 300);

    //Bruker addKeyListener og KeyAdapter-interfacet ved tastetrykk-hendelser
    vindu.addKeyListener(new KeyAdapter() {
            @Override public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                vindu.getContentPane()
                .setBackground(farger[tilfeldig.nextInt(farger.length)]);
            } 
        }
        }
    );
    vindu.setFocusable(true); //Anbefalt for aa la vinduet motta tastetrykk
    vindu.setLocationRelativeTo(null);
    vindu.setVisible(true);
    }
}


import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class FilLeser {
    private String innhold;

    public FilLeser(File fil) throws FileNotFoundException {
        Scanner scanner = new Scanner(fil);
        StringBuilder tekst = new StringBuilder("<html>"); // Start HTML
        while (scanner.hasNextLine()) {
            tekst.append(scanner.nextLine()).append("<br/>"); // Linje + linjeskift
        }
        tekst.append("</html>"); // Avslutt HTML
        scanner.close();
        innhold = tekst.toString();
    }

    public String hentTekst() {
        return innhold;
    }
}

class FilVelgerGUI {
    private static JLabel tekstViser = new JLabel("Ingen fil valgt.");

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { System.exit(1); }

        JFrame vindu = new JFrame("Filvelger");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vindu.setSize(500, 400); 
        JPanel panel = new JPanel();
        JButton velgFilKnapp = new JButton("Velg tekstfil");
        JButton lukkFilen = new JButton("Lukk filen");

        velgFilKnapp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser filVelger = new JFileChooser();
                int resultat = filVelger.showOpenDialog(null);

                if (resultat == JFileChooser.APPROVE_OPTION) {
                    File valgtFil = filVelger.getSelectedFile();
                    try {
                        FilLeser filLeser = new FilLeser(valgtFil);
                        tekstViser.setText(filLeser.hentTekst());
                    } catch (FileNotFoundException ex) {
                        tekstViser.setText("Finner ikke filen.");
                    }
                }
            }
        });
        lukkFilen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tekstViser.setText("");
            }
        });

        panel.add(velgFilKnapp);
        panel.add(lukkFilen);
        panel.add(tekstViser);

        vindu.add(panel);
        vindu.setLocationRelativeTo(null); 
        vindu.setVisible(true);
    }
}


// 1) (a) Hvorfor kaller vi GUI-programmering, også kalt programmering av grafiske brukergrensesnitt, 
// for hendelsesstyrt programmering?
// Svaret: GUI-programmer er som regel drevet av hendelser utført av brukeren i det grafiske brukergrensesnittet. 
// Med andre ord reagerer programmet på hendelser i form av brukerinteraksjoner.

// 2) Hva skiller hendelsesstyrt programmering fra imperativ programmering?
// Svaret: I imperativ programmering avgjør utvikleren nøyaktig hva som skal skje fra steg til steg i programmet. 
// Brukeren har ingen innvirkning på hva som skal skje, slik de har i hendelsesstyrt programmering.

import java.util.Random;
import javax.swing.*; import java.awt.*; import java.awt.event.*;

class spill {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { System.exit(1); }

        JFrame vindu = new JFrame("Spill :)");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        vindu.add(panel);

        JLabel result = new JLabel("Trykk any knapen for å spille!");

        JButton button1 = new JButton("EN");
        JButton button2 = new JButton("TO");
        JButton button3 = new JButton("TRE");

        class generereSeier implements ActionListener {
            Random tilfeldig = new Random();
            int chance;
            generereSeier(int c){
                chance = c;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                int seier = tilfeldig.nextInt(3) + 1;
                if (seier==chance){
                    result.setText("OK");
                } else {
                    result.setText("X");
                }
            }
        }

        button1.addActionListener(new generereSeier(1));
        button2.addActionListener(new generereSeier(2));
        button3.addActionListener(new generereSeier(3));

        panel.add(result);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
}


import java.util.Random;
import javax.swing.*; import java.awt.*; import java.awt.event.*;

class spill {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { System.exit(1); }

        JFrame vindu = new JFrame("Spill :)");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        vindu.add(panel);

        JButton button1 = new JButton("EN");
        JButton button2 = new JButton("TO");
        JButton button3 = new JButton("TRE");

        class generereSeier implements ActionListener {
            static boolean ferdig = false;
            Random tilfeldig = new Random();
            int chance;
            generereSeier(int c){
                chance = c;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!ferdig) {
                    int seier = tilfeldig.nextInt(3) + 1;
                    if (seier==chance){
                        ferdig = true;
                        if(chance==1){
                            button1.setForeground(Color.GREEN);
                            button1.setText("OK");
                        } else if (chance==2) {
                            button2.setForeground(Color.GREEN);
                            button2.setText("OK");
                        } else {
                            button3.setForeground(Color.GREEN);
                            button3.setText("OK");
                        }
                    } else {
                        ferdig = true;
                        if(chance==1){
                            button1.setForeground(Color.RED);
                            button1.setText("X");
                        } else if (chance==2) {
                            button2.setForeground(Color.RED);
                            button2.setText("X");
                        } else {
                            button3.setForeground(Color.RED);
                            button3.setText("X");
                        }
                    }
                }
            }
        }

        button1.addActionListener(new generereSeier(1));
        button2.addActionListener(new generereSeier(2));
        button3.addActionListener(new generereSeier(3));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;


class AvisoverskriftPubliserer {
    private List<String> overskrifter;
    private JButton publiserKnapp;
    private JPanel hovedpanel;
    private JFrame vindu;
    private int gjeldendeOverskriftIndeks;

    public AvisoverskriftPubliserer() {
        overskrifter = new ArrayList<>();
        lastInnOverskrifter();
        gjeldendeOverskriftIndeks = 0;

        try { UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());   
        } catch (Exception e) { System.exit(1); }

        vindu = new JFrame("Avisoverskrifter");
        vindu.setPreferredSize(new Dimension(300, 200));
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        publiserKnapp = new JButton("Publisér");
        publiserKnapp.addActionListener(new PubliserArtikkel());

        hovedpanel = new JPanel();
        hovedpanel.setBorder(BorderFactory.createTitledBorder("Overskrifter"));
        hovedpanel.add(publiserKnapp);

        vindu.add(hovedpanel);
    }

    private void lastInnOverskrifter() {
        overskrifter.add("Nye tiltak for aa bekjempe klimaendringene!");
        overskrifter.add("Lokalvalget naermer seg: Partiene paa banen!");
        overskrifter.add("Teknologigigantene slaar seg sammen!");
    }

    public static void main(String[] args) {
        AvisoverskriftPubliserer publiserer = new AvisoverskriftPubliserer();
        publiserer.vindu.setLocationRelativeTo(null);
        publiserer.vindu.pack();
        publiserer.vindu.setVisible(true);
    }

    private class PubliserArtikkel implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (gjeldendeOverskriftIndeks < overskrifter.size()) {
                JLabel overskrift = new JLabel(overskrifter.get(gjeldendeOverskriftIndeks));
                JPanel overskriftPanel = new JPanel();
                overskriftPanel.add(overskrift); hovedpanel.add(overskriftPanel);
                hovedpanel.revalidate(); hovedpanel.repaint();
                gjeldendeOverskriftIndeks++;
            }

            if (gjeldendeOverskriftIndeks >= overskrifter.size()) {
                publiserKnapp.setText("Avslutt");
                publiserKnapp.removeActionListener(this);
                publiserKnapp.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }             
                });
            }
        }
    }
}


import javax.swing.*;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ordmonitor {
    private final Lock lock = new ReentrantLock();
    private final String[] deltArray;
    private int indeksForInnsetting = 0;
    private GUI gui;

    public Ordmonitor(int antOrd, GUI gui) {
        deltArray = new String[antOrd];
        this.gui = gui;
    }

    public void settInnOrd(String ordSomSettesInn) {
        lock.lock();
        try {
            if (indeksForInnsetting < deltArray.length) {
                deltArray[indeksForInnsetting] = ordSomSettesInn;
                indeksForInnsetting++;
                StringBuilder sb = new StringBuilder();
                for (String ord : deltArray) {
                    if (ord != null) sb.append(" ").append(ord).append("\n");
                }
                gui.oppdaterGUI(sb.toString());
            }
        } finally {
            lock.unlock();
        }
    }
}

class GUI {
    private JFrame vindu = new JFrame("Ordsammensetter");
    private JTextArea tekstFeltMedOrd = new JTextArea();
    public GUI() {
        try {  UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());   
        } catch (Exception e) { System.exit(1); }

        vindu.setSize(400, 200);
        vindu.add(tekstFeltMedOrd);
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vindu.setLocationRelativeTo(tekstFeltMedOrd);
        vindu.setVisible(true);
    }

    public void oppdaterGUI(String sb) {
        tekstFeltMedOrd.setText(sb.toString());
        tekstFeltMedOrd.setCaretPosition(tekstFeltMedOrd.getDocument().getLength()-1);
    }
}

class Ordsammensetter implements Runnable {
    private char[] bokstaver;
    private int id;
    private Ordmonitor ordmonitor;

    public Ordsammensetter(int id, char[] bokstaver, Ordmonitor ordmonitor) {
        this.bokstaver = bokstaver;
        this.id = id;
        this.ordmonitor = ordmonitor;
    }

    @Override
    public void run() {
        String ord = new String(bokstaver);
        try {
            Thread.sleep(3000 + (id * 1000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.printf("En ordsammensetter ble avbrutt. %s ble ikke registrert.", ord);
            return;
        }
        ordmonitor.settInnOrd(ord);
    }
}

class Hovedprogram {
    public static void main(String[] args) {
        HashMap<Integer, char[]> ordHashMap = new HashMap<>();
        ordHashMap.put(1, new char[]{'h', 'e', 'i'});
        ordHashMap.put(2, new char[]{'p', 'a', 'a'});
        ordHashMap.put(3, new char[]{'d', 'e', 'g'});

        GUI gui = new GUI();
        Ordmonitor ordmonitor = new Ordmonitor(ordHashMap.size(), gui);

        int teller = 0;
        for (char[] bokstaver : ordHashMap.values()) {
            Thread traad = new Thread(new Ordsammensetter(teller, bokstaver, ordmonitor));
            traad.start();
            teller++;
        }
    }
}

import java.util.Random;
import javax.swing.*; import java.awt.*; import java.awt.event.*;
import java.util.ArrayList;

class spill {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { System.exit(1); }

        JFrame vindu = new JFrame("Spill :)");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        vindu.add(panel);

        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(new JButton("EN"));
        buttons.add(new JButton("TO"));
        buttons.add(new JButton("TRE"));

        Random tilfeldig = new Random();
        int seier = tilfeldig.nextInt(3);

        class generereSeier implements ActionListener {
            ArrayList<JButton> array;
            static boolean ferdig = false;
            int chance;
            generereSeier(int c, ArrayList<JButton> a){
                chance = c;
                array = a;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!ferdig) {
                    JButton button = array.get(chance);
                    ferdig = true;
                    if (seier==chance){
                        button.setForeground(Color.GREEN);
                        button.setText("OK");
                    } else {
                        button.setForeground(Color.RED);
                        button.setText("X");
                    }
                }
            }
        }

        buttons.get(0).addActionListener(new generereSeier(0, buttons));
        buttons.get(1).addActionListener(new generereSeier(1, buttons));
        buttons.get(2).addActionListener(new generereSeier(2, buttons));
        
        panel.add(buttons.get(0));
        panel.add(buttons.get(1));
        panel.add(buttons.get(2));

        vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
}


// Trengte ikke importere noe, Larissa :))

class IndeksertListe<T> { 

    // Nodeklassen deklareres som privat. Fordi nodeklassen er privat «lekker»
    // den aldri ut fra Dobbeltlenketliste, og derfor lar vi være med
    // å begrense (eller eksplisitt åpne) tilgangskontrollen.
    private class Node {
        T element;
        Node forrige, neste;

        Node(T element) {
            this.element = element;
        }
    }

    // Noden HODE settes til å være en node uten innhold.
    // Hvis listen er tom peker både HODE.neste og HODE.forrige til HODE.
    // Hvis listen ikke er tom vil:
    //   - HODE.neste peke på noden som holder på første element.
    //   - HODE.forrige peke på noden som holder på siste element.
    // Merk at dette utgjør en syklisk listestruktur.
    private final Node HODE;
    private int antall;

    // I konstruktøren opprettes HODE-noden. Første og siste settes til HODE.
    public IndeksertListe() {
        HODE = new Node(null);
        HODE.forrige = HODE.neste = HODE;
    }

    // Listen er tom hvis HODE.neste peker til HODE.
    // Vi kunne oppnådd samme effekt med HODE == HODE.forrige.
    public boolean erTom() {
        return HODE == HODE.neste;
    }

    public int størrelse() {
        return antall;
    }

    private void settInnEtter(Node node, T element) {
        Node ny = new Node(element);
        ny.forrige = node;
        ny.neste = node.neste;
        node.neste.forrige = ny;
        node.neste = ny;
        antall++;
    }

    private boolean inneholder(T element, Node node) {
        if (node == HODE) { // basistilfelle 1
            return false;
        }
        if (node.element.equals(element)) { // basistilfelle 2
            return true;
        }
         // oppdaterer noden før vi gjør neste kall
        return inneholder(element, node.neste); // rekursivt tilfelle (her er returadressen)
    }

    public boolean inneholder(T element) {
        return inneholder(element, HODE.neste);
    }

    private void settInn(int indeks, int teller, T element, Node node) {
        if (indeks - 1 == teller) { // kun ett basistilfelle her
            settInnEtter(node, element);
            return;
        }
        // oppdaterer telleren og noden før vi gjør neste kall
        settInn(indeks, ++teller, element, node.neste); // rekursivt tilfelle (her er returadressen)
    }

    public void settInn(int indeks, T element) {
        if (indeks < 0 || indeks > antall) {
            throw new IndexOutOfBoundsException();
        }
        settInn(indeks, -1, element, HODE); // vi starter rekursjonen her fordi vi trenger å kunne oppdatere noden mellom hvert rekursive kall
    }

    private void taUtDenne(Node denne) {
        denne.forrige.neste = denne.neste;
        denne.neste.forrige = denne.forrige;
        antall--;
    }

    private T taUt(int indeks, int teller, Node node) { // vi kunne klart oss fint uten en teller, men det er én måte å gjøre det enkelt å følge gangen i prosedyren
        if (indeks == teller) { // kun ett basistilfelle
            taUtDenne(node);
            return node.element;
        }
         // oppdaterer telleren og noden før vi gjør neste kall
        return taUt(indeks, ++teller, node.neste); // rekursivt tilfelle (her er returadressen)
    }

    public T taUt(int indeks) { // denne metoden skal brukeren forholde seg til, de trenger bare å sende inn en indeks
        if (indeks < 0 || indeks > antall - 1) {
            throw new IndexOutOfBoundsException();
        }
        return taUt(indeks, 0, HODE.neste); // vi starter rekursjonen her fordi vi trenger å kunne oppdatere noden mellom hvert rekursive kall
    }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EnkeltRutenett {
    public static void main (String[] args) {
        JFrame vindu = new JFrame("Rutenett");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        vindu.add(panel);

        JPanel rutenett = new JPanel();
        rutenett.setLayout(new GridLayout(3,3));
        for (int i = 1;  i <= 9;  i++) {
            JLabel nr = new JLabel("" + i);
            nr.setPreferredSize(new Dimension(30,30));
            nr.setHorizontalAlignment(JLabel.CENTER);
            nr.setVerticalAlignment(JLabel.CENTER);
            nr.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            rutenett.add(nr);
        }
        panel.add(rutenett);

        vindu.pack();
        vindu.setVisible(true);
    }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Teller {
    private int tellerVerdi = 0;

    public int hentVerdi(){
        return tellerVerdi;
    }
    public void okeVerdi(){
        ++tellerVerdi;
    }
    public void nullstillTeller(){
        tellerVerdi = 0;
    }
}

interface Gui{
    void visFremVerdi(int verdi);
    void init(Kontroller k);
}

class Kontroller {
    private Teller teller;
    private Gui gui;

    public void init(){
        gui.init(this);
    }
    public void oekTeller(){
        teller.okeVerdi();
        int verdi = teller.hentVerdi();
        gui.visFremVerdi(verdi);
    }
    void nullstillTeller(){
        teller.nullstillTeller();
        int verdi = teller.hentVerdi();
        gui.visFremVerdi(verdi);
    }
    public void setGui(Gui gui) {
        this.gui = gui;
    }
    
    public void setTeller(Teller teller) {
        this.teller = teller;
    }
}

class GrafiskInterface implements Gui {
    private Kontroller kontroller;
    private JButton oekButton, resetButton;
    private JFrame vindu;
    private JLabel verdiLabel;
    private JLabel verdiTekstLabel;
    private JPanel panel;

    class OekTeller implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            kontroller.oekTeller();
        }
    }
    class nullstillTeller implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            kontroller.nullstillTeller();
        }
    }

    @Override
    public void init(Kontroller k) {
        kontroller = k;
        vindu = new JFrame("Teller");
        panel = new JPanel();
        vindu.add(panel);
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        oekButton = new JButton(" +1 ");
        oekButton.addActionListener(new OekTeller());
        resetButton = new JButton("Nullstill");
        resetButton.addActionListener(new nullstillTeller());

        verdiTekstLabel = new JLabel("Verdi: ");
        verdiLabel = new JLabel(" ");

        panel.add(verdiLabel);
        panel.add(verdiTekstLabel);
        panel.add(oekButton);
        panel.add(resetButton);

        vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }

    @Override
    public void visFremVerdi(int verdi) {
        verdiLabel.setText("" + verdi);
    }

    public static void main(String[] args){
        Kontroller k = new Kontroller();
        GrafiskInterface gui = new GrafiskInterface();
        Teller teller = new Teller();
    
        k.setGui(gui);
        k.setTeller(teller);
        
        k.init();
    }
} 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

class Modell {
    char[][] brett = new char[3][3];
    int antTrekk = 0;
    boolean spilletErFerdig = false;
    String vinner;
    Modell () {
        for (int rx = 0; rx < 3; ++rx)
             for (int kx =0; kx<3; kx++)
                brett[rx][kx] = ' ';
    }
    
    boolean lovligTrekk (int r, int k) {
        return brett[r][k] == ' ';
    }
    void noterTrekk (int r, int k, char spiller){
        brett[r][k] = spiller;
        ++antTrekk;
    }
    boolean erSpilletFerdig () {
        return spilletErFerdig;
    }
    boolean erBrettetFullt(){
        return antTrekk == 9;
    }
    boolean harVunnet (char s){
        return
        // Sjekk radene
        brett[0][0]==s && brett[0][1]==s && brett[0][2]==s ||
        brett[1][0]==s && brett[1][1]==s && brett[1][2]==s ||
        brett[2][0]==s && brett[2][1]==s && brett[2][2]==s ||
        // Sjekk kolonnene
        brett[0][0]==s && brett[1][0]==s && brett[2][0]==s ||
        brett[0][1]==s && brett[1][1]==s && brett[2][1]==s ||
        brett[0][2]==s && brett[1][2]==s && brett[2][2]==s ||
        // Sjekk diagonalene
        brett[0][0]==s && brett[1][1]==s && brett[2][2]==s ||
        brett[0][2]==s && brett[1][1]==s && brett[2][0]==s;
    }
    public void noterVinner(String v){
        vinner = v;
        spilletErFerdig = true;
    }
    public void noterUavgjort(){
        spilletErFerdig = true;
    }
}

class Kontroll {
    GUI gui;
    Modell modell;
    Kontroll(){
        gui = new GUI(this);
        modell = new Modell();
    }

    void startSpillet(){
        gui.visStatus("Velg en rute");
    }
    void laMaskinenTrekke(){
        int r, k;
        do {
            r = trekk(0,2); 
            k = trekk(2,0);
        } while (! modell.lovligTrekk(r, k));
        modell.noterTrekk(r, k, 'X');
        gui.markerTrekk(r,k,'X');
        if(modell.harVunnet('X')){
            modell.noterVinner("Maskinen");
            gui.visStatus('X' + " vant");
        } else if (modell.erBrettetFullt()){
            modell.noterUavgjort();
            gui.visStatus("Uavgjort");
        }
    }
    private int trekk (int a, int b){
        return ThreadLocalRandom.current().nextInt(a, b + 1);
    }
    void brukervalg (int r, int k){
        if (modell.erSpilletFerdig()) {
            gui.visStatus("Ingen flere trekk");
            return;
        }
        if(! modell.lovligTrekk(r, k)){
            gui.visStatus("Ulovlig trekk");
            return;
        }
        modell.noterTrekk(r, k, 'O');
        gui.markerTrekk(r, k, 'O');
        if(modell.harVunnet('O')){
            gui.visStatus('O' + " vant");
            System.out.println("Jeg vant");
            modell.noterVinner("Du");
            modell.spilletErFerdig = true;
            return;
        }
        if(modell.erBrettetFullt()) {
            modell.noterUavgjort();
            gui.visStatus("Uavgjort");
            return;
        }
        laMaskinenTrekke();
        gui.visStatus("Velg en rute");
            
    }
}

class GUI {
    Kontroll kontroll;
    JFrame vindu;
    JPanel panel, konsoll, rutenett;
    JButton[][] ruter = new JButton[3][3];
    JLabel status;
    JButton stoppknapp;
        GUI (Kontroll k){
        kontroll = k;

        vindu = new JFrame("Tripp trapp tresko");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        vindu.add(panel);

        konsoll = new JPanel();
        konsoll.setLayout(new BorderLayout());
        panel.add(konsoll, BorderLayout.NORTH);

        status = new JLabel("Velg en rute");
        konsoll.add(status, BorderLayout.NORTH);

        stoppknapp = new JButton("Exit");
        stoppknapp.addActionListener(new Stoppbehandler());
        konsoll.add(stoppknapp, BorderLayout.SOUTH);

        rutenett = new JPanel();
        rutenett.setLayout(new GridLayout(3,3));
        for(int rx=0;rx<3;++rx){
            for(int kx=0;kx<3;++kx){
                JButton b = new JButton(" ");
                ruter[rx][kx] = b;
                b.setFont(new Font(
                   Font.MONOSPACED, Font.BOLD, 30));
                b.addActionListener(new Spillvelger(rx,kx));
                rutenett.add(b);
            }
        }
        panel.add(rutenett, BorderLayout.CENTER);

        vindu.pack();
        vindu.setSize(400,400);
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }

    class Spillvelger implements ActionListener{
        int rad, kol;
        Spillvelger (int r, int k){
            rad = r;
            kol = k;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            kontroll.brukervalg(rad, kol);
        }
    }
    class Stoppbehandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
         System.exit(0);   
        }
    }

    public void markerTrekk(int r, int k, char c){
        JButton button = ruter[r][k]; 
        button.setText("" + c);
    }
    public void visStatus(String text){
        status.setText(text);
    }
}

class GuiInterface{
    public static void main(String[] args){
        Kontroll kontroller = new Kontroll();
        kontroller.startSpillet();
    }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI{
    public static void main(String[] args){
        JFrame vindu = new JFrame("Grid");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        vindu.setContentPane(mainPanel);

        JPanel rutennet = new JPanel();
        rutennet.setLayout(new GridLayout(2,3, 10, 10));
        rutennet.setPreferredSize(new Dimension(300,200));
        mainPanel.add(rutennet);

        JButton[][] ruter = new JButton[2][3];

        class actionL implements ActionListener{
            int rad,kal;
            boolean status = true;
            int number;
            actionL(int r,int k){
                rad = r;
                kal = k;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if (status){
                    JButton b = ruter[rad][kal];
                    number = Integer.valueOf(b.getText());
                    b.setText(":)");
                    status = false;
                } else{
                    JButton b = ruter[rad][kal];
                    b.setText("" + number);
                    status = true;
                }
            }
        }
        
        int teller = 1;
        for(int r=0;r<2;r++){
            for(int k=0;k<3;k++){
                JButton b = new JButton("" + teller);
                ruter[r][k] = b;
                b.setFont(new Font(
                   Font.MONOSPACED, Font.BOLD, 20));
                b.addActionListener(new actionL(r,k));
                rutennet.add(b);
            }
        }
        vindu.setSize(400,400);
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }       
}


import java.util.ArrayList; import java.util.List;
import javax.swing.*; import java.awt.*; import java.awt.event.*;

class ShoppingListModel {
    private final List<String> shoppingList = new ArrayList<>();

    public void addItem(String item) {
        shoppingList.add(item);
    }
    public List<String> getShoppingList() {
        return shoppingList;
    }
}
class ShoppingListView {
    private ShoppingListController controller = null;
    private final DefaultListModel<String> shoppingList;
    private final JTextField inputField;
    private final JList<String> itemList;

    public ShoppingListView() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { System.exit(1); }

        shoppingList = new DefaultListModel<>();
        JFrame frame = new JFrame("Shopping List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputField = new JTextField(20);
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            controller.addItem(inputField.getText());
            inputField.setText("");
            inputField.requestFocusInWindow();
            }
        });
        itemList = new JList<>(shoppingList);
        JScrollPane scrollPane = new JScrollPane(itemList);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.NORTH);
        panel.add(addButton, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.SOUTH);
        frame.add(panel);
        frame.pack(); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void updateItemListView(List<String> items) {
        shoppingList.clear();
        for(String item : items) {
            shoppingList.addElement(item);
        }
    }
    public void setController(ShoppingListController controller) {
        this.controller = controller;
    }
}

class ShoppingListController {
    private final ShoppingListModel model;
    private final ShoppingListView view;

    public ShoppingListController(ShoppingListModel model, ShoppingListView view) {
        this.model = model;
        this.view = view;
    }
    public void addItem(String item) {
        if (item != null && !item.strip().isEmpty()) {
            model.addItem(item.strip());
            updateView();
        }
    }
    private void updateView() {
        List<String> shoppingList = model.getShoppingList();
        view.updateItemListView(shoppingList);
    }
}
class ShoppingListApp {
    public static void main(String[] args) {
    ShoppingListModel model = new ShoppingListModel();
    ShoppingListView view = new ShoppingListView();
    ShoppingListController controller = new ShoppingListController(model, view);
    view.setController(controller);
    }
}


import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ShoppingListModel {
    private final List<String> shoppingList = new ArrayList<>();

    public void addItem(String item) {
        shoppingList.add(item);
    }

    public void removeItem(String item) {
        shoppingList.remove(item);
    }

    public List<String> getShoppingList() {
        return shoppingList;
    }
}

class ShoppingListView {
    private ShoppingListController controller = null;
    private final DefaultListModel<String> shoppingList;
    private final JTextField inputField;
    private final JList<String> itemList;

    public ShoppingListView() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { System.exit(1); }

        shoppingList = new DefaultListModel<>();
        JFrame frame = new JFrame("Shopping List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputField = new JTextField(20);
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.addItem(inputField.getText());
                inputField.setText("");
                inputField.requestFocusInWindow();
            }
        });

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = itemList.getSelectedValue();
                controller.removeItem(selectedItem);
            }
        });

        itemList = new JList<>(shoppingList);
        JScrollPane scrollPane = new JScrollPane(itemList);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.NORTH);

        JPanel knappPanel = new JPanel(new GridLayout(1,2));

        knappPanel.add(addButton);
        knappPanel.add(removeButton);
        panel.add(knappPanel, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.SOUTH);
        frame.add(panel);
        frame.pack(); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void updateItemListView(List<String> items) {
        shoppingList.clear();
        for(String item : items) {
            shoppingList.addElement(item);
        }
    }

    public void setController(ShoppingListController controller) {
        this.controller = controller;
    }
}

class ShoppingListController {
    private final ShoppingListModel model;
    private final ShoppingListView view;

    public ShoppingListController(ShoppingListModel model, ShoppingListView view) {
        this.model = model;
        this.view = view;
    }

    public void addItem(String item) {
        if (item != null && !item.strip().isEmpty()) {
            model.addItem(item.strip());
            updateView();
        }
    }

    public void removeItem(String item) {
        if (item != null && !item.strip().isEmpty()) {
            model.removeItem(item.strip());
            updateView();
        }
    }

    private void updateView() {
        List<String> shoppingList = model.getShoppingList();
        view.updateItemListView(shoppingList);
    }
}

class ShoppingListAppTo {
    public static void main(String[] args) {
        ShoppingListModel model = new ShoppingListModel();
        ShoppingListView view = new ShoppingListView();
        ShoppingListController controller = new ShoppingListController(model, view);
        view.setController(controller);
    }
}


import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI {
    public static void main(String[] args){
        JFrame vindu = new JFrame("Smile spill");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());

        ArrayList<JButton> buttons = new ArrayList<>();

        class actionL implements ActionListener{
            ArrayList<JButton> buttonS = buttons;
            int index;
            actionL (int i){
                index = i;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton currentButton = buttonS.get(index);
                currentButton.setText(":D");
                currentButton.setBackground(Color.GREEN);
                currentButton.setForeground(Color.WHITE);

                buttonS.remove(index);

                for (JButton b : buttonS) {
                    b.setText(":@");
                    b.setBackground(Color.RED);
                    b.setForeground(Color.WHITE);
                }

                buttonS.add(index,currentButton);
            }
        }
        Font customFont = new Font("SansSerif", Font.BOLD, 18);
        Dimension preferredSize = new Dimension(150, 100);

        JButton b1 = new JButton("");
        b1.setFont(customFont);
        b1.setPreferredSize(preferredSize);
        b1.addActionListener(new actionL(0));
        panel.add(b1, BorderLayout.NORTH);
        JButton b2 = new JButton("");
        b2.setFont(customFont);
        b2.setPreferredSize(preferredSize);
        b2.addActionListener(new actionL(1));
        panel.add(b2, BorderLayout.SOUTH);
        JButton b3 = new JButton("");
        b3.setFont(customFont);
        b3.setPreferredSize(preferredSize);
        b3.addActionListener(new actionL(2));
        panel.add(b3, BorderLayout.EAST);
        JButton b4 = new JButton("");
        b4.setFont(customFont);
        b4.setPreferredSize(preferredSize);
        b4.addActionListener(new actionL(3));
        panel.add(b4, BorderLayout.WEST );
        JButton b5 = new JButton("");
        b5.setFont(customFont);
        b5.setPreferredSize(preferredSize);
        b5.addActionListener(new actionL(4));
        panel.add(b5, BorderLayout.CENTER);

        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);

        vindu.add(panel);
        vindu.pack(); 
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);

    }
}

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GUI{
    public static void main(String[] args){
        JFrame vindu = new JFrame("Chess desk");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        vindu.add(panel);
        JPanel rutenett = new JPanel(new GridLayout(8,8));
        rutenett.setPreferredSize(new Dimension(400,400));

        int intR = 8;
        int intK = 1;
        for (int r=0;r<8;r++){
            for (int k=0;k<8;k++){
                JLabel label = new JLabel("");
                label.setPreferredSize(new Dimension(50,50));
                if(((intR-r) + (intK+k))%2==0){
                    label.setBackground(Color.black);
                    label.setOpaque(true);
                }
                rutenett.add(label);
            }
        }
        panel.add(rutenett, BorderLayout.CENTER);
        vindu.pack(); 
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
}


import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

interface IViewNettbutikk {
    void settController(IControllerNettbutikk controller);
    void opprettView();
    void leggTilLyttere();
    void visView();
    void visAnnetProdukt(String navn, String pris);
    void visAntallIHandlekurv(int antall);
}

interface IModelNettbutikk {
    void leggTilProdukt(String navn, String pris);
    String[] hentProdukt(int indeks);
    int antallProdukter();
    void inkrementerHandlekurv();
    int hentAntallIHandlekurv();
}

interface IControllerNettbutikk {
    void oppdaterProdukt(int steg);
    void oppdaterAntallIHandlekurv();
}

class ModelNettbutikk implements IModelNettbutikk {
    private List<String[]> produkter = new ArrayList<>();
    private int antallIHandlekurv = 0;

    @Override
    public void leggTilProdukt(String produkt, String pris) {
        produkter.add(new String[] {produkt, pris});
    }

    @Override
    public String[] hentProdukt(int indeks) {
        return produkter.get(indeks);
    }

    @Override
    public int antallProdukter() {
        return produkter.size();
    }

    @Override
    public void inkrementerHandlekurv() {
        antallIHandlekurv++;
    }

    @Override
    public int hentAntallIHandlekurv() {
        return antallIHandlekurv;
    }
}

class ControllerNettbutikk implements IControllerNettbutikk {
    private IModelNettbutikk model;
    private IViewNettbutikk view;
    private int gjeldendeIndeks = 0;

    public ControllerNettbutikk(IModelNettbutikk model, IViewNettbutikk view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void oppdaterProdukt(int steg) {
        gjeldendeIndeks += steg;
        if(gjeldendeIndeks >= model.antallProdukter()) {
            gjeldendeIndeks = 0;
        } else if(gjeldendeIndeks < 0) {
            gjeldendeIndeks = model.antallProdukter() - 1;
        }

        String[] produkt = model.hentProdukt(gjeldendeIndeks);
        view.visAnnetProdukt(produkt[0], produkt[1]);
    }

    @Override
    public void oppdaterAntallIHandlekurv() {
        model.inkrementerHandlekurv();
        view.visAntallIHandlekurv(model.hentAntallIHandlekurv());
    }
}

class ViewNettbutikk implements IViewNettbutikk {
    private IControllerNettbutikk controller;
    private JFrame vindu; JPanel hovedpanel, produkter, knapper;
    private JLabel produktnavn, produktpris, antIHandlekurv;
    private JButton forrige, neste, kjop, betal;

    public ViewNettbutikk() {
        opprettView();
        leggTilLyttere();
        visView();
    }

    @Override
    public void opprettView() {
        vindu = new JFrame("Nettbutikk");
        hovedpanel = new JPanel(); hovedpanel.setLayout(new BoxLayout(hovedpanel, BoxLayout.Y_AXIS));
        produkter = new JPanel(); produkter.setLayout(new BoxLayout(produkter, BoxLayout.Y_AXIS));
        knapper = new JPanel(new GridLayout(2, 2));

        produktnavn = new JLabel("Klikk på neste eller forrige!");
        produktpris = new JLabel("Pris: --");
        antIHandlekurv = new JLabel("Antall i handlekurv: 0");
        produkter.add(antIHandlekurv); produkter.add(produktnavn); produkter.add(produktpris);
        hovedpanel.add(produkter); hovedpanel.add(knapper);

        produktnavn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        produktpris.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        antIHandlekurv.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        produkter.setBorder(new EmptyBorder(new Insets(20, 0, 20,0)));

        forrige = new JButton("Forrige"); neste = new JButton("Neste");
        kjop = new JButton("Kjop"); betal = new JButton("Betal");
        knapper.add(forrige); knapper.add(neste);
        knapper.add(kjop); knapper.add(betal);

        vindu.add(hovedpanel);
    }

    @Override
    public void leggTilLyttere() {
        forrige.addActionListener(new Forrige()); neste.addActionListener(new Neste());
        kjop.addActionListener(new Kjop()); betal.addActionListener(new Betal());
    }

    @Override
    public void visView() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { System.exit(1); }
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vindu.setPreferredSize(new Dimension(400, 200));
        vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }

    @Override
    public void visAnnetProdukt(String navn, String pris) {
        produktnavn.setText(navn);
        produktpris.setText("Pris: " + pris);
    }

    @Override
    public void visAntallIHandlekurv(int antall) {
        antIHandlekurv.setText("Antall i handlekurv: " + antall);
    }

    class Forrige implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.oppdaterProdukt(-1);
        }
    }

    class Neste implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.oppdaterProdukt(1);
        }
    }

    class Kjop implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.oppdaterAntallIHandlekurv();
        }
    }

    class Betal implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Betalt!");
            System.exit(0);
        }
    }

    @Override
    public void settController(IControllerNettbutikk controller) {
        this.controller = controller;
    }
}

class MainNettbutikk {
    public static void main(String[] args) {
        IModelNettbutikk model = new ModelNettbutikk();
        
        model.leggTilProdukt("iPhone", "20000");
        model.leggTilProdukt("Samsung Galaxy", "16000");

        IViewNettbutikk view = new ViewNettbutikk();
        IControllerNettbutikk controller = new ControllerNettbutikk(model, view);
        view.settController(controller);
    }
}

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GUI{
    public static void main(String[] args){
        JFrame vindu = new JFrame("Chess desk");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        vindu.add(panel);
        JPanel rutenett = new JPanel(new GridLayout(8,8));
        rutenett.setPreferredSize(new Dimension(400,400));

        int intR = 8;
        int intK = 1;
        for (int r=0;r<8;r++){
            for (int k=0;k<8;k++){
                JLabel label = new JLabel("");
                label.setPreferredSize(new Dimension(50,50));
                if(((intR-r) + (intK+k))%2==0){
                    label.setBackground(Color.black);
                    label.setOpaque(true);
                }
                rutenett.add(label);
            }
        }
        panel.add(rutenett, BorderLayout.CENTER);
        vindu.pack(); 
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Modell {
    double result;

    public void multiplication (double first, double second) {
        result = first * second;
    }
    public void division (double first, double second) {
        result = first / second;
    }
    public void addition (double first, double second) {
        result = first + second;
    }
    public void subtraction (double first, double second) {
        result = first - second;
    }
    public double hentResult(){
        return result;
    }
}

class Controller {
    Modell modell;
    GUIs guiInterface;
    Controller(Modell m, GUIs g) {
        modell = m;
        guiInterface = g;
    }

    public void calculation(String textfield){
    try {
        if (textfield == null || textfield.trim().isEmpty()) {
            throw new IllegalArgumentException("No input provided.");
        }

        String[] arr = textfield.trim().split("\\s+");
        if (arr.length != 3) {
            throw new IllegalArgumentException("Expected format: number operator number (e.g. 3 + 5)");
        }

        double first = Double.parseDouble(arr[0]);
        double second = Double.parseDouble(arr[2]);
        String symbol = arr[1];

        switch (symbol) {
            case "X":
                modell.multiplication(first, second);
                break;
            case "+":
                modell.addition(first, second);
                break;
            case "-":
                modell.subtraction(first, second);
                break;
            case "÷":
                if (second == 0) throw new ArithmeticException("Cannot divide by zero.");
                modell.division(first, second);
                break;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + symbol);
        }

        resultDisplayer(modell.hentResult());

    } catch (NumberFormatException ex) {
        guiInterface.showError("Invalid number format. Use digits (e.g. 3.14).");
    } catch (ArithmeticException | IllegalArgumentException ex) {
        guiInterface.showError(ex.getMessage());
    } catch (Exception ex) {
        guiInterface.showError("Something went wrong: " + ex.getMessage());
    }

    }
    public void resultDisplayer(double result){
        guiInterface.view(result);
    }
}

class GUIs {
    Controller controller;
    JTextField resultat;
    JLabel label;
    String[] specialCharacters = {"0","=","÷","+","-",".","X"};

    public void init(){
        JFrame vindu = new JFrame("Calculator");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel hovedpanel = new JPanel(new BorderLayout());
        vindu.add(hovedpanel);
        JPanel upperPanel = new JPanel(new BorderLayout());
        upperPanel.setPreferredSize(new Dimension(250,100));
        JPanel lowerPanel = new JPanel(new GridLayout(4,4));
        lowerPanel.setPreferredSize(new Dimension(250,250));
        resultat = new JTextField();
        resultat.setFont(new Font("Arial", Font.BOLD, 24));
        resultat.setHorizontalAlignment(JTextField.CENTER);
        label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setPreferredSize(new Dimension(45,45));

        hovedpanel.add(upperPanel,BorderLayout.NORTH);
        hovedpanel.add(lowerPanel, BorderLayout.CENTER);
        upperPanel.add(resultat, BorderLayout.SOUTH);
        upperPanel.add(label, BorderLayout.CENTER);

        class actionL implements ActionListener{
            JButton button;
            JTextField textField;
            actionL(JButton b, JTextField j){
                button = b;
                textField = j;
            }
;
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = button.getText();
                if(!buttonText.equals("X") && !buttonText.equals("÷") && !buttonText.equals("+") && !buttonText.equals("-")){
                    String originalText = textField.getText();
                    resultat.setText(originalText + buttonText);
                } else {
                    String originalText = textField.getText();
                    resultat.setText(originalText + " " + buttonText + " ");
                }
            }
        }

        class inAction implements ActionListener{
            JTextField textfield;
            inAction(JTextField t){
                textfield = t;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textfield.getText();
                controller.calculation(text);
            }
        }

        int teller = 9;
        for(int r=0;r<3;r++){
            for(int k=0;k<3;k++){
                JButton button = new JButton(""+teller);
                button.setFocusPainted(false);
                button.addActionListener(new actionL(button,resultat));
                teller--;
                lowerPanel.add(button);
            }
        }

        for(int i=0;i<7;i++){
            String symbol = specialCharacters[i];
            JButton button = new JButton(symbol);
            button.setFocusPainted(false);
            if (!specialCharacters[i].equals("0")){
                button.setBackground(Color.ORANGE);
            }
            if(specialCharacters[i].equals(".")){
                button.setFont(new Font("Arial", Font.BOLD, 22));
            }
            if(!specialCharacters[i].equals("=")){
                button.addActionListener(new actionL(button, resultat));
            } else {
                button.addActionListener(new inAction(resultat));
                button.setFont(new Font("Arial", Font.BOLD, 22));
            }
            lowerPanel.add(button);
        }

        vindu.pack(); 
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }

    public void view(double result) {
        resultat.setText("");
        if (result % 1 == 0) {
            label.setText("" + (int) result);
        } else {
            label.setText("" + result);
        } 
    }

    public void settController(Controller c){
        controller = c;
    }
    public void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

class Gui {
    public static void main(String[] args) {
        Modell modell = new Modell();
        GUIs gui = new GUIs();
        Controller controller = new Controller(modell, gui);
        gui.settController(controller);
        gui.init();
    }
}


// Hva er invarianter og når brukes de?
//a) Invarianter er betingelser i et program som alltid er sanne. 
//De er en type påstand som forblir uendret før og etter utførelsen av visse operasjoner i et program

//b) Invarianter brukes ofte i programmering for å hjelpe med å sikre at et program fungerer som forventet. 
//De er spesielt nyttige i objektorientert programmering, hvor de kan brukes til å definere og bevare tilstanden til et objekt. 

//c) Vi bruker invarianter for å hjelpe med å sikre at et program fungerer som forventet, og for å forhindre at
//  det går inn i en ugyldig tilstand.

//d)  En mulig invariant for en lenkeliste kan være at “hvert element i listen peker på det neste elementet, og det siste elementet peker på null”

//e) En løkkeinvariant for en for-løkke er en betingelse som er sann før og etter hver iterasjon av løkken



class Node {
    String data;
    int prioritet;
    Node neste;

    Node(String data, int prioritet) {
        this.data = data;
        this.prioritet = prioritet;
    }
}

class Lenkeliste {
    Node hode;

    void settInn(String data, int prioritet) {
        Node nyNode = new Node(data, prioritet);

        if (this.hode == null || nyNode.prioritet < this.hode.prioritet) {
            nyNode.neste = this.hode;
            this.hode = nyNode;
        } else {
            Node gjeldende = this.hode;
            while (gjeldende.neste != null && gjeldende.neste.prioritet <= nyNode.prioritet) {
                gjeldende = gjeldende.neste;
            }
            nyNode.neste = gjeldende.neste;
            gjeldende.neste = nyNode;
        }
    }
}

class Sorteringssjekk {
    public static boolean erSortert(String[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i].compareTo(A[i + 1]) > 0) {
                return false;
            }
        }

        return true;
    }
}

class rekursiveSorteringssjekk {

    public static boolean erSortert(String[] A) {
        return erSortert(A, 0);
    }
    
    private static boolean erSortert(String[] A, int index) {

        if (index == A.length - 1) {
            return true;
        }
        
        if(A[index].compareTo(A[index+1]) > 0){
            return false;
        } 

        return erSortert(A,index+1);
    }
}


class invarianter {
    // førbetingelse
    public static void main(String[] args) {
        class MathUtils {
            public int divide(int a, int b) {
                if(b==0){
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return a/b;
            }
        }

        // eterbetingelse
        class StringUtils {
            public String toUpperCase(String str){
                if(str==null){ // førbetingelse
                    throw new IllegalArgumentException("String cannot be null");
                }
                String result = str.toUpperCase();

                assert result.equals(result.toUpperCase()) : "Postcondition failed: result is not uppercase";
                return result;
            }
        }
    }
}


class BankAccount {
    private int balance;
// Class invariant: balance >= 0
    public BankAccount(int initialBalance){
        if(initialBalance<0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        balance = initialBalance;
    }

    public void deposit(int amount) {
        if(amount<0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance+=amount;
    }
    public void withdraw(int amount){
        if(amount<0){
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if(amount<balance){
           throw new IllegalArgumentException("Insufficient funds"); 
        }
        balance-=amount;
    }
    public int getBalance(){
        return balance;
    }
}


class ArraySum {
    public int sum(int[] arr){
        int n = arr.length;
        int sum = 0;
        int i = 0;
        // Loop invariant: sum is the sum of elements from arr[0] to arr[i-1]
        while (i<n){
            sum+=arr[i];
            i++;
        }
        // Loop terminates when i==n
        // Looå invariant: sum is the sum of elements from arr[0] to arr[i-1]
        return sum;
    }
}


// + og - av array: 1) rask tilgang til elementer via indekser; Enkel struktur;
// Type-sikkerhet: 2) Fast størrelse; Mangel på fleksibilitet; begrenset funksjonalitet

// + og - av ArrayList: 1) Dynamisk størrelse; Rik funksjonalitet (add(), remove(), contains());
// Type-sikker med generics; 2) Lavere ytelse ved visse operasjoner; Høyere minnebruk; Trådsikkerhet

// Bruk *Array* hvis: Du trenger høy ytelse, lavt minnebruk, og vet nøyaktig hvor mange elementer du skal håndtere

// Bruk *ArrayList* hvis: Du trenger fleksibilitet, dynamisk håndtering av elementer, og ønsker tilgang til mange praktiske metoder

class Node <T>{
    Node<T> neste; //= null hvis ingen neste
    T verdi;
    public Node(T verdi){
        this.verdi = verdi;
    }
    public void settNeste(Node<T> n){
        neste = n;
    }
    public Node<T> hentNeste(){
        return neste;
    }
    public T hentData(){
        return verdi;
    }
}

class hoved {
    public static void main(String[] args) {
        Node<String> forste = new Node<>(null);

        Node<String> hei = new Node<>("Hei");
        Node<String> po = new Node<>("po");
        Node<String> deg = new Node<>("deg");

        forste.settNeste(hei);
        hei.settNeste(po);
        po.settNeste(deg);
    
        Node<String> current = forste;
        while(current.neste!=null){
            current = current.neste;
            System.out.println(current.hentData());
        }
    }
}


interface Par<K, V> {
    public K hentNokkel();
    public V hentVerdi();
}

class OrdnetPar<K, V> implements Par<K, V> {
    K key;
    V value;
    OrdnetPar(K k,V v){
        key = k;
        value = v;
    }
    @Override
    public K hentNokkel() {
        return key;
    }
    @Override
    public V hentVerdi() {
        return value;
    }
}


 class Main {
    public static void main(String[] args) {
        Par<String, Integer> par = new OrdnetPar<>("alder", 25);
        System.out.println("Nøkkel: " + par.hentNokkel());
        System.out.println("Verdi: " + par.hentVerdi());
    }
}

import java.util.Arrays;

class Person implements Comparable<Person> {
    private String fornavn;
    private String etternavn;
    private int alder;

    Person(String f,String e,int a){
        fornavn = f;
        etternavn = e;
        alder = a;
    }
    @Override
    public String toString() {
        return fornavn + " " + etternavn + "\n" + "alder: " + alder;
    }
    public int hentAlder(){
        return alder;
    }
    @Override
    public int compareTo(Person person) {
        if(this.hentAlder()!=person.hentAlder()){
            return this.hentAlder() - person.hentAlder(); 
        } else {
            return this.fornavn.compareTo(person.fornavn);
        }
    }
}


class hoved {

    public static void main(String[] args) {
        Person[] personer = {
        new Person("Andreas", "Hurthe", 25),
        new Person("Kristine", "Henriksen", 30),
        new Person("Henrik", "Golsen", 25),
        new Person("Sigvart", "Dagsland", 29)
    };
        Arrays.sort(personer);
        for (Person p : personer) {
            System.out.println(p);
        }
    }
}


import java.util.Iterator;

class FIFOListe<T> implements Iterable<T> {
    private Node hode;
    private Node hale;

    private class Node {
    Node neste; //= null hvis ingen neste
    T verdi;
    public Node(T verdi){
        this.verdi = verdi;
    }
    public T hentData(){
        return verdi;
    }
}

    public int storrelse() {
        int antall = 0;
        Node currentNode = hode;
        while(currentNode!=null){
            antall++;
            currentNode = currentNode.neste;
        }
        return antall;
    }
    public boolean erTom() {
        return hode==null;
    }
    public void leggTil(T t) {
    Node newNode = new Node(t);
    if (erTom()) {
        hode = newNode;
        hale = newNode;
    } else {
        hale.neste = newNode;
        hale = newNode;
    }
}
    public void fjernAlt() {
        hode = null;
        hale = null;
    }
    
    public T pop() {
        if (erTom()) return null;
        T data;
        if (hode == hale) {
            data = hode.hentData();
            hode = null;
            hale = null;
        } else {
            Node current = hode;
            while (current.neste != hale) {
                current = current.neste;
            }
            data = hale.hentData();
            current.neste = null;
            hale = current;
        }
        return data;
    }
    public void skrivUtListe() {
        Node currentNode = hode;
        while(currentNode!=null){
            System.out.println(currentNode.hentData());
            currentNode = currentNode.neste;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new FIFOIterator();
    }

    private class FIFOIterator implements Iterator<T> {

    private Node denne = hode;

    @Override
    public boolean hasNext() {
        return denne!=null;
    }
    @Override
    public T next() {
        T data = denne.hentData();
        denne = denne.neste;
        return data;
     }
    }
}


class enkeltlenkede {
    private Node startNode;
    private Node sluttNode;

    private class Node {
    Node neste; //= null hvis ingen neste
    String verdi;
    public Node(String verdi){
        this.verdi = verdi;
    }
    public String hentData(){
        return verdi;
    }
}

    public int storrelse() {
        int antall = 0;
        Node currentNode = startNode;
        while(currentNode!=null){
            antall++;
            currentNode = currentNode.neste;
        }
        return antall;
    }
    public boolean erTom() {
        return startNode==null;
    }

    public void leggTilFoerst(String t){
        Node newNode = new Node(t);
        if (erTom()) {
        startNode = newNode;
        sluttNode = newNode;
    } else{
        newNode.neste = startNode;
        startNode = newNode;
    }
    }

    public void leggTilSist(String t) {
    Node newNode = new Node(t);
    if (erTom()) {
        startNode = newNode;
        sluttNode = newNode;
    } else {
        sluttNode.neste = newNode;
        sluttNode = newNode;
    }
}
    public void fjernAlt() {
        startNode = null;
        sluttNode = null;
    }
    
    public String pop() {
        if (erTom()) return null;
        String data;
        if (startNode == sluttNode) {
            data = startNode.hentData();
            startNode = null;
            sluttNode = null;
        } else {
            Node current = startNode;
            while (current.neste != sluttNode) {
                current = current.neste;
            }
            data = sluttNode.hentData();
            current.neste = null;
            sluttNode = current;
        }
        return data;
    }

    public String fjernSpecificString(String t){
        if (erTom()) return null;
        Node current = startNode;
        String data;
        if(current.hentData().equals(t)){
            data = current.hentData();
            startNode = startNode.neste;
            if (startNode == null) sluttNode = null;
            return data;
        }
        while(current.neste != null){
            if(current.neste.verdi.equals(t)){
                data = current.neste.hentData();
                if (current.neste == sluttNode) sluttNode = current;
                current.neste = current.neste.neste;
                return data;
            }
            current = current.neste;
        }
        return null;
    }

    public void skrivUtListe() {
        Node currentNode = startNode;
        while(currentNode!=null){
            System.out.println(currentNode.hentData());
            currentNode = currentNode.neste;
        }
    }
}


class dobbeltlenkede {
    private Node startNode;
    private Node sluttNode;

    private class Node {
    Node neste; 
    Node previous;
    String verdi;
    public Node(String verdi){
        this.verdi = verdi;
    }
    public String hentData(){
        return verdi;
    }
}

    public int storrelse() {
        int antall = 0;
        Node currentNode = startNode;
        while(currentNode!=null){
            antall++;
            currentNode = currentNode.neste;
        }
        return antall;
    }
    public boolean erTom() {
        return startNode==null;
    }

    public void leggTilFoerst(String t){
        Node newNode = new Node(t);
        if (erTom()) {
        startNode = newNode;
        sluttNode = newNode;
    } else{
        newNode.neste = startNode;
        startNode.previous = newNode;
        startNode = newNode;
    }
    }

    public void leggTilSist(String t) {
    Node newNode = new Node(t);
    if (erTom()) {
        startNode = newNode;
        sluttNode = newNode;
    } else {
        newNode.previous = sluttNode;  
        sluttNode.neste = newNode;
        sluttNode = newNode;
    }
}
    public void fjernAlt() {
        startNode = null;
        sluttNode = null;
    }
    
    public String pop() {
        if (erTom()) return null;
        String data;
        if (startNode == sluttNode) {
            data = startNode.hentData();
            startNode = null;
            sluttNode = null;
        } else {
            Node current = sluttNode.previous;
            data = sluttNode.hentData();
            current.neste = null;
            sluttNode = current;
        }
        return data;
    }

    public String fjernSpecificString(String t) {
    if (erTom()) return null;

    Node current = startNode;

    while (current != null) {
        if (current.hentData().equals(t)) {
            String data = current.hentData();

            // Remove from start
            if (current == startNode) {
                startNode = current.neste;
                if (startNode != null) {
                    startNode.previous = null;
                } else {
                    sluttNode = null; // List is now empty
                }
            }
            // Remove from end
            else if (current == sluttNode) {
                sluttNode = current.previous;
                sluttNode.neste = null;
            }
            // Remove from middle
            else {
                current.previous.neste = current.neste;
                current.neste.previous = current.previous;
            }

            return data;
        }

        current = current.neste;
    }

    return null; // Not found
}

    public void skrivUtListe() {
        Node currentNode = startNode;
        while(currentNode!=null){
            System.out.println(currentNode.hentData());
            currentNode = currentNode.neste;
        }
    }
}
*/

import java.util.Iterator;  

class Flyformasjon implements Iterable<Fly>{
    Fly first;
    PassasjerFly[] passasjerFly;
    Flyformasjon(){
    }

    public void leggTil(Fly fly){
        if(first==null){
            first = fly;
        } else{
            fly.neste = first;
            first = fly;
        }
    }
    public boolean erMed(String ID){
        Fly currentFly = first;
        while(currentFly!=null){
            if(currentFly.Id.equals(ID)){
                return true;
            }
            currentFly = currentFly.neste;
        } return false;
    }
    public Fly taUt(String ID){
        Fly currentFly = first;
        Fly prev = null;
        while (currentFly != null) {
            if (currentFly.Id.equals(ID)) {
                if (prev == null) {
                    first = currentFly.neste;
                } else {
                    prev.neste = currentFly.neste;
                }
                return currentFly;
            }
            prev = currentFly;
            currentFly = currentFly.neste;
        }
        return null;
    }
    @Override
    public Iterator<Fly> iterator() {
        return new flyIterator();
    }
    private class flyIterator implements Iterator<Fly>{
        Fly currentFly = first;

        @Override
        public boolean hasNext() {
            return currentFly!=null;
        }

        @Override
        public Fly next() {
            Fly data = currentFly;
            currentFly = currentFly.neste;
            return data;
        } 
    }

    PassasjerFly[] hentPassasjerFly(){
        int antall = 0;
        Fly currentFly = first;
        while(currentFly!=null){
            if(currentFly instanceof PassasjerFly){
                antall++;
            }
            currentFly=currentFly.neste;
        }
        passasjerFly = new PassasjerFly[antall];
        int index = 0;
        currentFly = first;
        while(currentFly!=null){
            if(currentFly instanceof PassasjerFly){
                passasjerFly[index] = (PassasjerFly)currentFly;
                index++;
            }
            currentFly=currentFly.neste;
        }
        return passasjerFly;
    }

    public int totalVekt() {
        int sum = 0;
        for (Fly fly : this) {   // Uses your iterator automatically!
            sum += fly.hentMTOW();
        }
        return sum;
    }

    public int maksVekt() {
        return maksVektRekursivt(0, first);
    }

    private int maksVektRekursivt(int maksVekt, Fly currentNode) {
        if (currentNode == null) {
            return maksVekt;
        }
        if (currentNode.hentMTOW() > maksVekt) {
            maksVekt = currentNode.hentMTOW();
        }
        return maksVektRekursivt(maksVekt, currentNode.neste);
    } 
}

class Fly {

    String Id;
    int motorAntall;
    int trekkraft;
    int MTOW;
    Fly neste;

    Fly(String I,int m,int t,int M){
        Id = I;
        motorAntall = m;
        trekkraft = t;
        MTOW = M;
    }

    public String hentId(){
        return Id;
    }
    public int hentMotorAntall(){
        return motorAntall;
    }
    public int hentMTOW(){
        return MTOW;
    }
}

class SeilFly extends Fly{
    int minSynkehastighet;
    SeilFly(String Id, int MTOW, int hastighet){
        super(Id, 0, 0, MTOW);
        minSynkehastighet = hastighet;
    }
}

interface Motordrevet {
    public int trekkraft();
}

class MotorFly extends Fly implements Motordrevet{
    MotorFly(String Id, int motorAntall, int trekkraft, int MTOW){
        super(Id, MTOW, motorAntall, trekkraft);
    }
    @Override
    public int trekkraft() {
        return trekkraft;
    }
}

class LasteFly extends MotorFly {
    int maxLasteVekt;
    LasteFly(String Id, int motorAntall, int trekkraft, int MTOW, int mLV){
        super(Id, MTOW, motorAntall, trekkraft);
        maxLasteVekt = mLV;
    }
}

class PassasjerFly extends MotorFly {
    int maxPassasjer;
    PassasjerFly(String Id, int motorAntall, int trekkraft, int MTOW, int mP){
        super(Id, MTOW, motorAntall, trekkraft);
        maxPassasjer = mP;
    }
}