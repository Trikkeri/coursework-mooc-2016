
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.println("Anna nimi: ");
        System.out.println("Kirjainmäärä: " + laskeKirjaimet(lukija.nextLine()));
    }
    
    // tee tänne metodi 
    //public static int laskeKirjaimet(String merkkijono)
    public static int laskeKirjaimet(String merkkijono) {
        return merkkijono.length();
    }
    
}
