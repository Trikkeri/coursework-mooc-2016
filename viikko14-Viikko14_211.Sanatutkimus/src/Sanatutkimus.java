
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sanatutkimus {
    
    private File tiedosto;
    private Scanner lukija;
    private List<String> luetutSanat;
    
    public Sanatutkimus(String tiedostonimi) {
        this.luetutSanat = new ArrayList<>();
        this.tiedosto = new File(tiedostonimi);
        
        try {
            this.lukija = new Scanner(tiedosto, "UTF-8");
            
            while(lukija.hasNextLine()) {
                luetutSanat.add(lukija.nextLine());
            }
            
        } catch(Exception e) {
            System.out.println("Virhe: " + e.toString());
        }
        lukija.close();
    }
    
    public int sanojenMaara() {
        return this.luetutSanat.size();
    }
    
    public boolean onkoSanaa(String sana) {
        List<String> tulos = luetutSanat.stream().filter(s -> s.equals(sana)).collect(Collectors.toList());
        
        if(tulos.size() >= 1) {
            return true;
        }
        
        return false;
    }
    
    public int laskeSanat(int pituus) {
        List<String> tulos = luetutSanat.stream().filter(s -> s.length() == pituus).collect(Collectors.toList());
        
        return tulos.size();
    }
    
    public void pituustilasto() {
        Map<Integer, Integer> sanojenPituudet = new HashMap<>();
        
        // Selvitetään minkä pituisia sanoja on lähteessä
        for(String s : this.luetutSanat) {
            int sananPituus = s.length();
            if(sanojenPituudet.containsKey(sananPituus)) {
                sanojenPituudet.put(sananPituus, sanojenPituudet.get(sananPituus) + 1);
            } else {
                sanojenPituudet.put(sananPituus, 1);
            }
        }
        
        // Tulostetaan tulokset
        tulostaHashMap(sanojenPituudet);
    }
    
    private void tulostaHashMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pari = (Map.Entry)it.next();
            System.out.println(pari.getKey() + " " + pari.getValue());
            it.remove();
        }
    }
    
    public int laskeKirjaimet(char kirjain) {
        int kirjaimenEsiintyvyys = 0;
        
        for(String s : this.luetutSanat) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == kirjain) {
                    kirjaimenEsiintyvyys++;
                }
            }
        }
        return kirjaimenEsiintyvyys;
    }
    
    public void kirjaintilasto() {
        Map<Character, Integer> kirjainTilasto = new HashMap<>(); 
        String vertailtavatKirjaimet = "abcdefghijklmnopqrstuvwxyzåäö";
        
        for(int i = 0; i < vertailtavatKirjaimet.length(); i++) {
            kirjainTilasto.put(vertailtavatKirjaimet.charAt(i), laskeKirjaimet(vertailtavatKirjaimet.charAt(i)));
        }
        
        tulostaHashMap(kirjainTilasto);
    }
    
    public ArrayList<String> haePituudella(int pituus) {
        ArrayList<String> oikeanpituisetSanat = new ArrayList<>();
        
        for(String s : luetutSanat) {
            if(s.length() == pituus) {
                oikeanpituisetSanat.add(s);
            }
        }
        return oikeanpituisetSanat;
    }
    
    public ArrayList<String> haeOsalla(String osa) {
        ArrayList<String> sanatJossaOsaEsiintyy = new ArrayList<>();
        
        for(String s : luetutSanat) {
            if(s.contains(osa)) {
                sanatJossaOsaEsiintyy.add(s);
            }
        }
        return sanatJossaOsaEsiintyy;
    }
    
    public ArrayList<String> haePalindromit() {
        ArrayList<String> palindromit = new ArrayList<>();
        
        for(String s : luetutSanat) {
            String kaannettySana = kaannaSana(s);
            
            if(kaannettySana.equalsIgnoreCase(s)) {
                palindromit.add(s);
            }
        }
        return palindromit;
    }
    
    private String kaannaSana(String sana) {
        StringBuilder sb = new StringBuilder(sana);
        sb.reverse();
        return sb.toString();
    } 
    
    public ArrayList<String> haeRistikkoon(String pohja) {
        
        ArrayList<String> oikeanPituisetSanat = new ArrayList<>();
        oikeanPituisetSanat = haePituudella(pohja.length());
        
        ArrayList<String> oikeatSanat = new ArrayList<>();
        
        for(String s : oikeanPituisetSanat) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == pohja.charAt(i)) {
                    oikeatSanat.add(s);
                } else {
                    break;
                }
            }
        }
        return oikeatSanat;
    }
}
