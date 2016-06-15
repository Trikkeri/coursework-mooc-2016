package game;

import gameoflife.Simulaattori;

public class Main {

    public static void main(String[] args) {
        // testaa ohjelmaasi täällä
        OmaAlusta alusta = new OmaAlusta(7, 5);

//       alusta.muutaElavaksi(0, 1);
//       alusta.muutaElavaksi(1, 0);
//       alusta.muutaElavaksi(1, 2);
//       alusta.muutaElavaksi(2, 2);
//       alusta.muutaElavaksi(2, 1);

//    alusta.muutaElavaksi(6, 1);
////    alusta.muutaElavaksi(6, 3);
//    alusta.muutaElavaksi(6, 0);
//        alusta.alustaSatunnaisetPisteet(5.0);
//        GameOfLifeTestaaja gom = new GameOfLifeTestaaja(alusta);
//        gom.pelaa();
       //System.out.println("Elossa naapureita (0,0): " + alusta.getElossaOlevienNaapurienLukumaara(0, 0));
       System.out.println("Elossa naapureita (1,1): " + alusta.getElossaOlevienNaapurienLukumaara(5, 3));
    }
}
