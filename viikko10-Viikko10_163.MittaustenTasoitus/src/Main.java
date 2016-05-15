
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        Henkilo h1 = new Henkilo("Esko", 1.75, 999, 95);
        Henkilo h2 = new Henkilo("Markku", 1.90, 80, 102);
        Henkilo h3 = new Henkilo("Perkko", 1.90, 80, 98);
        Henkilo h4 = new Henkilo("Herkka", 1.90, 80, 88);
        Henkilo h5 = new Henkilo("Terppo", 1.90, 80, 105);
        
        ArrayList<Henkilo> henkilot = new ArrayList<>();
        List<Double> tulokset = new ArrayList<>();
        
        henkilot.add(h1);
        henkilot.add(h2);
        henkilot.add(h3);
        henkilot.add(h4);
        henkilot.add(h5);
        
        MittaustenTasoittaja2 mt = new MittaustenTasoittaja2();
        System.out.println(mt.tasoita(henkilot));
        
    }

}
