
import java.util.Collections;


public class PalindrominTunnistus {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        System.out.println(onPalindromi("a man, a plan, a canal: Panama")); // true
        System.out.println(onPalindromi("not a bird, not a plane, superman!")); // false
        System.out.println(onPalindromi("saippuakauppias")); // true
        System.out.println(onPalindromi("porkkanakauppias")); // false
    }

    public static boolean onPalindromi(String merkkijono) {
        
        // Poistetaan whitespacet
        String cleanedString = merkkijono.replaceAll("\\s+", "");
        // Poistetaan erikoismerkit ja numerot
        cleanedString = cleanedString.replaceAll("[^a-zA-Z]", "");
        StringBuilder sb = new StringBuilder(cleanedString);
        return sb.reverse().toString().equalsIgnoreCase(cleanedString);
        
    }
}
