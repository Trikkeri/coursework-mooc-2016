
import siirrettava.Elio;
import siirrettava.Lauma;



public class Paaohjelma {

    public static void main(String[] args) {
        //kokeile ohjelman toimintaa täällä
//        Elio elio = new Elio(20, 30);
//        System.out.println(elio);
//        elio.siirra(-10, 5);
//        System.out.println(elio);
//        elio.siirra(50, 20);
//        System.out.println(elio);

        Elio elio = new Elio(5, 10);
        elio.siirra(1, 0);
        System.out.println(elio);


//        Lauma lauma = new Lauma();
//        lauma.lisaaLaumaan(new Elio(73, 56));
//        lauma.lisaaLaumaan(new Elio(57, 66));
//        lauma.lisaaLaumaan(new Elio(46, 52));
//        lauma.lisaaLaumaan(new Elio(19, 107));
//        System.out.println(lauma);
    }
}
