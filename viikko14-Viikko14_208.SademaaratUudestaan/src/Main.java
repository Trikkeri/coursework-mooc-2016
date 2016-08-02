
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        
        List<Double> sademaarat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        double syote = 0.0;
        
        System.out.println("Anna sademääriä, lopeta luvulla 999999.");
        
        while(true) {
            System.out.println("Anna sademäärä: ");
            
            if(lukija.hasNextDouble()) {
                syote = lukija.nextDouble();
                
                if(syote == 999999) {
                    break;
                }
                
            } else {
                lukija.next();
                System.out.println("Syötteen tulee olla luku.");
            }
            
            sademaarat.add(syote);
        }
        
        if(sademaarat.size() > 0) {
            double keskiarvo = sademaarat.stream().filter(i -> i >= 0).mapToDouble(i -> i).average().getAsDouble();
            System.out.println("Sademäärien keskiarvo on: " + keskiarvo);
        } else {
            System.out.println("Yhtään sademäärää ei syötetty");
        }
        
    }
}
