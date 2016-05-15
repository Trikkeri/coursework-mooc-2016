
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tulostaja {
    private ArrayList<String> rivit;
    
    public Tulostaja(String tiedostonNimi) throws Exception {
        this.rivit = new ArrayList<>();
        
        File tiedosto = new File(tiedostonNimi);
        Scanner lukija = new Scanner(tiedosto);
        
        while(lukija.hasNextLine()) {
            rivit.add(lukija.nextLine());
        }
        lukija.close();
        
    }
    
    public void tulostaRivitJoilla(String sana) throws FileNotFoundException {
        for(String rivi : rivit) {
            if(rivi.contains(sana)) {
                System.out.println(rivi);
            }
        }
    }
}
