package mooc.logiikka;

import mooc.ui.Kayttoliittyma;

public class Sovelluslogiikka {
    private Kayttoliittyma kayttis;
    
    
    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma) {
        this.kayttis = kayttoliittyma;
    }
    
    public void suorita(int montaKertaa) {
        for (int i = 0; i < montaKertaa; i++) {
            System.out.println("Sovelluslogiikka toimii");
            kayttis.paivita();
        }
    }
    
}
