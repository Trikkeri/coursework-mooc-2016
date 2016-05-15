import java.util.Scanner;

public class EnsimmaisetKirjaimet {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        
        if(nimi.length() >= 3) {
            System.out.println("1. kirjain: " + nimi.charAt(0));
            System.out.println("2. kirjain: " + nimi.charAt(1));
            System.out.println("3. kirjain: " + nimi.charAt(2));
        }
    }
}
