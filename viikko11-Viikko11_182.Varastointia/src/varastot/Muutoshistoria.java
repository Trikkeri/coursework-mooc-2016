package varastot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Muutoshistoria {
    private List<Double> muutoshist;
    
    public Muutoshistoria() {
        this.muutoshist = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        this.muutoshist.add(tilanne);
    }
    
    public void nollaa() {
        this.muutoshist.clear();
    }
    
    public String toString() {
        return this.muutoshist.toString();
    }
    
    public double maxArvo() { 
        
        if(this.muutoshist.isEmpty()) {
            return 0;
        }
        
        double suurin = this.muutoshist.get(0);
        
        for (int i = 0; i < this.muutoshist.size(); i++) {
            if(suurin < this.muutoshist.get(i)) {
                suurin = this.muutoshist.get(i);
            }
        }
        return suurin;
    }
    
    public double minArvo() {  
        
        if(this.muutoshist.isEmpty()) {
            return 0;
        }
        
        double pienin = this.muutoshist.get(0);
        for (int i = 0; i < this.muutoshist.size(); i++) {
            if(pienin > this.muutoshist.get(i)) {
                pienin = this.muutoshist.get(i);
            }
        }
        return pienin;
    }
    
    public double keskiarvo() {    
        
        if(this.muutoshist.isEmpty()) {
            return 0;
        }
        
        double summa = 0;
        
        for (int i = 0; i < this.muutoshist.size(); i++) {
            summa += this.muutoshist.get(i);
        }
        
        return summa / this.muutoshist.size();
    }
    
    public double suurinMuutos() {   
        
        if(this.muutoshist.size() <= 1) {
            return 0;
        }
        
        ArrayList<Double> muutokset = new ArrayList<>();
 
        for (int i = 0; i < this.muutoshist.size(); i++) {
            
            if(i < this.muutoshist.size() - 1) {
                muutokset.add(this.muutoshist.get(i) - this.muutoshist.get(i + 1));
            }
        }
        
        Collections.sort(muutokset);
        
        return Math.abs(muutokset.get(0));
    }
    
    public double varianssi() {
        
        if(this.muutoshist.size() <= 1) {
            return 0;
        }
        
        double keskiarvo = this.keskiarvo();
        
        double valisumma = 0;
        for (int i = 0; i < this.muutoshist.size(); i++) {
            valisumma = valisumma + Math.pow((this.muutoshist.get(i) - keskiarvo), 2);
        }
        return valisumma / (this.muutoshist.size() - 1);   
    }
    
}
