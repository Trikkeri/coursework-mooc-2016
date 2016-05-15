
import java.util.Scanner;

public class ViimeinenKirjain {


    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna nimi: ");
        System.out.println("Viimeinen kirjain: " + viimeinenKirjain(lukija.nextLine()));
    }
    
    public static char viimeinenKirjain(String merkkijono) {
        int pituus = merkkijono.length();
        return merkkijono.charAt(pituus - 1);
    }
}
