
import java.util.ArrayList;
import java.util.Random;

public class LottoRivi {

    private ArrayList<Integer> numerot;

    public LottoRivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        
        // Kirjoita numeroiden arvonta tänne käyttämällä metodia sisaltaaNumeron()
        Random random = new Random();
        
        int arvontaKerrat = 0;
        while(arvontaKerrat < 7) {
            
            int arvottuNumero = 0;
            while(arvottuNumero == 0) {
                arvottuNumero = random.nextInt(39 + 1);
            }
            
            if(!sisaltaaNumeron(arvottuNumero)) {
                this.numerot.add(arvottuNumero);
                arvontaKerrat++;
            }
       
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        return this.numerot.contains(numero);
    }
}
