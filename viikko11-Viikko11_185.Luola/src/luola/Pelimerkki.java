package luola;

public class Pelimerkki {

    private char tyyppi;
    private int x;
    private int y;
    private boolean nakyvyys;
    
    public Pelimerkki(char tyyppi, int x, int y) {
        this.tyyppi = tyyppi;
        this.nakyvyys = true;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.tyyppi);
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setNakyvyys(boolean nakyvyys) {
        this.nakyvyys = nakyvyys;
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
    
    public boolean getNakyvyys() {
        return this.nakyvyys;
    }
}
