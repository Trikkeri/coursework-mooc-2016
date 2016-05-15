
import java.util.List;

public class PainoindeksiRaportti {

    private List<String> alipainoiset;
    private List<String> normaalipainoiset;
    private List<String> ylipainoiset;
    private List<String> merkittavastiYlipainoiset;

    public PainoindeksiRaportti(List<String> alipainoiset,
            List<String> normaalipainoiset,
            List<String> ylipainoiset,
            List<String> merkittavastiYlipainoiset) {
        this.alipainoiset = alipainoiset;
        this.normaalipainoiset = normaalipainoiset;
        this.ylipainoiset = ylipainoiset;
        this.merkittavastiYlipainoiset = merkittavastiYlipainoiset;
    }

    public List<String> getAlipainoiset() {
        return alipainoiset;
    }

    public void setAlipainoiset(List<String> alipainoiset) {
        this.alipainoiset = alipainoiset;
    }

    public List<String> getNormaalipainoiset() {
        return normaalipainoiset;
    }

    public void setNormaalipainoiset(List<String> normaalipainoiset) {
        this.normaalipainoiset = normaalipainoiset;
    }

    public List<String> getYlipainoiset() {
        return ylipainoiset;
    }

    public void setYlipainoiset(List<String> ylipainoiset) {
        this.ylipainoiset = ylipainoiset;
    }

    public List<String> getMerkittavastiYlipainoiset() {
        return merkittavastiYlipainoiset;
    }

    public void setMerkittavastiYlipainoiset(List<String> merkittavastiYlipainoiset) {
        this.merkittavastiYlipainoiset = merkittavastiYlipainoiset;
    }

}
