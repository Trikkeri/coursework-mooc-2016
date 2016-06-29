package suosittelija.comparator;

import java.util.Comparator;
import java.util.Map;
import suosittelija.domain.Henkilo;

public class HenkiloComparator implements Comparator<Henkilo> {

    private Map<Henkilo, Integer> henkiloidenSamuudet;
    
    public HenkiloComparator(Map<Henkilo, Integer> henkiloidenSamuudet) {
        this.henkiloidenSamuudet = henkiloidenSamuudet;
    }

    @Override
    public int compare(Henkilo t, Henkilo t1) {
        return t1.getNimi().compareTo(t1.getNimi());
    }
    
}
