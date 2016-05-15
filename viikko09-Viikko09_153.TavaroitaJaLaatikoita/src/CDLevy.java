public class CDLevy implements Talletettava{
    private String artisti;
    private String nimi;
    private int julkaisuvuosi;
    private double paino;
    
    public CDLevy(String artisti, String nimi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.paino = 0.1;
    }
    
    public double paino() {
        return this.paino;
    }
    
    public String toString() {
        return this.artisti + ": " + this.nimi + " (" + this.julkaisuvuosi + ")";
    }
}
