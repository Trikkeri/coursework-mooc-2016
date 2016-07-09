package lukija.ehdot;

public class Ei implements Ehto {

    private Ehto ehto;
    
    public Ei(Ehto ehto) {
        this.ehto = ehto;
    }
    
    @Override
    public boolean toteutuu(String rivi) {
        return !this.ehto.toteutuu(rivi);
    }
    
}
