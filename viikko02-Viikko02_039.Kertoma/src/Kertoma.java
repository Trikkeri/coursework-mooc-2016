import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku? ");
        int kerrat = Integer.parseInt(lukija.nextLine());
        
        int summa = 1;
        int kerrattava = 1;
        while (kerrattava <= kerrat) {
            summa *= kerrattava;
            kerrattava++;
        }
        System.out.println("Kertoma on " + summa);
        
    }
}
