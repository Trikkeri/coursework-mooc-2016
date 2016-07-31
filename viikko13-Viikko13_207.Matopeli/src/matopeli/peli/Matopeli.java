package matopeli.peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import matopeli.Suunta;
import matopeli.domain.Mato;
import matopeli.domain.Omena;
import matopeli.gui.Paivitettava;

public class Matopeli extends Timer implements ActionListener {

    private int leveys;
    private int korkeus;
    private boolean jatkuu;
    private Paivitettava paivitettava;
    private Mato mato;
    private Omena omena;
    
    public Matopeli(int leveys, int korkeus) {
        super(1000, null);

        this.leveys = leveys;
        this.korkeus = korkeus;
        this.jatkuu = true;
        
        this.mato = new Mato(leveys / 2, korkeus / 2, Suunta.ALAS);
        this.omena = luoOmena();
        
        addActionListener(this);
        setInitialDelay(2000);
    }

    private Omena luoOmena() {
        Random rng = new Random();
        
        // Luodaan uusi omena ja tarkistetaan ettei se ole madon päällä, jos on niin tehdään uusi omena kunnes muodostuu sellainen joka ei ole madon päällä
        Omena uusiOmena = new Omena(rng.nextInt(this.leveys), rng.nextInt(this.korkeus));
        
        while(this.mato.osuu(uusiOmena)) {
            uusiOmena = new Omena(rng.nextInt(this.leveys), rng.nextInt(this.korkeus));
        }
        
        return uusiOmena;
    }


    public boolean jatkuu() {
        return jatkuu;
    }

    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public int getLeveys() {
        return leveys;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!jatkuu) {
            return;
        }
        
        this.mato.liiku();
        
        if(this.mato.osuu(omena)) {
            this.mato.kasva();
            this.omena = luoOmena();
        }
        
        if(this.mato.osuuItseensa()) {
            this.jatkuu = false;
        }
        
        if(this.mato.getPalat().get(this.mato.getPituus() - 1).getX() == this.leveys || 
                this.mato.getPalat().get(this.mato.getPituus() - 1).getY() == this.korkeus ||
                this.mato.getPalat().get(this.mato.getPituus() - 1).getX() < 0 ||
                this.mato.getPalat().get(this.mato.getPituus() - 1).getY() < 0) {
            this.jatkuu = false;
        }
        
        paivitettava.paivita();
        setDelay(1000 / mato.getPituus());
    }
    
    public Mato getMato() {
        return this.mato;
    }
    
    public void setMato(Mato mato) {
        this.mato = mato;
    }
    
    public Omena getOmena() {
        return this.omena;
    }
    
    public void setOmena(Omena omena) {
        this.omena = omena;
    }
}
