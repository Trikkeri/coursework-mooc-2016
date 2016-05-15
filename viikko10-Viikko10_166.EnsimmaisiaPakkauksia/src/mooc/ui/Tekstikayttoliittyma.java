package mooc.ui;

import mooc.ui.Kayttoliittyma;

public class Tekstikayttoliittyma implements Kayttoliittyma {

    @Override
    public void paivita() {
        System.out.println("Päivitetään käyttöliittymää");
    }
    
}
