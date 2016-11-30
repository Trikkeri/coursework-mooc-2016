
public class Main {

    public static void main(String[] args) {
        Sanatutkimus tutkimus = new Sanatutkimus("sanalista.txt");
        System.out.println("-1-");
        System.out.println(tutkimus.sanojenMaara());
        System.out.println(tutkimus.onkoSanaa("porkkana"));
        System.out.println(tutkimus.onkoSanaa("porkana"));
        System.out.println("-2-");
        System.out.println(tutkimus.laskeSanat(8));
        System.out.println(tutkimus.laskeSanat(15));
        System.out.println("-3-");
        tutkimus.pituustilasto();
        System.out.println("-4-");
        System.out.println(tutkimus.laskeKirjaimet('a'));
        System.out.println(tutkimus.laskeKirjaimet('h'));
        System.out.println("-5-");
        tutkimus.kirjaintilasto();
        System.out.println("-6-");
        System.out.println(tutkimus.haePituudella(28));
        System.out.println("-7-");
        System.out.println(tutkimus.haeOsalla("koodi"));
        System.out.println("-8-");
        System.out.println(tutkimus.haePalindromit());
        System.out.println("-9-");
        System.out.println(tutkimus.haeRistikkoon("s???is??s"));
    }
}
