public class Rutenett {
    public int antRader;
    public int antKolonner;
    public Celle rutene[][];

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
        for (int r = 0; r < this.antRader; r++) {
            for (int k = 0; k < this.antKolonner; k++) {
                this.rutene[r][k] = this.lagCelle();
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
        final String RESET = "\u001B[0m"; 
        final String GREEN = "\u001B[32m"; 
        final String RED = "\u001B[31m"; 
    
        System.out.println(); 
    
        System.out.print("+");
        for (int k = 0; k < this.antKolonner; k++) {
            System.out.print("---+"); 
        }
        System.out.println();
    
        for (int r = 0; r < this.antRader; r++) {
            System.out.print("|"); 
            for (int k = 0; k < this.antKolonner; k++) {
                Celle celle = this.rutene[r][k];
                char status = celle.hentStatusTegn();
                if (status == 'O') {
                    System.out.print(" " + GREEN + status + RESET + " |"); 
                } else {
                    System.out.print(" " + RED + status + RESET + " |"); 
                }
            }
            System.out.println();
    
            System.out.print("+");
            for (int k = 0; k < this.antKolonner; k++) {
                System.out.print("---+"); 
            }
            System.out.println();
        }
    }
    
    public void settNaboer(int rad, int kolonne) {
        Celle celle = this.hentCelle(rad, kolonne);
        if (celle != null) {
            int[][] naboerKoordinater = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1}, {1, -1},
                {1, 0}, {1, 1}
            };
            for (int[] nabo : naboerKoordinater) {      
                Celle naboCelle = hentCelle(rad+nabo[0], kolonne+nabo[1]);
                if (naboCelle != null) {
                    celle.leggTilNabo(naboCelle);
                }
            }
        }
    }

    public void kobleAlleCeller () {
        for (int r = 0; r < this.antRader; r++) { 
            for (int k = 0; k < this.antKolonner; k++) { 
                this.settNaboer(r, k);
            }
        }
    }

    public int antallLevende () {
        int antall = 0;
        for (int r = 0; r < this.antRader; r++) { 
            for (int k = 0; k < this.antKolonner; k++) { 
                Celle celle = this.hentCelle(r, k);
                if (celle.erLevende()) {
                    antall++;
                }
            }
        }
        return antall;
    }
}


