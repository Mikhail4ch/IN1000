public class GameOfLife {
    public static void main(String[] args) {
        Verden game = new Verden(8, 12);
        game.tegn();
        game.oppdatering();
        game.tegn();
        game.oppdatering();
        game.tegn();
        game.oppdatering();
        game.tegn();
    }
}
