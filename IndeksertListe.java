public class IndeksertListe<E> extends Lenkeliste<E> {
    public void leggTil (int pos, E x) {
        if(pos < 0 || pos > størrelse()){
            throw new UgyldigListeindeks(pos);
        }
        if (størrelse()==0 || pos == størrelse()){
            super.leggTil(x);
            return;
        }
        if (pos == 0) {
            Node ny = new Node(x);
            ny.neste = starten;
            if (starten != null) {
                starten.forrige = ny;
            }
            starten = ny;
            return;
        }
        Node aktuell = starten;
        for(int i=0; i < pos-1; i++){
            aktuell = aktuell.neste;
        }
        Node ny = new Node(x);
        ny.neste = aktuell.neste;
        ny.forrige = aktuell;
        if (aktuell.neste != null) {
            aktuell.neste.forrige = ny;
        }
        aktuell.neste = ny;
      }
    public void sett (int pos, E x) {
        if(pos < 0 || pos >= størrelse()){
            throw new UgyldigListeindeks(pos);
        }
        Node aktuell = starten;
        for (int i = 0; i < pos; i++) {
            aktuell = aktuell.neste;
        }
        aktuell.element = x;
    }
    public E hent (int pos) { 
        if(pos < 0 || pos > størrelse()){
            throw new UgyldigListeindeks(pos);
        }
        Node aktuell = starten;
        for (int i = 0; i < pos; i++) {
            aktuell = aktuell.neste;
        }
        return aktuell.element;
     }
    
    public E fjern (int pos) {
        if(pos < 0 || pos > størrelse()){
            throw new UgyldigListeindeks(pos);
        }
        if(pos==0){
            return super.fjern();
        }
        Node aktuell = starten;
        for (int i = 0; i < pos; i++) {
            aktuell = aktuell.neste;
        }

        aktuell.forrige.neste = aktuell.neste;

        if (aktuell.neste != null) {
            aktuell.neste.forrige = aktuell.forrige;
        }

        return aktuell.element;
      }
    }


 
        