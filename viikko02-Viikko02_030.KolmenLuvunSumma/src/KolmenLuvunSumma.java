
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int luettu;

        
        // KIRJOITA OHJELMA TÄHÄN
        // ÄLÄ KÄYTÄ MUITA MUUTTUJIA KUIN lukija, summa JA luettu!
        System.out.println("Luku1: ");
        luettu = Integer.parseInt(lukija.nextLine());
        summa = luettu;
        System.out.println("Luku2:");
        luettu = Integer.parseInt(lukija.nextLine());
        summa = summa + luettu;
        System.out.println("Luku3:");
        luettu = Integer.parseInt(lukija.nextLine());
        summa = summa + luettu;
        System.out.println("Summa: " + summa);
    }
}
