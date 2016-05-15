package sanakirja;

public class Main {

    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        UseanKaannoksenSanakirja sanakirja = new OmaUseanKaannoksenSanakirja();
        sanakirja.lisaa("kuusi", "six");
        sanakirja.lisaa("kuusi", "spruce");

        sanakirja.lisaa("pii", "silicon");
        sanakirja.lisaa("pii", "pi");

        System.out.println(sanakirja.kaanna("kuusi"));
        sanakirja.poista("pii");
        System.out.println(sanakirja.kaanna("pii"));
    }
}
