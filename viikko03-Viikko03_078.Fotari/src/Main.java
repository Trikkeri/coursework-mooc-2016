
import java.util.ArrayList;
import java.util.Scanner;
import kuva.Fotari;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner lukija = new Scanner(System.in);

        // käytössä ilta.jpg, puu.jpg, kukka.jpg ja fluffy.jpg
        System.out.print("Mikä kuva avataan? ");
        //String kuva = lukija.nextLine();
        String kuva = "puu.jpg";
        Fotari.avaa(kuva);

        while (true) {
            System.out.print("komento (lopeta, vaalenna, tummenna, negatiivi, peilaa, andywarhol)? ");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                break;
            }

            if (komento.equals("vaalenna")) {
                vaalenna();
            }
            
            if (komento.equals("tummenna")) {
                tummenna();
            }
            
            if (komento.equals("negatiivi")) {
                negatiivi();
            }
            
            if (komento.equals("peilaa")) {
                peilaa();
            }
            
            if (komento.equals("andywarhol")) {
                andywarhol();
            }
            
            if (komento.equals("testi")) {
                int testi = Integer.parseInt(lukija.nextLine());
                System.out.println(Fotari.punaiset(Fotari.kuvanLeveys()- 1, Fotari.kuvanKorkeus() - 1, testi));
            }

            
        }

        Fotari.sulje();
    }

    public static void vaalenna() {
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);
                
                Fotari.asetaVari(x, y,
                        Math.min(255, punainen + 30),
                        Math.min(255, vihrea + 30),
                        Math.min(255, sininen + 30));

                y++;
            }
            x++;
        }
    }
    
    public static void tummenna() {
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {

                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);
                
                System.out.println(punainen + " " + vihrea + " " + sininen);
                
                if(punainen > 29) {
                    punainen -= 30; 
                } else {
                    punainen = 0;
                }
                
                if(vihrea > 29) {
                    vihrea -= 30;
                } else {
                    vihrea = 0;
                }
                
                if(sininen > 29) {
                    sininen -= 30;
                } else {
                    sininen = 0;
                }
                
                Fotari.asetaVari(x, y,
                    Math.min(255, punainen),
                    Math.min(255, vihrea),
                    Math.min(255, sininen));

                y++;
            }
            x++;
        }
        
    }
    
    public static void negatiivi() {
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);
                               
                Fotari.asetaVari(x, y,
                        Math.min(255, 255 - punainen),
                        Math.min(255, 255 - vihrea),
                        Math.min(255, 255 - sininen));

                y++;
            }
            x++;
        }
    }   

    public static void peilaa() {
        
        int leveys = Fotari.kuvanLeveys() - 1; //600
        
        int x = 0;
        while (x < Fotari.kuvanLeveys() / 2) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                   
                int punainen = Fotari.punainen(leveys, y);
                int vihrea = Fotari.vihrea(leveys, y);
                int sininen = Fotari.sininen(leveys, y);
                 
                Fotari.asetaVari(x, y,
                        Math.min(255, punainen),
                        Math.min(255, vihrea),
                        Math.min(255, sininen));
                
                y++;  
            }
            x++;
            
            if(leveys > 0) {
                leveys--;
            }
        }
    }
    
    public static void andywarhol() {
        
        int leveys = Fotari.kuvanLeveys() - 1; //600
        
        int x = 0;
        while (x < Fotari.kuvanLeveys() / 2) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus() / 2) {
                   
                int punainen = Fotari.punainen(leveys, y);
                int vihrea = Fotari.vihrea(leveys, y);
                int sininen = Fotari.sininen(leveys, y);

                Fotari.asetaVari(x, y,
                        Math.min(255, punainen),
                        Math.min(255, vihrea),
                        Math.min(255, sininen));
                
                y++;  
            }
            x++;
            
            if(leveys > 0) {
                leveys--;
            }
        }
    }
}
