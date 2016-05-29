package maatilasimulaattori;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Testaa täällä ohjelmaasi
//        Maitosailio mh = new Maitosailio();
//        System.out.println(mh.getSaldo());
//        mh.lisaaSailioon(255);
//        System.out.println(mh.getSaldo());
//        System.out.println(mh.otaSailiosta(256));
//        mh.lisaaSailioon(25);
//        System.out.println(mh);

//        Lehma muu = new Lehma();
//        System.out.println(muu);
//        muu.eleleTunti();
//        System.out.println(muu);

//        Lypsyrobotti lypsyrobotti = new Lypsyrobotti();
//        Lehma lehma = new Lehma();
//        lypsyrobotti.lypsa(lehma);


//        Lypsyrobotti lypsyrobotti = new Lypsyrobotti();
//        Lehma lehma = new Lehma();
//        System.out.println("");
//
//        Maitosailio sailio = new Maitosailio();
//        lypsyrobotti.setMaitosailio(sailio);
//        System.out.println("Säiliö: " + sailio);
//
//        for(int i = 0; i < 2; i++) {
//            System.out.println(lehma);
//            System.out.println("Elellään..");
//            for(int j = 0; j < 5; j++) {
//                lehma.eleleTunti();
//            }
//            System.out.println(lehma);
//
//            System.out.println("Lypsetään...");
//            lypsyrobotti.lypsa(lehma);
//            System.out.println("Säiliö: " + sailio);
//            System.out.println("");
//        }

//        Navetta navetta = new Navetta(new Maitosailio());
//        System.out.println("Navetta: " + navetta);
//
//        Lypsyrobotti robo = new Lypsyrobotti();
//        navetta.asennaLypsyrobotti(robo);
//
//        Lehma ammu = new Lehma();
//        ammu.eleleTunti();
//        ammu.eleleTunti();
//
//        navetta.hoida(ammu);
//        System.out.println("Navetta: " + navetta);
//
//        LinkedList<Lehma> lehmaLista = new LinkedList();
//        lehmaLista.add(ammu);
//        lehmaLista.add(new Lehma());
//
//        for(Lehma lehma: lehmaLista) {
//            lehma.eleleTunti();
//            lehma.eleleTunti();
//        }
//
//        navetta.hoida(lehmaLista);
//        System.out.println("Navetta: " + navetta);

//        Maatila maatila = new Maatila("Esko", new Navetta(new Maitosailio()));
//        System.out.println(maatila);
//
//        System.out.println(maatila.getOmistaja() + " on ahkera mies!");

//        Maatila maatila = new Maatila("Esko", new Navetta(new Maitosailio()));
//        Lypsyrobotti robo = new Lypsyrobotti();
//        maatila.asennaNavettaanLypsyrobotti(robo);
//        
//        maatila.lisaaLehma(new Lehma());
//        maatila.lisaaLehma(new Lehma());
//        maatila.lisaaLehma(new Lehma());
//        
//        System.out.println(maatila);
//        
//        maatila.eleleTunti();
//        maatila.eleleTunti();
//        
//        System.out.println(maatila);
//        
//        maatila.hoidaLehmat();
//
//        System.out.println(maatila);

        Maitosailio m = new Maitosailio(5782.4);
        m.lisaaSailioon(3232.13);
        m.lisaaSailioon(50000.99);

        System.out.println(m.getSaldo());

    }

}
