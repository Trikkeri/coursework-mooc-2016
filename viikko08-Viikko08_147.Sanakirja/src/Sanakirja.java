
import java.util.ArrayList;
import java.util.HashMap;

public class Sanakirja {
    private HashMap<String, String> sanat;
    
    public Sanakirja() {
        this.sanat = new HashMap<>();
    }
    
    public String kaanna(String sana) {
        return this.sanat.get(sana);
    }
    
    public void lisaa(String sana, String kaannos) {
        this.sanat.put(sana, kaannos);
    }
    
    public int sanojenLukumaara() {
        return this.sanat.size();
    }
    
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> sanalista = new ArrayList<>();
        
        for(String avain : this.sanat.keySet()) {
            sanalista.add(avain + " = " + this.sanat.get(avain));
        }
        
        return sanalista;
    }
}
