import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter antall rader: ");
        int rader = scanner.nextInt();
        System.out.print("Enter antall kolonner: ");
        int kolonner = scanner.nextInt();
        scanner.nextLine();
       
        Verden game = new Verden(rader, kolonner);
        game.tegn();
        System.out.print("Trykk enter hvis du vil fortsette!\n" + 
        "Eller skriv \"q\" hvis du vil stoppe spillet\n> ");
        String nextRound = scanner.nextLine();
        while (!nextRound.equalsIgnoreCase("q")) {
            game.oppdatering();
            game.tegn();
            System.out.print("Trykk enter hvis du vil fortsette!\n" + 
                             "Eller skriv \"q\" hvis du vil stoppe spillet\n> ");
            nextRound = scanner.nextLine();
        }
        scanner.close();
        System.out.println("game over!");
    }
}





