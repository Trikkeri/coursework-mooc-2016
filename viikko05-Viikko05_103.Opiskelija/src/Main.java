
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tee tänne pääohjelma
        ArrayList<Opiskelija> lista = new ArrayList<>();
        
        Scanner lukija = new Scanner(System.in);
        String nimi = "";
        String opiskelijanumero = "";
         
        while(true) {
            System.out.println("Nimi: ");
            nimi = lukija.nextLine();
            
            if(nimi.isEmpty()) {
                break;
            }
            
            System.out.println("Opiskelijanumero: ");
            opiskelijanumero = lukija.nextLine();
            lista.add(new Opiskelija(nimi, opiskelijanumero));
        }
        
        for(Opiskelija oppilas : lista) {
            System.out.println(oppilas);
        }
        
        System.out.println("Anna hakusana: ");
        String hakusana = lukija.nextLine();
        System.out.println("Tulokset: ");
        for(Opiskelija oppilas : lista) {
            if(oppilas.haeNimi().contains(hakusana)) {
                System.out.println(oppilas);
            }
        }
        
    }
}