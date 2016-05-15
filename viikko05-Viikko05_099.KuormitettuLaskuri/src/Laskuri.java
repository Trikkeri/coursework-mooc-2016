/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Laskuri {
 
    private boolean tarkistus;
    private int arvo;
    
    public Laskuri(int alkuarvo, boolean tarkistus) {
        this.arvo = alkuarvo;
        this.tarkistus = tarkistus;
    }
    
    public Laskuri(int alkuarvo) {
        this(alkuarvo, false);
    }
    
    public Laskuri(boolean tarkistus) {
        this(0, tarkistus);
    }
    
    public Laskuri() {
        this.arvo = 0;
        this.tarkistus = false;
    }
    
    public int arvo(){
        return this.arvo;
    }
    
    public void lisaa() {
        lisaa(1);
    }
    
    public void vahenna() {
        vahenna(1);
    }
    
    public void lisaa(int lisays) {   
        if (lisays > 0) {
            this.arvo += lisays;
        } 
    }
    
    public void vahenna(int vahennys) {

        if (vahennys <0) {
            return;
        }
        
        this.arvo -= vahennys;
        
        if (this.arvo < 0 && tarkistus) {
            this.arvo = 0;
        }
    }
    
    @Override
    public String toString() {
        return "Arvo on: " + this.arvo();
    }
    
}
