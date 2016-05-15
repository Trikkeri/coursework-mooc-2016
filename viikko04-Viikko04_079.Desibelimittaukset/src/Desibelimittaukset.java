
import java.util.ArrayList;
import java.util.Scanner;

public class Desibelimittaukset {

    public static void main(String[] args) {
        // HUOM! Älä luo muita Scanner-olioita koodissa
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        // voit testata toimintaa täällä
        System.out.println("Syötä lukuja, tyhjä syöte lopettaa.");
        
        // alla on annettu eräs mahdollinen ratkaisu edellisen viikon tehtävään
        // Desibelimittaukset
        lueLuvut(lukija, lista);
        lista = valitseLuvutValilta(lista, 0, Integer.MAX_VALUE);

        if (lista.isEmpty()) {
            System.out.println("Ei lukuja.");
        } else {
            System.out.println("Lukujen keskiarvo: " + keskiarvo(lista));
        }
    }
    
    public static void lueLuvut(Scanner lukija, ArrayList<Integer> lista) {
        while(true) {
            String luettu = lukija.nextLine();
            if(luettu.isEmpty()){
                break;
            } else {
                lista.add(Integer.parseInt(luettu));
            }   
        }
    }
    
    public static ArrayList<Integer> valitseLuvutValilta(ArrayList<Integer> luvut, int pienin, int suurin) {
        ArrayList<Integer> valitutLuvut = new ArrayList<>();
        
        for (int luku : luvut) {
            if(luku <= suurin && luku >= pienin)
                valitutLuvut.add(luku);
        }
        
        return valitutLuvut;
    }
   
    public static double keskiarvo(ArrayList<Integer> luvut) {
        int maara = 0;
        int yhteenLaskettavat = 0;
        double summa;
        
        for (int luku : luvut) {
            yhteenLaskettavat = yhteenLaskettavat + luku;
            maara++;
        }
        summa = (double) yhteenLaskettavat / maara;
        return summa;
    }

}
