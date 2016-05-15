package sanatutkimus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanatutkimus {
    
    private ArrayList<String> rivit;
    
    public Sanatutkimus(File tiedostonNimi) throws FileNotFoundException {
        Scanner lukija = new Scanner(tiedostonNimi, "UTF-8");
        this.rivit = new ArrayList<>();
        
        while(lukija.hasNextLine()) {
            this.rivit.add(lukija.nextLine());
        }
        lukija.close();
    }
    
    public int sanojenMaara() {
        int sanojenMaara = 0;
        for(String rivi : this.rivit) {
            sanojenMaara++;
        }
        return sanojenMaara;
    }
    
    public List<String> kirjaimenZSisaltavatSanat() {
        List<String> zSanat = new ArrayList<>();
        
        for(String sana : this.rivit) {
            if(sana.contains("z") || sana.contains("Z")) {
                zSanat.add(sana);
            }
        }
        return zSanat;
    }
    
    public List<String> kirjaimeenLPaattyvatSanat() {
        List<String> lPaatteiset = new ArrayList<>();
        
        for(String sana : this.rivit) {
            if(sana.endsWith("l")) {
                lPaatteiset.add(sana);
            }
        }
        return lPaatteiset;
    }
    
    public List<String> palindromit() {
        List<String> palindromit = new ArrayList<>();
        
        for(String sana : this.rivit) {
            
            if(onkoPalindromi(sana)) {
                palindromit.add(sana);
            }
        }
        return palindromit;
    }
    
    public boolean onkoPalindromi(String sana) {
        
        String kaannettySana = "";
        
        for (int i = sana.length() - 1; i >= 0; i--) {
            kaannettySana +=sana.charAt(i);
        }
        if(kaannettySana.equalsIgnoreCase(sana)) {
            return true;
        } else {
            return false;
        }
    }
    
    public List<String> kaikkiVokaalitSisaltavatSanat() {
        List<String> sanassaKaikkiVokaalit = new ArrayList<>();
        
            for(String sana : this.rivit) {
                if(sana.contains("a") &&
                   sana.contains("e") &&
                   sana.contains("i") &&
                   sana.contains("o") &&
                   sana.contains("u") && 
                   sana.contains("u") &&
                   sana.contains("y") &&
                   sana.contains("ä") &&
                   sana.contains("ö")) {
                    
                    sanassaKaikkiVokaalit.add(sana);
                }
            }
        //aeiouyäö
        return sanassaKaikkiVokaalit;
    }
    
}
