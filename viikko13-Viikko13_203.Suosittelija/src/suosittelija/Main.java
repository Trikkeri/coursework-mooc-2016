package suosittelija;

import suosittelija.domain.Arvio;
import suosittelija.domain.ArvioRekisteri;
import suosittelija.domain.Elokuva;


public class Main {

    public static void main(String[] args) {
        // Testaa luokkiesi toteutusta täällä
        Elokuva hiljaisetSillat = new Elokuva("Hiljaiset sillat");
        Elokuva eraserhead = new Elokuva("Eraserhead");

        ArvioRekisteri rekisteri = new ArvioRekisteri();
        rekisteri.lisaaArvio(eraserhead, Arvio.HUONO);
        rekisteri.lisaaArvio(eraserhead, Arvio.HUONO);
        rekisteri.lisaaArvio(eraserhead, Arvio.HYVA);

        rekisteri.lisaaArvio(hiljaisetSillat, Arvio.HYVA);
        rekisteri.lisaaArvio(hiljaisetSillat, Arvio.OK);

        System.out.println("Kaikki arviot: " + rekisteri.elokuvienArviot());
        System.out.println("Arviot Eraserheadille: " + rekisteri.annaArviot(eraserhead));
    }
}
