package tiedosto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Analyysi {
    private ArrayList<String> rivit;
    
    
    public Analyysi(File tiedosto) throws FileNotFoundException {
        Scanner lukija = new Scanner(tiedosto);
        this.rivit = new ArrayList<>();
        
        while(lukija.hasNextLine()) {
            rivit.add(lukija.nextLine());
        }
        lukija.close();
    }
    
    public int rivimaara() {
        return rivit.size();
    }
    
    public int merkkeja() {
        
        int merkkeja = 0;
        for(String rivi : this.rivit) {
            merkkeja += rivi.length();
            
            // Kasvatetaan merkkeja yhdella jokaisen rivin jälkeen jotta huomiodaan myös rivinvaihto
            merkkeja++;
        }
        
        return merkkeja;
    }
    
}
