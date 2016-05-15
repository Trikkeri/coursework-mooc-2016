/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Maksukortti {
    private double saldo;
    
    public Maksukortti (double alkusaldo) {
        this.saldo = alkusaldo;
    }
    
    public String toString() {
        String paluuArvo = "Kortilla on rahaa " + this.saldo + " euroa";
        return paluuArvo;
    }
    
    public void syoEdullisesti() {
        if(this.saldo - 2.50 >= 0 ) {
            this.saldo = this.saldo - 2.50;
        }
    }
    
    public void syoMaukkaasti() {
        if(this.saldo - 4.30 >= 0) {
            this.saldo = this.saldo - 4.30;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
        if(rahamaara >= 0) {
            if (this.saldo + rahamaara > 150) {
                this.saldo = 150;
            } else {
                this.saldo = this.saldo + rahamaara;
            }     
        }
    }
}
