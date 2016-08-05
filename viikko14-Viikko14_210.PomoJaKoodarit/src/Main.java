
public class Main {

    public static void main(String[] args) {
        Koodari jenna = new Koodari("Jenna", 1000);
        Koodari kalle = new Koodari("Kalle", 1000);
        Koodari pauli = new Koodari("Pauli", 1000);
        Koodari arto = new Koodari("Arto", 1000);
        Koodari matti = new Koodari("Matti", 1000);

        Pomo jarmo = new Pomo("Jarmo", 2000);
        jarmo.lisaaAlainen(jenna);
        jarmo.lisaaAlainen(kalle);
        jarmo.lisaaAlainen(pauli);

        Pomo pekka = new Pomo("Pekka", 2000);
        pekka.lisaaAlainen(arto);
        pekka.lisaaAlainen(matti);

        Pomo maija = new Pomo("Maija", 4000);
        maija.lisaaAlainen(jarmo);
        maija.lisaaAlainen(pekka);

        jenna.lisaaKieli("Fortran");
        kalle.lisaaKieli("Prolog");
        kalle.lisaaKieli("C");
        pauli.lisaaKieli("Haskell");
        arto.lisaaKieli("Java");
        matti.lisaaKieli("Java");
        jarmo.lisaaKieli("Ruby");
        pekka.lisaaKieli("C++");
        maija.lisaaKieli("Cobol");

        System.out.println(maija.onkoTaitoa("C"));
        System.out.println(maija.onkoTaitoa("Cobol"));
        System.out.println(maija.onkoTaitoa("Python"));
        System.out.println(maija.onkoTaitoa("Java"));
    }
}
