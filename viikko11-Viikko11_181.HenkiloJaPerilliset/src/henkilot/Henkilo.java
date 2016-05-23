package henkilot;

public class Henkilo {
    
    private String nimi;
    private String osoite;
    
    public Henkilo(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nimi).append("\n").append("  ").append(this.osoite);
        return sb.toString(); 
    }
    
}
