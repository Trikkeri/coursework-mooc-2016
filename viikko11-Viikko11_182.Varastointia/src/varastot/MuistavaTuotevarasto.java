package varastot;

public class MuistavaTuotevarasto extends Tuotevarasto {
    
    private Muutoshistoria mt;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.mt = new Muutoshistoria();
        this.mt.lisaa(alkuSaldo);
    }
    
    public String historia() {
        return mt.toString();
    }
    
    @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        mt.lisaa(super.getSaldo());
    }
    
    @Override
    public double otaVarastosta(double maara) {
        double saldo = 0;
        saldo = super.otaVarastosta(maara);
        mt.lisaa(super.getSaldo() + saldo - maara);
        
        return saldo;
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + mt.toString());
        System.out.println("Suurin tuotemäärä: " + mt.maxArvo());
        System.out.println("Pienin tuotemäärä: " + mt.minArvo());
        System.out.println("Keskiarvo: " + mt.keskiarvo());
        System.out.println("Suurin muutos: " + mt.suurinMuutos());
        System.out.println("Varianssi: " + mt.varianssi());
    }
}
