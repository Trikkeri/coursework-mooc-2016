import java.util.ArrayList;
import java.util.Scanner;
import tktl.Soitin;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Aani> aanet = new ArrayList<>();
        
        System.out.println("Kirjoita soitettavat äänet");
        
        String syote = lukija.nextLine();
        
        if(syote.contains("TKO-ALY")) {
            syote = "C D C D C D F F F C G F AAAAAAH";
        }
        
        int index = 0;
        while(index < syote.length()) {      

            if(syote.charAt(index) == ' ') {
                aanet.add(new Aani(0.0, 0.1));
            }
            
            if(syote.charAt(index) == 'C') {
                aanet.add(new Aani(261.626,0.5));
            }
            
            if(syote.charAt(index) == 'D'){
                aanet.add(new Aani(293.665,0.5));
            }
            
            if(syote.charAt(index) == 'E') {
                aanet.add(new Aani(329.628,0.5));
            }
            
            if(syote.charAt(index) == 'F') {
                aanet.add(new Aani(349.228,0.5));
            }
            
            if(syote.charAt(index) == 'G') {
                aanet.add(new Aani(391.995,0.5));
            }
            
            if(syote.charAt(index) == 'A') {
                aanet.add(new Aani(440.000,0.5));
            }
            
            if(syote.charAt(index) == 'H') {
                aanet.add(new Aani(493.883,0.5));
            }
            index++;
        }

        System.out.println("Soitetaan!");
           
        Soitin soitin = new Soitin();
        soitin.soita(aanet);
    }
}
