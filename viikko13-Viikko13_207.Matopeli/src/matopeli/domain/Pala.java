package matopeli.domain;

public class Pala {
    
    private int x;
    private int y;
    
    public Pala(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public boolean osuu(Pala pala) {
        if(pala.getX() == this.x && pala.getY() == this.y) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return "(" + this.x + "," + this.y +(")");
    }
    
}
