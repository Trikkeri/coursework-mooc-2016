
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    // tee ohjelmaasi VAIN YKSI Scanner-olio
    // jos joudut käyttämään Scanneria muualta kuin luontipaikasta, välitä se parametrina

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Tietokanta tietokanta = new Tietokanta();
        
        String syote = "";
        
        while(true) {
            System.out.print("? ");
            syote = lukija.nextLine().toLowerCase();
            
            switch(syote) {
                case "lisaa": 
                    lisaaLintu(lukija, tietokanta);
                    break;
                    
                case "havainto":
                    lisaaHavainto(lukija, tietokanta);
                    break;
                    
                case "tilasto":
                    tulostaTilasto(tietokanta);
                    break;
                    
                case "nayta":
                    tulostaLinnunTiedot(lukija, tietokanta);
                    break;
                    
                case "lopeta":
                    return;
            }
        }
    }
    
    private static void lisaaLintu(Scanner lukija, Tietokanta tietokanta) {
        System.out.print("Nimi: ");
        String nimiSuomeksi = lukija.nextLine();
        System.out.print("Latinankielinen nimi: ");
        String nimiLatinaksi = lukija.nextLine();
        tietokanta.lisaaLintu(nimiSuomeksi, nimiLatinaksi);
    }
    
    private static void lisaaHavainto(Scanner lukija, Tietokanta tietokanta) {
        System.out.print("Mikä havaittu? ");
        String syote = lukija.nextLine();
        tietokanta.lisaaHavainto(syote);
    }
    
    private static void tulostaTilasto(Tietokanta tietokanta) {
        List<Lintu> tilasto = tietokanta.getHavaintolista();
        tilasto.forEach(System.out::println);
    }
    
    private static void tulostaLinnunTiedot(Scanner lukija, Tietokanta tietokanta) {
        System.out.print("Mikä? ");
        String syote = lukija.nextLine();
        Lintu lintu = tietokanta.haeLintu(syote);
        
        if(lintu != null) {
            System.out.print(lintu + "\n");
        }
    }
    
}
