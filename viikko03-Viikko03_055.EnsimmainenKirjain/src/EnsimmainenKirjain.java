import java.util.Scanner;

public class EnsimmainenKirjain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna nimi: ");
        System.out.println("Ensimmäinen kirjain: " + ensimmainenKirjain(lukija.nextLine()));
    }
    
    public static char ensimmainenKirjain(String merkkijono) {
        return merkkijono.charAt(0);
    }
}
