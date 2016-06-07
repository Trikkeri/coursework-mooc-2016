package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MuistavaSanakirja {
    
    private Map<String, String> sanakirja;
    private String tiedostonNimi;
    
    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
    }
    
    public MuistavaSanakirja(String tiedosto) {
        this.tiedostonNimi = tiedosto;
        this.sanakirja = new HashMap<>();
    }
    
    public boolean lataa() {
               
        File tiedosto;
        Scanner lukija;
        
        try {
            tiedosto = new File(this.tiedostonNimi);
            lukija = new Scanner(tiedosto);        
        } catch(Exception FileNotFoundException) {
            System.out.println("Tiedosto hukassa!");
            return false;
        }
        
        while(lukija.hasNextLine()) {
            String rivi = lukija.nextLine();
            String[] osat = rivi.split(":");   // pilkotaan rivi :-merkkien kohdalta
            this.lisaa(osat[0], osat[1]);
        }
        
        lukija.close();
        return true;
    }
    
    public boolean tallenna() {
        
        ArrayList<String> tallennettavatSanat = new ArrayList<>(); 
        tallennettavatSanat = haeTallennettavatSanat();
        
        File tiedosto;
        FileWriter fw;
        
        tiedosto = new File(this.tiedostonNimi);
        
        try {
            fw = new FileWriter(tiedosto);
            
            for (String sana : tallennettavatSanat) {
                fw.write(sana);
            }
           
            fw.close();
        } catch(Exception IOException) {
            System.out.println("Ongelmia tiedostoon kirjoittamisessa!");
            return false;
        }
        return true;
    }
    
    public void lisaa(String sana, String kaannos) {
        if(!this.sanakirja.containsKey(sana)) {
            this.sanakirja.put(sana, kaannos);
        }
    }
    
    public String kaanna(String sana) {

        for (Map.Entry<String, String> entry : this.sanakirja.entrySet()) {
            if(entry.getKey().equals(sana)) {
                return entry.getValue();
            }
            if(entry.getValue().equals(sana)) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    public void poista(String sana) {
        
        ArrayList<String> poistettavatSanat = new ArrayList<>();
        
        for (Map.Entry<String, String> entry : this.sanakirja.entrySet()) {
            if(entry.getKey().equals(sana)) {
                poistettavatSanat.add(entry.getKey());
            }
            if(entry.getValue().equals(sana)) {
                poistettavatSanat.add(entry.getKey());
            }
        }
        
        for (int i = 0; i < poistettavatSanat.size(); i++) {
            this.sanakirja.remove(poistettavatSanat.get(i));
        }
    }

    private ArrayList<String> haeTallennettavatSanat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
