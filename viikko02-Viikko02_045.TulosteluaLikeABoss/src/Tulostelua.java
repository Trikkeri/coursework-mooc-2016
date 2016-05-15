
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 40.1
        
        int i = 0;
        while(maara > i) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        // 40.1
        
        int i = 0;
        while (i < maara) {
            System.out.print(" ");
            i++;
        }
    }

    public static void tulostaKolmio(int koko) {
        // 40.2
        
        int i = 0;
        int tyhjat = koko - 1;
        int tahdet = (koko - koko) + 1;
        while(i < koko) {
            tulostaTyhjaa(tyhjat);
            tulostaTahtia(tahdet);
            
            i++;
            tyhjat--;
            tahdet++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        // 40.3
        int i = 0;
        int tyhjat = korkeus - 1;
        int tahdet = (korkeus - korkeus) + 1;
        
        int jalkaTyhjat = 0;
        int jalkaTahdet = 0;
        
        while(i < korkeus) {
            tulostaTyhjaa(tyhjat);
            tulostaTahtia(tahdet);
            
            if(i == 1) {
                jalkaTyhjat = tyhjat;
                jalkaTahdet = tahdet;
            }
//            tulostaTyhjaa(tyhjat);
            
//            tulostaTyhjaa(3);
//            tulostaTahtia(1);
//            tulostaTyhjaa(3);
//            
//            tulostaTyhjaa(2);
//            tulostaTahtia(3);
//            tulostaTyhjaa(2);
//            
//            tulostaTyhjaa(1);
//            tulostaTahtia(5);
//            tulostaTyhjaa(1);
//            
//            tulostaTyhjaa(0);
//            tulostaTahtia(7);
//            tulostaTyhjaa(0);
            
            i++;
            tyhjat--;
            tahdet++;
            tahdet++;
        }
        // jalka
        for(int j = 0; j < 2;j++) {
            tulostaTyhjaa(jalkaTyhjat);
            tulostaTahtia(jalkaTahdet);
        }

    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(3);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
