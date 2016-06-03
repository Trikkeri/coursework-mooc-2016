package luola;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println(this.siirtoja + "\n");
        //tulostaSijainnit();
        tulostaPelialue();
        
        String syote = "";
        
        while(!syote.equals("q")) {
            System.out.println("Mihin liikutaan (w, a, s, d)? ");
            
            syote = lukija.nextLine();
            for(char komento : syote.toCharArray()) {
                liiku(komento);
                if(this.hirvioitLiikkuvat) {
                    liikutaHirvioita(this.pelimerkit);
                }
            }
            this.siirtoja -= 1;
            tulostaPelialue();
        }
    }

    private void tulostaSijainnit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public void liiku(char suunta) {
        Pelimerkki pelaaja = null;
        Pelimerkki siirrettava = null;
        
        int pelaajaSiirtyyRivi = 0;
        int pelaajaSiirtyySarake = 0;
        
        int siirrettavaSiirtyyRivi = 0;
        int siirrettavaSiirtyySarake = 0;
        
        // Pelaaja aina ensimmäinen listassa
        pelaaja = this.pelimerkit.get(0);
        
        if(siirtyykoPelimerkkiPelialueenUlkopuolelle(pelaaja, suunta)) {
            return;
        }      
                     
        if(suunta == 'w') {
            
            pelaajaSiirtyyRivi = pelaaja.getRivi() - 1;
            pelaajaSiirtyySarake = pelaaja.getSarake();
            
            siirrettava = this.pelialue[pelaajaSiirtyyRivi][pelaajaSiirtyySarake]; 
            siirrettavaSiirtyyRivi = pelaaja.getRivi();
            siirrettavaSiirtyySarake = pelaaja.getSarake();
            
            suoritaSiirto(pelaaja, pelaajaSiirtyyRivi, pelaajaSiirtyySarake, siirrettava, siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake);  
        }
        
        if(suunta == 's') {
            
            pelaajaSiirtyyRivi = pelaaja.getRivi() + 1;
            pelaajaSiirtyySarake = pelaaja.getSarake();
            
            siirrettava = this.pelialue[pelaajaSiirtyyRivi][pelaajaSiirtyySarake]; 
            siirrettavaSiirtyyRivi = pelaaja.getRivi();
            siirrettavaSiirtyySarake = pelaaja.getSarake();
            
            suoritaSiirto(pelaaja, pelaajaSiirtyyRivi, pelaajaSiirtyySarake, siirrettava, siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake); 
        }
        
        if(suunta == 'a') {
            
            pelaajaSiirtyyRivi = pelaaja.getRivi();
            pelaajaSiirtyySarake = pelaaja.getSarake() - 1;
            
            siirrettava = this.pelialue[pelaajaSiirtyyRivi][pelaajaSiirtyySarake]; 
            siirrettavaSiirtyyRivi = pelaaja.getRivi();
            siirrettavaSiirtyySarake = pelaaja.getSarake();
            
            suoritaSiirto(pelaaja, pelaajaSiirtyyRivi, pelaajaSiirtyySarake, siirrettava, siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake); 
        }
        
        if(suunta == 'd') {
                       
            pelaajaSiirtyyRivi = pelaaja.getRivi();
            pelaajaSiirtyySarake = pelaaja.getSarake() + 1;
            
            siirrettava = this.pelialue[pelaajaSiirtyyRivi][pelaajaSiirtyySarake]; 
            siirrettavaSiirtyyRivi = pelaaja.getRivi();
            siirrettavaSiirtyySarake = pelaaja.getSarake();
            
            suoritaSiirto(pelaaja, pelaajaSiirtyyRivi, pelaajaSiirtyySarake, siirrettava, siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake);
        }
    }

    private void suoritaSiirto(Pelimerkki pelimerkki, int pelaajaSiirtyyRivi, int pelaajaSiirtyySarake, Pelimerkki siirrettava, int siirrettavaSiirtyyRivi, int siirrettavaSiirtyySarake) {
        
        pelimerkki.setRivi(pelaajaSiirtyyRivi);
        pelimerkki.setSarake(pelaajaSiirtyySarake);
        this.pelialue[pelaajaSiirtyyRivi][pelaajaSiirtyySarake] = pelimerkki;
        
        if(onkoHirvio(siirrettava)) {
            this.pelialue[siirrettavaSiirtyyRivi][siirrettavaSiirtyySarake] = new Pelimerkki('.', siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake);
        } else {
            siirrettava.setRivi(siirrettavaSiirtyyRivi);
            siirrettava.setSarake(siirrettavaSiirtyySarake);
            this.pelialue[siirrettavaSiirtyyRivi][siirrettavaSiirtyySarake] = siirrettava;
        }
    }

    private boolean siirtyykoPelimerkkiPelialueenUlkopuolelle(Pelimerkki pelaaja, char suunta) {
       
        boolean reunalla = false; 
        
        switch(suunta) {
            case 'w':
                if(pelaaja.getRivi() - 1 < 0) {
                    reunalla = true;  
                }
                break;
            case 's':
                if(pelaaja.getRivi() + 1 == this.pelialue.length) {
                    reunalla = true;
                }
                break;
            case 'a':
                if(pelaaja.getSarake() - 1 < 0) {
                    reunalla = true;
                }
                break;
            case 'd':
                if(pelaaja.getSarake() + 1 >= this.pelialue[pelaaja.getSarake()].length) {
                    reunalla = true;
                }
                break;
            default:
                reunalla = false;
                break;
            }
        
        return reunalla;
    }
    
    private boolean onkoHirvio(Pelimerkki siirrettava) {
        if(siirrettava.getTyyppi() == 'h') {
            return true;
        }
        return false;
    }

    private void liikutaHirvioita(List<Pelimerkki> pelimerkit) {
        for(Pelimerkki pm : pelimerkit) {
            if(pm.getTyyppi() == 'h') {
                //Arvotaan mihin liikutetaan
                int hirvioSiirtyyRivi = pm.getRivi();
                int hirvioSiirtyySarake = pm.getSarake();
                
                //Liikutetaan arvottuun suuntaan
                


                siirrettavaSiirtyyRivi = pelaaja.getRivi();
                siirrettavaSiirtyySarake = pelaaja.getSarake();
                Pelimerkki siirrettava = this.pelialue[pelaajaSiirtyyRivi][pelaajaSiirtyySarake]; 
                
                // Ei suoriteta siirtoa jos pelimerkki ja siirrettava pelimerkki ovat molemmat hirvioita
                if(onkoHirvio(siirrettava) && onkoHirvio(pm)) {
                    return;
                }  else {
                    suoritaSiirto();
                }
            }
        }
    }
    
    private void hirvioSiirtyyYlos(Pelimerkki hirvio) {
        hirvio.
    }
}
