
public class LukujenKeskiarvo {

    // toteuta tähän uudelleen tehtävään 50 jo tekemäsi metodi
    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        // kirjoita koodia tähän
        int summa = luku1 + luku2 + luku3 + luku4;
        return summa;
    }

    public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
        double ka = summa(luku1, luku2, luku3, luku4) / 4.0;
        return ka;
    }

    public static void main(String[] args) {
        double vastaus = keskiarvo(4, 3, 6, 1);
        System.out.println("Keskiarvo: " + vastaus);
    }
}
