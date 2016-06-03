package luola;

public class Pelimerkki {

    private char tyyppi;
    private int rivi;
    private int sarake;
    
    public Pelimerkki(char tyyppi, int rivi, int sarake) {
        this.tyyppi = tyyppi;
        this.rivi = rivi;
        this.sarake = sarake;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.tyyppi);
    }
    
    public void setRivi(int rivi) {
        this.rivi = rivi;
    }
    
    public void setSarake(int sarake) {
        this.sarake = sarake;
    }
    
    public int getRivi() {
        return this.rivi;
    }
    
    public int getSarake() {
        return this.sarake;
    }
    
    public char getTyyppi() {
        return this.tyyppi;
    }
}
