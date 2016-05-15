
import java.util.ArrayList;

public class Kasi implements Comparable<Kasi> {
    private ArrayList<Kortti> kortit;
    
    public Kasi() {
        this.kortit = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti) {
        kortit.add(kortti);
    }
    
    public void tulosta() {
        for(Kortti kortti : kortit) {
            System.out.println(kortti);
        }
    }
    
    public void jarjesta() {
        Kortti verrattava = null;
        Kortti kortti = null;
        Kortti apu = null;

        for (int i = 0; i < this.kortit.size(); i++) {
            for (int j = 0; j < this.kortit.size(); j++) {
                verrattava = this.kortit.get(i);
                kortti = this.kortit.get(j); 
                if(verrattava.compareTo(kortti) == -1) {
                    apu = this.kortit.get(j); 
                    this.kortit.set(j, verrattava);
                    this.kortit.set(i, apu);
                }
            }
        }
    }
    
    @Override
    public int compareTo(Kasi kasi) {
        
        int summa = 0;
        for(Kortti kortti : this.kortit) {
            summa += kortti.getArvo();
        }
        
        int vertailtavaSumma = 0;
        for(Kortti toinenKasi : kasi.kortit) {
            vertailtavaSumma += toinenKasi.getArvo();
        }
        
        if(summa == vertailtavaSumma) {
            return 0;
        } else if(summa > vertailtavaSumma) {
            return 1;
        } else {
            return -1;
        } 
    }
    
    public void jarjestaMaittain() {
        this.kortit.sort(new SamatMaatVierekkainArvojarjestykseen());
    }
}
