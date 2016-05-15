
import robotti.Ohjain;

public class Viivakimara {

    public static void main(String[] args) {
        Ohjain.kaynnista();
        Ohjain.asetaOdotusaika(10);
        // testaa metodejasi täällä
        viivakimara(5);
        Ohjain.sammuta();
    }

    // toteuta metodisi tänne
    public static void liikuMonta(int montakoAskelta) {
        
        int liikuttu = 0;
        while(liikuttu < montakoAskelta) {
            Ohjain.liiku();
            liikuttu++;
        }
    }
    
    public static void piirraNelio(int sivunPituus) {
        
        int kaannos = 0;
        while(kaannos < 4) {
            liikuMonta(sivunPituus);
            Ohjain.oikea();
            kaannos++;
        }
    }
    
    public static void piirraNelioAlhaalta(int sivunPituus) {
        
        // kuljetaan lahtopisteeseen
        liikuMonta(10);
        Ohjain.oikea();
        liikuMonta(10);
        Ohjain.oikea();
        
        int kaannos = 0;
        while(kaannos < 4) {
            liikuMonta(sivunPituus);
            Ohjain.oikea();
            kaannos++;
        }
    }
    
    public static void sisakkaisetNeliot(int montako) {
        
//        int piirretytNeliot = 1;
//        while(piirretytNeliot <= montako) {
//            piirraNelio(piirretytNeliot);
//            piirretytNeliot++;
//        }
        rajatutSisakkaisetNeliot(montako, 1);
    }
    
    public static void rajatutSisakkaisetNeliot(int suurin, int pienin) {
        
        while(suurin >= pienin) {
            piirraNelio(pienin);
            pienin++;
        }    
    }
    
    public static void viivakimara(int koko) {
        rajatutSisakkaisetNeliot(koko * 2,koko);
        kaanteisetRajatutSisikkaisetNeliot(koko * 2,koko);
    }
    
    public static void kaanteisetRajatutSisikkaisetNeliot(int suurin, int pienin){
        piirraNelioAlhaalta(5);
        
        while(suurin >= pienin) {
            piirraNelio(pienin);
            pienin++;
        }  
    }
    
}
