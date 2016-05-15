public class Kasvatuslaitos {

    private int punnitusKerrat;
    
    public Kasvatuslaitos() {
        this.punnitusKerrat = 0;
    }
    
    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        this.punnitusKerrat++;
        return henkilo.getPaino();  
    }
    
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }
    
    public int punnitukset() {
        return this.punnitusKerrat;
    }

}
