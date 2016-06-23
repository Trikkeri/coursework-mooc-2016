
import java.util.Scanner;


public class Paaohjelma {


    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja   
        
        System.out.println(kaikkiVokaaleja("aeiouäö"));
        System.out.println(kellonaika("23:59:59"));
    }
    
    public static boolean onViikonpaiva(String merkkijono) {
        
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }
    
    public static boolean kaikkiVokaaleja(String merkkijono) {
        
        merkkijono = merkkijono.toLowerCase();
        
        return merkkijono.matches("(a|e|o|u|i|ö|ä|y)+");
    }
    
    public static boolean kellonaika(String merkkijono) {
        
        return merkkijono.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
    }
}
