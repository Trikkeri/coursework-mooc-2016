import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tietokanta {
    private Scanner lukija;
    private Havainto havainto;
    
    public Tietokanta(Scanner lukija) {
        this.lukija = lukija;
        this.havainto = new Havainto();
    }
    
    public void kaynnista() {
        String syote = "";
        
        while(true) {
            System.out.print("? ");
            syote = lukija.nextLine().toLowerCase();
            
            switch(syote) {
                case "lisaa": 
                    lisaaLintu();
                    break;
                    
                case "havainto":
                    lisaaHavainto();
                    break;
                    
                case "tilasto":
                    tulostaTilasto();
                    break;
                    
                case "nayta":
                    tulostaLinnunTiedot();
                    break;
                    
                case "lopeta":
                    return;
            }
            
            
        }
    }
    
    private void lisaaLintu() {
        System.out.print("Nimi: ");
        String nimiSuomeksi = lukija.nextLine();
        System.out.print("Latinankielinen nimi: ");
        String nimiLatinaksi = lukija.nextLine();
        havainto.lisaaLintu(nimiSuomeksi, nimiLatinaksi);
    }
    
    private void lisaaHavainto() {
        System.out.print("Mikä havaittu? ");
        String syote = lukija.nextLine();
        havainto.lisaaHavainto(syote);
    }
    
    private void tulostaTilasto() {
        List<Lintu> tilasto = havainto.getHavaintolista();
        tilasto.forEach(System.out::println);
    }
    
    private void tulostaLinnunTiedot() {
        System.out.print("Mikä? ");
        String syote = lukija.nextLine();
        Lintu lintu = havainto.haeLintu(syote);
        
        if(lintu != null) {
            System.out.print(lintu + "\n");
        }
    }
    
}
