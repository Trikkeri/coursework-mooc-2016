
import java.util.List;

interface SeismisenToiminnanMittaaja {

    List<SuurinTaajuusRaportti> paivittaisetMaksimit(List<Double> mittausData,
            int kuukausi);
}
