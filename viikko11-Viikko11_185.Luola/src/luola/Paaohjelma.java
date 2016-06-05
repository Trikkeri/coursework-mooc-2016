package luola;

import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        new Luola(10, 10, 5, 14, true).run(lukija);
    }
}
