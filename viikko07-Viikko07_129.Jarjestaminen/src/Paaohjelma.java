
import java.util.Arrays;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
//        int[] taulukko = {3, 1, 5, 99, 3, 12};
//        System.out.println(pienimmanIndeksi(taulukko));
//        
//        // indeksit:    0  1  2  3   4
//        int[] luvut = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
//        System.out.println(pienimmanIndeksiAlkaen(luvut, 1));
//        System.out.println(pienimmanIndeksiAlkaen(luvut, 2));
//        System.out.println(pienimmanIndeksiAlkaen(luvut, 4));
//        
//        int[] luvut = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(luvut));
//
//        vaihda(luvut, 1, 0);
//        System.out.println(Arrays.toString(luvut));
//
//        vaihda(luvut, 0, 3);
//        System.out.println(Arrays.toString(luvut));

        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        jarjesta(luvut);
    }
    
    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i = 0; i < taulukko.length; i++) {
            if(pienin > taulukko[i]) {
                pienin = taulukko[i];
            }
        }
        
        return pienin;
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int pieninLuku = taulukko[0];
        int pieninIndeksi = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if(pieninLuku > taulukko[i]) {
                pieninLuku = taulukko[i];
                pieninIndeksi = i;
            }
        }
        return pieninIndeksi;
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pieninLuku = taulukko[aloitusIndeksi];
        int pieninIndeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if(pieninLuku > taulukko[i]) {
                pieninLuku = taulukko[i];
                pieninIndeksi = i;
            }    
        }
        return pieninIndeksi;
    }
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int luku1 = taulukko[indeksi1];
        int luku2 = taulukko[indeksi2];
        
        taulukko[indeksi1] = luku2;
        taulukko[indeksi2] = luku1;
    }
    
    public static void jarjesta(int[] taulukko) {
        
        for (int i = 0; i < taulukko.length; i++) {
            tulostaTaulukko(taulukko);
            int pieninIndeksi = pienimmanIndeksiAlkaen(taulukko, i);
            vaihda(taulukko, i, pieninIndeksi);
            tulostaTaulukko(taulukko);  
        }

    }
    
    public static void tulostaTaulukko(int[] taulukko) {
        System.out.print("[");
        for (int i = 0; i < taulukko.length; i++) {
            if(i == taulukko.length - 1) {
                System.out.print(taulukko[i]);
            } else {
                System.out.print(taulukko[i] + ", ");
            }           
        }
        System.out.print("]\n");
    }
    
    

}
