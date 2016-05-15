
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // tee ohjelmasi tänne
        // älä kuitenkaan tee kaikkea koodia mainiin, vaan suunnittele ohjelmalle järkevä rakenne
        // ÄLÄ tee ohjelmaasi muita Scannereita kuin tässä luotu
        // jos joudut käyttämään Scanneria muusta metodista, välitä se parametrina tehtävän 73 tapaan
        
        Arvosana arvosana = new Arvosana();
        
        // Etene ohjelmassa vain jos käyttäjä on syöttänyt hyväksyttyjä arvoja
        if(arvosana.kysyPisteet(lukija) == false) {
            arvosana.kasittelePisteet();
            arvosana.tulostaJakauma();
        } 
    }
}
