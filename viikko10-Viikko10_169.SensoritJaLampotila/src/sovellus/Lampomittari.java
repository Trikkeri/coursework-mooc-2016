package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori {

    private int lampotila;
    private boolean tila;
    
    public Lampomittari() {
        this.lampotila = 0;
        this.tila = false;
    }
    
    @Override
    public boolean onPaalla() {
        return this.tila;
    }

    @Override
    public void paalle() {
        this.tila = true;
    }

    @Override
    public void poisPaalta() {
        this.tila = false;
    }

    @Override
    public int mittaa() {
        if(this.tila) {
            Random rnd = new Random();
        
            return rnd.nextInt(30 + 1 + 30) - 30;  
            
        } else {
            throw new IllegalStateException("Ei voi mitata, sillä lämpömittari ei ole päällä!");
        }
    }
    
}
