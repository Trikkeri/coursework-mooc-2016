import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna sana: ");
        String sana = lukija.nextLine();
        System.out.println("Loppuosan pituus: ");
        int pituus = Integer.parseInt(lukija.nextLine());
        pituus = sana.length() - pituus;
        System.out.println("Tulos: " + sana.substring(pituus));
    }
}
