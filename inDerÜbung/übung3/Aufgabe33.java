// Die Webseite http://checkip.dyndns.com zeigt die zugreifende
// IP-Adresse an. Schreiben Sie ein Java-Programm, das die aktuelle
// IP-Adresse Ihres Computers anzeigt. Sie sollten dazu in einem
// ersten Schritt die erste Zeile der Seite auslesen und sich
// anschliessend überlegen, mit welchen Methoden zur
// Zeichenkettenmanipulation die IP-Adresse extrahiert werden
// kann.

// Hinweis: Die Methode indexOf der Klasse String ermöglicht die Suche
// von Textelementen.

import java.net.*;
import java.io.*;

public class Aufgabe33 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://checkip.dyndns.com");
        InputStream inpStream = url.openStream();
        InputStreamReader webInReader = new InputStreamReader(inpStream);
        BufferedReader page = new BufferedReader(webInReader);

        String str = page.readLine();

        // What's inside?
        // System.out.println(str);

        // str = <html><head><title>Current IP
        // Check</title></head><body>Current IP Address:
        // 141.70.24.95</body></html>

        // str = str.substring(str.indexOf("Address: "), str.indexOf("</body>"));
        str = str.substring(76, str.indexOf("</body>"));
        System.out.println("Deine Adresse: " + str);
    }
}
