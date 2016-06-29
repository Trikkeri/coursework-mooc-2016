package suosittelija;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Arvio;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Henkilo;

public class ArvioRekisteri {
    
    private Map<Elokuva, List<Arvio>> rekisteri;
    private Map<Henkilo, Map<Elokuva, Arvio>> henkiloidenArviot;
    
    public ArvioRekisteri() {
        this.rekisteri = new HashMap();
        this.henkiloidenArviot = new HashMap();
    }
    
    public void lisaaArvio(Elokuva elokuva, Arvio arvio) {
        if (!rekisteri.containsKey(elokuva)) {
            rekisteri.put(elokuva, new ArrayList<>());
        }
        rekisteri.get(elokuva).add(arvio);
    }
    
    public List<Arvio> annaArviot(Elokuva elokuva) {
        List<Arvio> elokuvanArviot = new ArrayList<>();
        
        for (Elokuva e : this.rekisteri.keySet()) {
            if(e.equals(elokuva)) {
                
                for (int i = 0; i < this.rekisteri.get(e).size(); i++) {
                    elokuvanArviot.add(this.rekisteri.get(e).get(i));
                }
            }
        }
        return elokuvanArviot;
    }
    
    public Map<Elokuva, List<Arvio>> elokuvienArviot() {
        return rekisteri;
    }
    
    public void lisaaArvio(Henkilo henkilo, Elokuva elokuva, Arvio arvio) {
        if (!henkiloidenArviot.containsKey(henkilo)) {
            henkiloidenArviot.put(henkilo, new HashMap<>());
        }
        henkiloidenArviot.get(henkilo).put(elokuva, arvio);
        this.lisaaArvio(elokuva, arvio);
    }
    
    public Arvio haeArvio(Henkilo henkilo, Elokuva elokuva) {
        
        Map<Elokuva, Arvio> henkilonArviot = new HashMap<>();
        
        henkilonArviot = henkiloidenArviot.get(henkilo);
        
        // Jos henkilo on arvostellut elokuvan
        if (henkilonArviot.containsKey(elokuva)) {
            return henkilonArviot.get(elokuva);
        }
        
        // Jos henkilö ei ole antanut arvioita
        return Arvio.EI_NAHNYT;
    }
    
    public Map<Elokuva, Arvio> annaHenkilonArviot(Henkilo henkilo) {
        
        if (henkiloidenArviot.containsKey(henkilo)) {
            return henkiloidenArviot.get(henkilo);
        }
        
        return Collections.emptyMap();
    }   
    
    public List<Henkilo> arvioijat() {
        
        List<Henkilo> arvioijat = new ArrayList<>();
        
        for (Henkilo h : this.henkiloidenArviot.keySet()) {
            arvioijat.add(h);
        }
        
        return arvioijat;
    }
}
