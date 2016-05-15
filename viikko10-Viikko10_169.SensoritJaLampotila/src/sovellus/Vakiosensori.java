package sovellus;

public class Vakiosensori implements Sensori {

    private int mittaarvo;
    
    public Vakiosensori(int i) {
        this.mittaarvo = i;
    }

    @Override
    public boolean onPaalla() {
        return true;
    }

    @Override
    public void paalle() {
    }

    @Override
    public void poisPaalta() {
    }

    @Override
    public int mittaa() {
        return this.mittaarvo;
    }
}
