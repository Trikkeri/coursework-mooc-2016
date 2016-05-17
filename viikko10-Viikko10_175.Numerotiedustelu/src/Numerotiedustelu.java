
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Numerotiedustelu {
    
    private List<Henkilo> henkilot;
    
    public Numerotiedustelu() {
        this.henkilot = new ArrayList<>();
    }
    
    public void lisaaNumero(String nimi, String numero) {
        
        if(!this.henkilot.contains(nimi)) {
            this.henkilot.add(new Henkilo(nimi));
        }
        
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equalsIgnoreCase(nimi)) {
                hk.lisaaNumero(numero);
            }
        }
    }
    
    public List<String> haeNumeroaNimella(String nimi) {
        
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equalsIgnoreCase(nimi)) {
                return hk.haeNumerot();
            }
        }
        return null;
    }
    
    public String haeNimeaNumerolla(String numero) {
        
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNumerot().contains(numero)) {
                return hk.haeNimi();
            }
        }
        
        return null;
    }
    
    public void lisaaOsoite(String nimi, String katu, String kaupunki) {
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equalsIgnoreCase(nimi)) {
                hk.lisaaOsoite(katu, kaupunki);
            }
        }
    }
    
    public Map<String, String> haeHenkilonOsoitteet(String nimi) {
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equalsIgnoreCase(nimi)) {
                return hk.haeOsoitteet();
            }
        }
        return null;
    }
    
    public void poistaHenkilo(String nimi) {
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equalsIgnoreCase(nimi)) {
                this.henkilot.remove(hk);
            }
        }
    }
    
    
}
