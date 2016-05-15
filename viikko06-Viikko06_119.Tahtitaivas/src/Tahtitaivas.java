
import java.util.Random;

public class Tahtitaivas {
    private double tiheys;
    private int leveys;
    private int korkeus;
    private int tahtiaViimeTulostuksessa;
    
    public Tahtitaivas(double tiheys) {
        this(tiheys, 20, 10);
    }
    
    public Tahtitaivas(int leveys, int korkeus) {
        this(0.1, leveys, korkeus);
    }
    
    public Tahtitaivas(double tiheys, int leveys, int korkeus) {
        this.tiheys = tiheys;
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.tahtiaViimeTulostuksessa = 0;
    }
    
    public void tulostaRivi() {
        
        Random random = new Random();
        for(int i = 0;i < this.leveys;i++) {
            double arpa = random.nextDouble();
            //System.out.println(arpa);
            if(arpa <= this.tiheys) {
                System.out.print("*");
                this.tahtiaViimeTulostuksessa++;
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void tulosta() {
        for (int i = 0; i < this.korkeus; i++) {
            tulostaRivi();
            System.out.println();
        }
    }
    
    public int tahtiaViimeTulostuksessa() {
        int tahdet = this.tahtiaViimeTulostuksessa;
        this.tahtiaViimeTulostuksessa = 0;
        return tahdet;
    }
    

    
}
