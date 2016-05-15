
import java.util.Scanner;

public class Paaohjelma {

    // tee ohjelmaasi VAIN YKSI Scanner-olio
    // jos joudut käyttämään Scanneria muualta kuin luontipaikasta, välitä se parametrina

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String komento = "";
        Bongari bongari = new Bongari();
        
        while(true) {
            System.out.print("? ");
            String syote = lukija.nextLine();
            
            if(syote.contains("Lisaa")) {
                System.out.print("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.print("Latinankielinen nimi: ");
                String latinaksi = lukija.nextLine();
                bongari.lisaa(nimi, latinaksi);
            }
            
            if(syote.contains("Tilasto")) {
                bongari.tilasto();
            }
            
            if(syote.contains("Havainto")) {
                System.out.println("Mikä havaittu?");
                String havainto = lukija.nextLine();
                bongari.havainto(havainto);
            }
            
            if(syote.contains("Nayta")) {
                System.out.print("Mikä? ");
                String hakusana = lukija.nextLine();
                bongari.etsi(hakusana);
            }
            
            if(syote.contains("Lopeta")) {
                return;
            }
            
        }
        
    }

}
