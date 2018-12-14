/*
  Albert-Ludwigs-Universität Freiburg Prof. Dr. Wolfram Burgard
    Institut für Informatik Alexander Schiotka Einführung in die
    Informatik Andreas Kuhner Sommersemester 2016 Thomas Darr
    Übungsblatt 6 Abgabe bis Montag, 06.06.2016, 23:59 Uhr Hinweis:
    Aufgaben immer per E-Mail (eine E-Mail pro Blatt und Gruppe) an
    den zuständigen Tutor schicken (bei Programmieraufgaben Java
    Quellcode und evtl. benötigte Datendateien).  Aufgabe 6.1 Auf der
    letzten Seite des Übungsblattes finden Sie einige Konventionen für
    die Formatie- rung von Java-Code. Betrachten Sie folgendes
    Programm und korrigieren Sie die Stellen, die nicht mit den
    Konventionen übereinstimmen.
*/



import java.net.*;
import java.io.*;
class Webpageread {
    public static void main(String[] arg) throws Exception {
        URL u = new URL("http://www.informatik.uni-freiburg.de/");
        InputStream ins =  u.openStream();
        InputStreamReader isr = new InputStreamReader(ins);
        BufferedReader webPageBuffer = new BufferedReader(isr);

        int noOfLines = 10;
        if (noOfLines == 0) {
            return;
        }
        
        if (noOfLines == 1) {
            System.out.println("Read " + noOfLines + " line of " + u);
        } else {
            System.out.println("Read " + noOfLines + " lines of " + u);
        }

        for (int i = 1; i <= noOfLines; i++) {
            System.out.println("line #" + i + ": \"" + webPageBuffer.readLine() + "\"");
        }
    }
}

