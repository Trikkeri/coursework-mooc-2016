
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimiesi luokkien Henkilo ja Puhelinmuistio toimintaa
        

        Puhelinmuistio muistio = new Puhelinmuistio();

        muistio.lisaa("Pekka Mikkola", "040-123123");
        muistio.lisaa("Antti Laaksonen", "045-456123");
        muistio.lisaa("Juhana Laurinharju", "050-222333");

        String numero = muistio.haeNumero("Pekka Mikkola");
        System.out.println(numero);

        numero = muistio.haeNumero("Martti Tienari");
        System.out.println(numero);

    }
}
