
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {
        
        if(luku1 > luku2 && luku1 > luku3) {
            return luku1;
        } else if (luku2 > luku3) {
            return luku2;
        } else {
            return luku3;
        }
    }

    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}