
import java.lang.reflect.Array;
import java.util.ArrayList;



public class IoobVirheOhjelma {

    public static void main(String[] args) {
        // Toteuta tänne ohjelma, jossa tapahtuu IndexOutOfBounds -virhe
        ArrayList<String> exceptionList = new ArrayList<>();
        
        exceptionList.add(5, "test");
        
    }
}
