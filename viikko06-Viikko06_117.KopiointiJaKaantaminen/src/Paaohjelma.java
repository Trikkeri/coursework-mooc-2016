
import java.util.Arrays;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee testauskoodia tänne
        int[] alkuperainen = {1, 2, 3, 4};
        int[] kaannetty = kaanna(alkuperainen);

        // tulostetaan molemmat
        System.out.println("alkup: " +Arrays.toString(alkuperainen));
        System.out.println("käännetty: " +Arrays.toString(kaannetty));
    }
    
    public static int[] kopioi(int[] taulukko) {
        
        int[] kopioitu = new int[taulukko.length]; 
        
        int i = 0;
        while(i < taulukko.length) {
            kopioitu[i] = taulukko[i];
            i++;
        }
        
        return kopioitu;   
    }
    
    public static int[] kaanna(int[] taulukko) {
        int[] kaannetty = new int[taulukko.length]; 

        int i = 0;
        int j = taulukko.length - 1;
        
        while(i < taulukko.length) {
            kaannetty[i] = taulukko[j];
            i++;
            j--;
        }
        
        return kaannetty;   
    }

}
