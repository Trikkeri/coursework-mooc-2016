package piirtaminen.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Piirtoalusta piirtoalusta;

    @Override
    public void run() {
        // ÄLÄ MUUTA TÄÄLLÄ OLEVAA KOODIA!!
        frame = new JFrame("Piirtoalusta");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        piirtoalusta = new Piirtoalusta();
        container.add(piirtoalusta);
    }

    public JFrame getFrame() {
        return frame;
    }
}
