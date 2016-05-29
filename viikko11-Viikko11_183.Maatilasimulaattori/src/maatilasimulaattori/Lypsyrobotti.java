package maatilasimulaattori;

public class Lypsyrobotti {

    private Maitosailio maitosailio;
    
    public Lypsyrobotti() {  
    }
    
    public Maitosailio getMaitosailio() {
        if(this.maitosailio == null) return null;
        
        return this.maitosailio;
    }
    
    public void setMaitosailio(Maitosailio maitosailio) {
        this.maitosailio = new Maitosailio();
        this.maitosailio = maitosailio;
    }
    
    public void lypsa(Lypsava lypsava) {
        if(this.maitosailio == null) {
            throw new IllegalStateException("Robottia ei ole kiinnitetty maitosäiliöön");
        }
        
        this.maitosailio.lisaaSailioon(lypsava.lypsa());        
    }   
}
