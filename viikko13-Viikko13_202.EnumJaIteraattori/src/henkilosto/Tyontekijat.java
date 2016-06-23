package henkilosto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tyontekijat {
    
    private List<Henkilo> tyontekijat;
    
    public Tyontekijat() {
        this.tyontekijat = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava) {
        if(tyontekijat.contains(lisattava)) {
            return;
        }
        
        tyontekijat.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattava) {
        Iterator<Henkilo> lisattavat = lisattava.iterator();
        
        while(lisattavat.hasNext()) {
            Henkilo lisattavaTyontekija = lisattavat.next();
            
            if(!tyontekijat.contains(lisattavaTyontekija)) {
                tyontekijat.add(lisattavaTyontekija);
            }
        }
    }
    
    public void tulosta() {
        Iterator<Henkilo> iter = this.tyontekijat.iterator();
        
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iter = this.tyontekijat.iterator();
        
        while(iter.hasNext()) {
            Henkilo tyontekija = iter.next();
            
            if(tyontekija.getKoulutus() == koulutus) {
                
                System.out.println(tyontekija);
            }
        }
    }
    
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iter = this.tyontekijat.iterator();
        
        while(iter.hasNext()) {
            
            if(iter.next().getKoulutus() == koulutus) {
                iter.remove();
            }
        }
    }
    
}
