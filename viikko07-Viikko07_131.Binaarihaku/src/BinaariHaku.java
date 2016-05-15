public class BinaariHaku {

    public static boolean hae(int[] taulukko, int etsittavaLuku) {
        int alku = 0;
        int loppu = taulukko.length - 1;

        // tarvitset ainakin toistolauseen, missä katsotaan aina taulukon
        // keskimmäistä alkiota, sekä jonkinlaisen toiminnallisuuden
        // hakualueen jatkuvaan pienentämiseen
        int keskiarvo = 0;
        
        while(alku <= loppu) {
            keskiarvo = keskiarvo(alku, loppu);
            
            if(taulukko[keskiarvo] == etsittavaLuku) {
                return true;
            }
            
            if(taulukko[keskiarvo] < etsittavaLuku) {
                alku = keskiarvo + 1; 
            } else {
                loppu = keskiarvo - 1; 
            }
        }
        return false;
    }
       
    public static int keskiarvo(int ekaLuku, int tokaLuku) {
        return (ekaLuku + tokaLuku) / 2;
    }
}
