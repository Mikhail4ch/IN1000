/*
public class Eclipse {
    public static void main(String[] args) {
    System.out.println();
    System.out.println();
    System.out.println();
    final String GREEN = "\u001B[32m";
    final String RESET = "\u001B[0m";
    String eclipse = GREEN + "        E  C  L  I  P  S  E" + RESET; 
    String everything = 
    GREEN + "     E" + RESET + "  " +
    "V" + " " +
    GREEN + "E" + RESET + "  " +
    "R" + " " +
    GREEN + "Y" + RESET + "  " +
    "T" + " " +
    GREEN + "H" + RESET + "  " +
    "I" + " " +
    GREEN + "N" + RESET + "  " +
    "G"; 
    String[] eclipseArt = {
        " ███████ ███████ ███████  ████████ ",
        "      ██ ██   ██      ██  ██       ",
        eclipse,            
        "      ██ ██   ██      ██  ██       ",
        " ███████ ██   ██ ███████  ███████  ",
        " ██      ██   ██ ██            ██  ",
        everything, 
        " ██      ██   ██ ██            ██  ",   
        " ███████ ███████ ███████  ███████  "
    };

    for (String line : eclipseArt) {
        System.out.println(line);
    }
    System.out.println();
    System.out.println();
    System.out.println();
  }
}
*/
class PixelArtCat {
    public static void main(String[] args) {
        String[] catArt = {
            "       /\\_/\\      ",
            "      (  o.o)     ",
            "       > ^ <      ",
            "      /  |  \\     ",
            "     (   *   )    ",
            "      `-----'     "
        };

        for (String line : catArt) {
            System.out.println(line);
        }
    }
}       
