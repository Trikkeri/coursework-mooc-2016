/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class Lukutulostin {
    
    public void lukuporras(int luku) {
        int rivinumero = 0;
        while(rivinumero < luku) {
            System.out.print(1 + " ");
            
            int sarake = 0;
            while(sarake < rivinumero) {
                System.out.print(sarake + 2 + " ");
                sarake++;
            }
            System.out.println(" ");
            rivinumero++;
        }
    }
    
    public void jatkuvaLukuporras(int luku) {
        
        int rivinumero = 0;
        int tuloste = 0;
        while(rivinumero < luku) {
            System.out.print(tuloste + " ");
            
            
            int sarake = 0;
            while(sarake < rivinumero) {
                System.out.print(tuloste + 1 + " ");
                sarake++;
                tuloste++;
            }
            
            System.out.println(" ");
            rivinumero++;
            tuloste++;
        }
    }
    
    public void kertokolmio(int luku) {
        
        int rivinumero = 0;
        int kerroin = 1;
        while(rivinumero < luku) {
            System.out.print(rivinumero + 1 + " ");
            
            int sarake = 1;
            while(sarake <= rivinumero) {
                sarake++;
                System.out.print(kerroin * sarake + " ");
            }
            
            System.out.println(" ");
            kerroin++;
            rivinumero++;
        }
        
    }
    
}