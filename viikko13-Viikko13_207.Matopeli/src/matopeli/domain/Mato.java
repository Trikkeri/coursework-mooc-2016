package matopeli.domain;

import java.util.ArrayList;
import java.util.List;
import matopeli.Suunta;

public class Mato {
    
    private List<Pala> palat;
    private int madonPituus;
    private Suunta suunta;
    private boolean kasvaako;
    
    public Mato(int alkuX, int alkuY, Suunta alkusuunta) {
        this.palat = new ArrayList<>();
        this.palat.add(new Pala(alkuX, alkuY));
        this.suunta = alkusuunta;
        this.kasvaako = false;
    }
    
    public Suunta getSuunta() {
        return this.suunta;
    }
    
    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    } 
    
    public int getPituus() {
        return this.palat.size();
    }
    
    public List<Pala> getPalat() {
        return this.palat;
    }
    
    public void liiku() {
        
        if(getPituus() < 3) {
            kasva();
        }
        
        switch (suunta) {
            case YLOS:
                siirraPalojenKoordinaatteja(this.palat.get(getPituus() - 1).getX(), this.palat.get(getPituus() - 1).getY() - 1);
                break;
            case OIKEA:
                siirraPalojenKoordinaatteja(this.palat.get(getPituus() - 1).getX() + 1, this.palat.get(getPituus() - 1).getY());
                break;
            case ALAS:
                siirraPalojenKoordinaatteja(this.palat.get(getPituus() - 1).getX(), this.palat.get(getPituus() - 1).getY() + 1);
                break;
            case VASEN:
                siirraPalojenKoordinaatteja(this.palat.get(getPituus() - 1).getX() - 1, this.palat.get(getPituus() - 1).getY());
                break;
        }
    }

    private void siirraPalojenKoordinaatteja(int x, int y) {
        this.palat.add(new Pala(x, y));
        
        if(!this.kasvaako) {
            this.palat.remove(0);
        }
        this.kasvaako = false;
    }
    
    public void kasva() {
        this.kasvaako = true;
    }
    
    public boolean osuu(Pala pala) {
        for(Pala madonPalat : this.palat) {
            if(madonPalat.getX() == pala.getX() && madonPalat.getY() == pala.getY()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean osuuItseensa() {
        
        Pala paaPala = this.palat.get(getPituus() - 1);
        
        for (int i = 0; i < this.palat.size(); i++) {
            if(i < this.palat.size() - 1) {
                if(this.palat.get(i).osuu(paaPala)) {
                    return true;
                }
            }
        }
        return false;
    }
}
