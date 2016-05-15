
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi 
                && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi 
                && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }
    
    public int erotusVuosissa(Paivays verrattava) {
        
        int vuosienErotus = 0;
        
        if(verrattava.aiemmin(this)) {
            vuosienErotus = this.vuosi - verrattava.vuosi;
            
            if(this.kuukausi < verrattava.kuukausi) {
                if(this.paiva == verrattava.paiva) {
                    return vuosienErotus;
                }
                return vuosienErotus - 1;
            }
            
            if(this.kuukausi == verrattava.kuukausi
                    && this.paiva > verrattava.paiva) {
                return vuosienErotus;
            }
            
            if(this.kuukausi == verrattava.kuukausi
                    && this.paiva < verrattava.paiva) {
                return vuosienErotus - 1;
            }
            
            return vuosienErotus;
        } else {
            vuosienErotus = verrattava.vuosi - this.vuosi;
                   
            if(verrattava.kuukausi < this.kuukausi) {
                if(verrattava.paiva == this.paiva) {
                    return vuosienErotus;
                }
                return vuosienErotus - 1;
            }
            
            if(verrattava.kuukausi == this.kuukausi
                    && verrattava.paiva > this.paiva) {
                return vuosienErotus;
            }
            
            if(verrattava.kuukausi == this.kuukausi
                    && verrattava.paiva < this.paiva) {
                return vuosienErotus - 1;
            }

            return vuosienErotus;
        }
    }
}
