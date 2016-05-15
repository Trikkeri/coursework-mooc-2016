
import java.util.ArrayList;

public class Bongari {
    private Lintu lintu;
    private ArrayList<Lintu> havainnot;
    
    public Bongari() {
        this.havainnot = new ArrayList<>();
    }
    
    public void lisaa(String nimi, String nimiLatinaksi) {
        this.lintu = new Lintu(nimi, nimiLatinaksi);
        havainnot.add(lintu);
    }
    
    public void havainto(String nimi) {
        for(Lintu havainto : havainnot) {
            if(havainto.getNimi().equalsIgnoreCase(nimi)) {
                havainto.kasvataHavaintoa();
            }
        }
    }
    
    public void tilasto() {
        for(Lintu havainto : havainnot) {
            System.out.println(havainto);
        }
    }
    
    public void etsi(String hakusana) {
        for(Lintu havainto : havainnot) {
            if(havainto.getNimi().equalsIgnoreCase(hakusana)) {
                System.out.println(havainto);
            }
        }
    }
}
