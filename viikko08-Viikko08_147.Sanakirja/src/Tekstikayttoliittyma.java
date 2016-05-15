
import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        String syote = "";
        System.out.println("Komennot");
        System.out.println("   lisaa - lisää sanaparin sanakirjaan");
        System.out.println("   kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("   lopeta - poistuu käyttliittymästä");
        
        while(true) {
            System.out.print("\nKomento: ");
            syote = this.lukija.nextLine();
            
            if(syote.equals("lisaa")) {
                System.out.print("Suomeksi: ");
                syote = this.lukija.nextLine();
                System.out.print("Käännös: ");
                String kaannos = this.lukija.nextLine();
                this.sanakirja.lisaa(syote, kaannos);
                
            } else if(syote.equals("kaanna")) {
                System.out.print("Anna sana: ");
                syote = this.lukija.nextLine();     
                System.out.println("Käännös: " + this.sanakirja.kaanna(syote));
                
            } else if(syote.equals("lopeta")) {
                System.out.println("Hei hei!");
                return;     
            } else {
                System.out.println("Tuntematon komento.\n");
            }
        }
    }
    
}
