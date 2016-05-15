package sovellus;


import sovellus.Keskiarvosensori;
import sovellus.Lampomittari;
import sovellus.Sensori;
import sovellus.Vakiosensori;

public class Main {
    
    public static void main(String[] args) {
//        Vakiosensori kymppi = new Vakiosensori(10);
//        Vakiosensori miinusViis = new Vakiosensori(-5);
//        
//        System.out.println(kymppi.mittaa());
//        System.out.println(miinusViis.mittaa());
//        
//        System.out.println(kymppi.onPaalla());
//        System.out.println(kymppi.onPaalla());

//        Lampomittari lamppis = new Lampomittari();
//        lamppis.paalle();
//        System.out.println(lamppis.mittaa());

//    Sensori kumpula = new Lampomittari();
//    Sensori kaisaniemi = new Lampomittari();
//    Sensori helsinkiVantaa = new Lampomittari();
//
//    Keskiarvosensori paakaupunki = new Keskiarvosensori();
//    paakaupunki.lisaaSensori(kumpula);
//    paakaupunki.lisaaSensori(kaisaniemi);
//    paakaupunki.lisaaSensori(helsinkiVantaa);
//
//    paakaupunki.paalle();
//    System.out.println("lämpötila Pääkaupunkiseudulla "+paakaupunki.mittaa() + " astetta");
//    System.out.println("lämpötila Pääkaupunkiseudulla "+paakaupunki.mittaa() + " astetta");
//    System.out.println("lämpötila Pääkaupunkiseudulla "+paakaupunki.mittaa() + " astetta");
//
//    System.out.println("mittaukset: "+paakaupunki.mittaukset());

        Keskiarvosensori ka = new Keskiarvosensori();
        ka.lisaaSensori(new Vakiosensori(3));
        ka.lisaaSensori(new Vakiosensori(7));
        System.out.println(ka.mittaa());
        System.out.println(ka.mittaukset());



    }
    
}
