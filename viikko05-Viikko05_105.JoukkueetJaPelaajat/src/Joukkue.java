
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Joukkue {
    private String nimi;
    private ArrayList<Pelaaja> pelaajat;
    private int maksimikoko;
    
    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.pelaajat = new ArrayList<>();
        this.maksimikoko = 16;
    }
    
    public String haeNimi() {
        return this.nimi;
    }
    
    public void lisaaPelaaja (Pelaaja pelaaja) {
        if(pelaajat.size() < this.maksimikoko) {
            pelaajat.add(pelaaja);
        }
    }
    
    public void tulostaPelaajat() {
        for(Pelaaja pelaaja : pelaajat) {
            System.out.println(pelaaja);
        }
    }
    
    public void asetaMaksimikoko(int maksimikoko) {
        this.maksimikoko = maksimikoko;
    }
    
    public int koko() {
        return pelaajat.size();
    }
    
    public int maalit() {
        
        int maalitYhteensa = 0;
        for(Pelaaja pelaaja : pelaajat) {
            maalitYhteensa += pelaaja.maalit();
        }
        return maalitYhteensa;
    }
    
}
