import java.util.Scanner;

public class Palindromi {

    public static String kaanna(String merkkijono) {
        // Kirjoita koodia tähän.
        // Metodin on siis palautettava käännetty merkkijono returnilla!
        int merkkienMaara = merkkijono.length() - 1;
        String paluuArvo = "";
        while(merkkienMaara >= 0) {
            paluuArvo = paluuArvo + merkkijono.charAt(merkkienMaara);
            merkkienMaara--;
        }
        
        return paluuArvo;
    }
    
    public static boolean palindromi(String merkkijono) {
        // kirjoita koodia tähän
        String kaannetty = kaanna(merkkijono);
        System.out.println(kaannetty);
        if (kaannetty.equals(merkkijono)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();    
        if (palindromi(merkkijono)) {
            System.out.println("Merkkijono on palindromi!");
        } else {
            System.out.println("Merkkijono ei ole palindromi!");
        }
    }
}
