package luola;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Luola {
    
    private int siirtoja;
    private Pelimerkki[][] pelialue;
    private int leveys;
    private int korkeus;
    private boolean hirvioitLiikkuvat;
    private List<Pelimerkki> pelimerkit;
    
    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirvioitLiikkuvat) {
        this.siirtoja = siirtoja;
        this.pelialue = new Pelimerkki[leveys][korkeus];
        this.hirvioitLiikkuvat = hirvioitLiikkuvat;
        this.pelimerkit = new ArrayList<>();
        
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
            System.out.println("");
            for (int y = 0; y < this.pelialue[x].length; y++) {
                System.out.print(this.pelialue[x][y]);
            }
        }
        System.out.print("\n\n");
    }

    private void populoiPelialue() {
        
        // Aluksi sijoitetaan pelialueelle 'tyhjät' kohdat
        for (int x = 0; x < this.pelialue.length; x++) {
            this.pelialue[0][x] = new Pelimerkki('.', x, 0);
                
            for (int y = 0; y < this.pelialue[x].length; y++) {
                this.pelialue[x][y] = new Pelimerkki('.', x, y);
            } 
        }
        
        // Sijoitetaan pelialueelle pelaaja ja taulukkoon talteen
        Pelimerkki pelaaja = new Pelimerkki('@', 0, 0);
        this.pelialue[0][0] = pelaaja;
        this.pelimerkit.add(pelaaja);
        
        // Sijoitetaan pelialueelle satunnaisesti hirviöt
     
    }
    
    public void liiku(String suunta) {
        Pelimerkki pelaaja = null;
        Pelimerkki siirrettava = null;
        
        int pelaajaSiirtyyX = 0;
        int pelaajaSiirtyyY = 0;
        
        int siirrettavaSiirtyyX = 0;
        int siirrettavaSiirtyyY = 0;
        
        // Pelaaja aina ensimmäinen listassa
        pelaaja = this.pelimerkit.get(0);
                     
        if(suunta.equalsIgnoreCase("w")) {
            
            if(!siirtyykoPelimerkkiPelialueenUlkopuolelle(pelaaja)) {
                System.out.println(siirtyykoPelimerkkiPelialueenUlkopuolelle(pelaaja));
                return;
            }
            
            // Estetään pelaajaa suorittamasta siirtoa, joka vie pelaajan alueen ulkopuolelle yläsuunnasta
//            if(pelaaja.getY() - 1 < 0) {
//                System.out.println("Ei suoriteta, sillä tipahtaa ulos pelialuuelta");
//                return;
//            }
            
            pelaajaSiirtyyX = pelaaja.getX();
            pelaajaSiirtyyY = pelaaja.getY() - 1;
            
            siirrettava = this.pelialue[pelaajaSiirtyyY][pelaajaSiirtyyX]; 
            siirrettavaSiirtyyX = pelaaja.getX();
            siirrettavaSiirtyyY = pelaaja.getY();
            
            suoritaSiirto(pelaaja, pelaajaSiirtyyX, pelaajaSiirtyyY, siirrettava, siirrettavaSiirtyyX, siirrettavaSiirtyyY);  
        }
        
        if(suunta.equalsIgnoreCase("s")) {
            
            if(!siirtyykoPelimerkkiPelialueenUlkopuolelle(pelaaja)) {
                return;
            }
            
//            // Estetään pelaajaa suorittamasta siirtoa, joka vie pelaajan alueen ulkopuolelle alasuunnasta
//            if(pelaaja.getY() + 1 == this.pelialue.length) {
//                System.out.println("Ei suoriteta, sillä tipahtaa ulos pelialuuelta");
//                return;
//            }
            
            pelaajaSiirtyyX = pelaaja.getX();
            pelaajaSiirtyyY = pelaaja.getY() + 1;
            
            siirrettava = this.pelialue[pelaajaSiirtyyY][pelaajaSiirtyyX]; 
            siirrettavaSiirtyyX = pelaaja.getX();
            siirrettavaSiirtyyY = pelaaja.getY();
            
            suoritaSiirto(pelaaja, pelaajaSiirtyyX, pelaajaSiirtyyY, siirrettava, siirrettavaSiirtyyX, siirrettavaSiirtyyY); 
        }
        
        if(suunta.equalsIgnoreCase("a")) {
            
            if(!siirtyykoPelimerkkiPelialueenUlkopuolelle(pelaaja)) {
                return;
            }
            
//            // Estetään pelaajaa suorittamasta siirtoa, joka vie pelaajan alueen ulkopuolelle vasemmalta
//            if(pelaaja.getX() - 1 < 0) {
//                System.out.println("Ei suoriteta, sillä tipahtaa ulos pelialuuelta");
//                return;
//            }
            
            pelaajaSiirtyyX = pelaaja.getX() - 1;
            pelaajaSiirtyyY = pelaaja.getY();
            
            siirrettava = this.pelialue[pelaajaSiirtyyY][pelaajaSiirtyyX]; 
            siirrettavaSiirtyyX = pelaaja.getX();
            siirrettavaSiirtyyY = pelaaja.getY();
            
            suoritaSiirto(pelaaja, pelaajaSiirtyyX, pelaajaSiirtyyY, siirrettava, siirrettavaSiirtyyX, siirrettavaSiirtyyY); 
        }
        
        if(suunta.equalsIgnoreCase("d")) {
            
            if(!siirtyykoPelimerkkiPelialueenUlkopuolelle(pelaaja)) {
                System.out.println(siirtyykoPelimerkkiPelialueenUlkopuolelle(pelaaja));
                return;
            }
            
//            // Estetään pelaajaa suorittamasta siirtoa, joka vie pelaajan alueen ulkopuolelle oikealta
//            System.out.println(this.pelialue[pelaaja.getY()].length);
//            if(pelaaja.getX() + 1 >= this.pelialue[pelaaja.getY()].length) {
//                System.out.println("Ei suoriteta, sillä tipahtaa ulos pelialuuelta");
//                return;
//            }
            
            pelaajaSiirtyyX = pelaaja.getX() + 1;
            pelaajaSiirtyyY = pelaaja.getY();
            
            siirrettava = this.pelialue[pelaajaSiirtyyY][pelaajaSiirtyyX]; 
            siirrettavaSiirtyyX = pelaaja.getX();
            siirrettavaSiirtyyY = pelaaja.getY();
            
            suoritaSiirto(pelaaja, pelaajaSiirtyyX, pelaajaSiirtyyY, siirrettava, siirrettavaSiirtyyX, siirrettavaSiirtyyY);
        }
    }

    private void suoritaSiirto(Pelimerkki pelaaja, int pelaajaSiirtyyX, int pelaajaSiirtyyY, Pelimerkki siirrettava, int siirrettavaSiirtyyX, int siirrettavaSiirtyyY) {
        pelaaja.setX(pelaajaSiirtyyX);
        pelaaja.setY(pelaajaSiirtyyY);
        this.pelialue[pelaajaSiirtyyY][pelaajaSiirtyyX] = pelaaja;
        System.out.print("Pelaaja x " + pelaaja.getX());
        System.out.print("Pelaaja y " + pelaaja.getY() + "\r");
        
        siirrettava.setX(siirrettavaSiirtyyX);
        siirrettava.setY(siirrettavaSiirtyyY);
        this.pelialue[siirrettavaSiirtyyY][siirrettavaSiirtyyX] = siirrettava;

        System.out.print("Siirettava x " + siirrettava.getX());
        System.out.print(" Siirrettava y " + siirrettava.getY()+ "\r");
    }

    private boolean siirtyykoPelimerkkiPelialueenUlkopuolelle(Pelimerkki pelaaja) {
        // TODO: lisää parametri, jossa välitetään mitä liikkumissuuntaa ollaa tarkistamassa. Nykyratkaisu ei toimi, sillä jokin if menee aina läpi?
        if(pelaaja.getY() - 1 < 0) {
            return true;
        } else if(pelaaja.getY() + 1 == this.pelialue.length) {
            return true;
        } else if(pelaaja.getX() - 1 < 0 ) {
            return true;
        } else if(pelaaja.getX() + 1 >= this.pelialue[pelaaja.getY()].length) {
            return true;
        } else {
            return false;
        }
    }
}
