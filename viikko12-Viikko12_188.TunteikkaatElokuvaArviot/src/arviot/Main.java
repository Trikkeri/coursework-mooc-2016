package arviot;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Testaa tunteikkaat elokuva-arviot ohjelmaa täällä

//        List<String> rivit = lueRivit("src/arviot.txt");
//        TunteikkaatArviot arviot = new TunteikkaatArviot(rivit);
////        System.out.println(arviot.sananTunne("great job"));
//        System.out.println(arviot.sananTunne("poor"));
//        System.out.println(arviot.sananTunne("is"));
//        System.out.println(arviot.sananTunne("love"));
//        System.out.println(arviot.sananTunne("damme"));
//        System.out.println(arviot.sananTunne("norris"));

//        List<String> rivit = lueRivit("src/arviot.txt");
//        TunteikkaatArviot arviot = new TunteikkaatArviot(rivit);
//        System.out.println(arviot.sananTunneMerkkijonona("poor"));
//        System.out.println(arviot.sananTunneMerkkijonona("is"));
//        System.out.println(arviot.sananTunneMerkkijonona("love"));
//        System.out.println(arviot.sananTunneMerkkijonona("damme"));
//        System.out.println(arviot.sananTunneMerkkijonona("norris"));

        List<String> rivit = lueRivit("src/arviot.txt");
        TunteikkaatArviot arviot = new TunteikkaatArviot(rivit);

        System.out.println(arviot.lauseenTunne("unicorn is a mythical creature"));
        System.out.println(arviot.lauseenTunne("chuck norris made a happy meal cry"));
        System.out.println(arviot.lauseenTunne("the movie was an utter and complete failure"));
        
//        // alla on valmiina annettuna tiedoston lukemiseen tarvittava koodi
//        List<String> rivit = lueRivit("src/arviot.txt");
//        TunteikkaatArviot arviot = new TunteikkaatArviot(rivit);
//
//        Scanner lukija = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("~~ Emo-tions ~~");
//            System.out.println("");
//            System.out.println("Komennot: ");
//            System.out.println("[1] Sanan yleisyys");
//            System.out.println("[2] Sanan tunne");
//            System.out.println("[3] Lauseen tunne");
//            System.out.println("[x] Lopeta");
//
//            System.out.print("> ");
//            String komento = lukija.nextLine();
//            if (komento.equals("x")) {
//                break;
//            }
//
//            System.out.println("Anna syöte: ");
//            String syote = lukija.nextLine();
//
//            if (komento.equals("1")) {
//                System.out.println("Sana '" + syote + "' esiintyy " + arviot.sanojenLukumaara(syote) + " kertaa.");
//            } else if (komento.equals("2")) {
//                System.out.println("Sanan '" + syote + "' tunne on " + arviot.sananTunneMerkkijonona(syote) + " (ka. " + arviot.sananTunne(syote) + ")");
//            } else if (komento.equals("3")) {
//                System.out.println("Lauseen '" + syote + "' tunne on " + arviot.lauseenTunneMerkkijonona(syote) + " (ka. " + arviot.lauseenTunne(syote) + ")");
//            }
//
//            System.out.println("");
//        }
    }

    private static List<String> lueRivit(String tiedosto) {
        List<String> rivit = new ArrayList<>();

        // avataan resurssi
        try (Scanner lukija = new Scanner(new File(tiedosto))) {

            // käsitellään resurssia
            while (lukija.hasNextLine()) {
                rivit.add(lukija.nextLine());
            }

        } catch (Exception e) {
            // käsitellään mahdollinen poikkeus
            System.out.println("Virhe: " + e.getMessage());
        }

        return rivit;
    }
}
