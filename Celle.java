public class Celle{
    public boolean status;
    public Celle naboer[];
    public int antNaboer;
    public int antLevendeNaboer;

    public Celle(){
        this.status = false;
        this.naboer = new Celle[8];
        this.antNaboer = 0;
        this.antLevendeNaboer = 0;
    }

    public void settDød(){
        this.status = false;
    }

    public void settLevende(){
        this.status = true;
    }

    public Boolean erLevende(){
        return this.status;
    }

    public char hentStatusTegn(){
        return this.status ? 'O' : '.';
    }
        
    public void leggTilNabo(Celle nabo){
        if(this.antNaboer < this.naboer.length){
            this.naboer[this.antNaboer] = nabo;
            this.antNaboer++;
        } else { System.out.println("full av naboer");}   
    }

    public void tellLevendeNaboer(){
        this.antLevendeNaboer = 0;
        for(int i = 0; i < this.naboer.length; i++){
            if(this.naboer[i] != null && this.naboer[i].erLevende()){
                this.antLevendeNaboer++;
            }
        }
    }

    public void oppdaterStatus() {
        if (this.erLevende()) {
            if (this.antLevendeNaboer < 2 || this.antLevendeNaboer > 3) {
                this.settDød(); 
            }
        } else { 
            if (this.antLevendeNaboer == 3) {
                this.settLevende(); 
            }
        }
    }
}



