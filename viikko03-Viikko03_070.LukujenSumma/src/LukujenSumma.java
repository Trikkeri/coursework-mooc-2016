import java.util.ArrayList;

public class LukujenSumma {
    public static int summa(ArrayList<Integer> lista) {
        // Kirjoita koodia tänne
        int summa = 0;
        for(int luku : lista) {
            summa = summa + luku;
        }
        return summa;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("Summa: " + summa(lista));

        lista.add(10);
        
        System.out.println("Summa: " + summa(lista));
    }

}