
import java.util.Locale;
import java.util.Scanner;

public class Desibelimittaukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta tänne ohjelma, joka laskee desibelimittausten keskiarvoja
        // Huomaa että ohjelmassa ei ole paikallisia testejä, vaan ohjelman
        // toiminta tarkastetaan palvelimella
        int syote = 0;
        int syotteidenMaara = 0;
        double summa = 0; 
        
        System.out.println("Anna desibelilukuja, lopeta luvulla 9999.");
        
        while(syote != 9999) {
            System.out.println("Anna desibelilukuja: ");
            syote = Integer.parseInt(lukija.nextLine());
            
            if(syote >= 0 && syote != 9999) {
                summa = summa + syote;
                syotteidenMaara++;
            } 
        }
        
        if(syotteidenMaara == 0) {
            System.out.println("Yhtään desibelilukua ei syötetty.");
        } else {
            System.out.println("Desibelilukujen keskiarvo on " + (double) summa / syotteidenMaara);
        }
    }
}
