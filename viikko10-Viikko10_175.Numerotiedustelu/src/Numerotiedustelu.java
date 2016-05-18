
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Numerotiedustelu {
    
    private List<Henkilo> henkilot;
    
    public Numerotiedustelu() {
        this.henkilot = new ArrayList<>();
    }
    
    public void lisaaNumero(String nimi, String numero) {
        
        lisaaHenkiloJosEiOlemassa(nimi);  
        
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equalsIgnoreCase(nimi)) {
                hk.lisaaNumero(numero);
            }
        }
    }
    
    public List<String> haeNumeroaNimella(String nimi) { 
 
        if(onkoHenkiloOlemassa(nimi)) {
            Henkilo hk = palautaHenkiloOlioJosOlemassa(nimi);
            return hk.haeNumerot();
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
        lisaaHenkiloJosEiOlemassa(nimi);
        
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equalsIgnoreCase(nimi)) {
                hk.lisaaOsoite(katu, kaupunki);
            }
        }
    }

    private void lisaaHenkiloJosEiOlemassa(String nimi) {
        if(!this.onkoHenkiloOlemassa(nimi)) {
            this.henkilot.add(new Henkilo(nimi));
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
                return;
            }
        }
    }
    
    public boolean onkoHenkiloOlemassa(String nimi) {
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equals(nimi)) {
                return true;
            }
        }
        return false;
    }
    
    private Henkilo palautaHenkiloOlioJosOlemassa(String nimi) {
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equals(nimi)) {
                return hk;
            }
        }
        return null;
    }
}
