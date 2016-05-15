
import java.util.HashMap;
import java.util.Scanner;

public class Numeropalvelu {

    public static void main(String[] args) {
        // Toteuta numeropalvelu tänne
        Scanner lukija = new Scanner(System.in);
        HashMap<String, String> numerot = new HashMap<>();
        
        while(true) {
            System.out.print("\nSyötä puhelinnumero, tyhjä lopettaa: ");
            String numero = lukija.nextLine();
            
            if(numero.isEmpty()){
                break;
            }
            System.out.print("Syötä nimi: ");
            String nimi = lukija.nextLine();
            if(nimi.isEmpty()) {
                break;
            }
            numerot.put(numero, nimi);            
        }
        System.out.println("\n Kiitos!");
        
        System.out.println("\n* Numeropalvelu * ");

        while(true) {
            System.out.println("\nMikä numero tarkistetaan?");
            System.out.print("> ");
            String tarkistettava = lukija.nextLine();
            
            if(tarkistettava.isEmpty()) {
                break;
            } else if(numerot.containsKey(tarkistettava)) {
                System.out.println("Soittaja on " + numerot.get(tarkistettava));
            } else {
                System.out.println("Tuntematon numero.");
            }
        }
    }
}
