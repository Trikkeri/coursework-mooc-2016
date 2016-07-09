
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(muotoile(t));
    }

    public static String muotoile(int[] t) {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("{\n");
        
        int riviLaskuri = 1;
        
        for (int i = 0; i < t.length; i++) {   
            // Jos ollaan lisäämässä riville ensimmäistä lukua niin laitetaan alkuun välilyönti
            if(riviLaskuri % 4 == 0) {
                sb.append(" ");
            }
            
            // Jos ollaan lisäämässä viimeistä lukua, ei lisätä pilkkua perään, muutoin lisätään
            if(i == t.length - 1) {
                sb.append(t[i]);
            } else {
                sb.append(t[i]).append(", ");
            }
            
            // Lisätään rivinvaihto, joka neljännelle luvulle
            if(riviLaskuri % 4 == 0) {
                sb.append("\n");
            }
            riviLaskuri++;
        }
        
        sb.append("\n}");
        
        return sb.toString();
    }
}
