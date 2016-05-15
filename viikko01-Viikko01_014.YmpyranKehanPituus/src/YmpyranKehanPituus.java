
import java.util.Scanner;

public class YmpyranKehanPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Anna ympyrän säde: ");
        int sade = lukija.nextInt();
        
        double tulos = 2 * Math.PI * sade;
        System.out.println("Ympyrän kehä: " + tulos);
    }
}
