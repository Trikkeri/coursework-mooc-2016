
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedostonKasittelija {

    public ArrayList<String> lue(String tiedosto) throws FileNotFoundException {
        ArrayList<String> luetutRivit = new ArrayList<>();
        
        File f = new File(tiedosto);
        Scanner tiedostonLukija = new Scanner(f);
        
        while(tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            luetutRivit.add(rivi);
        }
        tiedostonLukija.close();
        
        return luetutRivit;
    }

    public void tallenna(String tiedosto, String teksti) throws IOException {
        File f = new File(tiedosto);
        
        FileWriter fw = new FileWriter(tiedosto);
        
        String kirjoitettavaTeksti = teksti + "\n";
        
        if(f.exists()) {
            fw.append(kirjoitettavaTeksti);
        } else {
            fw.write(kirjoitettavaTeksti);
        }
        fw.close();        
    }

    public void tallenna(String tiedosto, ArrayList<String> tekstit) throws IOException {
        
        File f = new File(tiedosto);
        
        FileWriter fw = new FileWriter(tiedosto);
        
        for(String str : tekstit) {
            
            String kirjoitettavaTeksti = str + "\n";
            
            if(f.exists()) {
                fw.append(kirjoitettavaTeksti);
            } else {
                fw.write(kirjoitettavaTeksti);
            }
        }
        fw.close();         
    }
}
