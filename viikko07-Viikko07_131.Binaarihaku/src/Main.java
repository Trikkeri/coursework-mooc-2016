
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tässä voit testata binäärihakua
        int[] taulukko = {-3, 2, 3, 4, 7, 8, 12};
        Scanner lukija = new Scanner(System.in);

        System.out.print("Taulukon luvut: " + Arrays.toString(taulukko));
        System.out.println();

        System.out.print("Anna haettava luku: ");
        String etsittavaLuku = lukija.nextLine();
        System.out.println();

        // haku voi olettaa että luvut ovat järjestyksessä
        boolean tulos = BinaariHaku.hae(taulukko, Integer.parseInt(etsittavaLuku));

        // Tulosta tässä binäärihaun tulos
        if(tulos) {
            System.out.println("Luku " + etsittavaLuku + " on taulukossa");
        } else {
            System.out.println("Luku " + etsittavaLuku + " ei ole taulukossa");  
        }
        
    }
}
