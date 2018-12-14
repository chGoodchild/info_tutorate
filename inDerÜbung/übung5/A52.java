// Wie lautet die Ausgabe des folgenden Java-Programms?
class A52 {
    public static void main(String[] arg) {
        int x = 3, y = 10;
        System.out.println( x++ );             // print: 3; x = 4;
        System.out.println( x + y );           // print: 14;
        System.out.println( ++y + x );         // y = 11; print: 15
        int z = ++y / x;                       // y = 12; z = 12 / 4 = 3;
        y = z;                                 // y = 3;
        z *= y;                                // z = z * y = 3 * 3 = 9;
        System.out.println( z );               // print: 9
        System.out.println( y * ++z - x++ );   // z = 10; print: ((3 * 10) - 4) = 26; x = 5;
        System.out.println( x );               // print: 5;

        /*

          3
          14
          15
          9
          26
          5

        */
    }
}
