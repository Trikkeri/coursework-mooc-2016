package luola;

import java.util.Random;
import java.util.Scanner;

public class Luola {
    
    private int siirtoja;
    private Pelimerkki[][] pelialue;
    private boolean hirvioitLiikkuvat;
    private int hirvioita;
    private Pelilogiikka pl;
    
    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirvioitLiikkuvat) {
        this.siirtoja = siirtoja;
        this.pelialue = new Pelimerkki[korkeus][leveys];
        this.hirvioitLiikkuvat = hirvioitLiikkuvat;
        this.hirvioita = hirvioita;
        
        this.pl = new Pelilogiikka();
        
        populoiPelialue();
    }
    
    public void run(Scanner lukija) {
        
        String syote = "";
        
        while(this.siirtoja > 0 && this.pl.getPelimerkit().size() > 1) {
            System.out.println(this.siirtoja + "\n");
            tulostaSijainnit();
            tulostaPelialue();
            syote = lukija.nextLine().toLowerCase();
                      
            // Pureskellaan merkkijonossa olevat merkit jokainen yksittäiseksi liikkuminkomennoksi
            for(char komento : syote.toCharArray()) {
                
                Suunta suunta = null;
                
                if(komento == 'w') {
                    suunta = Suunta.YLOS;
                }
                
                if(komento == 's') {
                    suunta = Suunta.ALAS;
                }
                
                if(komento == 'a') {
                    suunta = Suunta.VASEN;
                }
                                
                if(komento == 'd') {
                    suunta = Suunta.OIKEA;
                }
                
                // Liikutetaan pelaajaa, yksi merkki merkkijonossa vastaan yhtä siirtoa
                this.pl.liiku(this.pl.getPelimerkit().get(0), suunta, pelialue);
            }
            
            // Liikutetaan pelaajan siirtojen päätteeksi hirviöitä
            if(this.hirvioitLiikkuvat) {
                this.pl.liikutaHirvioita(pelialue);
            }
            
            this.siirtoja -= 1;
            tulostaPelialue();
        }
        
        if(this.siirtoja > 0) {
            System.out.println("VOITIT");
        } else {
            System.out.println("HÄVISIT");
        }
    }

    private void tulostaSijainnit() {
        for (Pelimerkki pm : this.pl.getPelimerkit()) {
            System.out.print(pm.getTyyppi() + " " + pm.getSarake() + " " + pm.getRivi() + "\n");
        }
    }

    private void tulostaPelialue() {
        for (int korkeus = 0; korkeus < this.pelialue.length; korkeus++) {
            System.out.println("");
            for (int leveys = 0; leveys < this.pelialue[korkeus].length; leveys++) {
                System.out.print(this.pelialue[korkeus][leveys]);
            }
        }
        System.out.print("\n\n");
    }

    private void populoiPelialue() {
        
        // Aluksi sijoitetaan pelialueelle 'tyhjät' kohdat
        for (int korkeus = 0; korkeus < this.pelialue.length; korkeus++) {
            this.pelialue[korkeus][0] = new Pelimerkki('.', korkeus, 0);
                
            for (int leveys = 0; leveys < this.pelialue[korkeus].length; leveys++) {
                this.pelialue[korkeus][leveys] = new Pelimerkki('.', korkeus, leveys);
            } 
        }
        
        // Sijoitetaan pelialueelle pelaaja ja taulukkoon talteen
        Pelimerkki pelaaja = new Pelimerkki('@', 0, 0);
        this.pelialue[0][0] = pelaaja;
        this.pl.lisaaPelimerkki(pelaaja);
        
        // Sijoitetaan pelialueelle satunnaisesti hirviöt konstruktorissa annetun määrän mukaan
        for (int i = 0; i < this.hirvioita; i++) {
            
            boolean hirvioGeneroitu = false;
            
            int satunnainenRivi = 0, satunnainenSarake = 0;
            
            while(!hirvioGeneroitu) {
                // Generoidaan satunnaiset rivi ja sarakeluvut hirviölle
                Random rng = new Random();
                satunnainenRivi = rng.nextInt(this.pelialue[0].length - 1);
                satunnainenSarake = rng.nextInt(this.pelialue.length - 1);

                // Tarkistetaan onko kohdassa jo hirviö tai pelaaja
                Pelimerkki tarkistettavaPelimerkki = this.pelialue[satunnainenRivi][satunnainenSarake];

                // Jos kohdassa johon sijoitus tehdään on lamppu, silloin se voidaan korvata hirviöllä
                if(tarkistettavaPelimerkki.getTyyppi() == '.') {
                    hirvioGeneroitu = true;
                }
            }
            
            Pelimerkki hirvio = new Pelimerkki('h', satunnainenRivi, satunnainenSarake);
            this.pelialue[satunnainenRivi][satunnainenSarake] = hirvio;
            this.pl.lisaaPelimerkki(hirvio);
        }
    }
}
