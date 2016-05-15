
import java.util.ArrayList;
import java.util.Scanner;

public class Makihyppy {
    private Scanner lukija;
    private ArrayList<Osallistuja> osallistujat;
    private int kierros;
    
    public Makihyppy() {
        this.lukija = new Scanner(System.in);
        this.osallistujat = new ArrayList<>();
        this.kierros = 0;
    }
    
    public void kaynnista() {
        System.out.println("Kumpulan mäkiviikot\n");
        System.out.println("Syötä kilpailun osallistujat yksi kerrallaan, tyhjällä merkkijonolla siirtyy hyppyvaiheeseen.");
        
        while(true) {
            System.out.print("  Osallistujan nimi: ");
            String komento = this.lukija.nextLine();
            if(komento.isEmpty()) {
                return;
            }
            osallistujat.add(new Osallistuja(komento));
        }   
    }
    
    public void kaynnistaKierrokset() {
        System.out.println("\nKilpailu alkaa!");
        
        while(true) {
            System.out.print("\nKirjoita \"hyppaa\" niin hypätään, muuten lopetetaan: ");
            String komento = this.lukija.nextLine();
        
            if(komento.equals("hyppaa")) {
                hyppaa();
            } else {
                tulokset();
                return;
            }
        }
    }
    
    public void hyppaa() {
        this.kierros += 1;
        System.out.println("\n" + this.kierros + ". kierros");
        
        System.out.println("\nHyppyjärjestys:");
        asetaHyppaajatJarjestykseenPieninEnsin();
        tulostaHyppyjarjestys();
        
        for(Osallistuja osallistuja : osallistujat) {
            osallistuja.kierrokselle();
            osallistuja.kaynnistaKierros(this.kierros - 1);
        }
        
        System.out.println("\nKierroksen " + this.kierros + " tulokset");
        for(Osallistuja osallistuja : osallistujat) {
            System.out.println("  " + osallistuja.getNimi());
            System.out.println("    pituus: " + osallistuja.getHypynPituus(kierros - 1));
            System.out.println("    tuomaripisteet: " + osallistuja.getTuomariPisteet(kierros - 1));
        }
    }
    
    public void tulokset() {
        System.out.println("\nKiitos!");
        System.out.println("\nKilpailun lopputulokset: ");
        System.out.println("Sija    Nimi");
        
        Osallistuja osallistuja = null;
        asetaHyppaajatJarjestykseenSuurinEnsin();
        
        for (int i = 0; i < this.osallistujat.size(); i++) {
            System.out.println((i + 1) + "       " + this.osallistujat.get(i));
            System.out.print("          hyppyjen pituudet:");
            
            osallistuja = this.osallistujat.get(i);
            osallistuja.keraaJaTulostaHyppyjenPituudet();  
            
            System.out.println("\n");
        }
    }
    
    public void tulostaHyppyjarjestys() {
        int laskuri = 1;

        for(Osallistuja osallistuja : osallistujat) {
            System.out.println("  " + laskuri + ". " + osallistuja);
            laskuri++;
        }
    }
    
    public void asetaHyppaajatJarjestykseenPieninEnsin() {
        Osallistuja verrattava = null;
        Osallistuja apu = null;
       
        for (int i = 0; i < this.osallistujat.size(); i++) {
            for (int j = 0; j < this.osallistujat.size(); j++) {
                verrattava = this.osallistujat.get(i);
                if(verrattava.compareTo(this.osallistujat.get(j)) < 0) {
                    apu = this.osallistujat.get(j);
                    this.osallistujat.set(j, verrattava);
                    this.osallistujat.set(i, apu);
                }
            }
        }
    }
    
    public void asetaHyppaajatJarjestykseenSuurinEnsin() {
        Osallistuja verrattava = null;
        Osallistuja apu = null;
       
        for (int i = 0; i < this.osallistujat.size(); i++) {
            for (int j = 0; j < this.osallistujat.size(); j++) {
                verrattava = this.osallistujat.get(i);
                if(verrattava.compareTo(this.osallistujat.get(j)) > 0) {
                    apu = this.osallistujat.get(j);
                    this.osallistujat.set(j, verrattava);
                    this.osallistujat.set(i, apu);
                }
            }
        }
    }
}
