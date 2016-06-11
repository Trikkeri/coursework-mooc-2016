package clicker.sovelluslogiikka;

public class OmaLaskuri implements Laskuri {

    private int laskuri;
    
    public OmaLaskuri() {
        this.laskuri = 0;
    }
    
    @Override
    public int annaArvo() {
        return this.laskuri;
    }

    @Override
    public void kasvata() {
        this.laskuri++;
    }
    
}
