package game;

import gameoflife.GameOfLifeAlusta;
import java.util.Random;

public class OmaAlusta extends GameOfLifeAlusta {

    private boolean[][] alusta;
    private int maxSarake;
    private int maxRivi;
    
    public OmaAlusta(int leveys, int korkeus) {
        super(leveys, korkeus);
        this.alusta = this.getAlusta();
        
        maxSarake = alusta.length - 1;
        maxRivi = alusta[0].length - 1;
        System.out.println(maxSarake);
        System.out.println(maxRivi);
    }

    @Override
    public void alustaSatunnaisetPisteet(double d) {
        for (int i = 0; i < alusta.length; i++) {
            for (int j = 0; j < alusta[i].length; j++) {
                alusta[i][j] = arvoTila(d);
            }
        }
    }

    @Override
    public boolean onElossa(int i, int i1) {
        try {
            return alusta[i][i1];
        } catch(ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    @Override
    public void muutaElavaksi(int i, int i1) {
        alusta[i][i1] = true;
    }

    @Override
    public void muutaKuolleeksi(int i, int i1) {
        alusta[i][i1] = false;
    }

    @Override
    public int getElossaOlevienNaapurienLukumaara(int i, int i1) {
        int montakoElossa = 0;

        // Selvitetään aluksi onko origin keskellä, reunassa vai kulmassa
        // Kun on selvillä niin lasketaan naapurit       
        if(onkoKulmassa(i, i1)) { 
            System.out.println("KULMASSA");
            
            return montakoKulmanaapuriaOnElossa(i, i1);
            
        } else if(onkoReunassa(i, i1)) {
            System.out.println("REUNASSA");
        } else {
            // Täytyy olla keskellä
            System.out.println("TÄYTYY OLLA JOSSAIN KESKELLÄ");
        }
        return montakoElossa;
    }

    private int montakoKulmanaapuriaOnElossa(int i, int i1) {
        
        int montakoElossa = 0;
        
        for (int x = 0; x < maxRivi + 1; x++) {
            for (int y = 0; y < maxSarake + 1; y++) {
                
                // Jos tutkitaan vasenta yläkulmaa, jätetään se tutkimatta ja haistellaan naapurit
                if(i >= 0 && i1 <= 0 
                        && i <=) {
                    
                }
                
                // Jos tutkivaan oikeaa yläkulmaa, jätetään se tutkimatta ja haistellaan naapurit
                if(i == maxSarake && i1 == 0) {
                    
                }
                
                // Jos tutkitaan oikeaa alakulmaa, jätetään se tutkimatta ja haistellaan naapurit
                if(i == maxSarake && i1 == maxRivi) {
                    
                }
                
                // Jos tutkitaan vasenta alakulmaa, jätetään se tutkimatta ja haistellaan naapurit
                if(i == 0 && i1 == maxRivi) {
                    
                }
                
                // Tarkistetaan naapurit
                if(onElossa(x, y)) {
                    montakoElossa++;
                }
            }
        }
        
        
        return montakoElossa;
        
    }

    private boolean onkoKulmassa(int i, int i1) {
        return i == 0 && i1 == 0 || 
                i == maxSarake && i1 == 0 ||
                i == maxSarake && i1 == maxRivi ||
                i == 0 && i1 == maxRivi;
    }

    @Override
    public void hoidaSolu(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean arvoTila(double d) {
        Random rng = new Random();
        
        return rng.nextDouble() < d;
    }

    private boolean onkoReunassa(int i, int i1) {
        return i > 0 && i < maxSarake && i1 == 0 ||
                i == maxSarake && i1 > 0 && i1 < maxRivi ||
                i > 0 && i < maxSarake && i1 == maxRivi ||
                i == 0 && i1 > 0 && i1 < maxRivi;
    }
    
}
