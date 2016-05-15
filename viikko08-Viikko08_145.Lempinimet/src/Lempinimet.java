
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        
        HashMap<String, String> lempparinimet = new HashMap<>();
        lempparinimet.put("matti", "mage");
        lempparinimet.put("mikael", "mixu");
        lempparinimet.put("arto", "arppa");
        
        System.out.println(lempparinimet.get("mikael"));
        
    }

}
