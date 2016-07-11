package hirsipuu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Sanalista sanalista = new Sanalista(lueSanat());
        sanalista = sanalista.sanatJoidenPituusOn(8);
        
        Scanner lukija = new Scanner(System.in);
        Hirsipuu hirsipuu = new Hirsipuu(sanalista, 10);

        System.out.println("Tervetuloa roikkumaan!");
        System.out.println("");
        
        while (hirsipuu.arvauksiaJaljella() > 0 && !hirsipuu.onLoppu()) {
            if (hirsipuu.arvauksiaJaljella() > 1) {
                System.out.println("Sinulla on " + hirsipuu.arvauksiaJaljella() + " arvausta jäljellä.");
            } else {
                System.out.println("Sinulla on 1 arvaus jäljellä.");
            }

            System.out.println("Olet käyttänyt merkit: " + hirsipuu.arvaukset());
            System.out.println("Sana: " + hirsipuu.sana());
            System.out.print("Arvaus: ");
            char arvaus = lukija.nextLine().charAt(0);

            boolean onnistuiko = hirsipuu.arvaa(arvaus);
            
            if (onnistuiko) {
                System.out.println("Löytyi ainakin yksi " + arvaus + "-kirjain.");
            } else {
                System.out.println("Ei " + arvaus + "-kirjaimia.");
            }
            
            System.out.println("");
        }

        if (hirsipuu.arvauksiaJaljella() > 0) {
            System.out.println("Onneksi olkoon, voitit pelin!");
        } else {
            System.out.println("Parempaa onnea ensi kerralla!");
            System.out.println("Sana oli: " + hirsipuu.oikeaSana());
        }
    }

    private static List<String> lueSanat() throws FileNotFoundException {
        List<String> sanat = new ArrayList<>();
        try (Scanner s = new Scanner(new File("sanat.txt"))) {
            while (s.hasNextLine()) {
                sanat.add(s.nextLine());
            }
        }

        return sanat;
    }
}
