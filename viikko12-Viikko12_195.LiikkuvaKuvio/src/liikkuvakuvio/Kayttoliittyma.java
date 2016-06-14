package liikkuvakuvio;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Kuvio kuvio;
    
    public Kayttoliittyma(Kuvio kuvio) {
        this.kuvio = kuvio;
    }
    
    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());
        lisaaKuuntelijat();

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        Piirtoalusta pa = new Piirtoalusta(kuvio);
        
        NappaimistonKuuntelija nk = new NappaimistonKuuntelija(pa, kuvio);
        
        frame.addKeyListener(nk);
        
        container.add(pa);
    }

    private void lisaaKuuntelijat() {
    }

    public JFrame getFrame() {
        return frame;
    }
}
