
import java.util.Scanner;

public class EipasJuupas {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Eipäs Juupas"
        System.out.print("Syötä ensimmäinen merkkijono: ");
        String merkkijono1 = lukija.nextLine();
        System.out.print("Syötä toinen merkkijono: ");
        String merkkijono2 = lukija.nextLine();
        
        if(merkkijono1.equalsIgnoreCase(merkkijono2)) {
            System.out.println("Olipas!");
            System.out.println("No eipäs ollut!");
            System.out.println("Juupas!");
        } else {
            System.out.println("Eipäs ollut!");
            System.out.println("Juupas!");
            System.out.println("Eipäs!");
        }
    }
}
