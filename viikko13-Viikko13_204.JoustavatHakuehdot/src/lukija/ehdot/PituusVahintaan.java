package lukija.ehdot;

public class PituusVahintaan implements Ehto {

    private int rivinPituus;
    
    public PituusVahintaan(int rivinPituus) {
        this.rivinPituus = rivinPituus;
    }
    
    @Override
    public boolean toteutuu(String rivi) {
        return rivi.length() >= this.rivinPituus;
    }
    
}
