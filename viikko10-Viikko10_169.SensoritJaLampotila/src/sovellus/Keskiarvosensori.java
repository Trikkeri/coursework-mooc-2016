package sovellus;

import java.util.ArrayList;
import java.util.List;

public class Keskiarvosensori implements Sensori {

    private List<Sensori> sensorit;
    private List<Integer> mittaukset;
    
    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }
    
    @Override
    public boolean onPaalla() {
        
        for(Sensori s : this.sensorit) {
            if(s.onPaalla()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void paalle() {
        for(Sensori s : this.sensorit) {
            s.paalle();
        }
    }

    @Override
    public void poisPaalta() {
        for(Sensori s : this.sensorit) {
            s.poisPaalta();
        }
    }

    @Override
    public int mittaa() {
        
        if(this.sensorit.isEmpty()) {
            throw new IllegalStateException("Keskiarvosensori ei sisällä ainuttakaan sensoria!");
        } else {
            int mittausarvojenSumma = 0;
            int tulos = 0;
            for(Sensori s : this.sensorit) {
                
                if(!s.onPaalla()) {
                    throw new IllegalStateException("Jokin sensori on pois päältä!");
                } else {
                    mittausarvojenSumma += s.mittaa();
                }
                
            }
            tulos = mittausarvojenSumma / this.sensorit.size();
            this.mittaukset.add(tulos);
            return tulos;
        }
    }
    
    public void lisaaSensori(Sensori lisattava) {
        sensorit.add(lisattava);
    }
    
    public List<Integer> mittaukset() {
        return this.mittaukset;
    }
    
}
