import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class Lenkeliste<E> implements Liste<E> {
    Node starten;

    class Node{
        E element;
        Node forrige = null;
        Node neste = null;
        Node(E element){
            this.element = element;
        }
    }

    @Override
    public int størrelse() {                             
        int counter = 0;
        Node aktuell = starten;
        while(aktuell!=null){
            counter++;
            aktuell = aktuell.neste;
        }
        return counter;
    }

    @Override
    public void leggTil(E element) {
        if(starten == null){
            starten = new Node(element);
        } else{
            Node aktuell = starten;
            while(aktuell.neste != null){
                aktuell = aktuell.neste;
            }
            Node ny = new Node(element);
            aktuell.neste = ny;
            ny.forrige = aktuell;
        }
    }
    @Override
    public E fjern() {
        if(starten == null){
            throw new UgyldigListeindeks(-1);
        } else{
            E fjernetElement = starten.element;
            starten = starten.neste;
            if (starten != null) { 
                starten.forrige = null;
            }
            return fjernetElement;
        }
    }
    @Override
    public E hent() {
        if(starten == null){
            throw new UgyldigListeindeks(-1);
        } else{
            return starten.element;
        }
     }
     @Override
     public String toString() {
        String output = "";
        Node aktuell = starten;
        while(aktuell != null){
            output += aktuell.element;
            aktuell = aktuell.neste;
        }
        return "Streng av elementene i listen er:\n" + output.trim();
     }
     @Override
     public Iterator<E> iterator() {
         return new ListeIterator();
     }
     private class ListeIterator implements Iterator<E>{
        Node ståsted = starten;

        public boolean hasNext() {
            return ståsted != null;
        }
        public E next(){
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            E element = ståsted.element;
            ståsted = ståsted.neste;
            return element;
        }
     }
}
