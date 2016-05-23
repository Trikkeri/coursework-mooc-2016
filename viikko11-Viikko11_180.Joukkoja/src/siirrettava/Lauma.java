package siirrettava;

import java.util.ArrayList;
import java.util.List;

public class Lauma implements Siirrettava {
    private List<Object> siirrettavat;
    
    public Lauma() {
        this.siirrettavat = new ArrayList<>();
    }
    
    public String toString() {
        String palautettava = "";
        for (Object o : this.siirrettavat) {
            palautettava += o.toString() + "\n";
        }
        return palautettava;
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.siirrettavat.add(siirrettava);
    }
    
    @Override
    public void siirra(int dx, int dy) {
        for (Object o : this.siirrettavat) {
            Elio e = (Elio) o;
            e.siirra(dx, dy);
        }
    }
    
}
