package maatilasimulaattori;

import java.util.Collection;

public class Navetta {
    
    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;
    
    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }
    
    public Maitosailio getMaitosailio() {
        return this.maitosailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(this.maitosailio);
    }
    
    public void hoida(Lehma lehma) {
        if(lypsyrobotti == null) {
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu");
        }
        this.lypsyrobotti.lypsa(lehma);
    }
    
    public void hoida(Collection<Lehma> lehmat) {
        if(lypsyrobotti == null) {
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu");
        }
        for(Lehma lehma : lehmat) {
            this.lypsyrobotti.lypsa(lehma);
        }
    }
    
    @Override
    public String toString() {
        return this.maitosailio.toString();
    }
    
}
