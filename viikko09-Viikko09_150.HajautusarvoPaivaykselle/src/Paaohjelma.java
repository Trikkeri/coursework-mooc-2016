
import java.util.HashMap;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        HashMap<Paivays, String> paivat = new HashMap<>();

        Paivays olioPaivays = new Paivays(1, 12, 2000);
        paivat.put(olioPaivays, "P1");
        paivat.put(new Paivays(25,12, 2000), "P2");
        System.out.println(paivat.get(olioPaivays));
        System.out.println(paivat.get(new Paivays(1,12, 2000)));
        System.out.println(paivat.get(new Paivays(25,12, 2000)));
        
        
        
    }
}
