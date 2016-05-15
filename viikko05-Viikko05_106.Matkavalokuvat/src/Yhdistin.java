//
//import java.util.ArrayList;
//import java.util.Collections;
//import kuva.Fotari;
//import kuva.Kuva;
//
//public class Yhdistin {
//    private String moodi;
//
//    public Yhdistin(String moodi) {
//        this.moodi = moodi;
//    }
//    
//    public ArrayList<Kuva> lataaKuvat(ArrayList<String> kuvat) {
//        ArrayList<Kuva> ladatutKuvat = new ArrayList<>(); 
//        
//        for(String kuva : kuvat) {
//            ladatutKuvat.add(Fotari.lataa(kuva));
//        }
//        return ladatutKuvat;
//    }
//    
//    public Kuva yhdistaKuvat(ArrayList<Kuva> kuvat) {
//        Kuva kuva = new Kuva(kuvat.get(0).getLeveys(), kuvat.get(0).getKorkeus());
//        
//        ArrayList<Integer> punaiset = new ArrayList<>();
//        ArrayList<Integer> vihreat = new ArrayList<>();
//        ArrayList<Integer> siniset = new ArrayList<>();
//        
//        ArrayList<ArrayList<Integer>> kuvienPunaiset = new ArrayList<ArrayList<Integer>>();
//        ArrayList<ArrayList<Integer>> kuvienVihreat = new ArrayList<ArrayList<Integer>>();
//        ArrayList<ArrayList<Integer>> kuvienSiniset = new ArrayList<ArrayList<Integer>>();
//        
//        int i = 0;
//        while(i < kuvat.size()) {
//            
//            if(this.moodi.equals("mediaani")) {
//                kuvienPunaiset.add(haeKuvanVari(kuvat.get(i), "punainen"));
//                kuvienVihreat.add(haeKuvanVari(kuvat.get(i), "vihrea"));
//                kuvienSiniset.add(haeKuvanVari(kuvat.get(i), "sininen"));
//            }
//            
//            // Haetaan pohja-arvot väreille, jotta voidaan verrata myöhemmin
//            if(i == 0) {
//                punaiset = haeKuvanVari(kuvat.get(i), "punainen");
//                vihreat = haeKuvanVari(kuvat.get(i), "vihrea");
//                siniset = haeKuvanVari(kuvat.get(i), "sininen"); 
//            }
//
//            if(this.moodi.equals("vaalein")) {
//                onkoVariIsompi(punaiset, haeKuvanVari(kuvat.get(i), "punainen"));
//                onkoVariIsompi(vihreat, haeKuvanVari(kuvat.get(i), "vihrea"));
//                onkoVariIsompi(siniset, haeKuvanVari(kuvat.get(i), "sininen"));
//            }
//            
//            if(this.moodi.equals("tummin")) {
//                onkoVariPienempi(punaiset, haeKuvanVari(kuvat.get(i), "punainen"));
//                onkoVariPienempi(vihreat, haeKuvanVari(kuvat.get(i), "vihrea"));
//                onkoVariPienempi(siniset, haeKuvanVari(kuvat.get(i), "sininen"));
//            }
//
//
//            
//            i++;
//        }
//        
//        if(this.moodi.equals("mediaani")) {
//            int mediaaniPunainen = mediaani(punaiset);
//            int mediaaniVihrea = mediaani(vihreat);
//            int mediaaniSininen = mediaani(siniset);
//            
//            return maalaaKuva(kuva, mediaaniPunainen, mediaaniVihrea, mediaaniSininen);
//        }
//        
//        return maalaaKuva(kuva, punaiset, vihreat, siniset);
//    }
//    
//    public ArrayList<Integer> haeKuvanVari(Kuva kuva, String vari) {
//       
//        ArrayList<Integer> varit = new ArrayList<>();
//        
//        int x = 0;
//        while (x < kuva.getLeveys()) {
//                    
//            int y = 0;
//            while (y < kuva.getKorkeus()) {
//
//                if(vari.equals("punainen")) varit.add(kuva.punainen(x, y));
//
//                if(vari.equals("vihrea")) varit.add(kuva.vihrea(x, y));
//
//                if(vari.equals("sininen")) varit.add(kuva.sininen(x, y));
//
//                y++;
//            }  
//            x++;
//        }
//        return varit;
//    }
//    
//    public void onkoVariIsompi(ArrayList<Integer> pohjaArvo, ArrayList<Integer> vertailtava) {  
//        
//        int i = 0;
//        while(i < pohjaArvo.size()) {
//            if(pohjaArvo.get(i) < vertailtava.get(i)) {
//                pohjaArvo.set(i, vertailtava.get(i));
//            }
//            i++;
//        }
//    }
//    
//    public void onkoVariPienempi(ArrayList<Integer> pohjaArvo, ArrayList<Integer> vertailtava) {
//        
//        int i = 0;
//        while(i < pohjaArvo.size()) {
//            if(pohjaArvo.get(i) > vertailtava.get(i)) {
//                pohjaArvo.set(i, vertailtava.get(i));
//            }
//            i++;
//        }
//    }
//    
//    public int mediaani(ArrayList<Integer> varit) {
//        Collections.sort(varit); 
//        return varit.get(varit.size() / 2);
//    }  
//    
//    public Kuva maalaaKuva(Kuva kuva, ArrayList<Integer> punainen, ArrayList<Integer> vihrea, ArrayList<Integer> sininen) {
//        
//        int z = 0;
//        
//        int x = 0;
//        while (x < kuva.getLeveys()) {
//            
//            int y = 0;
//            while (y < kuva.getKorkeus()) {
//
//                kuva.asetaVari(x, y,
//                    Math.min(255, punainen.get(z)),
//                    Math.min(255, vihrea.get(z)),
//                    Math.min(255, sininen.get(z)));
//
//                    y++;
//                    z++;
//                }
//                x++;
//        }
//        
//        return kuva;
//    }
//    
//    public Kuva maalaaKuva(Kuva kuva, int punainen, int vihrea, int sininen) {
//        
//        int x = 0;
//        while (x < kuva.getLeveys()) {
//            
//            int y = 0;
//            while (y < kuva.getKorkeus()) {
//
//                kuva.asetaVari(x, y,
//                    Math.min(255, punainen),
//                    Math.min(255, vihrea),
//                    Math.min(255, sininen));
//
//                    y++;
//                }
//            x++;
//        }
//        return kuva;
//    }
//}


import java.util.ArrayList;
import java.util.Collections;
import kuva.Fotari;
import kuva.Kuva;
 
public class Yhdistin {
 
    private String yhdistystapa;
 
    public Yhdistin(String yhdistystapa) {
        this.yhdistystapa = yhdistystapa;
    }
 
//    public Kuva yhdista(ArrayList<String> tiedostot) {
//        if (tiedostot.isEmpty()) {
//            return null;
//        }
// 
//        ArrayList<Kuva> kuvat = lataaKuvat(tiedostot);
//        return yhdistaKuvat(kuvat);
//    }
 
    public ArrayList<Kuva> lataaKuvat(ArrayList<String> tiedostot) {
        ArrayList<Kuva> kuvat = new ArrayList<>();
        for (String tiedosto : tiedostot) {
            kuvat.add(Fotari.lataa(tiedosto));
        }
 
        return kuvat;
    }
 
    public Kuva yhdistaKuvat(ArrayList<Kuva> kuvat) {
        int leveys = kuvat.get(0).getLeveys();
        int korkeus = kuvat.get(0).getKorkeus();
         
        Kuva kuva = new Kuva(leveys, korkeus);
 
        for (int y = 0; y < korkeus; y++) {
            for (int x = 0; x < leveys; x++) {
                asetaHaluttuPikseli(kuvat, kuva, x, y);
            }
        }
 
        return kuva;
    }
 
    public void asetaHaluttuPikseli(ArrayList<Kuva> kuvat, Kuva kuva, int x, int y) {
        ArrayList<Integer> punaiset = new ArrayList<>();
        ArrayList<Integer> vihreat = new ArrayList<>();
        ArrayList<Integer> siniset = new ArrayList<>();
 
        for (Kuva k : kuvat) {
            punaiset.add(k.punainen(x, y));
            vihreat.add(k.vihrea(x, y));
            siniset.add(k.sininen(x, y));
        }
 
        Collections.sort(punaiset);
        Collections.sort(vihreat);
        Collections.sort(siniset);
 
        // tummin
        int punainen = punaiset.get(0);
        int vihrea = vihreat.get(0);
        int sininen = siniset.get(0);
 
        if (this.yhdistystapa.equals("vaalein")) {
            punainen = punaiset.get(punaiset.size() - 1);
            vihrea = vihreat.get(vihreat.size() - 1);
            sininen = siniset.get(siniset.size() - 1);
        } else if (this.yhdistystapa.equals("mediaani")) { // mediaanit
            punainen = punaiset.get(punaiset.size() / 2);
            vihrea = vihreat.get(vihreat.size() / 2);
            sininen = siniset.get(siniset.size() / 2);
        }
 
        kuva.asetaVari(x, y, punainen, vihrea, sininen);
    }
}