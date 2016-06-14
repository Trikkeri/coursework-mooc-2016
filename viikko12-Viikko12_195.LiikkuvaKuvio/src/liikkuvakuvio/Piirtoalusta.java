package liikkuvakuvio;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Piirtoalusta extends JPanel {
    
    private Kuvio kuvio;
    
    public Piirtoalusta(Kuvio kuvio) {
        this.kuvio = kuvio;
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.kuvio.piirra(g);
    }
    
}
