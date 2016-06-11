package ilmoitin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Kopioija implements ActionListener {
    
    private JTextField lahde;
    private JLabel kohde;
    
    public Kopioija(JTextField lahde, JLabel kohde) {
        this.lahde = lahde;
        this.kohde = kohde;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.kohde.setText(this.lahde.getText());
        this.lahde.setText("");
    }
    
}
