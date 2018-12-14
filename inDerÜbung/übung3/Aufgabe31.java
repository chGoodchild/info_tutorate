// Schreiben Sie ein Java-Programm, das den Benutzer auffordert, einen
// Text auf der Konsole einzugeben. Modifizieren Sie den Text so, dass
// er nur aus Großbuchstaben besteht und geben Sie den veränderten
// Text wieder auf der Konsole aus.

// Erweitern Sie das Java-Programm so, dass es den Benutzer zusätzlich
// zur Eingabe eines Dateinamens auffordert. Schreiben Sie den
// eingegebenen Text nun in diese Datei.

import java.io.*;
// Eigendlich redundant
// import java.io.InputStreamReader;


public class Aufgabe31 {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // Equivalent to the above comment:
        // BufferedReader br = new BufferedReader(InputStreamReader(System.in));
        System.out.println("Geben Sie einen Text ein: ");
        String eingabe = br.readLine();
        eingabe = eingabe.toUpperCase();

        System.out.println(eingabe);

        System.out.println("Geben Sie den Dateinamen ein: ");
        String datei = br.readLine();

        FileOutputStream fos = new FileOutputStream(datei);
        PrintStream target = new PrintStream(fos);
        target.print(eingabe + "\n");
        
    }
}
