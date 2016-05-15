
public class Main {

    public static void main(String[] args) throws Exception {
        // tee testikoodia tänne
        // projektissa kokeiluja varten tiedostot
        //    src/testitiedosto.txt
        //    src/kalevala.txt
        
//        Tulostaja t = new Tulostaja("src//testitiedosto.txt");
//        t.tulostaRivitJoilla("koivun");
        
        Tulostaja tulostaja = new Tulostaja("src/testitiedosto.txt");

        tulostaja.tulostaRivitJoilla("Väinämöinen");
        System.out.println("-----");
        tulostaja.tulostaRivitJoilla("Frank Zappa");
        System.out.println("-----");
        tulostaja.tulostaRivitJoilla("");
        System.out.println("-----");

    }
}
