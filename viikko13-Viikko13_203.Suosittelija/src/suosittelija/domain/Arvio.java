package suosittelija.domain;


public enum Arvio {
    
    HUONO(-5), 
    VALTTAVA(-3),
    EI_NAHNYT(0),
    NEUTRAALI(1),
    OK(3),
    HYVA(5);
    
    private int arvo;
    
    private Arvio(int arvo) {
        this.arvo = arvo;
    }
    
    public int getArvo() {
        return this.arvo;
    }
    
}
