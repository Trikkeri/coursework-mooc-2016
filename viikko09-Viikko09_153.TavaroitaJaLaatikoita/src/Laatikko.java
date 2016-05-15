
import java.util.ArrayList;

public class Laatikko implements Talletettava {
    private double maksimiPaino;
    private double paino;
    private ArrayList<Talletettava> tavarat;
    
    public Laatikko(double maksimiPaino ) {
        this.maksimiPaino = maksimiPaino;
        this.paino = 0;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Talletettava varastoitava) {
        this.paino += varastoitava.paino();
        
        if(this.paino <= this.maksimiPaino) {
            this.tavarat.add(varastoitava);
        } else {
            this.paino -= varastoitava.paino();
        }
    }
    
    public double paino() {
        double paino = 0;
        
        for(Talletettava tavara : this.tavarat) {
            paino += tavara.paino();
        }
        return paino;
    }
    
    public String toString() {
        return "Laatikko: " + this.tavarat.size() + " esinettä, paino yhteensä " + this.paino + " kiloa";
    }
    
}
