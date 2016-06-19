package game;

import gameoflife.GameOfLifeAlusta;
import java.util.Random;

public class OmaAlusta extends GameOfLifeAlusta {

    private int maxSarake;
    private int maxRivi;
    
    private static final int[][] NAAPURIT = {
    {-1, -1}, {-1, 0}, {-1, +1},
    { 0, -1},          { 0, +1},
    {+1, -1}, {+1, 0}, {+1, +1}};
    
    public OmaAlusta(int leveys, int korkeus) {
        super(leveys, korkeus);
        
        maxSarake = getLeveys() - 1;
        maxRivi = getKorkeus() - 1;
    }

    @Override
    public void alustaSatunnaisetPisteet(double d) {
        boolean[][] alusta = getAlusta(); 
        
        for (int i = 0; i < alusta.length; i++) {
            for (int j = 0; j < alusta[i].length; j++) {
                alusta[i][j] = arvoTila(d);
            }
        }
    }

    @Override
    public boolean onElossa(int x, int y) {
        boolean[][] alusta = getAlusta();
        
        try {
            return alusta[x][y];
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    @Override
    public void muutaElavaksi(int x, int y) {
        boolean[][] alusta = getAlusta();
        
        try {
            alusta[x][y] = true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }
    }

    @Override
    public void muutaKuolleeksi(int x, int y) {
        boolean[][] alusta = getAlusta();
        
        try {
            alusta[x][y] = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }
    }

    @Override
    public int getElossaOlevienNaapurienLukumaara(int x, int y) {
        int montakoElossa = 0;

        montakoElossa = laskeNaapurit(x, y);
        
        return montakoElossa;
    }

    @Override
    public void hoidaSolu(int x, int y, int elossaOleviaNaapureita) {
        
        // Jokainen elossa oleva solu, jolla on alle kaksi elossa olevaa naapuria kuolee.
        if (elossaOleviaNaapureita < 2 && onElossa(x, y)) {
            muutaKuolleeksi(x, y);
        }
        
        // Jokainen elossa oleva solu, jolla on kaksi tai kolme elossa olevaa naapuria elää seuraavaan iteraatioon eli kierrokseen.
        if (elossaOleviaNaapureita >= 2 && elossaOleviaNaapureita <= 3 && onElossa(x, y)) {
            muutaElavaksi(x, y);
        }
        
        // Jokainen elossa oleva solu, jolla on yli kolme naapuria kuolee.
        if (elossaOleviaNaapureita > 3 && onElossa(x, y)) {
            muutaKuolleeksi(x, y);
        }
        
        // Jokainen kuollut solu, jolla on tasan kolme elossa olevaa naapuria muuttuu eläväksi.
        if (elossaOleviaNaapureita == 3 && !onElossa(x, y)) {
            muutaElavaksi(x, y);
        }
    }

    private boolean arvoTila(double d) {
        Random rng = new Random();
        
        return rng.nextDouble() < d;
    }
   
    private boolean tarkistaSolu(int x, int y) {
        boolean[][] alusta = getAlusta();
        return x >= 0 && y >= 0 && x < this.getLeveys() && y < this.getKorkeus() && alusta[x][y];
    }
    
    private int laskeNaapurit(int x, int y) {
        int cnt = 0;
        for (int[] offset : NAAPURIT) {
            if (tarkistaSolu(x + offset[1], y + offset[0])) {
               cnt++;
            }
        }
        return cnt;       
    }
    
}
