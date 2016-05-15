
import java.util.HashMap;

public class Velkakirja {
    private HashMap<String, Double> velat;
    
    public Velkakirja() {
        this.velat = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        this.velat.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka) {
        if(this.velat.containsKey(kuka)) {
            return this.velat.get(kuka);
        }
        
        return 0;      
    }
}
