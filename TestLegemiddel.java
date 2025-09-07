public class TestLegemiddel {
    private static boolean testLegemiddelId(Legemiddel legemiddel, int expectedLegemiddelId) {
        return legemiddel.ID == expectedLegemiddelId;
    }
   
    private static void printTest(Legemiddel legemiddel, int expectedId) {
        if (testLegemiddelId(legemiddel, expectedId)) {
            System.out.println(" ID (" + expectedId + "): SUCCESS");
        } else {
            System.out.println(" ID (" + expectedId + "): FAILURE. Got: " + legemiddel.ID);
        }
    }
    public static void main(String[] args) {
        Legemiddel narkotisk = new Narkotisk("Noenting", 250, 8.4, 5);
        Legemiddel vanedannende = new Vanedannende("Farligting", 110, 10.0, 7);
        Legemiddel vanlig = new Vanlig("Vanligting", 55, 2.0);
        Legemiddel vanlig1 = new Vanlig("Vanligting1", 95, 11.0);

        printTest(narkotisk, 0);
        printTest(vanedannende, 0);
        printTest(vanlig, 0);
        printTest(vanlig1, 1);
        System.out.println();

        narkotisk.settNyPris(221);
        if (narkotisk.hentPris() == 221) {
            System.out.println("Teste Narkotisk ny pris: SUCCESS");
        } else {
            System.out.println("Teste Narkotisk ny pris: FAILURE. Fikk: " + narkotisk.hentPris());
        }
        System.out.println();
        System.out.println(narkotisk);
    }
}
