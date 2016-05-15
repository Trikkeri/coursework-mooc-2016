
import java.util.Scanner;

public class SalasanaTahtina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Salasana tähtinä"
        System.out.println("Anna salasanasi: ");
        String salasana = lukija.nextLine();
        
        System.out.println("Salasanasi on siis " + tahdiksi(salasana));
    }
    
    public static String tahdiksi(String sana) {
        String tahtina = "";
        for (int i = 0; i < sana.length(); i++) {
            tahtina += "*";
        }
            
        return tahtina;
    }
}
