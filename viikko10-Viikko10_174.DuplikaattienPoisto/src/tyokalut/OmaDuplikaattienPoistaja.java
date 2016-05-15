package tyokalut;

import java.util.HashSet;
import java.util.Set;

public class OmaDuplikaattienPoistaja implements DuplikaattienPoistaja {

    private Set<String> sanat;
    private int dublikaattienMaara;
    
    public OmaDuplikaattienPoistaja() {
        this.sanat = new HashSet();   
        this.dublikaattienMaara = 0;
    }
    
    @Override
    public void lisaa(String merkkijono) {
        if(!this.sanat.add(merkkijono)) {
            this.dublikaattienMaara++; 
        }
    }

    @Override
    public int getHavaittujenDuplikaattienMaara() {
        return this.dublikaattienMaara;
    }

    @Override
    public Set<String> getUniikitMerkkijonot() {
        return this.sanat;
    }

    @Override
    public void tyhjenna() {
        this.sanat.clear();
        this.dublikaattienMaara = 0;
    }
    
}
