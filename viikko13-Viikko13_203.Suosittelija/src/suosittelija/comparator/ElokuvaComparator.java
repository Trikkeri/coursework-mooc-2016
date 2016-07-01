package suosittelija.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Arvio;
import suosittelija.domain.Elokuva;

public class ElokuvaComparator implements Comparator<Elokuva> {

    private Map<Elokuva, List<Arvio>> arviot;
    
    public ElokuvaComparator(Map<Elokuva, List<Arvio>> arviot) {
        this.arviot = arviot;
        
    }
    
    @Override
    public int compare(Elokuva t, Elokuva t1) {
        int tSumma = arvioidenSumma(t);
        int t1Summa = arvioidenSumma(t1);
//        System.out.println("eka summa " + tSumma);
//        System.out.println("toka summa " + t1Summa);
        
        double tKeskiarvo = arvoidenKeskiarvo(tSumma, arviot.get(t).size());
        double t1Keskiarvo = arvoidenKeskiarvo(t1Summa, arviot.get(t1).size());
//        System.out.println("eka keskiarvo " + tKeskiarvo);
//        System.out.println("toka keskiarvo " + t1Keskiarvo);
        
        System.out.println(t.getNimi() + " keskiarvo " + tKeskiarvo);
        System.out.println(t1.getNimi() + " keskiarvo " + t1Keskiarvo);
        
        if(tKeskiarvo > t1Keskiarvo ) {
            return -1;
        } else if (tKeskiarvo == t1Keskiarvo) {
            return 0;
        } else {
            return 1;
        }
    }
    
    private int arvioidenSumma(Elokuva t) {
        int summa = 0;
        
        for (Elokuva e : this.arviot.keySet()) {
            if(e.equals(t)) {
                for (int i = 0; i < this.arviot.get(e).size(); i++) {
                    summa += this.arviot.get(e).get(i).getArvo();
                }
            }
        }
        
        return summa;
    }

    private double arvoidenKeskiarvo(int summa, int jakaja) {
        return (double) summa / jakaja;
    }
    
}
