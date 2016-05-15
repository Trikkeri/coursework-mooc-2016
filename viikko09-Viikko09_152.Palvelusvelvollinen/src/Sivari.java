public class Sivari implements Palvelusvelvollinen {
    private int tj;
    
    public Sivari() {
        this.tj = 362;
    }
    
    public int getTJ() {
        return this.tj;
    }
    
    public void palvele() {
        if(this.tj > 0) {
            this.tj--;
        }
    }
    
}
