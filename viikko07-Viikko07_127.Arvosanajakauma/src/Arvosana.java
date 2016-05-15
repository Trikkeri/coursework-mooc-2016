import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arvosana {
    private String[] arvosanaJakauma;
    private ArrayList<Integer> pisteet;
    private int hyvaksytytArvosanat;
    private int osallistujat;
    
    public Arvosana() {
        this.pisteet = new ArrayList<>();
        this.hyvaksytytArvosanat = 0;
        this.arvosanaJakauma = new String[6];
        Arrays.fill(this.arvosanaJakauma, "");
        this.osallistujat = 0;
    }
    
    public boolean kysyPisteet(Scanner lukija) {
        System.out.println("Syötä koepisteet, -1 lopettaa");
        
        while(true) {
            String syote = lukija.nextLine();
            
            if(syote.contains("-1")) {
                break;
            } else {
                pisteet.add(Integer.parseInt(syote));
            }
        }
        
        return this.pisteet.isEmpty();
    }
    
    public void kasittelePisteet() {
        for(int piste : this.pisteet) {
            if(piste >= 50 && piste < 61) {
                kasvataJakaumaa(5);
            } else if(piste >= 45 && piste <= 49 ) {
                kasvataJakaumaa(4);
            } else if(piste >= 40 && piste <= 44) {
                kasvataJakaumaa(3);
            } else if(piste >= 35 && piste <= 39) {
                kasvataJakaumaa(2);
            } else if(piste >= 30 && piste <= 34) {
                kasvataJakaumaa(1);
            } else if(piste >= 0 && piste <= 29) {
                kasvataJakaumaa(0);
            }
            
            if(piste >= 30 && piste <= 60) {
                kasvataHyvaksyttyja(); 
            }
            
            if(piste >= 0 && piste <= 60) {
                kasvataOsallistujia();
            }
        }
    }
    
    private void kasvataJakaumaa(int i) {
        this.arvosanaJakauma[i] += "*";
    }
    
    private void kasvataHyvaksyttyja() {
        this.hyvaksytytArvosanat += 1;
    }
    
    private void kasvataOsallistujia() {
        this.osallistujat += 1;
    }
    
    public void tulostaJakauma() {
        System.out.println("Arvosanajakauma: ");
        int laskuri = 5;
        for (int i = 5; i > -1; i--) {
            System.out.println(laskuri + ": " + this.arvosanaJakauma[laskuri]);
            laskuri -= 1;
        }
        System.out.println("Hyväksymisprosentti: " + (double) 100 * this.hyvaksytytArvosanat / this.osallistujat);
    }
    
}
