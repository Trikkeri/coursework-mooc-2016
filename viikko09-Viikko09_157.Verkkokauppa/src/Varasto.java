
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Varasto {
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldo;
    
    public Varasto() {
        this.hinnat = new HashMap<>();
        this.saldo = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinnat.put(tuote, hinta);
        this.saldo.put(tuote, saldo);
    }
    
    public int hinta(String tuote) {
        if(this.hinnat.containsKey(tuote)) {
            return this.hinnat.get(tuote);
        }     
        return -99;
    }
    
    public int saldo(String tuote) {
        if(this.saldo.containsKey(tuote)) {
            return this.saldo.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote) {
        
        if(this.saldo.containsKey(tuote)) {
            if(this.saldo.get(tuote) > 0) {
                this.saldo.replace(tuote, this.saldo.get(tuote) - 1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> tuotteet() {
        return this.hinnat.keySet();
    }
}
