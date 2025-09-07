interface Liste<E> extends Iterable<E> {
    int størrelse ();
    void leggTil (E x);
    E hent ();
    E fjern ();
    }
    
