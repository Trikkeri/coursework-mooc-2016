
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
        
        Raha a = new Raha(10, 0);
        Raha b = new Raha(3, 50);

        Raha c = a.miinus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.miinus(a);        // HUOM: tässä syntyy uusi Raha-olio, joka laitataan "c:n langan päähän"
        //       vanha c:n langan päässä ollut 6.5 euroa häviää ja Javan roskien kerääjä korjaa sen pois

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e

        System.out.println("--");
        
        Raha r1 = new Raha(10, 0);
        Raha r2 = new Raha(7, 40);
        Raha r3 = r1.miinus(r2);
        System.out.println(r3); // 2.60

//        Raha a = new Raha(10, 0);
//        Raha b = new Raha(3, 0);
//        Raha c = new Raha(5, 0);
//
//        System.out.println(a.vahemman(b));  // false
//        System.out.println(b.vahemman(c));  // true
//
//        System.out.println("--");
//
//        Raha r1 = new Raha(1, 0);
//        Raha r2 = new Raha(1, 5);
//        Raha r3 = new Raha(-3, 5);
//        Raha r4 = new Raha(2, 0);
//        
//        System.out.println(r1.vahemman(r2));  // true
//        System.out.println(r2.vahemman(r1));  // false
//        
//        System.out.println("--");
//
//        System.out.println(r1.vahemman(r3));  // false
//        System.out.println(r3.vahemman(r1));  // true XX
//        
//        System.out.println("--");
//        
//        System.out.println(r2.vahemman(r3));  // false
//        System.out.println(r3.vahemman(r2));  // true
//        
//        System.out.println("--");
//        
//        System.out.println(r2.vahemman(r4));  // true XX
//        System.out.println(r4.vahemman(r2));  // false
//        
//        System.out.println("--");
//        
//        System.out.println(r3.vahemman(r4));  // true XX
//        System.out.println(r4.vahemman(r3));  // false 
        

    }
}
