package sanakirja;

import java.util.Set;

public interface UseanKaannoksenSanakirja {

    void lisaa(String sana, String kaannos);

    Set<String> kaanna(String sana);

    void poista(String sana);
}
