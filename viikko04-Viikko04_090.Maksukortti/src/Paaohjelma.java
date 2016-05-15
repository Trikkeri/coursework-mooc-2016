
import java.util.Scanner;


public class Paaohjelma {

    public static void main(String[] args) {
//        Scanner lukija = new Scanner(System.in);
        // tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän osassa 88.6!
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);
               
        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
               
        pekanKortti.lataaRahaa(20.0);
        matinKortti.syoMaukkaasti();
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        
        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
        
        matinKortti.lataaRahaa(50.0);
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        
    }
}
