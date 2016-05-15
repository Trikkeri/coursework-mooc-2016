
import java.util.Scanner;

public class Numerotiedustelu {
    private Scanner lukija;
    
    public Numerotiedustelu() {
        this.lukija = new Scanner(System.in);
    }
    
    public void kaynnista() {
        System.out.println("numerotiedustelu");
        tulostaValikko();
        
        while(true) {
            String syote = this.lukija.nextLine();

            if(syote.equalsIgnoreCase("X")) {
                return;
            }
            
            if(syote.equals("1")) {
                
            }
            
        }
        
    }
    
    private void tulostaValikko() {
        System.out.println("käytettävissä oleva komennot");
        System.out.println("1 lisää numero");
        System.out.println("2 hae numerot");
        System.out.println("X lopeta");
    }
    
}
