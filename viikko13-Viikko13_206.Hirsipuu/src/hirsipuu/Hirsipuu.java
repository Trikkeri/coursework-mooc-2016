package hirsipuu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hirsipuu {

    private Sanalista sanalista;
    private List<Character> tehdytArvaukset;
    private int arvauksiaJaljella;
    private String arvattava;

    public Hirsipuu(Sanalista sanalista, int arvauksiaAlussa) {
        this.sanalista = sanalista;
        this.arvauksiaJaljella = arvauksiaAlussa;
        this.tehdytArvaukset = new ArrayList<>();
        
        Collections.shuffle(this.sanalista.sanat());
        this.arvattava = this.sanalista.sanat().get(0);
    }

    public List<Character> arvaukset() {
        return tehdytArvaukset;
    }

    public int arvauksiaJaljella() {
        return arvauksiaJaljella;
    }
    
    
    public boolean arvaa(Character kirjain) {
        this.tehdytArvaukset.add(kirjain);
        this.sanalista.
        
        return false;
    }

    
    public String sana() {
        return "-----";
    }

    public String oikeaSana() {
        return this.arvattava;
    }

    public boolean onLoppu() {
        if(this.arvauksiaJaljella == 0) {
            return true;
        }
        
        return false;
    }
}
