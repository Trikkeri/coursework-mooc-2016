
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna tunnus: ");
        String ts = lukija.nextLine();
        
        System.out.println("Anna salasana: ");
        String ss = lukija.nextLine();
        
        if(ts.equals("aleksi") && ss.equals("tappara")) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else if(ts.equals("elina") && ss.equals("kissa")) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}
