
public class Henkilo {

    private String nimi;
    private double pituus;
    private double paino;
    private int syke;

    public Henkilo(String nimi, double pituus, double paino, int syke) {
        this.nimi = nimi;
        this.pituus = pituus;
        this.paino = paino;
        this.syke = syke;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPituus() {
        return pituus;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public double getPaino() {
        return paino;
    }

    public void setPaino(double paino) {
        this.paino = paino;
    }

    public int getSyke() {
        return syke;
    }

    public void setSyke(int syke) {
        this.syke = syke;
    }

}
