
import java.util.HashMap;
import java.util.Map;

public class Ostoskori {
    private Map<String, Ostos> ostokset;
    
    public Ostoskori() {
        this.ostokset = new HashMap<String, Ostos>();
    }
    
    public void lisaa(String tuote, int hinta) {        
        if(this.ostokset.containsKey(tuote)) {
            int korvattavaHinta = this.ostokset.get(tuote).hinta() + hinta;
            
            for(Ostos ostos : this.ostokset.values()) {
                if(ostos.toString().startsWith(tuote)) {
                    ostos.kasvataMaaraa();
                }
            }
        } else {
            this.ostokset.put(tuote, new Ostos(tuote, 1, hinta));  
        }
    }
    
    public int hinta() {
        int hinta = 0;
        for(Ostos ostos : this.ostokset.values()) {
            hinta += ostos.hinta();
        }
        return hinta;
    }
    
    public void tulosta() {
        for(Ostos ostos : this.ostokset.values()) {
            System.out.println(ostos);
        }
    }
}
