
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class YleisimmatSanat1 implements ToistonTunnistin {

    YleisimmatSanat1() {
    }

    public List<String> yleisetSanat(List<String> sanat) {
        HashMap<String, Integer> loytyyMonesti = new HashMap<>();

        loytyyMonesti = selvitaUseitenEsiintyneetSanat(sanat);
        List<String> sortatutSanat = lajitteleSanatUseitenEsiintynytEnsin(loytyyMonesti);    
        
        return sortatutSanat;
    }
    
    public static List<String> lajitteleSanatUseitenEsiintynytEnsin(Map<String, Integer> wordMap) {
        Set<Entry<String, Integer>> entries = wordMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<>(entries);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        
        List<String> returnValues = new ArrayList<>();
        
        for(Map.Entry<String, Integer> entry : list) {
            if(returnValues.size() < 3) {
                returnValues.add(entry.getKey());
            }
        }
        
        return returnValues;
    }
    
    public HashMap<String, Integer> selvitaUseitenEsiintyneetSanat(List<String> sanat) {
        HashMap<String, Integer> loytyyMonesti = new HashMap<>();
        
        for (int i = 0; i < sanat.size(); i++) {
            String vertailtava = sanat.get(i);
            
            if(!loytyyMonesti.containsKey(vertailtava)) {
                
                for (int j = 0; j < sanat.size(); j++) {
                    if(j != i) {
                        if(vertailtava.equals(sanat.get(j))) {
                            if(loytyyMonesti.containsKey(vertailtava)) {
                                loytyyMonesti.put(vertailtava, loytyyMonesti.get(vertailtava) + 1);
                            } else {
                                // Laitetaan eka lyodetty arvo 2, jotta mukaan lasketaan myös vertailtava arvo
                                loytyyMonesti.put(vertailtava, 2);
                            }
                        }
                    }
                }
                
            }
            

        }
        return loytyyMonesti;
    }
}
