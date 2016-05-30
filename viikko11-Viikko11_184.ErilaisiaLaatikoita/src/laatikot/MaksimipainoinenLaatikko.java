package laatikot;

import java.util.ArrayList;
import java.util.List;

public class MaksimipainoinenLaatikko extends Laatikko {
    
    private int laatikonPaino;
    private int maksimipaino;
    private List<Tavara> maksimilaatikot;
    
    public  MaksimipainoinenLaatikko(int maksimipaino) {
        this.maksimilaatikot = new ArrayList<>();
        this.maksimipaino = maksimipaino;
        this.laatikonPaino = 0;
    }

    @Override
    public void lisaa(Tavara tavara) {
        int lisattavaPaino = this.laatikonPaino + tavara.getPaino();
        if(lisattavaPaino > this.maksimipaino) {
            return;
        }
        this.maksimilaatikot.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for(Tavara t : this.maksimilaatikot) {
            return t.equals(tavara);
        }
        return false;
    }
    
}
