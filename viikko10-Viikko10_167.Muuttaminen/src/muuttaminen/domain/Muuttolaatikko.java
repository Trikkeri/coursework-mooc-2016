package muuttaminen.domain;

import java.util.ArrayList;
import java.util.List;

public class Muuttolaatikko implements Tavara {
    private int maksimitilavuus;
    private List<Tavara> laatikko;
    
    public Muuttolaatikko(int maksimitilavuus) {
        this.maksimitilavuus = maksimitilavuus;
        this.laatikko = new ArrayList<>();
    }
    
    public boolean lisaaTavara(Tavara tavara) {    
        
        if(getTilavuus() < maksimitilavuus &&
                tavara.getTilavuus() + getTilavuus() <= maksimitilavuus) {
            this.laatikko.add(tavara);
            return true;
        }
        return false;
    }

    @Override
    public int getTilavuus() {
        int temptilavuus = 0;
        
        for (Tavara tavara : this.laatikko) {
            temptilavuus += tavara.getTilavuus();
        }
        return temptilavuus;
    }
    
    @Override
    public String toString() {
        String tavarat = "";
        for (Tavara tavara : laatikko) {
            tavarat += " " + tavara.toString();
        }
        return tavarat;
    }
    
}
