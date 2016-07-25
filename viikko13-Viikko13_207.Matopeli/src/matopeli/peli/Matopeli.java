package matopeli.peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import matopeli.Suunta;
import matopeli.gui.Paivitettava;

public class Matopeli extends Timer implements ActionListener {

    private int leveys;
    private int korkeus;
    private boolean jatkuu;
    private Paivitettava paivitettava;

    public Matopeli(int leveys, int korkeus) {
        super(1000, null);

        this.leveys = leveys;
        this.korkeus = korkeus;
        this.jatkuu = true;

        addActionListener(this);
        setInitialDelay(2000);

    }


    public boolean jatkuu() {
        return jatkuu;
    }

    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public int getLeveys() {
        return leveys;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!jatkuu) {
            return;
        }

    }

}
