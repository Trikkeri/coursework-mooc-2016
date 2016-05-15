
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat että YlhaaltaRajoitettuLaskuri toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävissä 89.3 ja 89.4 ja käyttää tehtäväannossa
        // ehdotettua koodirunkoa
        Scanner lukija = new Scanner(System.in);
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);

        System.out.print("sekunnit: ");
        int sek = Integer.parseInt(lukija.nextLine());// kysy sekuntien alkuarvo käyttäjältä
        System.out.print("minuutit: ");
        int min = Integer.parseInt(lukija.nextLine());// kysy minuuttien alkuarvo käyttäjältä
        System.out.print("tunnit: ");
        int tun = Integer.parseInt(lukija.nextLine());// kysy tuntien alkuarvo käyttäjältä

        sekunnit.asetaArvo(sek);
        minuutit.asetaArvo(min);
        tunnit.asetaArvo(tun);
        
        int i = 0;
        while (i < 121) {
            // lisää edelliseen myös sekuntiviisari
            
            System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);   // tulostetaan nykyinen aika
            
            if(tunnit.arvo() == 23 && minuutit.arvo() == 59 && sekunnit.arvo() == 59) {
                sekunnit.seuraava();
                minuutit.seuraava();
                tunnit.seuraava();
            } else {
                sekunnit.seuraava();// sekunttimäärä kasvaa
                //minuutit.seuraava();// minuuttimäärä kasvaa
                // jos minuuttimäärä menee nollaan, tuntimäärä kasvaa
                if(sekunnit.arvo() == 0) {
                    minuutit.seuraava();
                }
                if(minuutit.arvo() == 0 && sekunnit.arvo() == 0) {
                    minuutit.seuraava();
                    tunnit.seuraava();
                }   
            }
            i++;
        }
    }
}
