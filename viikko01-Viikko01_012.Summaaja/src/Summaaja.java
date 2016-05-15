
import java.util.Scanner;

public class Summaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. Muista kysyä kaksi lukua käyttäjältä!
        System.out.println("Luku1: ");
        int luku1 = lukija.nextInt();
        System.out.println("Luku2: ");
        int luku2 = lukija.nextInt();
        int tulos = luku1 + luku2;
        System.out.println("Lukujen summa: " + tulos);
    }
}
