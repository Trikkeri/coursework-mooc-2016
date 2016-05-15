
import grafiikka.Visualisointi;

public class Main {

    public static void main(String[] args) {

        Visualisointi visualisointi = new Visualisointi();
        visualisointi.run();

        // parametrit: leveys, korkeus, tyhjien osuus, tyytyväisyysmetri
        Eriytymismalli malli = new Eriytymismalli(10, 10, 0.1, 0.5);
        // parametri: eri joukkojen lukumäärä
        malli.alusta(3);

        while (true) {
            malli.paivita();
            visualisointi.asetaData(malli.annaData());

            if (!malli.tyytymattomiaLoytyy()) {
                break;
            }

            odota(100);
        }

        // odotetaan vielä lopuksi 5 sekuntia ja suljetaan visualisointi
        odota(5000);
        visualisointi.sulje();
    }

    public static void odota(int millisekuntia) {
        try {
            Thread.sleep(millisekuntia);
        } catch (InterruptedException ex) {
        }
    }
}
