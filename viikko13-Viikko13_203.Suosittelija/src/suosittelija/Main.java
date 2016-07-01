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
Henkilo mikke = new Henkilo("Mikke");

arviot.lisaaArvio(matti, tuulenViemaa, Arvio.HUONO);
arviot.lisaaArvio(matti, hiljaisetSillat, Arvio.HYVA);
arviot.lisaaArvio(matti, eraserhead, Arvio.OK);

arviot.lisaaArvio(pekka, tuulenViemaa, Arvio.OK);
arviot.lisaaArvio(pekka, hiljaisetSillat, Arvio.HUONO);
arviot.lisaaArvio(pekka, eraserhead, Arvio.VALTTAVA);

arviot.lisaaArvio(mikke, eraserhead, Arvio.HUONO);

Map<Elokuva, List<Arvio>> elokuvienArviot = arviot.elokuvienArviot();

List<Elokuva> elokuvat = Arrays.asList(tuulenViemaa, hiljaisetSillat, eraserhead);
System.out.println("Elokuvat ennen järjestämistä: " + elokuvat);

Collections.sort(elokuvat, new ElokuvaComparator(elokuvienArviot));
System.out.println("Elokuvat järjestämisen jälkeen: " + elokuvat);
    }
}
