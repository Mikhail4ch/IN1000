public class Stabel <E> extends Lenkeliste<E> {
    @Override
    public void leggTil(E element) {
        Node ny = new Node(element);
        if(starten==null){
            starten = new Node(element);
        } else{
            ny.neste = starten;
            starten.forrige = ny;
            starten = ny;
        }
    }
}
