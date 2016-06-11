package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.OmaLaskuri;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(new OmaLaskuri());
        SwingUtilities.invokeLater(kayttoliittyma);
    }
}
