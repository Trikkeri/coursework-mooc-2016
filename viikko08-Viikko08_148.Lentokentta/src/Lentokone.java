
import java.util.ArrayList;

public class Lentokone {
    private String tunnus;
    private int kapasiteetti;
    private ArrayList<Lento> lennot;
    
    public Lentokone() {
        this.tunnus = "";
        this.kapasiteetti = 0;
        this.lennot = new ArrayList<>();
    }
    
    public Lentokone(String tunnus, int kapasiteetti) {
        this.tunnus = tunnus;
        this.kapasiteetti = kapasiteetti;
        this.lennot = new ArrayList<>();
    }
    
    public String haeTunnus() {
        return this.tunnus;
    }
    
    public void asetaLennolle(Lento lento) {
        this.lennot.add(lento);
    }
    
    public void tulostaLennot() {
        for (Lento lento : this.lennot) {
            System.out.println(this.toString()+ " " + lento);
        }
    }
    
    public String toString() {
        return this.tunnus + " (" + this.kapasiteetti + " henkilöä)";
    }
}
