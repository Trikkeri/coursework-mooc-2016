package suosittelija.domain;

import java.util.Objects;

public class Elokuva {
    
    private String nimi;
    
    public Elokuva(String nimi) {
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nimi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elokuva other = (Elokuva) obj;
        if (!Objects.equals(this.nimi, other.nimi)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.nimi;
    }
    
}
