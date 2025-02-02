public class Celle{
    private Boolean status;
    private Celle naboer[];
    private int antNaboer;
    private int antLevendeNaboer;

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
        if(this.status) {
            return 'O';
        } else {
            return '.';
        }
    }
        
    public void leggTilNabo(Celle nabo){
        if(this.antNaboer < this.naboer.length){
            naboer[this.antNaboer] = nabo;
            this.antNaboer++;
        } else { System.out.println("full of neibhours");}   
    }

    public void tellLevendeNaboer(){
        this.antLevendeNaboer = 0;
        for(int i = 0; i < this.antNaboer; i++){
            if(this.naboer[i] != null && this.naboer[i].erLevende()){
                this.antLevendeNaboer++;
            }
        }
    }

    public void oppdaterStatus(){
        if(this.erLevende()){
            if(this.antLevendeNaboer == 2 || this.antLevendeNaboer == 3){
                this.settLevende();
            } else { this.settDød(); }

        } else{ 
            if(this.antLevendeNaboer == 3){
                this.settLevende();
            } else{ this.settDød();}
        }
    }
}



