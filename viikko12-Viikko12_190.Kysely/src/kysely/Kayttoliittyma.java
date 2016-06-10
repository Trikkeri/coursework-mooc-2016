package kysely;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Luo sovelluksesi tänne
        frame = new JFrame("Ikkuna");
        frame.setPreferredSize(new Dimension(300, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        // Checkboxin luonti
        container.add(new JLabel("Oletko?"));
        
        JCheckBox y = new JCheckBox("Kyllä");
        JCheckBox n = new JCheckBox("En");
        
        container.add(y);
        container.add(n);
        
        // Radiobuttonien luonti
        container.add(new JLabel("Miksi?"));
        
        JRadioButton siksi = new JRadioButton("Siksi.");
        JRadioButton koska = new JRadioButton("Koska se on kivaa!");
        
        ButtonGroup miksiGroup = new ButtonGroup();
        miksiGroup.add(siksi);
        miksiGroup.add(koska);
        
        container.add(siksi);
        container.add(koska);
        
        // Painikkeen luonti
        JButton confirm = new JButton("Valmis");
        container.add(confirm);
    }
}
