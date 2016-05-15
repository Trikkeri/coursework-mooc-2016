/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Sanatulostin {
    private String sana;
    
    public Sanatulostin(String sana) {
        this.sana = sana;
    }
       
    public void sanaporras(int luku) {
        
        int rivinumero = 0;
        int tuloste = 0;
        while(rivinumero < luku) {
            
            if(tuloste == sana.length()) {
                tuloste = 0;
            }
            
            System.out.print(sana.charAt(tuloste));
            tuloste++;
            int sarake = 0;
            while(sarake < rivinumero) {
                
                if(tuloste == sana.length()) {
                    tuloste = 0;
                }   
                
                System.out.print(sana.charAt(tuloste));
                sarake++;
                tuloste++;
            }
            
            System.out.println(" ");
            rivinumero++;
        }
    }
    
    
   public void laskevaSanaporras(int luku) {
        
        int rivinumero = 0;
        int tuloste = 0;
        while(rivinumero < luku) {
            
            if(tuloste == sana.length()) {
                tuloste = 0;
            }
            
            System.out.print(sana.charAt(tuloste));
            tuloste++;
            int sarake = luku - 1;
            while(sarake > rivinumero) {
                
                if(tuloste == sana.length()) {
                    tuloste = 0;
                }   
                
                System.out.print(sana.charAt(tuloste));
                sarake--;
                tuloste++;
            }
            
            System.out.println(" ");
            rivinumero++;
        }
   }
   
   public void sanapyramidi2(int luku) {
        
        int rivinumero = 0;
        int tuloste = 0;
        int plusLuku = luku;
        
        if(plusLuku > 1) {
            plusLuku +=2;
        }
        
        while(rivinumero < plusLuku) {
            
            if(tuloste == sana.length()) {
                tuloste = 0;
            }
            
            System.out.print(sana.charAt(tuloste));
            tuloste++;
            int sarake = 1;
            while(sarake < luku) {
                
                if(tuloste == sana.length()) {
                    tuloste = 0;
                }   
                
                if(rivinumero == 0) {
                    System.out.println(" ");
                } else {
                    System.out.print(sana.charAt(tuloste));
                    tuloste++;
                }    
                    
                sarake++;        
            }
            
            System.out.println(" ");
            rivinumero++;
        }
        
   }
    
   public void sanapyramidi(int luku) {
        
        int rivinumero = 0;
        int tuloste = 0;
        while(rivinumero < luku) {
            
            if(tuloste == sana.length()) {
                tuloste = 0;
            }
            
            System.out.print(sana.charAt(tuloste));
            tuloste++;
            int sarake = 0;
            while(sarake < rivinumero) {
                
                if(tuloste == sana.length()) {
                    tuloste = 0;
                }   
                
                System.out.print(sana.charAt(tuloste));
                sarake++;
                tuloste++;
            }
            
            System.out.println(" ");
            rivinumero++;
        }
        rivinumero = 1;
        while(rivinumero < luku) {
            
            if(tuloste == sana.length()) {
                tuloste = 0;
            }
            
            System.out.print(sana.charAt(tuloste));
            tuloste++;
            int sarake = luku - 1;
            while(sarake > rivinumero) {
                
                if(tuloste == sana.length()) {
                    tuloste = 0;
                }   
                
                System.out.print(sana.charAt(tuloste));
                sarake--;
                tuloste++;
            }
            
            System.out.println(" ");
            rivinumero++;
        }
   }
}