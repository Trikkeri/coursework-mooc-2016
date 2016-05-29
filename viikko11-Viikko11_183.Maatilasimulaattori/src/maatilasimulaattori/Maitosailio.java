package maatilasimulaattori;

public class Maitosailio {
    
    private double tilavuus;
    private double saldo;
    
    public Maitosailio() {
        this.tilavuus = 2000;
        this.saldo = 0;
    }
    
    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
        this.saldo = 0;
    }
    
    public double getTilavuus() {
        return this.tilavuus;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double paljonkoTilaaJaljella() {
        return this.tilavuus - this.saldo;
    }
    
    public void lisaaSailioon(double maara) {
        
        if(this.paljonkoTilaaJaljella() < maara) {
            this.saldo = this.tilavuus;
            return;
        }
        
        this.saldo += maara;
    }
    
    public double otaSailiosta(double maara) {
        if(this.getSaldo() < maara) {
            // Vie tuhkatkin pesästä
            this.saldo = 0;
            return this.saldo;
        } else {
            this.saldo -= maara;
            return this.getSaldo();
        }
    }
    
    @Override
    public String toString() {
        return Math.ceil(this.saldo) + "/" + Math.ceil(this.tilavuus);
    }
    
}
