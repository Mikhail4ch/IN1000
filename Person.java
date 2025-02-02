class Person {
    private Bil3 bil;
    public Person(Bil3 bil) {
        this.bil = bil;
    }
    public void skrivNummer () {
        System.out.println(this.bil.hentNummer());
    }
}


