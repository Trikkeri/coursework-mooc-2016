
import javax.swing.SwingUtilities;
import matopeli.Matopeli;
import matopeli.PeliIkkuna;

public class Main {

    public static void main(String[] args) {
        // Huom! Sinun ei tarvitse koskea tähän luokkaan. Muokkaa luokkaa
        // Matoaly älykkään madon rakentamiseksi.

        Matopeli matopeli = new Matopeli();
        PeliIkkuna ikkuna = new PeliIkkuna(matopeli);

        SwingUtilities.invokeLater(ikkuna);

        int odotusMillisekunteina = 100;

        Matoaly matoaly = new Matoaly();

        while (true) {
            if (matopeli.peliLoppu()) {
                break;
            }

            String siirto = matoaly.annaSiirto(matopeli);
            matopeli.liiku(siirto);

            ikkuna.paivita();
            matopeli.odota(odotusMillisekunteina);
        }

        ikkuna.sulje();
    }
}
