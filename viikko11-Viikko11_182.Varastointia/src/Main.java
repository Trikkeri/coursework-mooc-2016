
import varastot.Tuotevarasto;


public class Main {

    public static void main(String[] args) {
        // kirjoita tänne testikoodia
        Tuotevarasto mehu = new Tuotevarasto("Juice", 1000.0);
        mehu.lisaaVarastoon(1000.0);
        mehu.otaVarastosta(11.3);
        System.out.println(mehu.getNimi()); // Juice
        mehu.lisaaVarastoon(1.0);
        System.out.println(mehu);           // Juice: saldo = 989.7, tilaa 10.299999999999955
    }

}
