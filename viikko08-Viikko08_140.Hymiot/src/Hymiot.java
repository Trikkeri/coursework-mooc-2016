
public class Hymiot {

    public static void main(String[] args) {
        // Testaa metodisi toimintaa ainakin seuraavilla kutsuilla
        tulostaHymioityna("Metodi");
        System.out.println("\n");
        tulostaHymioityna("Hajautustaulu");
        System.out.println("\n");
        tulostaHymioityna("Rajapinta");
        System.out.println("\n");
        tulostaHymioityna("Matti");
        System.out.println("\n");
        tulostaHymioityna("\\:D/");
    }
    
    private static void tulostaHymioityna(String merkkijono) {
        String keskirivi = "";
        
        if(merkkijono.length() % 2 == 1) {
            keskirivi = "\n:) " + merkkijono + "  :)\n";
        } else {
            keskirivi = "\n:) " + merkkijono + " :)\n";
        }
        
        tulostaHymio(keskirivi.length() - 1);
        System.out.print(keskirivi);
        tulostaHymio(keskirivi.length() - 1);
    }
    
    public static void tulostaHymio(int keskiriviPituus) {
        for (int i = 0; i < keskiriviPituus / 2; i++) {
            System.out.print(":)");
        }
    }

}
