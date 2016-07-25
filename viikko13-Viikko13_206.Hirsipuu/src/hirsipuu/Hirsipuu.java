package hirsipuu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
            vaihdaArvattavaSana();
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

    private void vaihdaArvattavaSana() {
        System.out.println("Vanha sana ennen vaihtoa: " + this.arvattava);
        System.out.println("Välitetty sana: " + this.sana());
        
        Sanalista uudetSanat = this.sanalista.sanatJoissaMerkit(this.sana());
        String uusiArvattavaSana = "";
        Random rnd = new Random();
        
//        System.out.println("UUDET SANAT: ");
//        for(String sana : uudetSanat.sanat()) {
//            System.out.println(sana);
//        }
        
        Collections.shuffle(uudetSanat.sanat());
        this.arvattava = uudetSanat.sanat().get(0);
        
        // Valitaan toisen saman pituinen ja samankaltainen sana varmistaen ettei valita jo muuttujassa olevaa sanaa jos sanalistassa on enemmän kuin yksi sana
        
        if(uudetSanat.sanat().size() > 1) {
            while(this.arvattava.equalsIgnoreCase(uusiArvattavaSana)) {
                this.arvattava = uudetSanat.sanat().get(rnd.nextInt(uudetSanat.sanat().size() - 1));
            }    
        }

        System.out.println("Uusi sana vaihdon jälkeen: " + this.arvattava);
    }
}
