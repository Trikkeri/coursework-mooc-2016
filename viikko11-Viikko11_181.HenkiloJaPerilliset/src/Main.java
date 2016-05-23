
import henkilot.Henkilo;
import henkilot.Opettaja;
import henkilot.Opiskelija;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        // tee tänne testikoodia
//        Henkilo ada = new Henkilo("Ada Lovelace", "Korsontie 1 03100 Vantaa");
//        Henkilo esko = new Henkilo("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//        System.out.println(ada);
//        System.out.println(esko);

//        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
//        System.out.println(olli);
//        olli.opiskele();
//        System.out.println(olli);

//        Opettaja ada = new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200);
//        Opettaja esko = new Opettaja("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//        System.out.println(ada);
//        System.out.println(esko);
//
//        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
//        for (int i = 0; i < 25; i++) {
//            olli.opiskele();
//        }
//        System.out.println(olli);

        List<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200));
        henkilot.add(new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki"));

        tulostaLaitoksenHenkilot(henkilot);

    }
    
    public static void tulostaLaitoksenHenkilot(List<Henkilo> henkilot) {
        for (Henkilo henk : henkilot) {
            System.out.println(henk);
        }
    }
    
}
