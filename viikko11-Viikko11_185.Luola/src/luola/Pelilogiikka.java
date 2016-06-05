package luola;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pelilogiikka {
    private List<Pelimerkki> pelimerkit;
    
    public Pelilogiikka() {
        this.pelimerkit = new ArrayList<>();
    }
    
    public List<Pelimerkki> getPelimerkit() {
        return this.pelimerkit;
    }
    
    public void lisaaPelimerkki(Pelimerkki pm) {
        this.pelimerkit.add(pm);
    }
    
    public void liiku(Pelimerkki pelimerkki, char suunta, Pelimerkki[][] pelialue) {
        Pelimerkki siirrettava = null;
        
        int pelimerkkiSiirtyyRivi = pelimerkki.getRivi();
        int pelimerkkiSiirtyySarake = pelimerkki.getSarake();
        
        int siirrettavaSiirtyyRivi = pelimerkki.getRivi();
        int siirrettavaSiirtyySarake = pelimerkki.getSarake();
        
        if(siirtyykoPelimerkkiPelialueenUlkopuolelle(pelimerkki, suunta, pelialue)) {
            return;
        }      
                     
        if(suunta == 'w') {
            
            pelimerkkiSiirtyyRivi -= 1;
            siirrettava = pelialue[pelimerkkiSiirtyyRivi][pelimerkkiSiirtyySarake]; 
        }
        
        if(suunta == 's') {
            
            pelimerkkiSiirtyyRivi += 1;
            siirrettava = pelialue[pelimerkkiSiirtyyRivi][pelimerkkiSiirtyySarake]; 
        }
        
        if(suunta == 'a') {
            
            pelimerkkiSiirtyySarake -= 1;
            siirrettava = pelialue[pelimerkkiSiirtyyRivi][pelimerkkiSiirtyySarake]; 
        }
        
        if(suunta == 'd') {
                       
            pelimerkkiSiirtyySarake += 1;
            siirrettava = pelialue[pelimerkkiSiirtyyRivi][pelimerkkiSiirtyySarake];       
        }
        
        // Jos hirviöt meinaavat törmätä, ei tehdä siirtoa
        if(onkoHirvio(siirrettava) && onkoHirvio(pelimerkki)) {
            return;
        }
        
        suoritaSiirto(pelimerkki, pelimerkkiSiirtyyRivi, pelimerkkiSiirtyySarake, siirrettava, siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake, pelialue);
    }
    
    private void suoritaSiirto(Pelimerkki pelimerkki, int pelaajaSiirtyyRivi, int pelaajaSiirtyySarake, Pelimerkki siirrettava, int siirrettavaSiirtyyRivi, int siirrettavaSiirtyySarake, Pelimerkki[][] pelialue) {
        
        pelimerkki.setRivi(pelaajaSiirtyyRivi);
        pelimerkki.setSarake(pelaajaSiirtyySarake);
        pelialue[pelaajaSiirtyyRivi][pelaajaSiirtyySarake] = pelimerkki;
        
        // Jos pelaaja siirtyy pelaajan päälle, korvataan hirviö pisteellä ja poistetaan hirviö pelistä
        if(onkoHirvio(siirrettava)) {
            pelialue[siirrettavaSiirtyyRivi][siirrettavaSiirtyySarake] = new Pelimerkki('.', siirrettavaSiirtyyRivi, siirrettavaSiirtyySarake);
            this.pelimerkit.remove(siirrettava);
        } else {
            siirrettava.setRivi(siirrettavaSiirtyyRivi);
            siirrettava.setSarake(siirrettavaSiirtyySarake);
            pelialue[siirrettavaSiirtyyRivi][siirrettavaSiirtyySarake] = siirrettava;
        }
    }
    
    private boolean siirtyykoPelimerkkiPelialueenUlkopuolelle(Pelimerkki pelimerkki, char suunta, Pelimerkki[][] pelialue) {
       
        boolean reunalla = false; 
        
        switch(suunta) {
            case 'w':
                if(pelimerkki.getRivi() - 1 < 0) {
                    reunalla = true;  
                }
                break;
            case 's':
                if(pelimerkki.getRivi() + 1 == pelialue.length) {
                    reunalla = true;
                }
                break;
            case 'a':
                if(pelimerkki.getSarake() - 1 < 0) {
                    reunalla = true;
                }
                break;
            case 'd':
                if(pelimerkki.getSarake() + 1 >= pelialue[pelimerkki.getSarake()].length) {
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

    public void liikutaHirvioita(Pelimerkki[][] pelialue) {
        for(Pelimerkki pm : this.pelimerkit) {
            if(pm.getTyyppi() == 'h') {
                
                //Arvotaan mihin liikutetaan
                Random rng = new Random();
                int arvottuLuku = rng.nextInt(4);
                
                // Liiku ylös
                if(arvottuLuku == 0) {
                    liiku(pm, 'w', pelialue);
                }
                
                // Liiku alas
                if(arvottuLuku == 1 ) {
                    liiku(pm, 's', pelialue);
                }
                
                // Liiku vasemmalle
                if(arvottuLuku == 2) {
                    liiku(pm, 'd', pelialue);
                }
                
                // Liiku oikealle
                if(arvottuLuku == 3) {
                    liiku(pm, 'a', pelialue);
                }
            }
        }
    }
}
