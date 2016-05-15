public class Muunnos {
    private char muunnettava;
    private char muunneltu;
    
    public Muunnos(char muunnettava, char muunneltu) {
        this.muunnettava = muunnettava;
        this.muunneltu = muunneltu;
    }
    
    public String muunna(String merkkijono) {
        return merkkijono.replace(this.muunnettava, this.muunneltu);
    }
}
