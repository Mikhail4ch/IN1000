class Integrasjonstest {
    public static void main(String[] args) {
      
        Legemiddel[] legemidler = new Legemiddel[3];
        legemidler[0] = new Narkotisk("Noeting", 400, 8.5, 3);
        legemidler[1] = new Vanedannende("Farligting", 330, 5.5, 2);
        legemidler[2] = new Vanlig("Vanligting", 101, 2.1);

        Lege[] leger = new Lege[2];
        leger[0] = new Lege("Dr. Zhivago");
        leger[1] = new Spesialist("qwerty123", "Dr. House");

        Resepter[] resepter = new Resepter[4];
        resepter[0] = new Hvite(legemidler[2], leger[0], 1, 5);         
        resepter[1] = new MilitærResept(legemidler[0], leger[1], 2);       
        resepter[2] = new PResept(legemidler[1], leger[0], 3, 4);           
        resepter[3] = new Blå(legemidler[2], leger[1], 4, 2);              

        System.out.println("= Legemidler =");
        for (Legemiddel lm : legemidler) {
            System.out.println(lm);
            System.out.println();
        }

        System.out.println("\n= Leger =");
        for (Lege l : leger) {
            System.out.println(l);
        }

        System.out.println("\n= Resepter =");
        for (Resepter r : resepter) {
            System.out.println(r);
            System.out.println();
        }
    }
}
