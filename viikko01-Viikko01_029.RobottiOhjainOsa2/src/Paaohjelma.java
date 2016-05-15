
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();
        Ohjain.asetaLaatikkoSatunnaisesti();
        // toteuta ohjelma tänne

        while (true) {
            System.out.println("komento (sammuta, vasen, oikea, liiku, liikuMonta, viereen, ratkaise)");
            String komento = lukija.nextLine();
            
            if(komento.equals("sammuta")) {
                Ohjain.sammuta();
                break;
            }
            
            if(komento.equals("vasen")) {
                Ohjain.vasen();
            }
            
            if(komento.equals("oikea")) {
                Ohjain.oikea();
            }
            
            if(komento.equals("liiku")) {
                Ohjain.liiku();
            }

            if(komento.equals("liikuMonta")) {
                System.out.println("Kuinka monta askelta: ");
                int askeleet = Integer.parseInt(lukija.nextLine());
                Ohjain.liikuMonta(askeleet);
            }
            
            if(komento.equals("viereen")) {
                // kertoo robotin x- ja y-koordinaatit
                int robottiX = Ohjain.robottiX();
                int robottiY = Ohjain.robottiY();

                // kertoo laatikon x- ja y-koordinaatit
                int laatikkoX = Ohjain.laatikkoX();
                int laatikkoY = Ohjain.laatikkoY();

                // kertoo rahtialueen x- ja y-koordinaatit
                int tavoiteX = Ohjain.tavoiteX();
                int tavoiteY = Ohjain.tavoiteY();
                
                Ohjain.vasen();
                Ohjain.liikuMonta(laatikkoY -1);
                Ohjain.oikea();
                Ohjain.liikuMonta(laatikkoX -2);
            }
            
            if(komento.equals("ratkaise")) {
                // kertoo robotin x- ja y-koordinaatit
                int robottiX = Ohjain.robottiX();
                int robottiY = Ohjain.robottiY();

                // kertoo laatikon x- ja y-koordinaatit
                int laatikkoX = Ohjain.laatikkoX();
                int laatikkoY = Ohjain.laatikkoY();

                // kertoo rahtialueen x- ja y-koordinaatit
                int tavoiteX = Ohjain.tavoiteX();
                int tavoiteY = Ohjain.tavoiteY();
                
                if(robottiY != laatikkoY) {
                    Ohjain.vasen();
                    Ohjain.liikuMonta(laatikkoY-1);
                    Ohjain.oikea();
                    Ohjain.liikuMonta(laatikkoX-2);  
                }
                // Nyt ollaan laatikolla, sitten pusku maaliin               
                Ohjain.liikuMonta(tavoiteX-laatikkoX);
                Ohjain.vasen();
                Ohjain.liiku();
                Ohjain.oikea();
                Ohjain.liiku();
                Ohjain.oikea();
                Ohjain.liikuMonta(laatikkoY-tavoiteY);
            }
        }
    }
}
