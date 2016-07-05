package lukija;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lukija.ehdot.Ehto;

public class GutenbergLukija {

    private List<String> sanat;

    public GutenbergLukija(String osoite) {
        sanat = new ArrayList<>();
        try {
            URL url = new URL(osoite);
            Scanner lukija = new Scanner(url.openStream());
            while (lukija.hasNextLine()) {
                sanat.add(lukija.nextLine());
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<String> rivitJoilleVoimassa(Ehto ehto) {
        List<String> ehdonTayttavat = new ArrayList<>();

        for (String rivi : sanat) {
            if (ehto.toteutuu(rivi)) {
                ehdonTayttavat.add(rivi);
            }
        }

        return ehdonTayttavat;
    }
}
