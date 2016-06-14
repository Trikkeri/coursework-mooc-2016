package piirtaminen.kayttoliittyma;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Piirtoalusta extends JPanel {

    public Piirtoalusta() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        
        // Silimät
        graphics.fillRect(90, 50, 50, 50);
        graphics.fillRect(230, 50, 50, 50);
        
        // Suunpieli1
        graphics.fillRect(40, 200, 50, 50);
        
        // Huulet
        graphics.fillRect(90, 250, 200, 50);
        
        // Suunpieli2
        graphics.fillRect(290, 200, 50, 50);
    }
}
