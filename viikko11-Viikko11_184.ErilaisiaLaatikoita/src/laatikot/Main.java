package laatikot;

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        Tavara t1 = new Tavara("test", 50);
        Tavara t2 = new Tavara("testa", 0);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
