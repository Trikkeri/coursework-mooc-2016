
public class Lukutilasto {
    private int lukujenMaara;
    private int summa;
    
    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;
    }
    
    public void lisaaLuku(int luku) {
        this.summa += luku;
        this.lukujenMaara++;
    }
    
    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }
    
    public int summa() {
        return this.summa;
    }
    
    public double keskiarvo() {
        if(summa == 0) {
            return 0;
        } 
        return (double) this.summa / this.haeLukujenMaara();
    }
    
}
