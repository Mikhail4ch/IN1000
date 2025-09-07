class Prioritetskø <E extends Comparable<E>> extends Lenkeliste<E> {
    @Override
    public void leggTil(E element) {
        Node aktuell = starten;
        Node ny = new Node(element);
        if (starten == null || starten.element.compareTo(element) > 0) {
            ny.neste = starten;
            if (starten != null) {
                starten.forrige = ny;
            }
            starten = ny;
            return;
        }
        while (aktuell.neste != null && aktuell.neste.element.compareTo(element) <= 0) {
            aktuell = aktuell.neste;
        }

        ny.neste = aktuell.neste;
        ny.forrige = aktuell;

        if (aktuell.neste != null) {
            aktuell.neste.forrige = ny;
        }
        aktuell.neste = ny;
    }
}