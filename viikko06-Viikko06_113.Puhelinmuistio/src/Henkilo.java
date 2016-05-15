
import java.util.ArrayList;

public class Henkilo {
    private String nimi;
    private String puhnum;
    
    public Henkilo(String nimi, String puhnum) {
        this.nimi = nimi;
        this.puhnum = puhnum;  
    }
    
    public String haeNimi() {
        return this.nimi;
    }
    
    public String haeNumero() {
        return this.puhnum;
    }
    
    public void vaihdaNumeroa(String uusiNumero) {
        this.puhnum = uusiNumero;
    }
    
    public String toString() {
        return "" + this.nimi + "  puh: " + this.puhnum;
    }
    

    
}
