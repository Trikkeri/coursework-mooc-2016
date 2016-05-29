package maatilasimulaattori;

import java.util.ArrayList;
import java.util.List;

public class Maatila implements Eleleva {

    private String omistaja;
    private Navetta navetta;
    private List<Lehma> lehmat;
    
    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }

    public String getOmistaja() {
        return this.omistaja;
    }
    
    public void lisaaLehma(Lehma lehma) {
        this.lehmat.add(lehma);
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.navetta.asennaLypsyrobotti(lypsyrobotti);
    }
    
    public void hoidaLehmat() {
        this.navetta.hoida(this.lehmat);
   }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Maatilan omistaja: ").append(this.omistaja).append("\n");
        sb.append("Navetan maitosäiliö: ").append(this.navetta.toString()).append("\n");
        
        if(lehmat.isEmpty()) {
            sb.append("Ei lehmiä\n");
        } else {
            sb.append("Lehmät: \n");
            for(Lehma lehma : this.lehmat) {
                
                sb.append("        ").append(lehma).append("\n");
            }
        }
        
        return sb.toString();
    }
    
    @Override
    public void eleleTunti() {
        for(Lehma lehma : this.lehmat) {
            lehma.eleleTunti();
        }
    }
    
}
