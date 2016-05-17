
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Numerotiedustelu numerotiedustelu;
    
    public Kayttoliittyma(Scanner lukija,Numerotiedustelu numerotiedustelu) {
        this.numerotiedustelu = numerotiedustelu;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        System.out.println("numerotiedustelu");
        tulostaValikko();
        
        String syote = "";
        
        while(true) {
            System.out.print("\nkomento: ");
            syote = this.lukija.nextLine();

            if(syote.equalsIgnoreCase("X")) {
                return;
            }
            
            if(syote.equals("1")) {
                numeronLisays();
            }
            
            if(syote.equals("2")) {
                haeHenkilonNumerot();
            }
            
            if(syote.equals("3")) {
                haeHenkiloPuhelinnumerolla();
            }
            
            if(syote.equals("4")) {
                lisaaOsoite();
            }
            
            if(syote.equals("5")) {
                tulostaHenkilonTiedot();
            }
            
            if(syote.equals("6")) {
                kyselePoistettavaHenkilo();
            }
        }
    }
    
    private void tulostaValikko() {
        System.out.println("käytettävissä oleva komennot");
        System.out.println("1 lisää numero");
        System.out.println("2 hae numerot");
        System.out.println("3 hae puhelinnumeroa vastaava henkilö");
        System.out.println("4 lisää osoite");
        System.out.println("5 hae henkilön tiedot");
        System.out.println("6 poista henkilön tiedot");
        System.out.println("7 filtteröity listaus");
        System.out.println("X lopeta");
    }
    
    private void numeronLisays() {
        System.out.print("kenelle: ");
        String nimi = this.lukija.nextLine();
        System.out.print("numero: ");
        String numero = this.lukija.nextLine();
        
        this.numerotiedustelu.lisaaNumero(nimi, numero);      
    }
    
    private void haeHenkilonNumerot() {
        System.out.print("kenen: ");
        String nimi = this.lukija.nextLine();
        
        if(this.numerotiedustelu.haeNumeroaNimella(nimi) == null) {
            System.out.print("  ei löytynyt\n");
        } else {
            List<String> numerot = new ArrayList<>();
            numerot = this.numerotiedustelu.haeNumeroaNimella(nimi);
            
            for(String numero : numerot) {
                System.out.println(  numero);
            }
        }
    }
    
    private void haeHenkiloPuhelinnumerolla() {
        System.out.print("numero: ");
        String numero = this.lukija.nextLine();
        
        if(this.numerotiedustelu.haeNimeaNumerolla(numero) == null) {
            System.out.print("  ei löytynyt\n");
        } else {
            System.out.println(this.numerotiedustelu.haeNimeaNumerolla(numero));
        }
    }
    
    private void lisaaOsoite() {
        System.out.print("kenelle: ");
        String nimi = this.lukija.nextLine();
        System.out.print("katu: ");
        String katu = this.lukija.nextLine();
        System.out.print("kaupunki: ");
        String kaupunki = this.lukija.nextLine();
        
        this.numerotiedustelu.lisaaOsoite(nimi, katu, kaupunki);
    }
    
    private void tulostaHenkilonTiedot() {
        System.out.print("kenen: ");
        String nimi = this.lukija.nextLine();
        
        Map<String, String> osoitteet = new HashMap<>();
        osoitteet = this.numerotiedustelu.haeHenkilonOsoitteet(nimi);

        if(this.numerotiedustelu.haeHenkilonOsoitteet(nimi) == null || osoitteet.isEmpty()) {
            System.out.print("  osoite ei tiedossa\n");
        } else {
            System.out.print("  osoite: ");
            for(Entry<String, String> osoite : osoitteet.entrySet()) {
            System.out.print(osoite.getKey() + " ");
            System.out.print(osoite.getValue() + "\n");
            }
        }

        System.out.print("  puhelinnumerot: ");
        if(this.numerotiedustelu.haeNumeroaNimella(nimi) == null) {
            System.out.print("\n  ei puhelinta\n");
        } else {
            System.out.println(this.numerotiedustelu.haeNumeroaNimella(nimi));
        }
    }
    
    private void kyselePoistettavaHenkilo() {
        System.out.print("kenet: ");
        String nimi = this.lukija.nextLine();
        this.numerotiedustelu.poistaHenkilo(nimi);
    }
    
}
