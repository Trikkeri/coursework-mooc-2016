package grafiikka;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.WindowEvent;

public class Visualisointi implements Runnable {

    private JFrame kehys;
    private Piirtoalusta piirtoalusta;

    public Visualisointi() {
    }

    @Override
    public void run() {
        kehys = new JFrame("Schellingin malli");
        kehys.setPreferredSize(new Dimension(600, 600));

        kehys.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(kehys.getContentPane());

        kehys.pack();
        kehys.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        this.piirtoalusta = new Piirtoalusta();
        container.add(this.piirtoalusta);
    }

    public void asetaData(int[][] data) {
        if (this.piirtoalusta == null) {
            return;
        }

        this.piirtoalusta.setData(data);
        this.kehys.repaint();
    }

    public JFrame getFrame() {
        return kehys;
    }

    public void sulje() {
        if (kehys == null) {
            return;
        }

        kehys.dispatchEvent(new WindowEvent(kehys, WindowEvent.WINDOW_CLOSING));
    }
}
