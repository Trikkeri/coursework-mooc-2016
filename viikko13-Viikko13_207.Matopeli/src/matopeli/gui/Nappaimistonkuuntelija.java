package matopeli.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import matopeli.Suunta;
import matopeli.domain.Mato;

public class Nappaimistonkuuntelija implements KeyListener {

    private Mato mato;
    
    public Nappaimistonkuuntelija(Mato mato) {
        this.mato = mato;
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        int painikeKoodi = ke.getKeyCode();
        
        switch (painikeKoodi) {
            case KeyEvent.VK_UP:
                this.mato.setSuunta(Suunta.YLOS);
                break;
            
            case KeyEvent.VK_RIGHT:
                this.mato.setSuunta(Suunta.OIKEA);
                break;
            
            case KeyEvent.VK_DOWN:
                this.mato.setSuunta(Suunta.ALAS);
                break;
                
            case KeyEvent.VK_LEFT:
                this.mato.setSuunta(Suunta.VASEN);
                break;
        }
    }    

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
