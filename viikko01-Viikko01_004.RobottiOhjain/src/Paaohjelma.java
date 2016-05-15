
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();
        
        // ohjelmoi liikkeet tänne
        Ohjain.ylos();
        Ohjain.ylos();
        Ohjain.ylos();
        Ohjain.ylos();
        Ohjain.ylos();
        Ohjain.oikealle();
        Ohjain.oikealle();
        Ohjain.oikealle();
        Ohjain.alas();
        Ohjain.alas();
        Ohjain.vasemmalle();
        Ohjain.vasemmalle();
        Ohjain.vasemmalle();
        
        // Toka laatikko
        Ohjain.alas();
        Ohjain.alas();
        Ohjain.alas();     
        Ohjain.oikealle();
        Ohjain.oikealle();
        Ohjain.oikealle();
        Ohjain.oikealle();
        Ohjain.oikealle();
        Ohjain.oikealle();
        Ohjain.oikealle();
        Ohjain.ylos();
        Ohjain.ylos();
        Ohjain.ylos();
        Ohjain.ylos();
        Ohjain.ylos();
        Ohjain.vasemmalle();
        Ohjain.vasemmalle();
        Ohjain.vasemmalle();
        Ohjain.vasemmalle();
        Ohjain.vasemmalle();
        Ohjain.vasemmalle();
        Ohjain.vasemmalle();
        
        Ohjain.sammuta();
    }
}
