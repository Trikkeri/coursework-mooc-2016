package validointi;

public class Laskin {

    public int kertoma(int luvusta) {

        if(luvusta < 0) {
            throw new IllegalArgumentException("Parametrina annetun luvun tulee olla 0 tai suurempi!");
        }
        
        int kertoma = 1;
        for (int i = 1; i <= luvusta; i++) {
            kertoma *= i;
        }

        return kertoma;
    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {

        int osoittaja = kertoma(joukonKoko);
        int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);

        return osoittaja / nimittaja;
    }
}
