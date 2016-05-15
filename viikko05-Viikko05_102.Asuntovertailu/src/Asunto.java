
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        if(this.nelioita > verrattava.nelioita) {
            return true;
        }
        return false;
    }
    
    public int hintaero(Asunto verrattava) {
        int asunto1Hinta = this.neliohinta * this.nelioita;
        int verrattavaHinta = verrattava.neliohinta * verrattava.nelioita;
        
        if (asunto1Hinta > verrattavaHinta) {
            return asunto1Hinta - verrattavaHinta;
        } else {
            return verrattavaHinta - asunto1Hinta;
        }
    }

    public boolean kalliimpi(Asunto verrattava) {
        if(this.neliohinta * this.nelioita > verrattava.neliohinta * verrattava.nelioita) {
            return true;
        }
        return false;
    }
    
}
