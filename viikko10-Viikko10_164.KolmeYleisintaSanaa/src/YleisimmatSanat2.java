
import java.util.List;

public class YleisimmatSanat2 implements ToistonTunnistin {

    YleisimmatSanat2() {
    }

    public List<String> yleisetSanat(List<String> sanat) {
        return null;
    }
    
    private int monestikkoSanaLoytyy(String haettava, List<String> sanat) {
        int monestikko = 0;
        for(String sana : sanat) {
            if(sana.equals(haettava)) {
                monestikko++;
            }
        }
        return monestikko;
    }
}
