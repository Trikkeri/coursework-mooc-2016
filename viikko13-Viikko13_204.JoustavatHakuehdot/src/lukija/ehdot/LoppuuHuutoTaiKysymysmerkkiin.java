package lukija.ehdot;

public class LoppuuHuutoTaiKysymysmerkkiin implements Ehto {

    @Override
    public boolean toteutuu(String rivi) {
        
        if(rivi.length() > 0) {
            return rivi.charAt(rivi.length() - 1) == '?' || rivi.charAt(rivi.length() - 1) == '!';
        } else {
            return false;
        }
    }
}
