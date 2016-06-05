package game;

import gameoflife.GameOfLifeAlusta;
import java.util.Scanner;

// tämän luokan avulla voi testata koodiasi, ks. tehtävänanto
public class GameOfLifeTestaaja {

    private static final Scanner LUKIJA = new Scanner(System.in);
    private GameOfLifeAlusta alusta;

    public GameOfLifeTestaaja(GameOfLifeAlusta alusta) {
        this.alusta = alusta;
    }

    public void pelaa() {
        piirra();
        while (jatketaanKierros()) {
            try {
                alusta.pelaaKierros();
            } catch (Exception e) {
                System.out.println("Virhe: " + e.getMessage());
            }
            piirra();
        }
    }

    private static boolean jatketaanKierros() {
        tulostaKomennot();
        if ("".equals(LUKIJA.nextLine())) {
            return true;
        }

        System.out.println("Kiitos!");

        return false;
    }

    private static void tulostaKomennot() {
        System.out.print("Paina enter jatkaaksesi, muut lopettaa: ");
    }

    public void piirra() {
        if (this.alusta == null) {
            return;
        }

        System.out.println("");

        for (int y = 0; y < alusta.getKorkeus(); y++) {
            for (int x = 0; x < alusta.getLeveys(); x++) {
                if (alusta.onElossa(x, y)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}