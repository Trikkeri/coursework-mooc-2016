
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        Henkilo h1 = new Henkilo("Esko", 1.75, 999, 10);
        Henkilo h2 = new Henkilo("Markku", 1.90, 80, 10);
        Henkilo h3 = new Henkilo("Perkko", 1.90, 80, 10);
        Henkilo h4 = new Henkilo("Herkka", 1.90, 80, 10);
        ArrayList<Henkilo> henkilot = new ArrayList<>();

        henkilot.add(h1);
        henkilot.add(h2);
        henkilot.add(h3);
        henkilot.add(h4);
        
        RaportinLuoja2 rapsa = new RaportinLuoja2();
        PainoindeksiRaportti raposa = rapsa.painoindeksiRaportti(henkilot);
        
        
        System.out.println("Ali: " + raposa.getAlipainoiset());
        System.out.println("Normi: " + raposa.getNormaalipainoiset());
        System.out.println("Yli: " + raposa.getYlipainoiset());
        System.out.println("Merkittävä yli: " + raposa.getMerkittavastiYlipainoiset());
        
    }

}
