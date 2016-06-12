
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LaskimenKuuntelija implements ActionListener {

    private JButton plus;
    private JButton miinus;
    private JButton z;
    private JTextField laskettava;
    private JTextField tulos;
    
    public LaskimenKuuntelija(JButton plus, JButton miinus, JButton z, JTextField laskettava, JTextField tulos) {
        this.plus = plus;
        this.miinus = miinus;
        this.z = z;
        this.laskettava = laskettava;
        this.tulos = tulos;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.plus) {
            // käsittele pluslasku
        } else if(ae.getSource() == this.miinus) {
            // käsittele miinus
        } else {
            //xxx
        }
    }
    
}
