
import java.util.ArrayList;

public class Osallistuja implements Comparable <Osallistuja> {
    private String nimi;
    private ArrayList<Kierros> kierrokset;
    private int kokonaispisteet;
    
    public Osallistuja(String nimi) {
        this.nimi = nimi;
        this.kierrokset = new ArrayList<>();
        this.kokonaispisteet = 0;
    }
    
    public String toString() {
        return this.nimi + " (" + this.kokonaispisteet + " pistettä)";
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getKokonaispisteet() {
        return this.kokonaispisteet;
    }
    
    public int getHypynPituus(int kierrosNumero) {
        return this.kierrokset.get(kierrosNumero).getHypynPituus();
    }
    
    public ArrayList<Integer> getTuomariPisteet(int kierrosNumero) {
        return this.kierrokset.get(kierrosNumero).getTuomariPisteet();
    }

    public void kierrokselle() {
        this.kierrokset.add(new Kierros());
    }
    
    public void kaynnistaKierros(int kierrosNumero) {
        Kierros kierros = this.kierrokset.get(kierrosNumero);
        kierros.arvoHyppy();
        
        kierros.arvoPisteet();
        this.kokonaispisteet += kierros.laskeKokonaispisteet();
    }
    
    public int compareTo(Osallistuja osallistuja) {
        if(this.kokonaispisteet == osallistuja.getKokonaispisteet()) {
            return 0;
        } else if(this.kokonaispisteet > osallistuja.getKokonaispisteet()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public void keraaJaTulostaHyppyjenPituudet() {
        ArrayList<Integer> hyppyjenPituudet = new ArrayList<>();
        
        for(Kierros kierros : this.kierrokset) {
            hyppyjenPituudet.add(kierros.getHypynPituus());
        }
        
        for (int i = 0; i < hyppyjenPituudet.size(); i++) {
            if(i == hyppyjenPituudet.size() - 1) {
                System.out.print(" " + hyppyjenPituudet.get(i) + " m");
            } else {
                System.out.print(" " + hyppyjenPituudet.get(i) + " m,");
            }
        }
    }
    
}
