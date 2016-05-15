public class VahenevaLaskuri {
    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon
    private int muistettavaArvo;
    
    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.muistettavaArvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        // kirjoita tänne metodin toteutus
        // laskurin arvon on siis tarkoitus vähentyä yhdellä
        if(this.arvo > 0) {
            this.arvo = this.arvo - 1;
        }
    }

    public void nollaa() {
        this.arvo = 0;
    }
    
    public void palautaAlkuarvo() {
        this.arvo = this.muistettavaArvo;
    }
    // ja tänne muut metodit
}
