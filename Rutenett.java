public class Rutenett {
    private int antRader;
    private int antKolonner;
    private Celle rutene[][];

    public Rutenett (int antRader, int antKolonner) {
        this.antRader = antRader;
        this.antKolonner = antKolonner;
        this.rutene = new Celle[antRader][antKolonner];
    }

    public Celle lagCelle () {
        Celle cele = new Celle();
        if (Math.random() <= 0.3333) {
            cele.settLevende();
        } 
        return cele;
    }

    public void fyllMedTilfeldigeCeller () {
        for (int i = 0; i < this.antRader; i++) {
            for (int k = 0; i < this.antKolonner; k++) {
                this.rutene[i][k] = this.lagCelle();
            }
        }
    }

    public Celle hentCelle (int rad, int kolonne) {
        if (rad >= 0 && rad < this.antRader && kolonne >= 0 && kolonne < this.antKolonner) {
            return this.rutene[rad][kolonne];  
        }
        return null;
    }

    public void tegnRutenett() {
        System.out.println("\n\n"); 
        for (int i = 0; i < this.antRader; i++) { 
            for (int k = 0; k < this.antKolonner; k++) { 
                Celle celle = this.rutene[i][k]; 
                System.out.print(celle.hentStatusTegn()); 
            }
            System.out.println(); 
        }
        System.out.println("\n\n"); 
    }
    
    public void settNaboer(int rad, int kolonne) {
        if (this.hentCelle(rad, kolonne) != null) {
            Celle celle = this.hentCelle(rad, kolonne);
            if (celle == null) {
                System.out.println("Denne cellen finnes ikke");
                return;
            } else {
                int[][] naboKoordinater = {
                    {-1, -1}, {-1, 0}, {-1, 1},
                    {0, -1}, {0, 1}, {1, -1},
                    {1, 0}, {1, 1}
                };
                for (int[] nabo : naboKoordinater) {
                    int naboRad = rad + nabo[0];
                    int naboKolonne = kolonne + nabo[1];
                    
                    Celle naboCelle = hentCelle(naboRad, naboKolonne);
                    if (naboCelle != null) {
                        celle.leggTilNabo(naboCelle);
                    }
                }
            }
        }
    }

    
}


