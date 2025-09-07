// Full Labyrint program with all classes supporting path tracking

// === Labyrint.java ===
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class Labyrint {
    private Rute[][] ruter;
    private int rader, kolonner;
    private List<List<Rute>> alleUtveier = new ArrayList<>();

    public Labyrint(String filnavn) {
        try {
            Scanner fil = new Scanner(new File(filnavn));
            rader = fil.nextInt();
            kolonner = fil.nextInt();
            fil.nextLine();

            ruter = new Rute[rader][kolonner];

            for (int rad = 0; rad < rader; rad++) {
                String linje = fil.nextLine();
                for (int kol = 0; kol < kolonner; kol++) {
                    char tegn = linje.charAt(kol);
                    if (tegn == '.') {
                        ruter[rad][kol] = new HvitRute(this, rad, kol);
                    } else if (tegn == '#') {
                        ruter[rad][kol] = new SortRute(this, rad, kol);
                    }
                }
            }

            for (int rad = 0; rad < rader; rad++) {
                for (int kol = 0; kol < kolonner; kol++) {
                    Rute r = ruter[rad][kol];
                    if (r instanceof HvitRute) {
                        int naboer = 0;
                        if (rad > 0 && ruter[rad - 1][kol] != null) naboer++;
                        if (rad < rader - 1 && ruter[rad + 1][kol] != null) naboer++;
                        if (kol > 0 && ruter[rad][kol - 1] != null) naboer++;
                        if (kol < kolonner - 1 && ruter[rad][kol + 1] != null) naboer++;

                        if (naboer == 3) {
                            ruter[rad][kol] = new Aapning(this, rad, kol);
            }
        }
    }
}

            // 3. Now assign neighbors safely
            for (int rad = 0; rad < rader; rad++) {
                for (int kol = 0; kol < kolonner; kol++) {
                    ruter[rad][kol].settNaboer(ruter, rader, kolonner);
                }
}

            fil.close();
        } catch (FileNotFoundException e) {
            System.err.println("Filen ble ikke funnet.");
            System.exit(1);
        }
    }

public int getAntRader() {
    return ruter.length;
}

public int getAntKolonner() {
    return ruter[0].length;
}

public Rute hentRute(int rad, int kol) {
    return ruter[rad][kol];
}

public List<Rute> hentKortesteUtvei() {
    if (alleUtveier.isEmpty()) return null;
    List<Rute> korteste = alleUtveier.get(0);
    for (List<Rute> sti : alleUtveier) {
        if (sti.size() < korteste.size()) {
            korteste = sti;
        }
    }
    return korteste;
}

    public void leggTilUtvei(List<Rute> sti) {
        alleUtveier.add(sti);
    }

    public void finnUtveiFra(int rad, int kol) {
        Rute.teller = 1;
        System.out.println("Starter leting fra (" + rad + ", " + kol + ")");
        List<Rute> sti = new ArrayList<>();
        ruter[rad][kol].finn(null, sti);
        System.out.println("Her er labyrinten slik du gikk gjennom den:");
        System.out.println(this);

        System.out.println("Antall utveier funnet: " + alleUtveier.size());

        if (!alleUtveier.isEmpty()) {
            List<Rute> korteste = alleUtveier.get(0);
            for (List<Rute> s : alleUtveier) {
                if (s.size() < korteste.size()) {
                    korteste = s;
                }
            }

            System.out.println("Korteste utvei (" + korteste.size() + " steg):");
            for (Rute r : korteste) {
                System.out.print(r.hentKoordinat() + " ");
            }
            System.out.println();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int rad = 0; rad < rader; rad++) {
            for (int kol = 0; kol < kolonner; kol++) {
                sb.append(ruter[rad][kol].toString());
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

// === Rute.java ===
abstract class Rute {
    protected int rad, kol;
    protected Labyrint lab;
    protected Rute nord, syd, vest, oest;
    protected boolean besokt = false;
    protected static int teller = 1;             // shared counter
    protected int besoksrekkefolge = 0;          // instance visit number

    public Rute(Labyrint lab, int rad, int kol) {
        this.lab = lab;
        this.rad = rad;
        this.kol = kol;
    }

    public void settNaboer(Rute[][] ruter, int maxRad, int maxKol) {
        if (rad > 0) nord = ruter[rad - 1][kol];
        if (rad < maxRad - 1) syd = ruter[rad + 1][kol];
        if (kol > 0) vest = ruter[rad][kol - 1];
        if (kol < maxKol - 1) oest = ruter[rad][kol + 1];
    }

    public int antallNaboer() {
        int count = 0;
        if (nord != null) count++;
        if (syd != null) count++;
        if (vest != null) count++;
        if (oest != null) count++;
        return count;
    }

    public String hentKoordinat() {
        return "(" + rad + ", " + kol + ")";
    }

    public abstract void finn(Rute fra, List<Rute> sti);
    public abstract String toString();
}

// === HvitRute.java ===
class HvitRute extends Rute {
    public HvitRute(Labyrint lab, int rad, int kol) {
        super(lab, rad, kol);
    }

    @Override
    public void finn(Rute fra, List<Rute> sti) {
        if (besokt) return;
        besokt = true;
        besoksrekkefolge = teller++; 
        sti.add(this);

        if (nord != fra && nord != null) nord.finn(this, new ArrayList<>(sti));
        if (syd != fra && syd != null) syd.finn(this, new ArrayList<>(sti));
        if (vest != fra && vest != null) vest.finn(this, new ArrayList<>(sti));
        if (oest != fra && oest != null) oest.finn(this, new ArrayList<>(sti));
    }

    @Override
    public String toString() {
        return besoksrekkefolge == 0 ? " . " : String.format("%3d", besoksrekkefolge);
    }
}

// === SortRute.java ===
class SortRute extends Rute {
    public SortRute(Labyrint lab, int rad, int kol) {
        super(lab, rad, kol);
    }

    @Override
    public void finn(Rute fra, List<Rute> sti) {
        // Do nothing
    }

    @Override
    public String toString() {
        return "###";
    }
}

// === Aapning.java ===
class Aapning extends HvitRute {
    public Aapning(Labyrint lab, int rad, int kol) {
        super(lab, rad, kol);
    }

    @Override
    public void finn(Rute fra, List<Rute> sti) {
        if (besokt) return;
        besokt = true;
        besoksrekkefolge = teller++; 
        sti.add(this);
        lab.leggTilUtvei(new ArrayList<>(sti));
        System.out.println("Fant åpning: ");
        for (Rute r : sti) {
            System.out.print(r.hentKoordinat() + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return besoksrekkefolge == 0 ? " O " : String.format("%3d", besoksrekkefolge);
    }
}

class LabyrintGUI {
    private Labyrint labyrint;
    private JFrame vindu;
    private JPanel rutenett;
    private RuteKnapp[][] knapper;

    public LabyrintGUI(String filnavn) {
        labyrint = new Labyrint(filnavn);
        int rader = labyrint.getAntRader();
        int kolonner = labyrint.getAntKolonner();

        vindu = new JFrame("Labyrint");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vindu.setLayout(new BorderLayout());

        rutenett = new JPanel(new GridLayout(rader, kolonner));
        knapper = new RuteKnapp[rader][kolonner];

        for (int rad = 0; rad < rader; rad++) {
            for (int kol = 0; kol < kolonner; kol++) {
                Rute r = labyrint.hentRute(rad, kol);
                RuteKnapp knapp = new RuteKnapp(rad, kol, r instanceof SortRute);
                knapp.addActionListener(e -> behandleKlikk(knapp));
                knapper[rad][kol] = knapp;
                rutenett.add(knapp);
            }
        }

        JButton avslutt = new JButton("Exit");
        avslutt.addActionListener(e -> System.exit(0));

        vindu.add(rutenett, BorderLayout.CENTER);
        vindu.add(avslutt, BorderLayout.SOUTH);
        vindu.pack();
        vindu.setVisible(true);
    }

    private void behandleKlikk(RuteKnapp knapp) {
        int rad = knapp.rad;
        int kol = knapp.kol;
        labyrint.finnUtveiFra(rad, kol);
        List<Rute> korteste = labyrint.hentKortesteUtvei();

        if (labyrint.hentRute(rad, kol) instanceof SortRute) return;

        // Farg stien rød
        if (korteste != null) {
            for (Rute r : korteste) {
                knapper[r.rad][r.kol].setBackground(Color.RED);
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Bruk: java LabyrintGUI <filnavn>");
            System.exit(1);
        }
        SwingUtilities.invokeLater(() -> new LabyrintGUI(args[0]));
    }
}

// RuteKnapp.java
class RuteKnapp extends JButton {
    int rad, kol;
    boolean erSort;
    Color opprinnelig;

    public RuteKnapp(int rad, int kol, boolean erSort) {
        this.rad = rad;
        this.kol = kol;
        this.erSort = erSort;
        this.setPreferredSize(new Dimension(20, 20));
        if (erSort) {
            setBackground(Color.BLACK);
        } else {
            setBackground(Color.WHITE);
        }
        this.opprinnelig = getBackground();
    }
}



/* 
class Innlevering6 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Bruk: java Innlevering6 <filnavn>");
            System.exit(1);
        }

        Labyrint lab = new Labyrint(args[0]);
        System.out.println("Labyrint innlest:");
        System.out.println(lab);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Oppgi startposisjon (rad kol), eller 'exit': ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            String[] deler = input.split(" ");
            if (deler.length != 2) {
                System.out.println("Feil format. Bruk: <rad> <kol>");
                continue;
            }

            try {
                int rad = Integer.parseInt(deler[0]);
                int kol = Integer.parseInt(deler[1]);
                lab.finnUtveiFra(rad, kol);
            } catch (NumberFormatException e) {
                System.out.println("Feil: Ugyldige tall. Prøv igjen.");
            }
        }
        sc.close();
    }
}
*/






