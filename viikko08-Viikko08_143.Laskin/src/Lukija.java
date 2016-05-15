
import java.util.Scanner;

public class Lukija {
    private Scanner lukija;
    
    public Lukija() {
        this.lukija = new Scanner(System.in);
    }
    
    public String lueMerkkijono() {
        return this.lukija.nextLine();
    }
    
    public int lueKokonaisluku() {
        return Integer.parseInt(this.lukija.nextLine());
    }
}
