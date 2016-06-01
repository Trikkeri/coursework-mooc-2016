package luola;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Luola {
    
    private int siirtoja;
    private Pelimerkki[][] pelialue;
    private int leveys;
    private int korkeus;
    
    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirvioitLiikkuvat) {
        this.siirtoja = siirtoja;
        this.pelialue = new Pelimerkki[leveys][korkeus];
        populoiPelialue();
    }
    
    public void run(Scanner lukija) {
        System.out.println(this.siirtoja + "\n");
        //tulostaSijainnit();
        tulostaPelialue();
        
        String syote = "";
        
        while(!syote.equals("q")) {
            System.out.println("Mihin liikutaan (w, a, s, d)? ");
            syote = lukija.nextLine();
            liiku(syote);
        }
        
        
    }

    private void tulostaSijainnit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void tulostaPelialue() {
        for (int i = 0; i < this.pelialue.length; i++) {
            //System.out.println(this.pelialue[i][0]);
            System.out.println("");
            for (int j = 0; j < this.pelialue.length; j++) {
                System.out.print(this.pelialue[i][j]);
            }
        }
        System.out.print("\n\n");
    }

    private void populoiPelialue() {
        
        // Aluksi sijoitetaan pelialueelle 'tyhjät' kohdat
        for (int i = 0; i < this.pelialue.length; i++) {
            this.pelialue[0][i] = new Pelimerkki('.', i, 0);
                
            for (int j = 0; j < this.pelialue.length; j++) {
                this.pelialue[i][j] = new Pelimerkki('.', i, j);
            } 
        }
        
        // Sijoitetaan pelialueelle pelaaja
        this.pelialue[0][0] = new Pelimerkki('@', 0, 0);
        
        // Sijoitetaan pelialueelle satunnaisesti hirviöt
     
    }
    
    public void liiku(String suunta) {
        Pelimerkki pelaaja = selvitaPelaajanSijaintiTaulukossa();
    }
    
    private Pelimerkki selvitaPelaajanSijaintiTaulukossa() {
        Pelimerkki pelaaja = null;
        
        for (int i = 0; i < this.pelialue.length; i++) {
            for (int j = 0; j < this.pelialue.length; j++) {
                if(this.pelialue[i][j].getTyyppi() == '@') {
                    pelaaja = this.pelialue[i][j];
                }
            }
        }
        return pelaaja;
    }
    
}
