
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        
        List<String> sanat = new ArrayList<>();
        
//        sanat.add("perkele");
//        sanat.add("heviletti");
//        sanat.add("asd");
//        sanat.add("asd");
//        sanat.add("asd");
//        sanat.add("qweqwe");
//        sanat.add("das");
//        sanat.add("qwerty");
//        sanat.add("das");
//        sanat.add("qwerty");
//        sanat.add("test");
//        sanat.add("test");
//        sanat.add("test");
//        sanat.add("test");
//        sanat.add("test");
        
        sanat.add("3");
        sanat.add("1");
        sanat.add("3");
        sanat.add("2");
        sanat.add("2");
        sanat.add("3");
        sanat.add("2.2");
        sanat.add("2.2");
        sanat.add("5");
        sanat.add("5");
        sanat.add("5");
        sanat.add("5");
        sanat.add("5");

        YleisimmatSanat1 top3 = new YleisimmatSanat1();
        System.out.println(top3.yleisetSanat(sanat));
        
    }

}
