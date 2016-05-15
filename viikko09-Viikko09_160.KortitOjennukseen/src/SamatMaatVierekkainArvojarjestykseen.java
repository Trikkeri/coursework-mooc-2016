
import java.util.Comparator;

public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {
    public int compare(Kortti k1, Kortti k2) {
        
//        System.out.println(k1.compareTo(k2));
//        return k1.compareTo(k2);
        
        if(k1.getMaa() == k2.getMaa()) {
            return k1.getArvo() - k2.getArvo();
        } else {
            return k1.getMaa() - k2.getMaa();
        }
    }
}
