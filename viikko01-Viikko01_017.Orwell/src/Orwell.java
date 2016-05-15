
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Anna luku: ");
        int nopeus = Integer.parseInt(lukija.nextLine());
        
        if(nopeus == 1984) {
            System.out.println("Orwell!");
        }
    }
}
