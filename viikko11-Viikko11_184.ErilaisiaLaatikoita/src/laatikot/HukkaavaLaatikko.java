package laatikot;

import java.util.ArrayList;
import java.util.List;

public class HukkaavaLaatikko extends Laatikko {

    private List<Tavara> laatikko;
    
    public HukkaavaLaatikko() {
        this.laatikko = new ArrayList<>();
    }
    
    @Override
    public void lisaa(Tavara tavara) {
        this.laatikko.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
    
}
