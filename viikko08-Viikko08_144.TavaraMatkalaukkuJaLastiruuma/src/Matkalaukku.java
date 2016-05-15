
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Matkalaukku {
    private int maksimiPaino;
    private ArrayList<Tavara> tavarat;
    
    public Matkalaukku(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara) {
        int matkalaukunPaino = this.yhteispaino();
        matkalaukunPaino += tavara.getPaino();
        if(matkalaukunPaino <= this.maksimiPaino) {
            this.tavarat.add(tavara);
        }
    }
    
    public String toString() {
        
        if(this.tavarat.size() == 0) {
            return "ei tavaroita (" + this.yhteispaino() + " kg)";
        }   
        
        if(this.tavarat.size() == 1) {
            return this.tavarat.size() + " tavara (" + this.yhteispaino() + " kg)";
        }   
        
        return this.tavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
    }
    
    public void tulostaTavarat() {
        for(Tavara esine : this.tavarat) {
            System.out.println(esine);
        }
    }
    
    public int yhteispaino() {
        int yhteispaino = 0;
        
        for(Tavara esine : this.tavarat) {
            yhteispaino += esine.getPaino();
        }
        return yhteispaino;
    }
    
    public Tavara raskainTavara() {
        
        if(this.tavarat.isEmpty()) {
            return null;
        }
        
        Tavara raskainTavara = this.tavarat.get(0);
        for(Tavara esine : this.tavarat) {
            if(esine.getPaino() > raskainTavara.getPaino()) {
                raskainTavara = esine;
            }       
        }
        return raskainTavara;
    }
}
