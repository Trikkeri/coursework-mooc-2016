
import java.util.Scanner;

public class Arvauspeli {

    private Scanner lukija;

    public Arvauspeli() {
        // käytä ohjelmassa vain tässä luotua lukijaa, muuten testit eivät toimi!
        this.lukija = new Scanner(System.in);
    }

    public void pelaa(int alaraja, int ylaraja) {
        tulostaOhjeet(ylaraja, alaraja);
    
        // Kirjoita pelin koodi tänne
        int keskiarvo;
        
        while(alaraja < ylaraja) {
            keskiarvo = keskiarvo(alaraja, ylaraja);
            if(onkoSuurempiKuin(keskiarvo)) {
                alaraja = keskiarvo + 1;
            } else {
                ylaraja = keskiarvo;
            }
        }
        System.out.println("Ajattelemasi luku on " + alaraja + ".");
    }
    
    public boolean onkoSuurempiKuin(int luku) {
        System.out.println("Onko lukusi suurempi kuin " + luku + "? (k/e)");
        String vastaus = this.lukija.nextLine();
        if(vastaus.contains("k")) {
            return true;
        }
        return false;     
    }
    
    public int keskiarvo(int ekaLuku, int tokaLuku) {
        return (ekaLuku + tokaLuku) / 2;
    }


    public void tulostaOhjeet(int ylaraja, int alaraja) {
        int kysymyksiaKorkeintaan = kuinkaMontaKertaaVoiJakaaKahteen(ylaraja - alaraja);

        System.out.println("Ajattele jotain lukua väliltä " + alaraja + "..." + ylaraja + ".");

        System.out.println("Lupaan pystyä arvaamaan ajattelemasi luvun " + kysymyksiaKorkeintaan + " kysymyksellä.");
        System.out.println("");
        System.out.println("Esitän sinulle seuraavaksi sarjan kysymyksiä. Vastaa niihin rehellisesti.");
        System.out.println("");
    }

    // apumetodi 
    public int kuinkaMontaKertaaVoiJakaaKahteen(int luku) {
        // luodaan kaksikantainen logaritmi annetusta luvusta, logaritmeista
        // löytyy lisää tietoa mm. osoitteessa

        // http://www02.oph.fi/etalukio/pitka_matematiikka/kurssi8/maa8_teoria7.html
        // Alla vaihdamme kantalukua alkuperäisestä kaksikantaisiin logaritmeihin!
        return (int) (Math.log(luku) / Math.log(2)) + 1;
    }
}
