import java.util.ArrayList;
import java.util.Collections;

public class Suurin {
    public static int suurin(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        Collections.sort(lista);
        return lista.get(lista.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("Suurin: " + suurin(lista));
    }
}