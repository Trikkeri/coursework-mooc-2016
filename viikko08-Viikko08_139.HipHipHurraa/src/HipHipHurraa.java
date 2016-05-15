
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Hip Hip Hurraa"
        System.out.print("Kirjoita merkkijono:");
        String merkkijono = lukija.nextLine();
        String lisasana = "";
        
        for (int i = 0; i < merkkijono.length(); i++) {      
            lisasana = "";
            
            if (i % 2 == 1) {
                lisasana += " hip";
            }
            
            if (i % 5 == 4) {
                lisasana += " hurraa";
            }
            
            System.out.println(merkkijono.charAt(i) + lisasana);  
        }
    }
}
