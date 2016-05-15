public class Kortti implements Comparable<Kortti> {

    /*
     * Nämä ovat Kortti-luokan staattisia vakioita. Näitä voi tästä sekä
     * toisistakin luokista esimerkiksi tyyliin Kortti.RISTI.
     */
    public static final int RISTI = 0;
    public static final int RUUTU = 1;
    public static final int HERTTA = 2;
    public static final int PATA = 3;
    /*
     * Tulostuksen helpottamiseksi Kortti-luokalla on myös merkkijonotaulukot maita
     * ja arvoja varten.
     * MAAT[maa] on maan selkokielinen merkkijonoesitys (Risti, Ruutu, Pata, Hertta)
     * ARVOT[arvo] on arvon korttipakkaan sopiva lyhenne (A, J, Q, K normaalien
     * lukumerkintöjen lisäksi)
     */
    public static final String[] MAAT = {"Risti", "Ruutu", "Hertta", "Pata"};
    public static final String[] ARVOT = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private int arvo;
    private int maa;

    public Kortti(int arvo, int maa) {
        this.arvo = arvo;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return MAAT[maa] + " " + ARVOT[arvo];
    }

    public int getArvo() {
        return arvo;
    }

    public int getMaa() {
        return maa;
    }
    
    @Override
    public int compareTo(Kortti kortti) {
        if(this.arvo == kortti.getArvo()) {
            //verrataan maittan
            if(this.maa > kortti.getMaa()) {
                return 1;
            } else if(this.maa == kortti.getMaa()) {
                return 0;
            } else {
                return -1;
            }
        } else if(this.arvo > kortti.getArvo()) {
            return 1;
        } else {
            return -1;
        }
    }

}
