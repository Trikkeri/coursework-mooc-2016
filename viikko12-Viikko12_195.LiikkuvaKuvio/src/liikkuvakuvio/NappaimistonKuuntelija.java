package liikkuvakuvio;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NappaimistonKuuntelija implements KeyListener {

    private Component component;
    private Kuvio kuvio;
    
    public NappaimistonKuuntelija(Component component, Kuvio kuvio) {
        this.component = component;
        this.kuvio = kuvio;
    } 
    
    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
        if(ke.getKeyCode() == KeyEvent.VK_UP) {
            this.kuvio.siirra(0, -5);
        } else if(ke.getKeyCode() == KeyEvent.VK_LEFT) {
            this.kuvio.siirra(-5, 0);
        } else if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.kuvio.siirra(5, 0);
        } else if(ke.getKeyCode() == KeyEvent.VK_DOWN) {
            this.kuvio.siirra(0, 5);
        }  
        this.component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
