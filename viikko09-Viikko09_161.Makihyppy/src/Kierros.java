import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Kierros {
    private int hypynPituus;
    private Random rng;
    private ArrayList<Integer> tuomariPisteet;
    
    public Kierros() {
        this.hypynPituus = 0;
        this.rng = new Random();
        this.tuomariPisteet = new ArrayList<>();
    }
    
    public void arvoHyppy() {
        this.hypynPituus = arvoLuku(60, 120);
    }
    
    public void arvoPisteet() {
        for (int i = 0; i < 5; i++) {
            this.tuomariPisteet.add(arvoLuku(10, 20));
        }
    }
    
    public int laskeKokonaispisteet() {
        int summa = 0;
        
        // Otetaan pisteet omaan taulukkoon jottei sortata luokan omaa pistetaulukkoa
        ArrayList<Integer> tpisteet = new ArrayList<>();
        tpisteet = this.tuomariPisteet;
        
        Collections.sort(tpisteet);
        summa = this.hypynPituus + tpisteet.get(1) + tpisteet.get(2) + tpisteet.get(3);
        
        return summa;
    }
    
    private int arvoLuku(int min, int max) {
        return this.rng.nextInt((max - min) + 1) + min;
    }
    
    public int getHypynPituus() {
        return this.hypynPituus;
    }
    
    public ArrayList<Integer> getTuomariPisteet() {
        return this.tuomariPisteet;
    }
}
