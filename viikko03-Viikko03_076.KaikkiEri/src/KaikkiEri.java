
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KaikkiEri {

    public static boolean kaikkiEri(ArrayList<Integer> luvut) {
        // kirjoita koodia tähän
        ArrayList<Integer> kopio = new ArrayList<>(luvut);
        Collections.sort(kopio);
        
        int verrattava;
        //int montakoKertaa = 0;
        int index = 0;
        
        for(int i : kopio) {          
            if(index > 0) {
                verrattava = kopio.get(index - 1);
                if(i == verrattava) {
                    //montakoKertaa++;
                    return false;
                }
            }
            index++;
        }          
        //return montakoKertaa <= 0;
        return true;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();

        System.out.println("Anna lukuja, -99 lopettaa:");

        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -99) {
                break;
            }
            luvut.add(luku);
        }

        if (kaikkiEri(luvut)) {
            System.out.println("Kaikki syöttämäsi luvut olivat erisuuruisia");
        } else {
            System.out.println("Syöttämiesi lukujen joukossa oli samansuuruisia");
        }
    }
}
