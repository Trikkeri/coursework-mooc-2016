
public class Paaohjelma {

    
    public static void main(String[] args){
        Opiskelija eka = new Opiskelija("jamo");
        Opiskelija toka = new Opiskelija("jamo1");
        System.out.println(eka.compareTo(toka));
        
        Opiskelija kolmas = new Opiskelija("Pekka");
        Opiskelija neljas = new Opiskelija("Aku");
        System.out.println(kolmas.compareTo(neljas));
    }
}
