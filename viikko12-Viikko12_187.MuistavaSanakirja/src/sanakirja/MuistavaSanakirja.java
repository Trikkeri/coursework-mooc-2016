package sanakirja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MuistavaSanakirja {
    
    Map<String, String> sanakirja;
    
    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
    }
    
    public MuistavaSanakirja(String tiedosto) {
        
    }
    
    public void lisaa(String sana, String kaannos) {
        if(!this.sanakirja.containsKey(sana)) {
            this.sanakirja.put(sana, kaannos);
        }
    }
    
    public String kaanna(String sana) {

        for (Map.Entry<String, String> entry : this.sanakirja.entrySet()) {
            if(entry.getKey().equals(sana)) {
                return entry.getValue();
            }
            if(entry.getValue().equals(sana)) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    public void poista(String sana) {
        
        ArrayList<String> poistettavatSanat = new ArrayList<>();
        
        for (Map.Entry<String, String> entry : this.sanakirja.entrySet()) {
            if(entry.getKey().equals(sana)) {
                poistettavatSanat.add(entry.getKey());
            }
            if(entry.getValue().equals(sana)) {
                poistettavatSanat.add(entry.getKey());
            }
        }
        
        for (int i = 0; i < poistettavatSanat.size(); i++) {
            this.sanakirja.remove(poistettavatSanat.get(i));
        }
    }
    
}
