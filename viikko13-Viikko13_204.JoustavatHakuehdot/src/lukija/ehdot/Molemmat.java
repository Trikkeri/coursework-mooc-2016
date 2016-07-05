package lukija.ehdot;

public class Molemmat implements Ehto {

    private Ehto ehto1;
    private Ehto ehto2;
    
    public Molemmat(Ehto ehto1, Ehto ehto2) {
        this.ehto1 = ehto1;
        this.ehto2 = ehto2;
    }
    
    @Override
    public boolean toteutuu(String rivi) {
        System.out.println(ehto1.toteutuu(rivi));
        System.out.println(ehto2.toteutuu(rivi));
        
        if(ehto1.toteutuu(rivi) && ehto2.toteutuu(rivi)) {
            return true;
        }
        return false;
    }
    
}
