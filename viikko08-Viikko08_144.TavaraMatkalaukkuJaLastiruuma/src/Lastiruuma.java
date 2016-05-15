
import java.util.ArrayList;

public class Lastiruuma {
    private int maksimipaino;
    private ArrayList<Matkalaukku> laukut;
    private int yhteispaino;
    
    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.laukut = new ArrayList<>();
        this.yhteispaino = 0;
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        yhteispaino += laukku.yhteispaino();
        if(yhteispaino <= this.maksimipaino) {
            laukut.add(laukku);
        }
    }
    
    public String toString() {
        int paino = 0;
        
        for(Matkalaukku laukku : this.laukut) {
            paino += laukku.yhteispaino();
        }
        
        return this.laukut.size() + " matkalaukkua (" + paino + " kg)";
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku laukku : this.laukut) {
            laukku.tulostaTavarat();
        }
    }
}
