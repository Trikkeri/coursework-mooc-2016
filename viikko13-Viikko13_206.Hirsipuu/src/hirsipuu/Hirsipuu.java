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
        
        if(this.arvattava.contains(String.valueOf(kirjain))) {
            return true;
        } else {
            this.arvauksiaJaljella -= 1;
            return false;
        }
    }

    
    public String sana() {
        
        char[] arvattavaSana = this.arvattava.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char merkki : arvattavaSana) {
            if(this.tehdytArvaukset.contains(merkki)) {
                sb.append(merkki);
            } else {
                sb.append("-");
            }
        }
        
        return sb.toString();
    }

    public String oikeaSana() {
        return this.arvattava;
    }

    public boolean onLoppu() {
        if(this.arvauksiaJaljella == 0 || this.sana().equals(arvattava)) {
            return true;
        }
        return false;
    }
}
