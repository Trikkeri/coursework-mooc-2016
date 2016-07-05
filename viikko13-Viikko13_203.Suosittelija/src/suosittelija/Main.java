package suosittelija;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.comparator.ElokuvaComparator;
import suosittelija.comparator.HenkiloComparator;
import suosittelija.domain.Arvio;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Henkilo;


public class Main {

    public static void main(String[] args) {
        // Testaa luokkiesi toteutusta täällä
        ArvioRekisteri arviot = new ArvioRekisteri();

        Elokuva tuulenViemaa = new Elokuva("Tuulen viemää");
        Elokuva hiljaisetSillat = new Elokuva("Hiljaiset sillat");
        Elokuva eraserhead = new Elokuva("Eraserhead");

        Henkilo matti = new Henkilo("Matti");
        Henkilo pekka = new Henkilo("Pekka");
        Henkilo mikke = new Henkilo("Mikael");

        arviot.lisaaArvio(matti, tuulenViemaa, Arvio.HUONO);
        arviot.lisaaArvio(matti, hiljaisetSillat, Arvio.HYVA);
        arviot.lisaaArvio(matti, eraserhead, Arvio.OK);

        arviot.lisaaArvio(pekka, tuulenViemaa, Arvio.OK);
        arviot.lisaaArvio(pekka, hiljaisetSillat, Arvio.VALTTAVA);
        arviot.lisaaArvio(pekka, eraserhead, Arvio.VALTTAVA);

        Suosittelija suosittelija = new Suosittelija(arviot);
        Elokuva suositeltu = suosittelija.suositteleElokuva(mikke);
        System.out.println("Mikaelille suositeltu elokuva oli: " + suositeltu);
    }
}
