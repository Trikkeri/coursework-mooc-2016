
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class VieraslistaTiedostosta {

    public static void main(String[] args) {
        // HUOM! Älä luo muita Scanner-olioita koodissa -- nyt tai muutenkaan :)
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        // kun toteutat metodit, voit testata toimintaa täällä
        ArrayList<String> lista = lueNimet(tiedosto);

        System.out.println("");
        tarkistaNimet(lukija, lista);
        System.out.println("Kiitos!");
    }

    public static ArrayList<String> lueNimet(String tiedosto) {
        // toteuta tänne toiminnallisuus, jolla luet parametrina annetun
        // tiedoston rivit arraylist-olioon ja palautat arraylist-olion

        ArrayList<String> luetutRivit = new ArrayList<>();
        
        try (Scanner lukija = new Scanner(new File(tiedosto))) {
            
            while(lukija.hasNextLine()) {
                luetutRivit.add(lukija.nextLine());
            }
        } catch(Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        return luetutRivit;
    }

    public static void tarkistaNimet(Scanner lukija, ArrayList<String> lista) {
        System.out.println("Syötä nimiä, tyhjä rivi lopettaa.");
        while (true) {
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }

            if (lista.contains(nimi)) {
                System.out.println("Nimi on listalla.");
            } else {
                System.out.println("Nimi ei ole listalla.");
            }
        }
    }
}
