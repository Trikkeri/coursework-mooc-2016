
import java.util.HashMap;
import java.util.Scanner;

public class Kahvikassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        HashMap<String, Integer> kahvit = new HashMap<>();

        while(true) {
            // kahvikassan toiminnallisuus
            System.out.println("\n** Kahvikassa **");
            System.out.print("> ");
            String nimi = lukija.nextLine();
            if(nimi.isEmpty()) {
                break;
            }
            haeTiedot(kahvit, nimi);
        
            System.out.println("\nKirjoita " + (char)34+ "juo" + (char)34+ " jos haluat juoda kahvin, " + (char)34 + "tuo" + (char)34+ " jos toit kahvipaketin.");
            System.out.print("> ");
            String syote = lukija.nextLine();
        
            if(syote.equals("juo")) {
                muutaSaldoa(kahvit, nimi, +1);
            } else if (syote.equals("tuo")) {
                muutaSaldoa(kahvit, nimi, -10);
            } 
            haeTiedot(kahvit, nimi);
        }    
    }

    // metodit
    public static void haeTiedot(HashMap<String, Integer> kassa, String nimi) {
        if(!kassa.containsKey(nimi)) {
            System.out.println("Luodaan tunnus " + nimi + ".");
            kassa.put(nimi, 0);
        } 
        System.out.println("Juotuja kahveja " + kassa.get(nimi) + ".");
    }
    
    public static void muutaSaldoa(HashMap<String, Integer> kassa, String nimi, int paljonko) {
//        int nykySaldo = kassa.get(nimi);
//        paljonko = nykySaldo + paljonko;
//        kassa.replace(nimi, paljonko);
          kassa.put(nimi, kassa.get(nimi) + paljonko);
    }
}
