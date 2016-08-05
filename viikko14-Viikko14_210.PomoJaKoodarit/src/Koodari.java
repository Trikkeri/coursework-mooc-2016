
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Koodari implements Tyontekija {

    private String nimi;
    private int palkka;
    private int alaiset;
    private List<String> kielet;
    
    public Koodari(String nimi, int palkka) {
        this.nimi = nimi;
        this.palkka = palkka;
        this.alaiset = 0;
        this.kielet = new ArrayList<>();
    }
    
    @Override
    public String haeNimi() {
        return this.nimi;
    }

    @Override
    public int haePalkka() {
        return this.palkka;
    }

    @Override
    public int laskeAlaiset() {
        return this.alaiset;
    }

    @Override
    public void lisaaKieli(String kieli) {
        if(!this.kielet.contains(kieli)) {
            this.kielet.add(kieli);
        }
    }

    @Override
    public boolean onkoTaitoa(String kieli) {
        for(String k : this.kielet) {
            if(k.equalsIgnoreCase(kieli)) {
                return true;
            }
        }
        return false;
    }
}
