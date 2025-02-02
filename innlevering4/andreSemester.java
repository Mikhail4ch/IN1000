/* 
class Positiv {
   public static void main (String[] args) {
    int v = 42;
    if (v<0) {
        System.out.println(v + " er negativ");
    } else if (v==0) {
        System.out.println(v + " er null");
    } else {
        System.out.println(v + " er positiv");
    }
   }
}


class Taller {
    public static void main(String[] args) {
        int first = 5;
        int second = 5;
        if (first > second) {
            System.out.println(first + " won");
        }
        else if (first == second ){
            System.out.println(" equality (not social one)");
        }
        else {
            System.out.println(second + " won");
        }
    }
}

class polet {
    public static void main(String[] args) {
        int age = 26;
        if (age > 25){
            System.out.println(" forget bout ID dawg");
        }
        else if (age >= 20) {
            System.out.println(" you can buy teen spirit");
        }
        else {
            System.out.println(" get the hell out of here!!!!");
        }
    }
}
     
import java.util.Scanner;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void skriv(){
        System.out.println(this.name + " " + this.age);
    }
    public void bursdag(){
        this.age++;
    }
}

class Mainprogram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn alder: ");

        int alder = input.nextInt();
        System.out.println("You wrote" + alder);
        System.out.println("Write your name: ");
        String navn = input.nextLine();
        Person me
    }
}
 
class Motorsykkel {
    private int kilometerstand;
    private String regNr;
    private int produksjonsnr;
    private static int teller = 0;
    public Motorsykkel(String regNr) {
        this.regNr = regNr;
        this.kilometerstand = 0;
        this.produksjonsnr = teller;
        teller++;
    }
}
    

    public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1; // Initialize the counter

        System.out.println("Counting using while loop:");
        while (count <= 5) { // Condition to check
            System.out.println("Count: " + count); // Print the count
            count++; // Increment the counter
        }
    }
}

public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1; // Initialize the counter

        System.out.println("Counting using while loop:");
        while (count <= 5) { // Condition to check
            System.out.println("Count: " + count); // Print the count
            count++; // Increment the counter
        }
    }
}

public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("Counting using for loop:");
        for (int i = 1; i <= 5; i++) { // Initialization; condition; increment
            System.out.println("Count: " + i); // Print the count
        }
    }
} */

