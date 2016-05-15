/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class YlhaaltaRajoitettuLaskuri {
    private int arvo;
    private int ylaraja;
    
    public YlhaaltaRajoitettuLaskuri(int ylarajanAlkuarvo) {
        this.arvo = 0;
        this.ylaraja = ylarajanAlkuarvo;
    }
    
    public void seuraava() {
        if(this.ylaraja > this.arvo) {
            this.arvo += 1;
        } else {
            this.arvo = 0;
        }
    }
    
    public String toString() {
        String merkkijono;
        merkkijono = String.valueOf(this.arvo);
        
        if(merkkijono.length() <= 1) {
            return "0" + this.arvo;
        }
        return "" + this.arvo; 
    }
    
    public int arvo() {
        return this.arvo;
    }
    
    public void asetaArvo(int arvo) {
        if(arvo >= 0 && arvo <= this.ylaraja) {
            this.arvo = arvo;
        } else {
            return;
        }
    }
}
