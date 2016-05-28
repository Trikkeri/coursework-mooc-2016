
import varastot.MuistavaTuotevarasto;
import varastot.Muutoshistoria;
import varastot.Tuotevarasto;


public class Main {

    public static void main(String[] args) {
        // kirjoita tänne testikoodia
//        Tuotevarasto mehu = new Tuotevarasto("Juice", 1000.0);
//        mehu.lisaaVarastoon(1000.0);
//        mehu.otaVarastosta(11.3);
//        System.out.println(mehu.getNimi()); // Juice
//        mehu.lisaaVarastoon(1.0);
//        System.out.println(mehu);           // Juice: saldo = 989.7, tilaa 10.299999999999955

        // tuttuun tapaan:
//        MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 1000.0);
//        mehu.otaVarastosta(11.3);
//        System.out.println(mehu.getNimi()); // Juice
//        mehu.lisaaVarastoon(1.0);
//        System.out.println(mehu);           // Juice: saldo = 989.7, vielä tilaa 10.3
//       
//        // mutta nyt on historiaakin:
//        System.out.println(mehu.historia()); // [1000.0, 988.7, 989.7]
        

//        MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 1000.0);
//        mehu.otaVarastosta(11.3);
//        mehu.lisaaVarastoon(1.0);
//        //System.out.println(mehu.historia()); // [1000.0, 988.7, 989.7]
//
//        mehu.tulostaAnalyysi();

//            MuistavaTuotevarasto mtv = new MuistavaTuotevarasto("kahvi",10,5);
//            mtv.lisaaVarastoon(1);
//            mtv.lisaaVarastoon(1);
//            mtv.lisaaVarastoon(1);
//            mtv.lisaaVarastoon(1);
//            mtv.otaVarastosta(3);
//            mtv.otaVarastosta(3);
//            mtv.otaVarastosta(3);
//            System.out.println(mtv.historia());
//            //expected:<...6.0, 7.0, 8.0, 9.0, [6.0, 3.0, 0].0]> but was:<...6.0, 7.0, 8.0, 9.0, [7.0, 7.0, 7].0]>

//        MuistavaTuotevarasto mtv = new MuistavaTuotevarasto("kahvi", 10, 5);
//        System.out.println(mtv.otaVarastosta(7));
//        mtv.tulostaAnalyysi();

        Muutoshistoria mh = new Muutoshistoria();
//        mh.lisaa(-3.0);
//        mh.lisaa(-3.0);
//        mh.lisaa(6.0);
//        mh.lisaa(7.0);
//        mh.lisaa(-3.0);
//        mh.lisaa(5.0);
//        mh.lisaa(12.0);
//        mh.lisaa(5);
//        mh.lisaa(6);

        mh.lisaa(5);
        mh.lisaa(4);
        mh.lisaa(7);
        mh.lisaa(1);
        mh.lisaa(12);
        mh.lisaa(3);

        System.out.println(mh.suurinMuutos());



    }

}
