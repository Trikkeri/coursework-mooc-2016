package suosittelija.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArvioRekisteri {
    
    private Map<Elokuva, List<Arvio>> rekisteri;
            
    public ArvioRekisteri() {
        this.rekisteri = new HashMap();
    }
    
    public void lisaaArvio(Elokuva elokuva, Arvio arvio) {
        if(!rekisteri.containsKey(elokuva)) {
            rekisteri.put(elokuva, new ArrayList<>());
        }
        rekisteri.get(elokuva).add(arvio);
    }
    
    public List<Arvio> annaArviot(Elokuva elokuva) {
        List<Arvio> elokuvanArviot = new ArrayList<>();
        
        for (Elokuva e : this.rekisteri.keySet()) {
            if(e.equals(elokuva)) {
                
                for (int i = 0; i < this.rekisteri.get(e).size(); i++) {
                    elokuvanArviot.add(this.rekisteri.get(e).get(i));
                }
            }
        }
        return elokuvanArviot;
    }
    
    public Map<Elokuva, List<Arvio>> elokuvienArviot() {
        return rekisteri;
    }
    
}
