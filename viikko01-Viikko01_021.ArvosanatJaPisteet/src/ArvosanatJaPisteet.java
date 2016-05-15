
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-100]: ");
        int pisteet = Integer.parseInt(lukija.nextLine());
        
        if(pisteet > 100) {
            System.out.println("Arvosana: uskomatonta!");
        } else if (pisteet <= 100 && pisteet > 89) {
            System.out.println("Arvosana: 5");
        } else if (pisteet < 90 && pisteet > 74){
            System.out.println("Arvosana: hyväksytty");
        } else if (pisteet < 75 && pisteet > -1){
            System.out.println("Arvosana: hylätty");
        } else {
            System.out.println("Arvosana: mahdotonta!");
        }

    }
}
