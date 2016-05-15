/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Lintu {
    private String nimi;
    private String nimiLatina;
    private int havainnot;
    
    public Lintu(String nimi, String latinaksi) {
        this.nimi = nimi;
        this.nimiLatina = latinaksi;
        this.havainnot = 0;
    }
    
    public void kasvataHavaintoa() {
        this.havainnot += 1;
    }
    
    public int havaintojenMaara() {
        return this.havainnot;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String toString() {
        return "" + this.nimi + " (" + this.nimiLatina + "): " + this.havainnot + " havaintoa";
    }
}
