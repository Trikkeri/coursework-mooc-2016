import java.util.Scanner;

public class Paaohjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtäviä 90.3 ja 90.4 tehdessäsi
        
        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();
        
        System.out.println("Anna lukuja: ");
        
        while(true) {
            int syote = Integer.parseInt(lukija.nextLine());
            if(syote < 0) {
                break;
            } else {
                tilasto.lisaaLuku(syote);
                
                if(syote % 2 == 0) {
                    parilliset.lisaaLuku(syote);
                } 
                
                if(syote % 2 != 0) {
                    parittomat.lisaaLuku(syote);
                }
            }
        }
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + parilliset.summa());
        System.out.println("Parittomien summa: " + parittomat.summa());
                
//        System.out.println("Keskiarvo: " + tilasto.keskiarvo());
        
    }
}
