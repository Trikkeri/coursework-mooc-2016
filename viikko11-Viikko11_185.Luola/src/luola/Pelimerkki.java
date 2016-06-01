package luola;

public class Pelimerkki {

    private char tyyppi;
    private int x;
    private int y;
    
    public Pelimerkki(char tyyppi, int x, int y) {
        this.tyyppi = tyyppi;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.tyyppi);
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public char getTyyppi() {
        return this.tyyppi;
    }
}
