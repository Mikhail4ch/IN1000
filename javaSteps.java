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
*/
         
