package laatikot;

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
//        Tavara t1 = new Tavara("test", 50);
//        Tavara t2 = new Tavara("testa", 0);
//        System.out.println(t1.hashCode());
//        System.out.println(t2.hashCode());

        MaksimipainollinenLaatikko kahviLaatikko = new MaksimipainollinenLaatikko(10);
        kahviLaatikko.lisaa(new Tavara("Saludo", 5));
        kahviLaatikko.lisaa(new Tavara("Pirkka", 5));
        kahviLaatikko.lisaa(new Tavara("Kopi Luwak", 5));
//
//        System.out.println(kahviLaatikko.onkoLaatikossa(new Tavara("Saludo")));
//        System.out.println(kahviLaatikko.onkoLaatikossa(new Tavara("Pirkka")));
//        System.out.println(kahviLaatikko.onkoLaatikossa(new Tavara("Kopi Luwak")));

//        YhdenTavaranLaatikko laatikko = new YhdenTavaranLaatikko();
//        laatikko.lisaa(new Tavara("Saludo", 5));
//        laatikko.lisaa(new Tavara("Pirkka", 5));
//
//        System.out.println(laatikko.onkoLaatikossa(new Tavara("Saludo")));
//        System.out.println(laatikko.onkoLaatikossa(new Tavara("Pirkka")));

    }
}
