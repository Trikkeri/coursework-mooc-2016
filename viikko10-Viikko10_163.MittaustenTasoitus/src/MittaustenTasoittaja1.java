
import java.util.ArrayList;
import java.util.List;

public class MittaustenTasoittaja1 implements Tasoittava {

    MittaustenTasoittaja1() {
    }

    public List<Double> tasoita(List<Henkilo> henkilotiedot) {
        
        List<Integer> sykkeet = new ArrayList<>();
        List<Double> tasoitetut = new ArrayList<>();
        
        for(Henkilo hk : henkilotiedot) {
            sykkeet.add(hk.getSyke());
        }
        
        // Asetetaan palautettevaan taulukkoon sykkeet taulukon eka arvo
        tasoitetut.add((double) sykkeet.get(0));
        for (int i = 1; i < sykkeet.size() - 1; i++) {
            System.out.println(i);
            tasoitetut.add(tasoitaArvo(sykkeet.get(i - 1), sykkeet.get(i), sykkeet.get(i + 1)));
        }
        // Asetetaan palautettavan taulukon loppuun sykkeet taulukon viimeinen arvo
        tasoitetut.add((double) sykkeet.get(sykkeet.size() - 1));
        return tasoitetut;
    }
    
    public double tasoitaArvo(int eka, int toka, int kolmas) {
        System.out.println((eka + toka + kolmas) / 3);
             
        return ((double) eka + (double) toka + (double) kolmas) / 3;
    }
}
