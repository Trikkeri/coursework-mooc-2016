public class Laskin {
    private Lukija lukija;
    private int kerrat;
    
    public Laskin() {
        this.lukija = new Lukija();
        this.kerrat = 0;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("komento: ");
            String komento = lukija.lueMerkkijono();
            if (komento.equals("lopetus")) {
                break;
            }

            if (komento.equals("summa")) {
                summa();
            } else if (komento.equals("erotus")) {
                erotus();
            } else if (komento.equals("tulo")) {
                tulo();
            }
        }

        statistiikka();
    }
    
    private void summa() {
        int[] luvut = new int[2];
        luvut = kysy();
        System.out.print("Lukujen summa " + (luvut[0] + luvut[1]));
        this.kerrat++;
    }
    
    private void erotus() {
        int[] luvut = new int[2];
        luvut = kysy();
        System.out.print("Lukujen erotus " + (luvut[0] - luvut[1]));
        this.kerrat++;        
    }
    
    private void tulo() {
        int[] luvut = new int[2];
        luvut = kysy();
        System.out.print("Lukujen tulo " + (luvut[0] * luvut[1]));
        this.kerrat++;
    }
    
    private void statistiikka() {
        System.out.println("Lukuja laskettiin " + this.kerrat);
    }
    
    private int[] kysy() {
        int[] luvut = new int[2];
        System.out.print("Luku1: ");
        luvut[0] = this.lukija.lueKokonaisluku();
        System.out.print("Luku2: ");
        luvut[1] = this.lukija.lueKokonaisluku();
        
        return luvut;
    }
}
