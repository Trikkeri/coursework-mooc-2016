/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Tuote {
    private String nimiAlussa;
    private double hintaAlussa;
    private int maaraAlussa;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.nimiAlussa = nimiAlussa;
        this.hintaAlussa = hintaAlussa;
        this.maaraAlussa = maaraAlussa;
    }
    
    public void tulostaTuote() {
        System.out.println(this.nimiAlussa + ", hinta " + this.hintaAlussa + ", " + this.maaraAlussa + " kpl");
    }
    
}
