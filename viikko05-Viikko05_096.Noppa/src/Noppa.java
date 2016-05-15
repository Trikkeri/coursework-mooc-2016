
import java.util.Random;

public class Noppa {

    private Random random;
    private int tahkojenMaara;

    public Noppa(int tahkojenMaara) {
        this.random = new Random();
        this.tahkojenMaara = tahkojenMaara;
    }

    public int heita() {
        int arvottuLuku = random.nextInt(tahkojenMaara + 1);
        
        if(arvottuLuku == 0) {
            while(arvottuLuku == 0) {
                arvottuLuku = random.nextInt(tahkojenMaara + 1);
            }
        }
        return arvottuLuku;
    }
}
