// HUOM! Älä muuta tämän luokan toimintaa.

public class YlhaaltaRajoitettuLaskuri {

    private int arvo;
    private int ylaraja;

    public YlhaaltaRajoitettuLaskuri(int ylarajanAlkuarvo) {
        this.ylaraja = ylarajanAlkuarvo;
        this.arvo = 0;
    }

    public void seuraava() {
        if (this.arvo == this.ylaraja) {
            this.arvo = 0;
        } else {
            this.arvo++;
        }
    }

    public int arvo() {
        return this.arvo;
    }

    public void asetaArvo(int uusiArvo) {
        if (uusiArvo < 0 || uusiArvo > this.ylaraja) {
            return;
        }

        this.arvo = uusiArvo;
    }

    @Override
    public String toString() {
        String etunolla = "0";
        if (this.arvo > 9) {
            etunolla = "";
        }
        return etunolla + this.arvo;
    }

}
