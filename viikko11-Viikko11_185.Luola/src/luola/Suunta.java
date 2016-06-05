package luola;

public enum Suunta {
    YLOS('w'),
    ALAS('s'),
    VASEN('a'),
    OIKEA('d');
    
    private final char suunta;
    
    public char suunta() {
        return this.suunta;
    }
    
    private Suunta(char suunta) {
        this.suunta = suunta;
    }
    
}
