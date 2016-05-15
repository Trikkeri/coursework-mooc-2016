
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        
        String sana = "porkkana";
        Muunnos muunnos1 = new Muunnos('a', 'b');
        sana = muunnos1.muunna(sana);

        System.out.println(sana);

        Muunnos muunnos2 = new Muunnos('k', 'x');
        sana = muunnos2.muunna(sana);

        System.out.println(sana);
        
        ArrayList<Muunnos> muunnokset = new ArrayList<>();

        muunnokset.add(new Muunnos('A', 'I'));
        muunnokset.add(new Muunnos('!', '?'));
        muunnokset.add(new Muunnos('e', 'a'));
        muunnokset.add(new Muunnos('i', 'u'));

        String sana2 = "Arkkitehti!";

        for (Muunnos muunnos : muunnokset) {
            sana2 = muunnos.muunna(sana2);
        }
        
        System.out.println(sana2);  // tulostuu pårxxbnb
    }
}
