
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Kirjasto {
    private ArrayList<Kirja> kirjat;
    
    public Kirjasto() {
        this.kirjat = new ArrayList<>();
    }
    
    public void lisaaKirja(Kirja uusiKirja) {
        this.kirjat.add(uusiKirja);
    }
    
    public void tulostaKirjat() {
        for(Kirja kirja : kirjat) {
            System.out.println(kirja);
        }
    }
    
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimike) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();       
        
        haku(nimike, loydetyt, 1);
        
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        
        haku(julkaisija, loydetyt, 2);
        
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        
        String hakuvuosi = String.valueOf(julkaisuvuosi);
        haku(hakuvuosi, loydetyt, 3);
        
        return loydetyt;
    }

    private void haku(String haettava, ArrayList<Kirja> loydetyt, int moodi) {
        for(Kirja kirja : kirjat) {
            
            if(moodi == 1) {
                if(StringUtils.sisaltaa(kirja.nimeke(), haettava)) {
                    loydetyt.add(kirja);
                }
            }
            
            if(moodi == 2) {
                if(StringUtils.sisaltaa(kirja.julkaisija(), haettava)) {
                    loydetyt.add(kirja);
                }
            }

            if(moodi == 3) { 
                if(kirja.julkaisuvuosi() == Integer.parseInt(haettava)) {
                    loydetyt.add(kirja);
                }
            }
        }
    }
}
