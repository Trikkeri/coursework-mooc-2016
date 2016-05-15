import java.util.Scanner;

public class NimenKaantaminen {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Tee koodisi tänne
        
        System.out.println("Anna nimi:");
        String nimi = lukija.nextLine();
        int i = nimi.length() - 1;
        String kaanto = "";
        
        while(i >= 0) {
            kaanto += nimi.charAt(i);
            System.out.println(kaanto);
            i--;
        }
        
        System.out.println("Väärinpäin: " + kaanto);
    }
}
