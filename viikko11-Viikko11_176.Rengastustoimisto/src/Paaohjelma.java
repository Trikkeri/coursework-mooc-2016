public class Paaohjelma {
    
    public static void main(String args[]) {
//        Lintu lintu1 = new Lintu("punakottarainen", "Sturnus roseus", 2012);
//        Lintu lintu2 = new Lintu("rusokottarainen", "Sturnus roseus", 2012);
//        Lintu lintu3 = new Lintu("varis", "Corvus corone cornix", 2012);
//        Lintu lintu4 = new Lintu("punakottarainen", "Sturnus roseus", 2000);
//
//        System.out.println(lintu1.equals(lintu2));   // ovat sama koska sama latinankielinen nimi ja rengastusvuosi
//        System.out.println(lintu1.equals(lintu3));   // eivät ole sama koska latinankielinen nimi eri
//        System.out.println(lintu1.equals(lintu4));   // eivät ole sama koska eri rengastusvuosi
//        System.out.println(lintu1.hashCode() == lintu2.hashCode());


        Rengastustoimisto kumpulanRengas = new Rengastustoimisto();

        kumpulanRengas.havaitse(new Lintu("punakottarainen", "Sturnus roseus", 2012), "Arabia");
        kumpulanRengas.havaitse(new Lintu("rusokottarainen", "Sturnus roseus", 2012), "Vallila");
        kumpulanRengas.havaitse(new Lintu("harmaalokki", "Larus argentatus", 2008), "Kumpulanmäki");
        kumpulanRengas.havaitse(new Lintu("punakottarainen", "Sturnus roseus", 2008), "Mannerheimintie");

        kumpulanRengas.havainnot(new Lintu("rusokottarainen", "Sturnus roseus", 2012));
        System.out.println("--");
        kumpulanRengas.havainnot(new Lintu("harmaalokki", "Larus argentatus", 2008));
        System.out.println("--");
        kumpulanRengas.havainnot(new Lintu("harmaalokki", "Larus argentatus", 1980));
    }
}
