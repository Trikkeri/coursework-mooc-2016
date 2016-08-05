
import java.util.ArrayList;
import java.util.List;

public class Pomo implements Tyontekija {
    
    private String nimi;
    private int palkka;
    private List<Tyontekija> alaiset;
    private List<String> kielet;
    
    public Pomo(String nimi, int palkka) {
        this.nimi = nimi;
        this.palkka = palkka;
        this.alaiset = new ArrayList<>();
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
        int alaistenSumma = this.alaiset.size();
        
        for(Tyontekija t : this.alaiset) {
            alaistenSumma += t.laskeAlaiset();
        }
        return alaistenSumma;
    }

    @Override
    public void lisaaKieli(String kieli) {
        if(!this.kielet.contains(kieli)) {
            this.kielet.add(kieli);
        }
    }

    @Override
    public boolean onkoTaitoa(String kieli) {
        // Käydään läpi aluksi pomon kielet
        for(String k : this.kielet) {
            if(k.equalsIgnoreCase(kieli)) {
                return true;
            }
        }
        
        // Käydään läpi alaisten kieliosaaminen
        for(Tyontekija t : this.alaiset) {
            if(t.onkoTaitoa(kieli)) {
                return true;
            }
        }
        
        return false;
    }
    
    public void lisaaAlainen(Tyontekija alainen) {
        if(!this.alaiset.contains(alainen)) {
            this.alaiset.add(alainen);
        }
    }
    
}
