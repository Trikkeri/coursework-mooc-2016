
public class Kello {

    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;

    public Kello(int tunnitAlussa, int minuutitAlussa, int sekunnitAlussa) {
        // luodaan kello joka asetetaan parametrina annettuun aikaan
        
        this.tunnit = new YlhaaltaRajoitettuLaskuri(23);
        this.minuutit = new YlhaaltaRajoitettuLaskuri(59);
        this.sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        
        this.tunnit.asetaArvo(tunnitAlussa);
        this.minuutit.asetaArvo(minuutitAlussa);
        this.sekunnit.asetaArvo(sekunnitAlussa);
        
    }

    public void etene() {
        this.sekunnit.seuraava();
          
        if(sekunnit.arvo() < 1) {
            minuutit.seuraava();

            if(minuutit.arvo() < 1) {
                tunnit.seuraava();
            }
        }
    }

    public String toString() {
        // palauttaa kellon merkkijonoesityksen
        return "" + tunnit + ":" + minuutit + ":" + sekunnit;
    }
}
