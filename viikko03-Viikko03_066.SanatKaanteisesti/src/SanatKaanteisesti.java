import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanatKaanteisesti {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Tee tänne edellisen tehtävän tapaan ArrayList, johon laitat sanat
        
        ArrayList<String> sanat = new ArrayList<>();

        while(true) {
            
            System.out.print("Anna sana: ");
            String sana = lukija.nextLine();
            sanat.add(sana);
            
            if(sana.isEmpty()){
                System.out.println("Annoit seuraavat sanat: ");
                Collections.reverse(sanat);
                for(String sanaset : sanat) {
                    System.out.println(sanaset);
                }
                break;
            }
        }
    }
}
