
public class Main {
    public static void main(String[] args) {
        // testaa täällä luokkiesi toimintaa
        Laatikko laatikko = new Laatikko(20.0);

        laatikko.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2)) ;
        laatikko.lisaa(new Kirja("Robert Martin", "Clean Code", 1));
        laatikko.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));
        laatikko.lisaa(new Kirja("Raskasta luettavaa", "Perkele", 110.0));

        laatikko.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
        laatikko.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
        laatikko.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));
        laatikko.lisaa(new Laatikko(10.0));

        Laatikko laatikko2 = new Laatikko(15.0);
        laatikko2.lisaa(new Kirja("Inseptioni", "Oooo", 5.5));
        laatikko2.lisaa(new Kirja("Kevyttä luettavaa", "Perkeletus", 2.5));
        laatikko.lisaa(laatikko2);
    
        System.out.println(laatikko);
    }
    
}
