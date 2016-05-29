package maatilasimulaattori;

public class Lypsyrobotti implements Lypsava {

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

    @Override
    public double lypsa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
