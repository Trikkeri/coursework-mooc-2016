
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();
        System.out.println(arvottuLuku);
        // OHJELMOI OHJELMASI TÄHÄN, ÄLÄ MUOKKAA YLLÄOLEVIA ASIOITA
        int arvattuLuku = 255;
        int arvausKertoja = 1;
        
        while(arvottuLuku != arvattuLuku) {
            System.out.print("Arvaa luku: ");
            arvattuLuku = Integer.parseInt(lukija.nextLine());

            if (arvattuLuku < arvottuLuku) {
                System.out.println("Luku on suurempi, tehtyjä arvauksia: " + arvausKertoja);
            } else if (arvattuLuku > arvottuLuku) {
                System.out.println("Luku on pienempi, tehtyjä arvauksia: " + arvausKertoja);
            } else {
                System.out.println("Onneksi olkoon, oikein arvattu!");
            }
            arvausKertoja++;
        }

    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}
