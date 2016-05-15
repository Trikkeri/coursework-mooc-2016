
public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // HUOM: oliomuuttujissa on määre final eli niiden arvoa ei voi muuttaa!
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }
    
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        
        if(getClass() != object.getClass()) {
            return false;
        }
        
        Rekisterinumero verrattava = (Rekisterinumero) object;
        
        if(verrattava.maa.equals(this.maa) &&
                verrattava.rekNro.equals(this.rekNro)) {
            return true;
        }
        
        return false;
    }
    
    public int hashCode() {
        int hassi = 212;
        hassi = 12 * hassi + this.maa.hashCode();
        hassi = 12 * hassi + this.rekNro.hashCode();
        
        return hassi;
    }

}
