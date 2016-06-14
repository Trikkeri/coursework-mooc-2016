package liikkuvakuvio;

import java.awt.Graphics;

public class Ympyra extends Kuvio {

    private int halkaisija;
    
    public Ympyra(int x, int y) {
        super(x, y);
    }
    
    public Ympyra(int x, int y, int halkaisija) {
        super(x, y);
        this.halkaisija = halkaisija;
    }

    @Override
    public void piirra(Graphics graphics) {
        graphics.fillOval(super.getX(), super.getY(), halkaisija, halkaisija);
    }
}
