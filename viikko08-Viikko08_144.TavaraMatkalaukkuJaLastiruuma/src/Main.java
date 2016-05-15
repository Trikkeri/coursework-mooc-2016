
public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        
//        Tavara kirja = new Tavara("Aapiskukko", 2);
//        Tavara puhelin = new Tavara("Nokia 3210", 1);
//        Tavara tiiliskivi = new Tavara("tiiliskivi", 4);
//
//        Matkalaukku adanLaukku = new Matkalaukku(10);
//        adanLaukku.lisaaTavara(kirja);
//        adanLaukku.lisaaTavara(puhelin);
//
//        Matkalaukku pekanLaukku = new Matkalaukku(10);
//        pekanLaukku.lisaaTavara(tiiliskivi);
//
//        Lastiruuma lastiruuma = new Lastiruuma(5);
//        lastiruuma.lisaaMatkalaukku(adanLaukku);
//        lastiruuma.lisaaMatkalaukku(pekanLaukku);

//        System.out.println(lastiruuma);
        
        Lastiruuma lastiruuma = new Lastiruuma(1000);
        lisaaMatkalaukutTiiliskivilla(lastiruuma);
        System.out.println(lastiruuma);
    }

    public static void lisaaMatkalaukutTiiliskivilla(Lastiruuma lastiruuma) {
        // 100 matkalaukun lisääminen, jokaiseen tulee tiiliskivi  
        
        for (int i = 1; i < 101; i++) {
            Tavara tiiliskivi = new Tavara("tiiliskivi", i);
            Matkalaukku tiilisLaukku = new Matkalaukku(i);
            tiilisLaukku.lisaaTavara(tiiliskivi);
            lastiruuma.lisaaMatkalaukku(tiilisLaukku);
        }
    }

}
