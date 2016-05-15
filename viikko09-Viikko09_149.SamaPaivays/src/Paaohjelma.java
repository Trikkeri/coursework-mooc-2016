
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        Paivays p = new Paivays(1, 2, 2000);
        System.out.println(p.equals("heh"));
        System.out.println(p.equals(new Paivays(5, 2, 2012)));
        System.out.println(p.equals(new Paivays(1, 2, 2000)));
    }
}
