
import java.util.Objects;


public class Lintu {

    private String nimi;
    private String latinankielinenNimi;
    private int rengastusvuosi;

    public Lintu(String nimi, String latinankielinenNimi, int rengastusvuosi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielinenNimi;
        this.rengastusvuosi = rengastusvuosi;
    }


    @Override
    public String toString() {
        return this.latinankielinenNimi + " (" + this.rengastusvuosi + ")";
    }
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Lintu)) {
            return false;
        }
        
        Lintu verrattava = (Lintu) o;
        
        if(this.latinankielinenNimi == null) {
            return false;
        }
        
        return this.latinankielinenNimi.equals(verrattava.latinankielinenNimi) &&
                this.rengastusvuosi == verrattava.rengastusvuosi;
    }
    
    @Override
    public int hashCode() {
        int hash = 1;
        hash = 41 * hash + Objects.hash(this.latinankielinenNimi);
        hash = 41 * hash + Objects.hash(this.rengastusvuosi);
        return hash;
    }
}
