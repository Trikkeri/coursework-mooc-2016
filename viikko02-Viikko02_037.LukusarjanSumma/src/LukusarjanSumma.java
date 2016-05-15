
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mihin asti? ");
        int kerrat = Integer.parseInt(lukija.nextLine());
        
        int summa = 0;
        int summattava = 1;
        while (summattava <= kerrat) {
            summa += summattava;
            summattava++;
        }
        System.out.println("Summa on " + summa);
    }
}
