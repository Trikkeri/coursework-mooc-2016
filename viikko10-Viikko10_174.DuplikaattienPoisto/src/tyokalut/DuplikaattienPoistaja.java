package tyokalut;

import java.util.Set;

public interface DuplikaattienPoistaja {

    void lisaa(String merkkijono);

    int getHavaittujenDuplikaattienMaara();

    Set<String> getUniikitMerkkijonot();

    void tyhjenna();
}
