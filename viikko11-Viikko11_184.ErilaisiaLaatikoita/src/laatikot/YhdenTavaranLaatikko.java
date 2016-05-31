package laatikot;

import java.util.ArrayList;
import java.util.List;

public class YhdenTavaranLaatikko extends Laatikko {

    private List<Tavara> laatikko;
    
    public YhdenTavaranLaatikko() {
        this.laatikko = new ArrayList<>();  
    }
    
    @Override
    public void lisaa(Tavara tavara) {
        if(this.laatikko.size() >= 1) {
            return;
        }
        
        this.laatikko.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.laatikko.contains(tavara);
    }
    
}
