import java.util.Random;

public class SalasananArpoja {
    private int salasanaPituus;
    private Random random;

    public SalasananArpoja(int salasananPituus) {
        this.salasanaPituus = salasananPituus;
        this.random = new Random();
    }

    public String luoSalasana() {
        // Kirjoita tähän koodi, joka palauttaa uuden salasanan
        int indeksi = 0;
        String salasana = "";
        while(indeksi < this.salasanaPituus) {
            
            char merkki = "abcdefghijklmnopqrstuvwxyz".charAt(arvoLuku(25));
            salasana = salasana + merkki;
            
            indeksi++;
        }
        return salasana;
    }
    
    private int arvoLuku(int maksimiLuku) {
        int arvottuLuku = random.nextInt(maksimiLuku + 1);
        
        if(arvottuLuku == 0) {
            while(arvottuLuku == 0) {
                arvottuLuku = random.nextInt(maksimiLuku + 1);
            }
        }
        return arvottuLuku;
    }
    
}
