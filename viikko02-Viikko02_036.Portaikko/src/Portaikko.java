
import java.util.Scanner;
import robotti.Ohjain;

public class Portaikko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();
        // KIRJOITA OHJELMASI TÄNNE
        while(true) {
            System.out.println("Montako ylös? ");
            int ylos = Integer.parseInt(lukija.nextLine());
            int kerratYlos = 0;
            
            while(ylos > kerratYlos) {
                Ohjain.vasen();
                Ohjain.liiku();
                Ohjain.oikea();
                Ohjain.liiku();
                kerratYlos++;
            }
            
            System.out.println("Montako alas? ");
            int alas = Integer.parseInt(lukija.nextLine());
            int kerratAlas = 0;
            
            while(alas > kerratAlas) {
                Ohjain.oikea();
                Ohjain.liiku();
                Ohjain.vasen();
                Ohjain.liiku();
                kerratAlas++;
            }
            
            break;
        }

        Ohjain.sammuta();
    }
}
