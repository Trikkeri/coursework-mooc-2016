
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        
        // KIRJOITA OHJELMASI TÄNNE
        System.out.println("Mihin asti? ");
        int luettuArvo = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Mista lähtien? ");
        int lahtoLuku = Integer.parseInt(lukija.nextLine());
        
        while(lahtoLuku <= luettuArvo) {
            System.out.println(lahtoLuku);
            lahtoLuku++;
        }
    }
}
