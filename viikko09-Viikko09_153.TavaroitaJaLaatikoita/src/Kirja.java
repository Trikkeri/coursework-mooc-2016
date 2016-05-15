public class Kirja implements Talletettava {
    private String kirjoittaja;
    private String nimi;
    double paino;
    
    public Kirja(String kirjoittaja, String nimi, double paino) {
        this.kirjoittaja = kirjoittaja;
        this.nimi = nimi;
        this.paino = paino;
    }
    
    public double paino() {
        return this.paino;
    }
    
    public String toString() {
        return this.kirjoittaja + ": " + this.nimi;
    }
}
