
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 44.1
        int i = 0;
        while(maara > i) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // 44.2
        int i = 0;
        while(sivunpituus > i) {
            tulostaTahtia(sivunpituus);
            i++;
        }
        System.out.println("");
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // 44.3
        int i = 0;
        while(korkeus > i) {
            tulostaTahtia(leveys);
            i++;
        }
        System.out.println("");
    }

    public static void tulostaKolmio(int koko) {
        // 44.4
        
        int i = 0;
        int tahdetMaara = 1;
        while(koko > i) {
            tulostaTahtia(tahdetMaara);
            i++;
            tahdetMaara++;
        }
        System.out.println("");
        
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

}
