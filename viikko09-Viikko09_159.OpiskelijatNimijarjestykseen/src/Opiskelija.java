public class Opiskelija implements Comparable<Opiskelija> {

    private String nimi;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return nimi;
    }
    
    public int compareTo(Opiskelija opiskelija) {
        System.out.println("luokassa: " + this.nimi.compareToIgnoreCase(opiskelija.getNimi()));
        if(this.nimi.compareToIgnoreCase(opiskelija.getNimi()) == 0) {
            return 0;
        } else if(this.nimi.compareToIgnoreCase(opiskelija.getNimi()) > 1) {
            return 1;
        } else {
            return -1;
        }
    } 

}
