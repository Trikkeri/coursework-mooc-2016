package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {

        if(nimi == null 
                || nimi.isEmpty() 
                || nimi.length() > 40 
                || ika > 120 || ika < 0) {
            throw new IllegalArgumentException("Nimi on null, tyhjä tai yli 40 merkkiä pitkä, ikä tulee olla 0-120 väliltä!");
        }
        
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
