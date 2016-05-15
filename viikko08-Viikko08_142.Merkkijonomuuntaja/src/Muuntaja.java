
import java.util.ArrayList;

public class Muuntaja {
    private ArrayList<Muunnos> sanat;
    
    public Muuntaja() {
        this.sanat = new ArrayList<>();
    }
    
    public void lisaaMuunnos(Muunnos muunnos) {
        this.sanat.add(muunnos);
    }
    
    public String muunna(String merkkijono) {
        
        for (Muunnos muunnettava : this.sanat) {
            merkkijono = muunnettava.muunna(merkkijono);
        }
        
        return merkkijono;
    }
}
