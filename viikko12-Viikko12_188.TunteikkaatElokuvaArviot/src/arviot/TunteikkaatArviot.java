package arviot;

import java.util.ArrayList;
import java.util.List;

public class TunteikkaatArviot {

    private List<String> rivit;
    
    // Huom! Älä muuta konstruktorin parametrien määrää -- konstruktoria
    // saa toki muuten muuttaa
    public TunteikkaatArviot(List<String> rivit) {
        this.rivit = rivit;
    }

    public int sanojenLukumaara(String sana) {
        
        int montakoKertaaEsiintyy = 0;
        
        List<String> palastellutSanat = new ArrayList<>();
        
        for (String rivi : this.rivit) {
            String[] sanat = rivi.split(" ");
            
            for (int i = 0; i < sanat.length; i++) {
                palastellutSanat.add(sanat[i]);
            }
        }
        
        for (int i = 0; i < palastellutSanat.size(); i++) {
            if(palastellutSanat.get(i).equalsIgnoreCase(sana)) {
                montakoKertaaEsiintyy++;
            }
        }
        
        return montakoKertaaEsiintyy;
    }

    public double sananTunne(String sana) {
        
        List<Integer> tuntemukset = new ArrayList<>();
        int montakoKertaa = 0;
        
        for (String rivi : this.rivit) {
            String[] sanat = rivi.split(" ");
            
            for (int i = 0; i < sanat.length; i++) {
                if(sanat[i].equalsIgnoreCase(sana)) {
                    tuntemukset.add(Integer.parseInt(sanat[0]));
                    montakoKertaa++;
                }
            }
        }
        
        if(tuntemukset.isEmpty()) {
            return 2;
        }
        
        return laskeKeskiarvo(tuntemukset, montakoKertaa);
    }

    public String sananTunneMerkkijonona(String sana) {
        double tunneLukuna = this.sananTunne(sana);
        
        if(tunneLukuna <= 1.9) {
            return "negatiivinen";
        } else if(tunneLukuna <= 2.1) {
            return "neutraali"; 
        } else {
            return "positiivinen";
        }
    }

    public double lauseenTunne(String lause) {
        return 0.0;
    }

    public String lauseenTunneMerkkijonona(String lause) {
        return "";
    }

    private double laskeKeskiarvo(List<Integer> tuntemukset, int jakaja) {
        double summa = 0;
        for (int i = 0; i < tuntemukset.size(); i++) {
            summa += tuntemukset.get(i);
        }
        return summa / jakaja;
    }

}
