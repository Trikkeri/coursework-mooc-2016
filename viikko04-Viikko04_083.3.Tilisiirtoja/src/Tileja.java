
public class Tileja {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili tiliA = new Tili("tili A", 100.0);
        Tili tiliB = new Tili("tili B", 0.0);
        Tili tiliC = new Tili("tili C", 0.0);
        tilisiirto(tiliA, tiliB, 50.0);
        tilisiirto(tiliB, tiliC, 25.0);
        System.out.println(tiliA);
        System.out.println(tiliB);
        System.out.println(tiliC);
    }
    
    public static void tilisiirto(Tili mista, Tili minne, double paljonko) {
        mista.otto(paljonko);
        minne.pano(paljonko);
    }


}
