package luola;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Luola {
    
    private int siirtoja;
    private Pelimerkki[][] pelialue;
    private int leveys;
    private int korkeus;
    private boolean hirvioitLiikkuvat;
    
    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirvioitLiikkuvat) {
        this.siirtoja = siirtoja;
        this.pelialue = new Pelimerkki[leveys][korkeus];
        this.hirvioitLiikkuvat = hirvioitLiikkuvat;
        
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
            tulostaPelialue();
        }
        
        
    }

    private void tulostaSijainnit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void tulostaPelialue() {
        for (int x = 0; x < this.pelialue.length; x++) {
            //System.out.println(this.pelialue[i][0]);
            System.out.println("");
            for (int y = 0; y < this.pelialue.length; y++) {
                System.out.print(this.pelialue[x][y]);
            }
        }
        System.out.print("\n\n");
    }

    private void populoiPelialue() {
        
        // Aluksi sijoitetaan pelialueelle 'tyhjät' kohdat
        for (int x = 0; x < this.pelialue.length; x++) {
            this.pelialue[0][x] = new Pelimerkki('.', x, 0);
                
            for (int y = 0; y < this.pelialue.length; y++) {
                this.pelialue[x][y] = new Pelimerkki('.', x, y);
            } 
        }
        
        // Sijoitetaan pelialueelle pelaaja
        this.pelialue[0][0] = new Pelimerkki('@', 0, 0);
        
        // Sijoitetaan pelialueelle satunnaisesti hirviöt
     
    }
    
    public void liiku(String suunta) {
        //Pelimerkki pelaaja = selvitaPelaajanSijaintiTaulukossa();
        Pelimerkki pelaaja = null;
        Pelimerkki siirrettava = null;
        
        for (int x = 0; x < this.pelialue.length; x++) {
            for (int y = 0; y < this.pelialue.length - 1; y++) {
                if(this.pelialue[x][y].getTyyppi() == '@') {
                    
                    // Liikkuu oikealle
                    pelaaja = this.pelialue[x][y];
                    siirrettava = this.pelialue[x][y + 1];
                    this.pelialue[x][y + 1] = pelaaja;
                    this.pelialue[x][y] = siirrettava;
                    
                    return;
                }
            }
        }
        
    }
    
    private Pelimerkki selvitaPelaajanSijaintiTaulukossa() {
        Pelimerkki pelaaja = null;
        
        for (int x = 0; x < this.pelialue.length; x++) {
            for (int y = 0; y < this.pelialue.length; y++) {
                if(this.pelialue[x][y].getTyyppi() == '@') {
                    pelaaja = this.pelialue[x][y];
                }
            }
        }
        return pelaaja;
    }
    
}
