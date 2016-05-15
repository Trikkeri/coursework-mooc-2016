
public class Main {

    public static void main(String[] args) {
        // Testaa Tahtitaivas-luokkaasi täällä
        
//        Tahtitaivas tahtitaivas = new Tahtitaivas(0.1);
//        tahtitaivas.tulostaRivi();
        
//        Tahtitaivas tahtitaivas = new Tahtitaivas(8, 4);
//        tahtitaivas.tulosta();

        Tahtitaivas tahtitaivas = new Tahtitaivas(8, 4);
        tahtitaivas.tulosta();
        System.out.println("Tähtiä: " + tahtitaivas.tahtiaViimeTulostuksessa());
        System.out.println("");

        tahtitaivas.tulosta();
        System.out.println("Tähtiä: " + tahtitaivas.tahtiaViimeTulostuksessa());
  
    }
}
