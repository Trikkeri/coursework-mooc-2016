
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Numerotiedustelu {
    
    private List<Henkilo> henkilot;
    
    public Numerotiedustelu() {
        this.henkilot = new ArrayList<>();
    }
    
    public void lisaaNumero(String nimi, String numero) {
        lisaaHenkiloJosEiOlemassa(nimi);  
        
        if(onkoHenkiloOlemassa(nimi)) {
            Henkilo hk = palautaHenkiloHenkiloJosOlemassa(nimi);
            hk.lisaaNumero(numero);
        }
    }
    
    public List<String> haeNumeroaNimella(String nimi) { 
        if(onkoHenkiloOlemassa(nimi)) {
            Henkilo hk = palautaHenkiloHenkiloJosOlemassa(nimi);
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
        
        if(onkoHenkiloOlemassa(nimi)) {
            Henkilo hk = palautaHenkiloHenkiloJosOlemassa(nimi);
            hk.lisaaOsoite(katu, kaupunki);
        }
    }

    private void lisaaHenkiloJosEiOlemassa(String nimi) {
        if(!this.onkoHenkiloOlemassa(nimi)) {
            this.henkilot.add(new Henkilo(nimi));
        }
    }
    
    public Map<String, String> haeHenkilonOsoitteet(String nimi) {
        if(onkoHenkiloOlemassa(nimi)) {
            Henkilo hk = palautaHenkiloHenkiloJosOlemassa(nimi);
            return hk.haeOsoitteet();
        }    
        return null;
    }
    
    public void poistaHenkilo(String nimi) {      
        if(onkoHenkiloOlemassa(nimi)) {
            Henkilo hk = palautaHenkiloHenkiloJosOlemassa(nimi);
            this.henkilot.remove(hk);
            return;
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
    
    private Henkilo palautaHenkiloHenkiloJosOlemassa(String nimi) {
        for(Henkilo hk : this.henkilot) {
            if(hk.haeNimi().equals(nimi)) {
                return hk;
            }
        }
        return null;
    }
    
    public List<Henkilo> haeJaPalautaHenkiloJoissaSamaString(String hakusana) {
        List<Henkilo> hakutulokset = new ArrayList<>();
        
        if(hakusana.isEmpty()) {
            Collections.sort(henkilot);
            return henkilot;
        } else {
            for(Henkilo hk : this.henkilot) {
                if(hk.haeNimi().contains(hakusana) || 
                        hk.haeNumerot().contains(hakusana) || 
                        hk.haeOsoitteet().containsKey(hakusana) || 
                        hk.haeOsoitteet().containsValue(hakusana)) {
                    hakutulokset.add(hk);
                }
            }
        }
        Collections.sort(hakutulokset);
        return hakutulokset;
    }
    
}
