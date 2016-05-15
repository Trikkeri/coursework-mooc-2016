
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen: ");
        int ensimmainen = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Viimeinen: ");
        int viimeinen = Integer.parseInt(lukija.nextLine());
        
        int summa = 0;
        int summattava = ensimmainen;
        while (summattava <= viimeinen) {
            summa += summattava;
            summattava++;
        }
        System.out.println("Summa on " + summa);
    }
}
