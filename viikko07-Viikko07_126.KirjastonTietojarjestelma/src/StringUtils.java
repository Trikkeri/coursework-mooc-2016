/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trigu
 */
public class StringUtils {
    public static boolean sisaltaa(String sana, String haettava) {
        
        if(sana != null || haettava != null) {
            String siistittySana = sana.toUpperCase().trim();
            String siistittyHaettava = haettava.toUpperCase().trim();
            
            if(siistittySana.contains(siistittyHaettava)) {
                return true;
            }
        }
        return false;
    }
}
