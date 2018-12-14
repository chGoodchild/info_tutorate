// Auf der Vorlesungshomepage können Sie eine Vorlage für eine
// einfache Homepage herunterladen (template.html).

// 1. Schreiben Sie ein Java-Programm, das den Benutzer dazu
// auffordert seinen Namen und seine Adresse einzugeben. Hierbei
// sollen die Angaben wie Name, Straße, Hausnummer, PLZ und Ort
// einzeln nacheinander eingegeben werden. Geben Sie die Daten zur
// Kontrolle wieder auf der Konsole aus.

// 2. Erweitern Sie das Java-Programm so, dass die Datei template.html
// eingelesen wird. Fügen Sie anschließend die in Teilaufgabe 1
// eingelesenen Daten in die Datei ein. Lesen Sie dazu alle neun
// Zeilen der Datei ein und ersetzen sie die Textbausteine NAME ,
// STRASSE , HAUSNUMMER , PLZ und WOHNORT in den entsprechenden
// Zeilen. Verwenden Sie hierfür die von der Klasse String zur
// Verfügung gestellten Methoden. Schreiben Sie Ihre persönliche
// Homepage anschließend in eine Datei index.html.

import java.io.*;

public class Aufgabe32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie Ihren Namen ein: ");
        String name = br.readLine();
        System.out.println("Geben Sie Ihren Strasse ein: ");
        String strasse = br.readLine();
        System.out.println("Geben Sie Ihren Hausnummer ein: ");
        String nummer = br.readLine();
        System.out.println("Geben Sie Ihren PLZ ein: ");
        String plz = br.readLine();
        System.out.println("Geben Sie Ihren Wohnort ein: ");
        String ort = br.readLine();

        // Output
        System.out.println("Name:" + name);
        System.out.println("Strasse:" + strasse);
        System.out.println("Hausnummer:" + nummer);
        System.out.println("PLZ:" + plz);
        System.out.println("Ort:" + ort);

        File template = new File("template.html");
        FileInputStream fs = new FileInputStream(template);
        InputStreamReader isr = new InputStreamReader(fs);
        BufferedReader fileIn = new BufferedReader(isr);

        //BufferedReader fileIn = new BufferedReader(new InputStreamReader(new FileInputStream(new File("template.html"))));

        String s = fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n"
            + fileIn.readLine() + "\n";

        System.out.println("String Adresse = " + s);

        s = s.replace("_NAME_", name);
        s = s.replace("_STRASSE_", strasse);
        s = s.replace("_HAUSNUMMER_", nummer);
        s = s.replace("_PLZ_", plz);
        s = s.replace("_WOHNORT_", ort);

        System.out.println("String Adresse = " + s);

        PrintStream out = new PrintStream(new FileOutputStream("index.html"));
        out.println(s);
    }
}
