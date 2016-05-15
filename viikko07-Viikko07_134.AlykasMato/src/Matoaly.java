
import matopeli.Matopeli;

public class Matoaly {

    public String annaSiirto(Matopeli matopeli) {
        // vaihtoehtoja ovat: YLOS, ALAS, VASEN, OIKEA

        int[][] pelialue = matopeli.annaAlusta();
        // voit käyttää allaolevaa tulostusta pelialueen tulostamiseen konsoliin
//        for (int y = pelialue[0].length - 1; y >= 0; y--) {
//            for (int x = 0; x < pelialue.length; x++) {
//                if(pelialue[x][y] >= 0) {
//                    System.out.print(" ");
//                }
//                System.out.print(pelialue[x][y]);
//            }
//
//            System.out.println("");
//        }
//        System.out.println("");

        int matoX = matopeli.matoX();
        int matoY = matopeli.matoY();
        
        int omenaX = matopeli.omenaX();
        int omenaY = matopeli.omenaY();
        
        if(matoY < omenaY) {
            return "YLOS";
        }
        
        if(matoY > omenaY) {
            return "ALAS";
        }
        
        // Ollaan samalla rivillä, mihin käännytään?
        if(matoY == omenaY) {
            
            if(matoX < omenaX) {
                return "OIKEA";
            } else if(matoX > omenaX) {
                return "VASEN";
            }
        }
        return "YLOS";
    }
}
