
import java.util.ArrayList;

public class Puhelinmuistio {
    private ArrayList<Henkilo> muistio;
    
    public Puhelinmuistio() {
        this.muistio = new ArrayList<>();
    }
    
    public void lisaa(String nimi, String numero) {    
        this.muistio.add(new Henkilo(nimi, numero));
    }
    
    public void tulostaKaikki() {
        int iteraattori = 0;
        while(iteraattori < muistio.size()) {
            System.out.println(muistio.get(iteraattori));
            iteraattori++;
        }
    }
    
    public String haeNumero(String nimi) {
        for(Henkilo henk : this.muistio) {
            if(henk.haeNimi().equals(nimi)) {
                return henk.haeNumero();
            }
        }
        return "Numeroa ei tiedossa";
    }
    
}
