
public class Main {

    public static void main(String[] args) {
        // Testaa Taikanelio-luokkaasi täällä
        
//        Taikaneliotehdas tt = new Taikaneliotehdas();
//        System.out.println(tt.luoTaikanelio(5));

        Taikanelio tt = new Taikanelio(2);
        tt.asetaArvo(0, 0, 1);
        tt.asetaArvo(0, 1, 1);
        tt.asetaArvo(1, 0, 5);
        
        tt.asetaArvo(1, 1, 7);
//        tt.asetaArvo(1, 1, 5);
//        tt.asetaArvo(1, 2, 8);
//        
//        tt.asetaArvo(2, 0, 3);
//        tt.asetaArvo(2, 1, 6);
//        tt.asetaArvo(2, 2, 9);
        System.out.println(tt);
        
        System.out.println(tt.rivienSummat());
        System.out.println(tt.sarakkeidenSummat());
        System.out.println(tt.lavistajienSummat());
        
    }
}
