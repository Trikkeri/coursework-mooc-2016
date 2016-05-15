
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Ostoslista {
    private HashMap<String, Integer> lista;
    
    public Ostoslista() {
        this.lista = new HashMap<>();
    }
    
    public void lisaa(String tuote) {
        
        if(this.lista.containsKey(tuote)) {
           int montakoKappaletta = this.lista.get(tuote);
           montakoKappaletta++;
           this.lista.replace(tuote, montakoKappaletta);
        } else {
            this.lista.put(tuote, 1);
        }
    }
    
    public int kappalemaara(String tuote) {
        if(this.lista.containsKey(tuote)) {
            return this.lista.get(tuote);
        }
        
        return 0;
    }
    
    public void poista(String tuote) {
        if(this.lista.containsKey(tuote)) {
           int montakoKappaletta = this.lista.get(tuote);
           montakoKappaletta--;
           this.lista.replace(tuote, montakoKappaletta);
        } else {
            this.lista.put(tuote, 0);
        }
    }
}
