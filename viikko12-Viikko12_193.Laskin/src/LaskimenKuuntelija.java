
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LaskimenKuuntelija implements ActionListener {

    private JButton plus;
    private JButton miinus;
    private JButton z;
    private JTextField laskettava;
    private JTextField tulosKentta;
    private Laskuoperaatio laskin;
    
    public LaskimenKuuntelija(JButton plus, JButton miinus, JButton z, JTextField tulos, JTextField laskettava) {
        this.plus = plus;
        this.miinus = miinus;
        this.z = z;
        this.laskettava = laskettava;
        this.tulosKentta = tulos;
        
        laskin = new Laskuoperaatio();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
                
        // Poikkeuksen käsittely jos syöte ei ole numero
        int laskettavaNumero = 0;
        try {
            laskettavaNumero = Integer.parseInt(this.laskettava.getText());
        } catch(NumberFormatException e) {
            System.out.println(e.toString());
            this.laskettava.setText("");
            return;
        }
        
        if(ae.getSource() == plus) {
            laskin.plus(laskettavaNumero);
            
        } else if(ae.getSource() == miinus) {
            laskin.miinus(laskettavaNumero);
        } else {
            laskin.nollaa();
            this.tulosKentta.setText("0");         
        }
        
        int tulos = laskin.tulos();
        this.tulosKentta.setText("" + tulos);
        
        // Poistetaan Z painike pois käytöstä, jos tulos on 0
        if(tulos == 0) {
            z.setEnabled(false);
        }  else {
            this.z.setEnabled(true);
        }
        
        // Tyhjennetään syötekenttä kun on tehty operaatio
        this.laskettava.setText("");
    }
    
}
