package ilmoitin;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class Ilmoitin implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        
        frame = new JFrame("Frame");
        frame.setPreferredSize(new Dimension(600, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame);
        
        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        
        GridLayout gridLeiska = new GridLayout(3, 1);
        container.setLayout(gridLeiska);
        
        JTextField lahde = new JTextField("Tekstiä, joka kopiotuu nappia painamalla alas");
        
        JButton kopioi = new JButton("Päivitä");
        Kopioija cp = new Kopioija(lahde, kohde);
        kopioi.addActionListener(cp);
    
        JLabel kohde = new JLabel();
       
        container.add(lahde);
        container.add(kopioi);
        container.add(kohde);
        
        
    }
}
