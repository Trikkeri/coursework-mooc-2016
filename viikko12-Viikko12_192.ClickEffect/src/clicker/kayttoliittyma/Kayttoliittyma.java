package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.Laskuri;
import clicker.sovelluslogiikka.OmaLaskuri;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {
    private JFrame frame;
    private Laskuri laskuri;
    
    public Kayttoliittyma(Laskuri laskuri) {
        this.laskuri = laskuri;
    }

    @Override
    public void run() {
        frame = new JFrame("The Effect");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        BorderLayout borderLeiska = new BorderLayout();
        container.setLayout(borderLeiska);
        
        JLabel laskuriLabel = new JLabel(String.valueOf(this.laskuri.annaArvo()));
        JButton kasvataLaskuriaButton = new JButton("Click!");
        
        KlikkaustenKuuntelija kk = new KlikkaustenKuuntelija(this.laskuri, laskuriLabel);
        kasvataLaskuriaButton.addActionListener(kk);
        
        container.add(laskuriLabel, BorderLayout.CENTER);
        container.add(kasvataLaskuriaButton, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
