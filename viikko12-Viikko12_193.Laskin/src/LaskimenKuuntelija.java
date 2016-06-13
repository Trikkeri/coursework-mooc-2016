
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
    
    public LaskimenKuuntelija(JButton plus, JButton miinus, JButton z, JTextField tulos, JTextField laskettava) {
        this.plus = plus;
        this.miinus = miinus;
        this.z = z;
        this.laskettava = laskettava;
        this.tulos = tulos;
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
            int summa = laskettavaNumero + Integer.parseInt(this.tulos.getText());
            this.tulos.setText(String.valueOf(summa));
        } else if(ae.getSource() == miinus) {
            int erotus = Integer.parseInt(this.tulos.getText()) - laskettavaNumero;
            this.tulos.setText(String.valueOf(erotus));
        } else {
            this.tulos.setText("0");         
        }
        
        // Poistetaan Z painike pois käytöstä, jos tulos on 0
        if(tulos.getText().equals("0")) {
            z.setEnabled(false);
        }  else {
            this.z.setEnabled(true);
        }
        
        // Tyhjennetään syötekenttä kun on tehty operaatio
        this.laskettava.setText("");
    }
    
}
