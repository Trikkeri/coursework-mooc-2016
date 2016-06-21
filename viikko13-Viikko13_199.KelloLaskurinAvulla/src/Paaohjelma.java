
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // tee tänne koodia jolla testaat että YlhaaltaRajoitettuLaskuri toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävissä tehtävän loppuosassa
        // (kohdat 3 ja 4) ja käyttää tehtäväannossa ehdotettua koodirunkoa
        
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);

        System.out.print("sekunnit: ");
        int sek = Integer.parseInt(lukija.nextLine()); // kysy sekuntien alkuarvo käyttäjältä
        System.out.print("minuutit: ");
        int min = Integer.parseInt(lukija.nextLine()); // kysy minuuttien alkuarvo käyttäjältä
        System.out.print("tunnit: ");
        int tun = Integer.parseInt(lukija.nextLine()); // kysy tuntien alkuarvo käyttäjältä

        sekunnit.asetaArvo(sek);
        minuutit.asetaArvo(min);
        tunnit.asetaArvo(tun);
        
        int i = 0;
        while (i < 121) {
            System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);   // tulostetaan nykyinen aika
            
            sekunnit.seuraava();
            
            if(sekunnit.arvo() < 1) {
                minuutit.seuraava();
                
                if(minuutit.arvo() < 1) {
                    tunnit.seuraava();
                }
            }
            i++;
        }

    }
}
