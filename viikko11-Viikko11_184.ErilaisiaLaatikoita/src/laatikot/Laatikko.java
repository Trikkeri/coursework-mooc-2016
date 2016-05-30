package laatikot;

import java.util.Collection;

public abstract class Laatikko {

    public abstract void lisaa(Tavara tavara);

    public void lisaa(Collection<Tavara> tavarat) {
        for (Tavara tavara : tavarat) {
            lisaa(tavara);
        }
    }

    public abstract boolean onkoLaatikossa(Tavara tavara);
}
