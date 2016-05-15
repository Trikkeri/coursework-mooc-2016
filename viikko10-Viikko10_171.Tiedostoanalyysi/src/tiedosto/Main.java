package tiedosto;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // testaa luokkasi toimintaa täällä

        File tiedosto = new File("src/testitiedosto.txt");
        Analyysi a = new Analyysi(tiedosto);
        System.out.println("Riviä: " + a.rivimaara());
        System.out.println("Merkkejä:" + a.merkkeja());
    }
}
