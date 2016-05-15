package muuttaminen.logiikka;

import java.util.ArrayList;
import java.util.List;
import muuttaminen.domain.Muuttolaatikko;
import muuttaminen.domain.Tavara;

public class Pakkaaja {
    
    private int laatikonTilavuus;
    
    public Pakkaaja(int laatikonTilavuus) {
        this.laatikonTilavuus = laatikonTilavuus;
    }
    
    public List<Muuttolaatikko> pakkaaTavarat(List<Tavara> tavarat) {
        List<Muuttolaatikko> loota = new ArrayList<>();        
        
        for (Tavara tavara : tavarat) {
            Muuttolaatikko ml = new Muuttolaatikko(laatikonTilavuus);
            ml.lisaaTavara(tavara);
            loota.add(ml);
        }
        
        
//        // Pakataan tavarat jokainen eri laatikkoon
//        for (int i = 0; i < tavarat.size(); i++) {
//            Muuttolaatikko muuttolaatikko = new Muuttolaatikko(laatikonTilavuus); 
//            muuttolaatikko.lisaaTavara(tavarat.get(i));
//            loota.add(muuttolaatikko);
//        } 
        return loota;
    }
    
}
