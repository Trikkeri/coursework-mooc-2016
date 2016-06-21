public class YlhaaltaRajoitettuLaskuri {
    private int arvo;
    private int ylaraja;
    
    public YlhaaltaRajoitettuLaskuri(int ylarajanAlkuarvo) {
        this.ylaraja = ylarajanAlkuarvo;
    }
    
    public void seuraava() {
        if(arvo >= this.ylaraja) {
            arvo = 0;
            return;
        }
        
        arvo++;
    }
    
    public String toString() {
        
        if(arvo <= 9) {
            return "0" + arvo;
        } else {
            return "" + arvo;
        }
    }
    
    public int arvo() {
        return this.arvo;
    }
    
    public void asetaArvo(int arvo) {
        
        if(arvo < 0 || arvo > this.ylaraja) {
            return;
        }
        
        this.arvo = arvo;
    }
}
