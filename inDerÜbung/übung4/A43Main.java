public class A43Main {
    public static void main(String[] args) {
        Aufgabe43 a = new Aufgabe43();  // a contains "A"  (construktor)
        Aufgabe43 b = new Aufgabe43();  // b contains "A"  (construktor)
        b.changeString("B");                // b contains "B" (nur
                                            // seine Instanzvariable
                                            // wird um refferenziert)
        a.printString();                    // System.out.println("A");
        b.printString();                    // System.out.println("B");
        a = b;                              // Refferenzieren jetzt beide auf das Objekt von b
        a.printString();                    // System.out.println("B"); (a ist b bzw b ist a)
        b.printString();                    // System.out.println("B"); (a ist b bzw b ist a)
        b.changeString("C");                // b contains "C" und a contains "C"
        a.printString();                    // System.out.println("C"); (a ist b bzw b ist a)
        b.printString();                    // System.out.println("C"); (a ist b bzw b ist a)
    }
}

// Welche Ausgabe liefert folgendes Programm? Lösen Sie die Aufgabe
// ohne den Compiler zu verwenden.
/*

Print:
A 
B 
B 
B 
C 
C

*/
