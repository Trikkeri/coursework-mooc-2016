public class Asevelvollinen implements Palvelusvelvollinen {
    private int tj;
    
    public Asevelvollinen(int tj) {
        this.tj = tj;
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
