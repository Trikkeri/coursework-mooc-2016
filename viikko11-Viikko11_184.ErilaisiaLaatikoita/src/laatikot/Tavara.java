package laatikot;

public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {

        this.nimi = nimi;
        this.paino = paino;
        
        if(this.paino < 0) {
            throw new IllegalArgumentException("Tavaran paino ei voi olla negatiivinen");
        }
    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    @Override
    public boolean equals(Object o) {
        
        if(o == null || !(o instanceof Tavara)) {
            return false;
        }
        
        Tavara vertailtava = (Tavara) o;
        
        if(this.nimi.equals(vertailtava.nimi) ) {
            return true;
        } else {
            return false;
        }        
    }

    @Override
    public int hashCode() {
        return this.nimi.hashCode();
    }
}
