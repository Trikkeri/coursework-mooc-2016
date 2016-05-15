
import java.util.Scanner;

public class KirjaimetErikseen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        
        int i = 0;
        while(i < nimi.length()) {
            System.out.println(i+1 + ". kirjain: " + nimi.charAt(i));
            i++;
        }
    }
}
