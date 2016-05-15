
import java.util.ArrayList;
import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private ArrayList<Lentokone> lentokoneet;
    
    public Tekstikayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        this.lentokoneet = new ArrayList<>();
    }
    
    public void kaynnistaHallinta() {
        
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------\n");
        
        while(true) {
        
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Lisää lentokone");
            System.out.println("[2] Lisää lento");
            System.out.println("[x] Poistu hallintamoodista");
            System.out.print("> ");
            String syote = this.lukija.nextLine();

            if(syote.equals("x")) {
                System.out.println("");
                break;
            }

            suoritaHallinta(syote);
        }
    }
    
    void kaynnistaLentoPalv() {
        
        System.out.println("Lentopalvelu");
        System.out.println("------------\n");
        
        while(true) {
        
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Tulosta lentokoneet");
            System.out.println("[2] Tulosta lennot");
            System.out.println("[3] Tulosta lentokoneen tiedot");
            System.out.println("[x] Lopeta");
            System.out.print("> ");
            String syote = this.lukija.nextLine();

            if(syote.equals("x")) {
                break;
            }

            suoritaPalvelu(syote);
        }
    }
    
    public void suoritaHallinta(String komento) {
        if(komento.equals("1")) {
            lisaaLentokone();
        }
        
        if(komento.equals("2")) {
            lisaaLento();
        }
    }
    
    public void suoritaPalvelu(String komento) {
        if(komento.equals("1")) {
            tulostaLentokoneet();
        }
        
        if(komento.equals("2")) {
            tulostaLennot();
        }
        
        if(komento.equals("3")) {
            tulostaLentokone();
        }
    }
    
    public void lisaaLentokone() {
        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus = this.lukija.nextLine();
        System.out.print("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti = Integer.parseInt(this.lukija.nextLine());
        this.lentokoneet.add(new Lentokone(tunnus, kapasiteetti));
    }
    
    public void lisaaLento() {
        System.out.print("Anna lentokoneen tunnus: ");
        String koneenTunnus = this.lukija.nextLine();
        System.out.print("Anna lähtöpaikan tunnus: ");
        String lahtotunnus = this.lukija.nextLine();
        System.out.print("Anna kohdepaikan tunnus: ");
        String kohdetunnus = this.lukija.nextLine();
        
        for(Lentokone kone : this.lentokoneet) {
            if(kone.haeTunnus().equals(koneenTunnus)) {
                kone.asetaLennolle(new Lento(lahtotunnus, kohdetunnus));
            }
        }
    }
    
    public void tulostaLentokoneet() {
        for(Lentokone kone : this.lentokoneet) {
            System.out.println(kone);
        }
    }
    
    public void tulostaLennot() {
        for (Lentokone kone : this.lentokoneet) {
            kone.tulostaLennot();
        }
    }
    
    public void tulostaLentokone() {
        System.out.print("Mikä kone: ");
        String koneenTunnus = this.lukija.nextLine();
        for(Lentokone kone : this.lentokoneet) {
            if(kone.haeTunnus().equals(koneenTunnus)) {
                System.out.println(kone);
            }
        }
    }
}
