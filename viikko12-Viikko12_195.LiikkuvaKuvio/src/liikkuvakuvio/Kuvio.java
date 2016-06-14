package liikkuvakuvio;

import java.awt.Graphics;

public abstract class Kuvio {
    
    private int x;
    private int y;
    
    public Kuvio(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void siirra(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public abstract void piirra(Graphics graphics);
    
}
