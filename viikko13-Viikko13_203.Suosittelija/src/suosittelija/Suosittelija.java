package suosittelija;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.comparator.ElokuvaComparator;
import suosittelija.domain.Arvio;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Henkilo;

public class Suosittelija {
    
    private ArvioRekisteri arviorekisteri;
    
    public Suosittelija(ArvioRekisteri arviorekisteri) {
        this.arviorekisteri = arviorekisteri;
    }
    
    public Elokuva suositteleElokuva(Henkilo henkilo) {

        Map<Elokuva, List<Arvio>> elokuvienArviot = new HashMap<>();
        elokuvienArviot = this.arviorekisteri.elokuvienArviot();
        
        // Jos ei ole arvioinut yhtään elokuvaa niin suositellaan korkeiten arvosteltua elokuvaa
        if (!this.arviorekisteri.arvioijat().contains(henkilo)) {
            
            List<Elokuva> elokuvat = new ArrayList<>();
        
            for (Elokuva e : elokuvienArviot.keySet()) {
                elokuvat.add(e);
            }
        
            Collections.sort(elokuvat, new ElokuvaComparator(elokuvienArviot));
        
            return elokuvat.get(0);
        }
        
        return null;
    }    
}
