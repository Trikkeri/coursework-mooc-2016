
import java.util.ArrayList;
import java.util.Collections;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        ArrayList<Kortti> kortit = new ArrayList<>();

        kortit.add(new Kortti(3, Kortti.PATA));
        kortit.add(new Kortti(2, Kortti.RUUTU));
        kortit.add(new Kortti(14, Kortti.PATA));
        kortit.add(new Kortti(12, Kortti.HERTTA));
        kortit.add(new Kortti(2, Kortti.PATA));

        SamatMaatVierekkainArvojarjestykseen samatMaatVierekkainArvojarjestykseen = new SamatMaatVierekkainArvojarjestykseen();
        Collections.sort(kortit, samatMaatVierekkainArvojarjestykseen);

        for (Kortti k : kortit) {
            System.out.println(k);
        }

    }
}
