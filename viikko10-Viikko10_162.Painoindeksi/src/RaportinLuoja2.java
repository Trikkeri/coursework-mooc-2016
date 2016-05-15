
import java.util.ArrayList;
import java.util.List;

public class RaportinLuoja2 implements Raportoiva {

    RaportinLuoja2() {
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
                
        List<String> ali = new ArrayList<>();
        List<String> normi = new ArrayList<>();
        List<String> yli = new ArrayList<>();
        List<String> superYli = new ArrayList<>();
        
        for (int i = 0; i < henkilotiedot.size(); i++) {
            
           double bmi = laskeBMI(henkilotiedot.get(i)); 
            System.out.println(bmi);
            if(bmi >= 30) {
                //Merkittvä ylipaino
                superYli.add(henkilotiedot.get(i).getNimi());
            } else if(bmi < 30 && bmi >= 25) {
                // Yliapino
                normi.add(henkilotiedot.get(i).getNimi());
            } else if(bmi < 25 && bmi >= 18.5 ) {
                // Normi
                yli.add(henkilotiedot.get(i).getNimi());
            } else {
                // Ali
                ali.add(henkilotiedot.get(i).getNimi());
            }
            
        }
        
        PainoindeksiRaportti rapsa = new PainoindeksiRaportti(null, null, null, null);
        
        rapsa.setAlipainoiset(ali);
        rapsa.setNormaalipainoiset(normi);
        rapsa.setYlipainoiset(yli);
        rapsa.setMerkittavastiYlipainoiset(superYli);
        
        return rapsa;
    }
    
    private double laskeBMI(Henkilo henk) {
        
        double bmi = henk.getPaino() / (henk.getPituus() * henk.getPituus());
        return bmi;
    }    
}
