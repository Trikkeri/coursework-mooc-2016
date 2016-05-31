package laatikot;

import java.util.ArrayList;
import java.util.List;

public class MaksimipainollinenLaatikko extends Laatikko {
    
    private int maksimipaino;
    private List<Tavara> maksimilaatikot;
    
    public  MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimilaatikot = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }

    @Override
    public void lisaa(Tavara tavara) {
        
        int laatikonPaino = laatikonPaino();
        
        int lisattavaPaino = laatikonPaino + tavara.getPaino();
        if(lisattavaPaino > this.maksimipaino) {
            return;
        }
        this.maksimilaatikot.add(tavara);
    }

    private int laatikonPaino() {
        // Selvitetään laatikossa olevien tavaroiden paino
        int laatikonPaino = 0;
        for(Tavara t : this.maksimilaatikot) {
            laatikonPaino += t.getPaino();
        }
        return laatikonPaino;
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for(Tavara t : this.maksimilaatikot) {
            
            if(t.equals(tavara)) {
                return true;
            }
        }
        return false;
    }
    
}
