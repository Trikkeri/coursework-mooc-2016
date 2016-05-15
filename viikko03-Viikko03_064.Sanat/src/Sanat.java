import java.util.ArrayList;
import java.util.Scanner;

public class Sanat {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<>();
     
        //for(String sana : sanat) {
        for(int i = 0;i <= sanat.size();i++) {
            
            System.out.print("Anna sana: ");
            String sana = lukija.nextLine();
            sanat.add(sana);
            
            if(sana.isEmpty()){
                System.out.println("Annoit seuraavat sanat: ");
                for(String sanaset : sanat) {
                    System.out.println(sanaset);
                }
                break;
            }
        }
        
    }
}
