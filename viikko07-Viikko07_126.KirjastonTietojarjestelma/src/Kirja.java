public class Kirja {
    private String nimeke;
    private String julkaisija;
    private int julkaisuvuosi;
    
    public Kirja(String nimeke, String julkaisija, int julkaisuvuosi) {
        this.nimeke = nimeke;
        this.julkaisija = julkaisija;
        this.julkaisuvuosi = julkaisuvuosi;
    }
    
    public String nimeke() {
        return this.nimeke;
    }
    
    public String julkaisija() {
        return this.julkaisija;
    }
    
    public int julkaisuvuosi() {
        return this.julkaisuvuosi;
    }
    
    public String toString() {
        return "" + nimeke + ", " + julkaisija + ", " +julkaisuvuosi;
    }
}
