package sanakirja;

public class Main {
    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
//        MuistavaSanakirja sanakirja = new MuistavaSanakirja();
//        sanakirja.lisaa("apina", "monkey");
//        sanakirja.lisaa("banaani", "banana");
//        sanakirja.lisaa("ohjelmointi", "programming");
//        sanakirja.poista("apina");
//        sanakirja.poista("banana");
//
//        System.out.println(sanakirja.kaanna("apina"));
//        System.out.println(sanakirja.kaanna("monkey"));
//        System.out.println(sanakirja.kaanna("banana"));
//        System.out.println(sanakirja.kaanna("banaani"));
//        System.out.println(sanakirja.kaanna("ohjelmointi"));

//        MuistavaSanakirja sanakirja = new MuistavaSanakirja("src/sanat.txt");
//        boolean onnistui = sanakirja.lataa();
//
//        if (onnistui) {
//          System.out.println("sanakirjan lataaminen onnistui");
//        }
//        
//        sanakirja.lisaa("apina", "monkey");
//        sanakirja.lisaa("banaani", "banana");
//        sanakirja.lisaa("ohjelmointi", "programming");
//
//        sanakirja.tallenna();

        MuistavaSanakirja s = new MuistavaSanakirja("src/sanat2.txt");
        s.lataa();
        s.kaanna("olut");
        s.tallenna();

    }
}
