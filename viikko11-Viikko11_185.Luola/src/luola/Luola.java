package luola;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Luola {
    
    private int siirtoja;
    private Pelimerkki[][] pelialue;
    private boolean hirvioitLiikkuvat;
    private List<Pelimerkki> pelimerkit;
    
    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirvioitLiikkuvat) {
        this.siirtoja = siirtoja;
        this.pelialue = new Pelimerkki[korkeus][leveys];
        this.hirvioitLiikkuvat = hirvioitLiikkuvat;
        this.pelimerkit = new ArrayList<>();
        
        populoiPelialue();
    }
    
    public void run(Scanner lukija) {
        
        String syote = "";
        
        while(this.siirtoja > 0 && this.pelimerkit.size() > 1) {
            System.out.println(this.siirtoja + "\n");
            tulostaSijainnit();
            tulostaPelialue();
            syote = lukija.nextLine();
            
            for(char komento : syote.toCharArray()) {
                // Liikutetaan pelaajaa, yksi merkki merkkijonossa vastaan yhtä siirtoa
                liiku(this.pelimerkit.get(0), komento);
            }
            
            // Liikutetaan pelaajan siirtojen päätteeksi hirviöitä
            if(this.hirvioitLiikkuvat) {
                liikutaHirvioita(this.pelimerkit);
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
        for (Pelimerkki pm : this.pelimerkit) {
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
        this.pelimerkit.add(pelaaja);
        
        // Sijoitetaan pelialueelle satunnaisesti hirviöt
        Pelimerkki hirvio = new Pelimerkki('h', 2, 2);
        this.pelialue[2][2] = hirvio;
        this.pelimerkit.add(hirvio);
        
    }
    
    public void liiku(Pelimerkki pelimerkki, char suunta) {
        Pelimerkki siirrettava = null;
        
        int pelimerkkiSiirtyyRivi = pelimerkki.getRivi();
        int pelimerkkiSiirtyySarake = pelimerkki.getSarake();
        
        int siirrettavaSiirtyyRivi = pelimerkki.getRivi();
        int siirrettavaSiirtyySarake = pelimerkki.getSarake();
        
        if(siirtyykoPelimerkkiPelialueenUlkopuolelle(pelimerkki, suunta)) {
            return;
        }      
                     
        if(suunta == 'w') {
            
            pelimerkkiSiirtyyRivi -= 1;
            siirrettava = this.pelialue[pelimerkkiSiirtyyRivi][pelimerkkiSiirtyySarake]; 
        }
        
        if(suunta == 's') {
            
            pelimerkkiSiirtyyRivi += 1;
            siirrettava = this.pelialue[pelimerkkiSiirtyyRivi][pelimerkkiSiirtyySarake]; 
        }
        
        if(suunta == 'a') {
            
            pelimerkkiSiirtyySarake -= 1;
            siirrettava = this.pelialue[pelimerkkiSiirtyyRivi][pelimerkkiSiirtyySarake]; 
        }
        
        if(suunta == 'd') {
                       
            pelimerkkiSiirtyySarake += 1;
            siirrettava = this.pelialue[pelimerkkiSiirtyyRivi][pelimerkkiSiirtyySarake];       
        }
        
        // Jos hirviöt meinaavat törmätä, ei tehdä siirtoa
        if(onkoHirvio(siirrettava) && onkoHirvio(pelimerkki)) {
            return;
        }
        
        suoritaSiirto(pelimerkki, pelimerkkiSiirtyyRivi, pelimerkkiSiirtyySarake, siirrettava, siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake);
    }

    private void suoritaSiirto(Pelimerkki pelimerkki, int pelaajaSiirtyyRivi, int pelaajaSiirtyySarake, Pelimerkki siirrettava, int siirrettavaSiirtyyRivi, int siirrettavaSiirtyySarake) {
        
        pelimerkki.setRivi(pelaajaSiirtyyRivi);
        pelimerkki.setSarake(pelaajaSiirtyySarake);
        this.pelialue[pelaajaSiirtyyRivi][pelaajaSiirtyySarake] = pelimerkki;
        
        // Jos pelaaja siirtyy pelaajan päälle, korvataan hirviö pisteellä ja poistetaan hirviö pelistä
        if(onkoHirvio(siirrettava)) {
            this.pelialue[siirrettavaSiirtyyRivi][siirrettavaSiirtyySarake] = new Pelimerkki('.', siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake);
            this.pelimerkit.remove(siirrettava);
        } else {
            siirrettava.setRivi(siirrettavaSiirtyyRivi);
            siirrettava.setSarake(siirrettavaSiirtyySarake);
            this.pelialue[siirrettavaSiirtyyRivi][siirrettavaSiirtyySarake] = siirrettava;
        }
    }

    private boolean siirtyykoPelimerkkiPelialueenUlkopuolelle(Pelimerkki pelimerkki, char suunta) {
       
        boolean reunalla = false; 
        
        switch(suunta) {
            case 'w':
                if(pelimerkki.getRivi() - 1 < 0) {
                    reunalla = true;  
                }
                break;
            case 's':
                if(pelimerkki.getRivi() + 1 == this.pelialue.length) {
                    reunalla = true;
                }
                break;
            case 'a':
                if(pelimerkki.getSarake() - 1 < 0) {
                    reunalla = true;
                }
                break;
            case 'd':
                if(pelimerkki.getSarake() + 1 >= this.pelialue[pelimerkki.getSarake()].length) {
                    reunalla = true;
                }
                break;
            default:
                reunalla = false;
                break;
            }
        
        return reunalla;
    }
    
    private boolean onkoHirvio(Pelimerkki pm) {
        if(pm.getTyyppi() == 'h') {
            return true;
        }
        return false;
    }

    private void liikutaHirvioita(List<Pelimerkki> pelimerkit) {
        for(Pelimerkki pm : pelimerkit) {
            if(pm.getTyyppi() == 'h') {
                
                //Arvotaan mihin liikutetaan
                Random rng = new Random();
                int arvottuLuku = rng.nextInt(4);
                
                // Liiku ylös
                if(arvottuLuku == 0) {
                    liiku(pm, 'w');
                }
                
                // Liiku alas
                if(arvottuLuku == 1 ) {
                    liiku(pm, 's');
                }
                
                // Liiku vasemmalle
                if(arvottuLuku == 2) {
                    liiku(pm, 'd');
                }
                
                // Liiku oikealle
                if(arvottuLuku == 3) {
                    liiku(pm, 'a');
                }
            }
        }
    }
}
