// Aufgabe 4.3

// Betrachten Sie folgende Klasse Aufgabe43, die einen Text als
// Instanzvariable enthält. Die Klasse beinhaltet Methoden, die den
// Text ändern bzw. auf der Konsole ausgeben können.

// Welche Ausgabe liefert folgendes Programm? Lösen Sie die Aufgabe
// ohne den Compiler zu verwenden.

/*

Aufgabe43 a = new Aufgabe43();  // a contains "A"  (construktor)
Aufgabe43 b = new Aufgabe43();  // b contains "A"  (construktor)
b.changeString("B");                // b contains "B"  (nur seine Instanzvariable wird um refferenziert)
a.printString();                    // System.out.println("A");
b.printString();                    // System.out.println("B");
a = b;                              // Refferenzieren jetzt beide auf das Objekt von b
a.printString();                    // System.out.println("B"); (a ist b bzw b ist a)
b.printString();                    // System.out.println("B"); (a ist b bzw b ist a)
b.changeString("C");                // b contains "C" und a contains "C"
a.printString();                    // System.out.println("C"); (a ist b bzw b ist a)
b.printString();                    // System.out.println("C"); (a ist b bzw b ist a)


Print:
A 
B 
B 
B 
C 
C

*/


public class Aufgabe43 {
    Aufgabe43() {
        text = "A";
    }
    public void changeString(String s) {
        text = s;
    }
    public void printString() {
        System.out.println(text);
    }
    private String text;
}

