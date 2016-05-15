package sanatutkimus;

import java.io.File;
import java.io.FileNotFoundException;

public class Paaohjelma {

    public static void main(String[] args) throws FileNotFoundException {
        // testaa luokkasi toimintaa täällä

        File tiedosto = new File("src/pienilista.txt");
        // kaikki sanat tiedostossa src/sanalista.txt
        Sanatutkimus st = new Sanatutkimus(tiedosto);
        //st.sanojenMaara();
        //System.out.println(st.kirjaimenZSisaltavatSanat());
        System.out.println(st.kaikkiVokaalitSisaltavatSanat());
    }
}
