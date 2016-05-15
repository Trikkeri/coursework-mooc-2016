package muuttaminen.domain;


public class Esine implements Tavara, Comparable<Esine> {

    private int tilavuus;
    private String nimi;
    
    public Esine(String nimi, int tilavuus) {
        this.tilavuus = tilavuus;
        this.nimi = nimi;
    }
    
    @Override
    public int getTilavuus() {
        return tilavuus;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public String toString() {
        return nimi + " (" + tilavuus + " dm^3)";
    }
    
    public int compareTo(Esine verrattava) {
        return this.tilavuus - verrattava.getTilavuus();
    }
    
}
