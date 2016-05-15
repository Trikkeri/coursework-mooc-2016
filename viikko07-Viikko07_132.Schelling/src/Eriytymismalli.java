
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Eriytymismalli {

    private int[][] taulukko;
    private int leveys;
    private int korkeus;
    private double prosTyhjia;
    private double tyytyvaisyysraja;
    private boolean tyytymattomiaLoytyy;

    public Eriytymismalli(int leveys, int korkeus, double prosTyhjia, double tyytyvaisyysraja) {
        this.leveys = leveys;
        this.korkeus = korkeus;

        this.taulukko = new int[korkeus][leveys];

        this.prosTyhjia = prosTyhjia;
        this.tyytyvaisyysraja = tyytyvaisyysraja;

        this.tyytymattomiaLoytyy = true;
    }

    public int[][] annaData() {
        return this.taulukko;
    }

    public void alusta(int joukkoja) {
        if (joukkoja < 2) {
            joukkoja = 2;
        }

        if (joukkoja > 4) {
            joukkoja = 4;
        }

        asetaKaikkiTyhjiksi();
        arvoAlkuarvot(joukkoja);
    }

    public void asetaKaikkiTyhjiksi() {
        // luo tänne metodi, joka asettaa jokaisen taulukon alkion
        // arvoksi luvun 0
        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko.length; j++) {
                taulukko[i][j] = 0;
            }
        }
    }

    public ArrayList<Piste> tyhjatPaikat() {
        ArrayList<Piste> tyhjat = new ArrayList<>();
        // luo täällä lista, missä on kaikki tyhjät paikat piste-olioina
        // tyhjissä paikoissa on arvo 0
        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko.length; j++) {
     
                if(taulukko[i][j] == 0) {
                    tyhjat.add(new Piste(j, i));
                }
            }
        }
        return tyhjat;
    }

    public void paivita() {
        ArrayList<Piste> tyytymattomat = haeTyytymattomat();

        if (tyytymattomat.isEmpty()) {
            this.tyytymattomiaLoytyy = false;
            return;
        }

        Collections.shuffle(tyytymattomat);

        while (!tyytymattomat.isEmpty()) {
            Piste tyytymaton = tyytymattomat.remove(0);

            ArrayList<Piste> tyhjat = tyhjatPaikat();
            Collections.shuffle(tyhjat);

            Piste tyhja = tyhjat.get(0);

            this.taulukko[tyhja.getY()][tyhja.getX()] = this.taulukko[tyytymaton.getY()][tyytymaton.getX()];
            this.taulukko[tyytymaton.getY()][tyytymaton.getX()] = 0;            
        }
    }

    public ArrayList<Piste> haeTyytymattomat() {
        ArrayList<Piste> tyytymattomat = new ArrayList<>();
        
        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko.length; j++) {
                double tyytyvaisuus = tarkistaNaapurit(i, j);
                if(tyytyvaisuus < this.tyytyvaisyysraja) {
                    tyytymattomat.add(new Piste(j, i));
                }
            }
        }     
        return tyytymattomat;
    }

    public double tarkistaNaapurit(int i, int j) {
        int verrattavaArvo = this.taulukko[i][j];
        int tyytyvaisyys = 0;
        int jakaja = 0;
        
        // Vasen yla
        if(i == 0 && j == 0 ) {
            tyytyvaisyys += tarkistaE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaSE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaS(i, j, verrattavaArvo, 1);
            
            jakaja += tarkistaE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaSE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaS(i, j, verrattavaArvo, 0);
            
            return (double) tyytyvaisyys / jakaja;
        }
        
        // Vasen sivu
        if(i > 0 && i < taulukko.length - 1 && j == 0) {
            tyytyvaisyys += tarkistaN(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaNE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaSE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaS(i, j, verrattavaArvo, 1);
            
            jakaja += tarkistaN(i, j, verrattavaArvo, 0);
            jakaja += tarkistaNE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaSE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaS(i, j, verrattavaArvo, 0);
            return (double) tyytyvaisyys / jakaja;
        }        

        // Vasen ala
        if(i == this.taulukko.length - 1 && j == 0) {
            tyytyvaisyys += tarkistaN(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaNE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaE(i, j, verrattavaArvo, 1);
            
            jakaja += tarkistaN(i, j, verrattavaArvo, 0);
            jakaja += tarkistaNE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaE(i, j, verrattavaArvo, 0);
            return (double) tyytyvaisyys / jakaja;
        } 

        // Yla keski
        if(i == 0 && j > 0 && j < taulukko.length - 1) {
            tyytyvaisyys += tarkistaW(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaSE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaS(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaSW(i, j, verrattavaArvo, 1);
            
            jakaja += tarkistaW(i, j, verrattavaArvo, 0);
            jakaja += tarkistaE(i, j, verrattavaArvo,0);
            jakaja += tarkistaSE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaS(i, j, verrattavaArvo, 0);
            jakaja += tarkistaSW(i, j, verrattavaArvo, 0);
            return (double) tyytyvaisyys / jakaja;
        }

        // Oikea yla
        if (i == 0 && j == taulukko.length - 1 ) {
            tyytyvaisyys += tarkistaW(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaS(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaSW(i, j, verrattavaArvo, 1);
            
            jakaja += tarkistaW(i, j, verrattavaArvo, 0);
            jakaja += tarkistaS(i, j, verrattavaArvo, 0);
            jakaja += tarkistaSW(i, j, verrattavaArvo, 0);
            return (double) tyytyvaisyys / jakaja;
        }

        // Oikea sivu
        if(i > 0 && i < taulukko.length - 1 && j == taulukko.length - 1 ) {
            tyytyvaisyys += tarkistaN(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaS(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaSW(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaW(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaNW(i, j, verrattavaArvo, 1);
            
            jakaja += tarkistaN(i, j, verrattavaArvo, 0);
            jakaja += tarkistaS(i, j, verrattavaArvo, 0);
            jakaja += tarkistaSW(i, j, verrattavaArvo, 0);
            jakaja += tarkistaW(i, j, verrattavaArvo, 0);
            jakaja += tarkistaNW(i, j, verrattavaArvo, 0);
            return (double) tyytyvaisyys / jakaja;
        }

        // Oikea ala
        if (i == taulukko.length - 1 && j == taulukko.length - 1) {
            tyytyvaisyys += tarkistaN(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaW(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaNW(i, j, verrattavaArvo, 1);
            
            jakaja += tarkistaN(i, j, verrattavaArvo, 0);
            jakaja += tarkistaW(i, j, verrattavaArvo, 0);
            jakaja += tarkistaNW(i, j, verrattavaArvo, 0);
            return (double) tyytyvaisyys / jakaja;
        }
        
        // Ala keski
        if (i == taulukko.length - 1 && j > 0 && j < taulukko.length - 1) {
            tyytyvaisyys += tarkistaN(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaNE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaE(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaW(i, j, verrattavaArvo, 1);
            tyytyvaisyys += tarkistaNW(i, j, verrattavaArvo, 1);
            
            jakaja += tarkistaN(i, j, verrattavaArvo, 0);
            jakaja += tarkistaNE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaE(i, j, verrattavaArvo, 0);
            jakaja += tarkistaW(i, j, verrattavaArvo, 0);
            jakaja += tarkistaNW(i, j, verrattavaArvo, 0);
            return (double) tyytyvaisyys / jakaja;
        }

        // Normi tilanne, tarkista joka suuntaan
        tyytyvaisyys += tarkistaNW(i, j, verrattavaArvo, 1);
        tyytyvaisyys += tarkistaN(i, j, verrattavaArvo, 1);
        tyytyvaisyys += tarkistaNE(i, j, verrattavaArvo, 1);
        tyytyvaisyys += tarkistaE(i, j, verrattavaArvo, 1);
        tyytyvaisyys += tarkistaSE(i, j, verrattavaArvo, 1);
        tyytyvaisyys += tarkistaS(i, j, verrattavaArvo, 1);
        tyytyvaisyys += tarkistaSW(i, j, verrattavaArvo, 1);
        tyytyvaisyys += tarkistaW(i, j, verrattavaArvo, 1);
        
        jakaja += tarkistaNW(i, j, verrattavaArvo, 0);
        jakaja += tarkistaN(i, j, verrattavaArvo, 0);
        jakaja += tarkistaNE(i, j, verrattavaArvo, 0);
        jakaja += tarkistaE(i, j, verrattavaArvo, 0);
        jakaja += tarkistaSE(i, j, verrattavaArvo, 0);
        jakaja += tarkistaS(i, j, verrattavaArvo, 0);
        jakaja += tarkistaSW(i, j, verrattavaArvo, 0);
        jakaja += tarkistaW(i, j, verrattavaArvo, 0);
        
        return (double) tyytyvaisyys / jakaja;
        
    }
        
    public int tarkistaNW(int i, int j, int verrattavaArvo, int moodi) {
        int indeksi1 = i - 1;
        int indeksi2 = j - 1;
        
        // Jos moodi on 1 niin tarkistetaan arvon sisältö
        if(moodi == 1) {
            if(this.taulukko[indeksi1][indeksi2] == verrattavaArvo
            && this.taulukko[indeksi1][indeksi2] != 0 ) {
                return 1;
            }
            return 0;
        }    
        
        // Jos moodi on 0 niin tarkistetaan onko arvo tyhja
        if(moodi == 0) {
            if(this.taulukko[indeksi1][indeksi2] == 0) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    
    public int tarkistaN(int i, int j, int verrattavaArvo, int moodi) {      
        int indeksi1 = i - 1;
        int indeksi2 = j;
        
        // Jos moodi on 1 niin tarkistetaan arvon sisältö
        if(moodi == 1) {
            if(this.taulukko[indeksi1][indeksi2] == verrattavaArvo
            && this.taulukko[indeksi1][indeksi2] != 0 ) {
                return 1;
            }
            return 0;
        }    
        
        // Jos moodi on 0 niin tarkistetaan onko arvo tyhja
        if(moodi == 0) {
            if(this.taulukko[indeksi1][indeksi2] == 0) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    
    public int tarkistaNE(int i, int j, int verrattavaArvo, int moodi) {
        int indeksi1 = i - 1;
        int indeksi2 = j + 1;
        
        // Jos moodi on 1 niin tarkistetaan arvon sisältö
        if(moodi == 1) {
            if(this.taulukko[indeksi1][indeksi2] == verrattavaArvo
            && this.taulukko[indeksi1][indeksi2] != 0 ) {
                return 1;
            }
            return 0;
        }        
        
        // Jos moodi on 0 niin tarkistetaan onko arvo tyhja
        if(moodi == 0) {
            if(this.taulukko[indeksi1][indeksi2] == 0) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    
    public int tarkistaE(int i, int j, int verrattavaArvo, int moodi) {
        int indeksi1 = i;
        int indeksi2 = j + 1;
        
        // Jos moodi on 1 niin tarkistetaan arvon sisältö
        if(moodi == 1) {
            if(this.taulukko[indeksi1][indeksi2] == verrattavaArvo
                && this.taulukko[indeksi1][indeksi2] != 0 ) {
                return 1;
            }
            return 0;
        }
        
        // Jos moodi on 0 niin tarkistetaan onko arvo tyhja
        if(moodi == 0) {
            if(this.taulukko[indeksi1][indeksi2] == 0) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    
    public int tarkistaSE(int i, int j, int verrattavaArvo, int moodi) {
        int indeksi1 = i + 1;
        int indeksi2 = j + 1;
        
        // Jos moodi on 1 niin tarkistetaan arvon sisältö
        if(moodi == 1) {
            if(this.taulukko[indeksi1][indeksi2] == verrattavaArvo
            && this.taulukko[indeksi1][indeksi2] != 0 ) {
                return 1;
            }
            return 0;
        }
        
        // Jos moodi on 0 niin tarkistetaan onko arvo tyhja
        if(moodi == 0) {
            if(this.taulukko[indeksi1][indeksi2] == 0) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    
    public int tarkistaS(int i, int j, int verrattavaArvo, int moodi) {
        int indeksi1 = i + 1;
        int indeksi2 = j;
        
        if(moodi == 1) {
            if(this.taulukko[indeksi1][indeksi2] == verrattavaArvo
            && this.taulukko[indeksi1][indeksi2] != 0 ) {
                return 1;
            }
            return 0;
        }
        
        // Jos moodi on 0 niin tarkistetaan onko arvo tyhja
        if(moodi == 0) {
            if(this.taulukko[indeksi1][indeksi2] == 0) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    
    public int tarkistaSW(int i,int j, int verrattavaArvo, int moodi) {
        int indeksi1 = i + 1;
        int indeksi2 = j - 1;
        
        if(moodi == 1) {
            if(this.taulukko[indeksi1][indeksi2] == verrattavaArvo
            && this.taulukko[indeksi1][indeksi2] != 0 ) {
                return 1;
            }
            return 0;
        }
        
        // Jos moodi on 0 niin tarkistetaan onko arvo tyhja
        if(moodi == 0) {
            if(this.taulukko[indeksi1][indeksi2] == 0) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    
    public int tarkistaW(int i,int j, int verrattavaArvo, int moodi) {
        int indeksi1 = i;
        int indeksi2 = j - 1;
        
        if(moodi == 1) {
            if(this.taulukko[indeksi1][indeksi2] == verrattavaArvo
            && this.taulukko[indeksi1][indeksi2] != 0 ) {
                return 1;
            }
            return 0;
        }
        
        // Jos moodi on 0 niin tarkistetaan onko arvo tyhja
        if(moodi == 0) {
            if(this.taulukko[indeksi1][indeksi2] == 0) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    
    public void arvoAlkuarvot(int joukkoja) {
        Random arpoja = new Random();

        ArrayList<Piste> tyhjat = tyhjatPaikat();
        Collections.shuffle(tyhjat);

        for (int i = 0; i < (1.0 - prosTyhjia) * tyhjat.size(); i++) {
            int x = tyhjat.get(i).getX();
            int y = tyhjat.get(i).getY();
            this.taulukko[y][x] = 1 + arpoja.nextInt(joukkoja);
        }
    }

    public boolean tyytymattomiaLoytyy() {
        return tyytymattomiaLoytyy;
    }

}
