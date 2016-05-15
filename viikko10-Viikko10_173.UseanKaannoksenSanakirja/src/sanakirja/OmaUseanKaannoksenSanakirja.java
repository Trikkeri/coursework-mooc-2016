package sanakirja;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OmaUseanKaannoksenSanakirja implements UseanKaannoksenSanakirja {
    
    private Map<String, Set<String>> sanat;
    
    public OmaUseanKaannoksenSanakirja() {
        this.sanat = new HashMap<>();
    }

    @Override
    public void lisaa(String sana, String kaannos) {
        
        if(!this.sanat.containsKey(sana)) {
            this.sanat.put(sana, new HashSet<>());
        }
        this.sanat.get(sana).add(kaannos);
    }

    @Override
    public Set<String> kaanna(String sana) {
        return sanat.get(sana);
    }

    @Override
    public void poista(String sana) {
        if(this.sanat.containsKey(sana)) {
            this.sanat.remove(sana);
        }
    }
    
}
