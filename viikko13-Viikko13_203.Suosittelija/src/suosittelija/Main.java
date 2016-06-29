package suosittelija;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.comparator.HenkiloComparator;
import suosittelija.domain.Arvio;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Henkilo;


public class Main {

    public static void main(String[] args) {
        // Testaa luokkiesi toteutusta täällä
Henkilo matti = new Henkilo("Matti");
Henkilo pekka = new Henkilo("Pekka");
Henkilo mikke = new Henkilo("Mikke");
Henkilo thomas = new Henkilo("Thomas");

Map<Henkilo, Integer> henkiloidenSamuudet = new HashMap<>();
henkiloidenSamuudet.put(matti, 42);
henkiloidenSamuudet.put(pekka, 134);
henkiloidenSamuudet.put(mikke, 8);
henkiloidenSamuudet.put(thomas, 82);

List<Henkilo> henkilot = Arrays.asList(matti, pekka, mikke, thomas);
System.out.println("Henkilöt ennen järjestämistä: " + henkilot);

Collections.sort(henkilot, new HenkiloComparator(henkiloidenSamuudet));
System.out.println("Henkilöt järjestämisen jälkeen: " + henkilot);
    }
}
