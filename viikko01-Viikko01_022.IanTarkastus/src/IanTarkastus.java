
import java.util.Scanner;

public class IanTarkastus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet? ");
        int ika = Integer.parseInt(lukija.nextLine());
        
        if(ika < 121 && ika >= 0) {
            System.out.println("OK");
        } else {
            System.out.println("Mahdotonta!");
        }
    }
}
