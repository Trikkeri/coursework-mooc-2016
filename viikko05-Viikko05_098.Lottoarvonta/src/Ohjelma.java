
import java.util.ArrayList;

public class Ohjelma {

    public static void main(String[] args) {
        LottoRivi lottoRivi = new LottoRivi();
        ArrayList<Integer> lottonumerot = lottoRivi.numerot();

        System.out.println("Lottonumerot:");
        for (int numero : lottonumerot) {
            System.out.print(numero + " ");
        }
        System.out.println("");
    }
}
