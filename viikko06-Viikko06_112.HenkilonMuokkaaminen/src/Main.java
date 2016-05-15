
public class Main {

    public static void main(String[] args) {
        // voit kopioida tänne testikoodia materiaalista
        // esim. Henkilo pekka = new Henkilo("Pekka", 15, 2, 1993);
        
        Henkilo janika = new Henkilo("Janika", 1, 1, 2010);
        Henkilo helga = new Henkilo("Helga", 30, 12, 2009);

        System.out.println(janika.getNimi() + " vanhempi kuin " + helga.getNimi() + ": " + janika.vanhempiKuin(helga));
        System.out.println(helga.getNimi() + " vanhempi kuin " + janika.getNimi() + ": " + helga.vanhempiKuin(janika));
    }
}
