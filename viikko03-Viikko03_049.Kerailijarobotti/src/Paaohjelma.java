
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {

        Ohjain.kaynnista();
        int y = 0;
        Ohjain.asetaOdotusaika(10);
        while(y < 14) {
            int x = 0;
            
            while(x < 13){
                Ohjain.liiku();
                
                if(x % 2 == 0) {
                    Ohjain.nosta();
                 }
                x++;
            }
            
            if(y % 2 == 0) {
                Ohjain.vasen();
                Ohjain.liiku();
                Ohjain.vasen();
            } else {
                Ohjain.oikea();
                Ohjain.liiku();
                Ohjain.oikea();
            }
            y++;
        }
        
        // ohjelmoi liikkeet tänne
        // Huom! Älä luota testeihin -- kokeile, että ohjelma toimii
        // oikein ohjelmaa ajamalla.
        Ohjain.sammuta();
    }

}
