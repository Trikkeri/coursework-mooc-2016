package lukija.ehdot;

public class VahintaanYksi implements Ehto {

    private Ehto[] ehdot;
    
    public VahintaanYksi(Ehto... ehto) {
        this.ehdot = ehto;
    }
    
    @Override
    public boolean toteutuu(String rivi) {
        
        boolean toteutuukoYksi = false;
        
        for (int i = 0; i < ehdot.length; i++) {
            if(ehdot[i].toteutuu(rivi)) {
                toteutuukoYksi = true;
            }
        }
        return toteutuukoYksi;
    }
    
}
