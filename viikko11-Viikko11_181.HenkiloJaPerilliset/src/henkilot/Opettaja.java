package henkilot;

public class Opettaja extends Henkilo {
    private int palkka;
    
    public Opettaja(String nimi, String osoite, int palkka) {
        super(nimi, osoite);
        this.palkka = palkka;
    }
    
    public String toString() {
        return super.toString() + "\n  " + "palkka " + this.palkka + " euroa/kk";
    }
    
}
