package liikkuvakuvio;

import java.awt.Graphics;

public class Laatikko extends Kuvio {

    private int korkeus;
    private int leveys;
    
    public Laatikko(int x, int y, int korkeus, int leveys) {
        super(x, y);
        this.korkeus = korkeus;
        this.leveys = leveys;
    }

    @Override
    public void piirra(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), korkeus, leveys);
    }
    
}
