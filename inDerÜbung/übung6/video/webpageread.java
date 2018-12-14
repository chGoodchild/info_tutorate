/*
Albert-Ludwigs-Universität Freiburg
    Prof. Dr. Wolfram Burgard
    Institut für Informatik
    Alexander Schiotka
    Einführung in die Informatik
    Andreas Kuhner
    Sommersemester 2016
    Thomas Darr
    Übungsblatt 6
    Abgabe bis Montag, 06.06.2016, 23:59 Uhr
    Hinweis:
    Aufgaben immer per E-Mail (eine E-Mail pro Blatt und Gruppe) an den zuständigen Tutor
        schicken (bei Programmieraufgaben Java Quellcode und evtl. benötigte Datendateien).
        Aufgabe 6.1
        Auf der letzten Seite des Übungsblattes finden Sie einige Konventionen für die Formatie-
        rung von Java-Code. Betrachten Sie folgendes Programm und korrigieren Sie die Stellen,
        die nicht mit den Konventionen übereinstimmen.
*/


import java.net.*;
import java.io.*;
class webpageread {
    public static void main(String[] arg) throws Exception{
        URL u = new URL("http://www.informatik.uni-freiburg.de/");
        InputStream ins =  u.openStream();
        InputStreamReader isr = new InputStreamReader(ins);
        BufferedReader WebPageBuffer = new BufferedReader(isr);

        
        int NoOfLines =10;
        if (NoOfLines==0){ return; }
        if (NoOfLines == 1){
            System.out.println("Read " + NoOfLines + " line of " + u );
        } 
        else{
            System.out.println("Read " + NoOfLines + " lines of " + u );
        }
        for (int i=1; i<=NoOfLines ; i++)
        {
            System.out.println("line #" +i+ ": \""+ WebPageBuffer.readLine() +"\"");
        }
    }
}
