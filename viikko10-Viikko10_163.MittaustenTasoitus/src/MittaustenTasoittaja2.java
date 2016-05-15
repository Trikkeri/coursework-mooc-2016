
import java.util.ArrayList;
import java.util.List;

public class MittaustenTasoittaja2 implements Tasoittava {

    MittaustenTasoittaja2() {
    }

    public List<Double> tasoita(List<Henkilo> henkilotiedot) {
        List<Double> sykkeet = new ArrayList<>();
        List<Double> tasoitettavat = new ArrayList<>();
        
        for(Henkilo hk : henkilotiedot) {
            sykkeet.add((double) hk.getSyke());
        }
        
        for (int i = 0; i < sykkeet.size(); i++) {
            tasoitettavat.add(sykkeet.get(i));
        }
        
        
        for (int i = 1; i < sykkeet.size() - 1; i++) {
            System.out.println(i);
            sykkeet.set(i ,tasoitaArvo(tasoitettavat.get(i - 1), tasoitettavat.get(i), tasoitettavat.get(i + 1)));
        }
        return sykkeet;
    }
    
    public double tasoitaArvo(double eka, double toka, double kolmas) {
        System.out.println((eka + toka + kolmas) / 3);
             
        return (eka + toka + kolmas) / 3;
    }
}
