
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraafinenLaskin implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Laskin");
        this.frame.setPreferredSize(new Dimension(300, 150));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(this.frame);
        
        frame.pack();
        frame.setVisible(true);

    }

    private void luoKomponentit(Container container) {
        GridLayout tekstikenttienGrid = new GridLayout(3, 1);
        container.setLayout(tekstikenttienGrid);
        
        JTextField tulos = new JTextField();
        tulos.setEnabled(false);
        JTextField laskettava = new JTextField();
        
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plus = new JButton("+");
        JButton miinus = new JButton("-");
        JButton z = new JButton("z");
        
        panel.add(plus);
        panel.add(miinus);
        panel.add(z);
        
        LaskimenKuuntelija kk = new LaskimenKuuntelija(plus, miinus, z, tulos, laskettava);
        
        container.add(tulos);
        container.add(laskettava);
        container.add(panel);
        
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
}