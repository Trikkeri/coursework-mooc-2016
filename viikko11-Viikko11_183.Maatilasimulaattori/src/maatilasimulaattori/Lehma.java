package maatilasimulaattori;

import java.util.Random;

public class Lehma implements Lypsava, Eleleva {
    private Random rng;
    private String nimi;
    private double utareidenTilavuus;
    private double maitoaJaljella;
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Lehma() {
        this.rng = new Random();
        this.nimi = this.NIMIA[this.rng.nextInt(this.NIMIA.length)];
        this.utareidenTilavuus = 15 + this.rng.nextInt(26);
        this.maitoaJaljella = 0;
    }
    
    public Lehma(String nimi) {
        this.nimi = nimi;
        this.utareidenTilavuus = 15 + new Random().nextInt(26);
        this.maitoaJaljella = 0;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public double getTilavuus() {
        return this.utareidenTilavuus;
    }
    
    public double getMaara() {
        return this.maitoaJaljella;
    }
    
    public String toString() {
        return this.nimi + " " + Math.ceil(this.maitoaJaljella) + "/" + Math.ceil(this.utareidenTilavuus);
    }

    @Override
    public double lypsa() {
        double otaMaidot = this.maitoaJaljella;
        this.maitoaJaljella = 0;
        return otaMaidot;
    }

    @Override
    public void eleleTunti() {
               
        double vali = 2.0 - 0.7;
        double arvottu = 0.7 + Math.random() * vali;
        
        if(arvottu + this.maitoaJaljella >= this.utareidenTilavuus) {
            this.maitoaJaljella = this.utareidenTilavuus;
            return;
        }
        
        this.maitoaJaljella += arvottu;
    }
}
