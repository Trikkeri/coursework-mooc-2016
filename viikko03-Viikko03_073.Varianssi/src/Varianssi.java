import java.util.ArrayList;

public class Varianssi {
    // Kopioi tänne tehtävän 70 metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int summa = 0;
        for(int luku : lista) {
            summa = summa + luku;
        }
        return summa;
    }
    
    // Kopioi tänne tehtävän 71 metodi keskiarvo
    public static double keskiarvo(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        double ka = 0.0;
        
        ka = (double) summa(lista) / lista.size();
        return ka;
    }

    public static double varianssi(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        double keskiarvo = keskiarvo(lista);
        
        double valisumma = 0;
        for (int i = 0; i < lista.size(); i++) {
            valisumma = valisumma + Math.pow((lista.get(i) - keskiarvo),2);
        }
        return valisumma / (lista.size() - 1);   
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("Varianssi: " + varianssi(lista));
    }

}
