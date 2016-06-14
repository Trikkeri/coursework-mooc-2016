package liikkuvakuvio;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

public class Koostekuvio extends Kuvio {

    private List<Kuvio> kuviot;
    
    public Koostekuvio() {
        super(0, 0);
        this.kuviot = new ArrayList<>();
    }
    
    public void liita(Kuvio k) {
        this.kuviot.add(k);
    }

    @Override
    public void piirra(Graphics graphics) {
        for (Kuvio k : this.kuviot) {
            k.piirra(graphics);
        }
    }
    
    public void siirra(int dx, int dy) {
        for (Kuvio k : this.kuviot) {
            k.siirra(dx, dy);
        }
    }
    
}
