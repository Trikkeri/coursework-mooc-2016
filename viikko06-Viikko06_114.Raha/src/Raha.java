
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }
    
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);
 
        return uusi;
    }
    
    public boolean vahemman(Raha verrattava) {
        if(this.euroa <= verrattava.euroa) {
            
            if(this.euroa == verrattava.euroa
                    && this.senttia <= verrattava.senttia) {
                return true;
            }
            
            if(this.euroa < verrattava.euroa
                    && this.senttia >= verrattava.senttia) {
                return true;
            }
        }
        return false;
        
    }
    
    public Raha miinus(Raha vahentaja) {
        
        int euroaTemp = this.euroa - vahentaja.euroa;
        int senttiaTemp = this.senttia - vahentaja.senttia;
        
        if(senttiaTemp < 0) {
            euroaTemp--;
            senttiaTemp = 100 - vahentaja.senttia;
        }
        
        if(euroaTemp < 0) {
            Raha uusi = new Raha(0, 0);
            return uusi;
        } else {
            Raha uusi = new Raha(euroaTemp, senttiaTemp);
            return uusi;
        }
    }
    

}
