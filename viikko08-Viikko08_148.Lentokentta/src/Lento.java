public class Lento {
    private String lahtotunnus;
    private String kohdetunnus;
    
    public Lento() {
        this.lahtotunnus = "";
        this.kohdetunnus = "";
    }
    
    public Lento(String lahto, String kohde) {
        this.lahtotunnus = lahto;
        this.kohdetunnus = kohde;
    }
    
    public String toString() {
        return "(" + this.lahtotunnus + "-" + this.kohdetunnus + ")";
    }
}
