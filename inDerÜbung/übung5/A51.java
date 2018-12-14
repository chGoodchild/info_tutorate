/* 

   Betrachten Sie folgenden Programmcode (Source-Code auf der Web-Seite).
    
   1. Welche Ausgaben liefert das Programm? Lösen Sie die Aufgabe zunächst ohne den
   Compiler zu verwenden. Begründen Sie Ihre Antwort!
   2. Modifizieren Sie den arithmetischen Ausdruck in Zeile 3 ohne Veränderung der
   Zahlwerte und der Operatoren so, dass in Zeile 7 der Wert 0.125 ausgegeben wird.

*/
    
public class A51 {
    public static void main (String args[]) {

        /*

        a * b
        a / b
        int vs float: 
        int mit int ---> int
        int mit float ---> float
        float mit int ---> float

        */

        double f = 2 / (4 * 0.25);        // f = 0.0 ---> double
        double g = 7;                   // g = 7.0 ---> Double ist
                                        // eine float mit doppelter
                                        // Länge
        double h = 1 / g;               // h = 1/7 = 0.142857143 ---> double
        int i = 7;                      // i = 7 ---> integer
        
        System.out.println(f);          // print: 0.0 ---> float
        System.out.println((1 / g) * g);  // print: 1.0 ---> float
        System.out.println((1 / i) * i);  // (0 * i) = 0 ---> Integer,
                                        // Problem, analog zur ersten
                                        // Zeile.
                                        // print: 0 ---> int
        
        f = (g * h) * (g * h) * (g * h); // (1.0) * (1.0) * (1.0) =
                                         // (1.0) ---> Float, analog
                                         // zur vorletzten zeile.
        System.out.println(f - 1.0);     // (1.0 - 1.0), float minut
                                         // float = float => print:
                                         // 0.0

        // double: 00000000.00000000
        // float: 0000.0000
        
        f = (g * g * g) * (h * h * h);  // 0.9999999999999999
        System.out.println(f - 1.0);    // print: -1.1102... * 10^(-16)

        // 0.0; 1.0; 0; 0.0; -1.1102... * 10^(-16)

        /*

          Ausgeführt:
          0.0
          1.0
          0
          0.0
          -1.1102230246251565E-16

        */
    }
}
