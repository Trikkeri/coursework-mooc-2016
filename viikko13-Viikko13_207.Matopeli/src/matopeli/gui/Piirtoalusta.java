package matopeli.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import matopeli.domain.Pala;
import matopeli.peli.Matopeli;

public class Piirtoalusta extends JPanel implements Paivitettava {
    
    private Matopeli matopeli;
    private int palanSivunPituus;
    
    public Piirtoalusta(Matopeli matopeli, int palanSivunPituus) {
        this.matopeli = matopeli;
        this.palanSivunPituus = palanSivunPituus;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Piirra mato ja kaikki sen palat
        g.setColor(Color.BLACK);
        
        for(Pala pala : this.matopeli.getMato().getPalat()) {
            g.fill3DRect(pala.getX() * palanSivunPituus, pala.getY() * palanSivunPituus, palanSivunPituus, palanSivunPituus, true);
        }
        
        // Piirra omena
        g.setColor(Color.RED);
        g.fillOval(this.matopeli.getOmena().getX() * palanSivunPituus, this.matopeli.getOmena().getY() * palanSivunPituus, palanSivunPituus, palanSivunPituus);
    }

    @Override
    public void paivita() {
        super.repaint();
    }
    
}
