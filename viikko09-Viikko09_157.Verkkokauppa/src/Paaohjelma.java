
import java.util.Scanner;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        Varasto varasto = new Varasto();
        varasto.lisaaTuote("kahvi", 5, 10);
        varasto.lisaaTuote("maito", 3, 20);
        varasto.lisaaTuote("piimä", 2, 55);
        varasto.lisaaTuote("leipä", 7, 8);

        Kauppa kauppa = new Kauppa(varasto, new Scanner(System.in));
        kauppa.asioi("Pekka");
    }
}
