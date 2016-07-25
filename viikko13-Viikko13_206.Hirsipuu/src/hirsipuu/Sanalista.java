package hirsipuu;

import java.util.ArrayList;
import java.util.List;

public class Sanalista {

    private List<String> sanat;

    public Sanalista(List<String> sanat) {
        this.sanat = sanat;
    }

    public List<String> sanat() {
        return this.sanat;
    }

    public Sanalista sanatJoidenPituusOn(int pituus) {
        List<String> sopivatSanat = new ArrayList<>();
        
        for (String sana : this.sanat) {
            if(sana.length() == pituus) {
                sopivatSanat.add(sana);
            }
        }
        
        return new Sanalista(sopivatSanat);
    }

    public Sanalista sanatJoissaEiEsiinnyKirjainta(char kirjain) {
        List<String> sopivatSanat = new ArrayList<>();
        
        for (String sana : this.sanat) {
            boolean esiintyykoKirjan = false;
            
            // Käydään läpi sana kirjain kirjaimelta, jos sanasta löytyy parametrin kirjain niin kirjataan siitä tieto booleaniin
            for (int i = 0; i < sana.length(); i++) {
                if(sana.charAt(i) == kirjain) {
                    esiintyykoKirjan = true;
                }
            }
            
            // Jos kirjainta ei löytynyt sanasta niin lisätään listaan
            if(!esiintyykoKirjan) {
                sopivatSanat.add(sana);
            }
        }
        
        return new Sanalista(sopivatSanat);
    }

    public Sanalista sanatJoissaMerkit(String merkkijono) {
        List<String> sopivatSanat = new ArrayList<>();
        
        char[] merkit = merkkijono.toCharArray();
        
        for (String sana : this.sanat) {
            List<Boolean> sopivaMerkki = new ArrayList<>();
            
            // Jos sanat on saman pituiset
            if(sana.length() == merkkijono.length()) {
                // Tarkistetaan merkki merkiltä sana samassa kohdassa olevia merkkejä          
                for (int i = 0; i < merkit.length; i++) {
                    // Ei edetä jos ollaan tarkistamassa viiva merkkiä
                    if(merkit[i] != '-') {
                        // Vertaillaan merkkejä ja tallennetaan tulos taulukkoon
                        if(sana.charAt(i) == merkit[i]) {
                            sopivaMerkki.add(true);
                        } else {
                            sopivaMerkki.add(false);
                        }
                    }
                }
            }
            // Jos tulostaulukossa on yksikin false, ei käsitelty sana siis ole sopiva kandidaatti korvaavaksi sanaksi
            if(!sopivaMerkki.contains(false)) {
                sopivatSanat.add(sana);
            }
        }
        return new Sanalista(sopivatSanat);
    }

    public int koko() {
        return this.sanat.size();
    }
}
