public class SuurinTaajuusRaportti {

    private int paiva;
    private double suurinArvo;

    public SuurinTaajuusRaportti(int paiva, double suurinArvo) {
        this.paiva = paiva;
        this.suurinArvo = suurinArvo;
    }

    public int getPaiva() {
        return paiva;
    }

    public void setPaiva(int paiva) {
        this.paiva = paiva;
    }

    public double getSuurinArvo() {
        return suurinArvo;
    }

    public void setSuurinArvo(double suurinArvo) {
        this.suurinArvo = suurinArvo;
    }

}
