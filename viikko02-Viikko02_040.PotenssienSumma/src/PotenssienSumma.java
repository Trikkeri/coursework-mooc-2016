
import java.util.Scanner;

public class PotenssienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku? ");
        int kerrattava = Integer.parseInt(lukija.nextLine());
        
        int tulos = 0;
        int luku = 2;
        int potenssi = 0;
        int potenssienSumma = 0;
        
        while (potenssi <= kerrattava) {
            tulos = (int) Math.pow(luku, potenssi);
            potenssienSumma += tulos;
            System.out.println("Tulos " + tulos + " Luku " + luku + " Kerrattava " + potenssi + " summa " + potenssienSumma);
            potenssi++;
        }
        System.out.println("Kertoma on " + potenssienSumma);
        
    }
}
