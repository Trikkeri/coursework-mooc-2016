
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Henkilo implements Comparable<Henkilo> {
    private String nimi;
    private List<String> numerot;
    private Map<String, String> osoitteet;
    
    public Henkilo(String nimi) {
        this.nimi = nimi;
        this.numerot = new ArrayList<>();
        this.osoitteet = new HashMap<>();
    }
    
    public void lisaaNumero(String numero) {
        this.numerot.add(numero);
    }
    
    public String haeNimi() {
        return this.nimi;
    }
    
    public List<String> haeNumerot() {
        return this.numerot;
    }
    
    public void lisaaOsoite(String katu, String kaupunki) {
        if(!this.osoitteet.containsKey(katu)) {
            this.osoitteet.put(katu, kaupunki);
        }
    }
    
    public Map<String, String> haeOsoitteet() {
        return this.osoitteet;
    }
    
    @Override
    public int compareTo(Henkilo henkilo) {
        return this.nimi.compareTo(henkilo.nimi);
    }
}
