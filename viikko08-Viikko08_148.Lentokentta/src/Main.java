
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Scanner lukija = new Scanner(System.in);

        Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija);
        kayttoliittyma.kaynnistaHallinta();
        kayttoliittyma.kaynnistaLentoPalv();
        
    }
}
