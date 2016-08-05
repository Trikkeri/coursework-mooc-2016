
import java.util.ArrayList;
import java.util.List;

public class Tietokanta {
    private List<Lintu> havaintolista;
    
    public Tietokanta() {
        this.havaintolista = new ArrayList<>();
    }
    
    public void lisaaLintu(String nimi, String nimiLatinaksi) {
        Lintu lisattavaLintu = new Lintu(nimi, nimiLatinaksi);
        
        if(havaintolista.contains(lisattavaLintu)) {
            System.out.println("Lintu on jo lisättynä tietokannassa!");
        } else {
            havaintolista.add(new Lintu(nimi, nimiLatinaksi));
        }
    }
    
    public void lisaaHavainto(String suomalinenNimi) {
        if(onkoLintuOlemassa(suomalinenNimi)) {
            for(Lintu lintu : this.havaintolista) {
                if(lintu.getsuomalainenNimi().equalsIgnoreCase(suomalinenNimi)) {
                    lintu.lintuHavaittu();
                }
            }
        } else {
            System.out.println("Ei ole lintu!");
        }
    }
    
    public List<Lintu> getHavaintolista() {
        return havaintolista;
    }

    private boolean onkoLintuOlemassa(String suomalainenNimi) {
        for(Lintu lintu : this.havaintolista) {
                if(lintu.getsuomalainenNimi().equalsIgnoreCase(suomalainenNimi)) {
                    return true;
                }
        }
        return false;
    }
    
    public Lintu haeLintu(String suomalainenNimi) {
        for(Lintu lintu : this.havaintolista) {
                if(lintu.getsuomalainenNimi().equalsIgnoreCase(suomalainenNimi)) {
                    return lintu;
                }
        }
        return null;
    }
}