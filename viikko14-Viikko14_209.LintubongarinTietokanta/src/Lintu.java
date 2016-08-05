
import java.util.Objects;

public class Lintu {
    
    private String suomalainenNimi;
    private String latinalainenNimi;
    private int havaittu;
    
    public Lintu(String suomalainenNimi, String latinalainenNimi) {
        this.suomalainenNimi = suomalainenNimi;
        this.latinalainenNimi = latinalainenNimi;
        this.havaittu = 0;
    }
    
    @Override
    public String toString() {
        return suomalainenNimi + " (" + latinalainenNimi + "): " + havaittu + " havaintoa";
    }
    
    public void lintuHavaittu() {
        havaittu++;
    }
    
    public String getsuomalainenNimi() {
        return suomalainenNimi;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        
        if(o == this) {
            return true;
        }
        
        if(!(o instanceof Lintu)) {
            return false;
        }
        
        Lintu toinenLintu = (Lintu) o;
        if(this.getsuomalainenNimi().equalsIgnoreCase(toinenLintu.getsuomalainenNimi())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.suomalainenNimi);
        hash = 61 * hash + Objects.hashCode(this.latinalainenNimi);
        return hash;
    }
}
