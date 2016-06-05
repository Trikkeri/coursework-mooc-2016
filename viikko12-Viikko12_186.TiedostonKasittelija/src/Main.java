
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        TiedostonKasittelija t = new TiedostonKasittelija();

        for (String rivi : t.lue("src/koesyote1.txt")) {
            System.out.println(rivi);
        }
    }
}
