
import java.util.ArrayList;
import java.util.List;

public class RaportinLuoja1 implements Raportoiva {
    
    public RaportinLuoja1() {
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
        
        ArrayList<String> ali = new ArrayList<>();
        ArrayList<String> normi = new ArrayList<>();
        ArrayList<String> yli = new ArrayList<>();
        ArrayList<String> superYli = new ArrayList<>();
        
        for (Henkilo henk : henkilotiedot) {
            double bmi = laskeBMI(henk);
            System.out.println(bmi);
            
            if(bmi >= 30) {
                //Merkittvä ylipaino
                superYli.add(henk.getNimi());
            } else if(bmi < 30 && bmi >= 25) {
                // Yliapino
                yli.add(henk.getNimi());
            } else if(bmi < 25 && bmi >= 18.5 ) {
                // Normi
                normi.add(henk.getNimi());
            } else {
                // Ali
                ali.add(henk.getNimi());
            }
        }
        
        return new PainoindeksiRaportti(ali, normi, yli, superYli);  
    }

    private double laskeBMI(Henkilo henk) {
        
        double bmi = henk.getPaino() / (henk.getPituus() * henk.getPituus());
        return bmi;
    }    
}
