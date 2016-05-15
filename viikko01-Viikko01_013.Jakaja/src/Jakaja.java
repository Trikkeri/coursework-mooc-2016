
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
        System.out.println("Jakolasku");
        System.out.println("X ");
        int luku1 = lukija.nextInt();
        System.out.println("Y ");
        int luku2 = lukija.nextInt();
        double tulos = 1.0 * luku1 / luku2;
        System.out.println(luku1 + " / " + luku2 + " = " + tulos);
    }
}
