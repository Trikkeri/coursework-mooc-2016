package lukija;

import lukija.ehdot.*;

public class Main {

    public static void main(String[] args) {
        String osoite = "http://www.gutenberg.org/cache/epub/2554/pg2554.txt";
        GutenbergLukija kirja = new GutenbergLukija(osoite);

//        Ehto ehto = new SisaltaaSanan("beer");
//        Ehto ehto = new KaikkiRivit();
//        Ehto ehto = new LoppuuHuutoTaiKysymysmerkkiin();
//        Ehto ehto = new PituusVahintaan(40);

//Ehto ehto = new Molemmat(
//                new LoppuuHuutoTaiKysymysmerkkiin(),
//                new SisaltaaSanan("beer")
//            );

//        Ehto ehto = new Ei( new PituusVahintaan(10) );

        Ehto ehto = new VahintaanYksi(
                        new SisaltaaSanan("beer"),
                        new SisaltaaSanan("milk"),
                        new SisaltaaSanan("oil")
                    );

        for (String rivi : kirja.rivitJoilleVoimassa(ehto)) {
            System.out.println(rivi);
        }
    }
}
