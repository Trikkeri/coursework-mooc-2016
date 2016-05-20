
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Rengastustoimisto {
    private Map<Lintu, List<String>> havainnot;
    
    public Rengastustoimisto() {
        this.havainnot = new HashMap<>();
    }
    
    public void havaitse(Lintu lintu, String paikka) {
        
        if(!this.havainnot.containsKey(lintu)) {
            this.havainnot.put(lintu, new ArrayList<>());
        }
        this.havainnot.get(lintu).add(paikka);
    }
    
    public void havainnot(Lintu lintu) {
        
        if(this.havainnot.containsKey(lintu)) {
            for(Lintu l : this.havainnot.keySet()) {
                if(l.equals(lintu)) {
                    System.out.println(l + " havaintoja: " + this.havainnot.get(l).size());
                    for (int i = 0; i < this.havainnot.get(l).size(); i++) {
                        System.out.println(this.havainnot.get(l).get(i));
                    }
                }
            }
        } else {
            System.out.println(lintu + " havaintoja: 0");
        }
    }   
}
