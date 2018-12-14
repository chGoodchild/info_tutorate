/*

Schreiben Sie ein Programm, das die erstellte Klasse verwendet. Dieses
Programm soll den Benutzer zur Eingabe zweier Punkte
auffordern. Anschließend sollen die Koordinaten der beiden Punkte
sowie deren Euklidischer Abstand auf dem Bild- schirm ausgegeben
werden.

 */

import java.io.*;

public class usePoints {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Folien Seite 211
        // http://docs.oracle.com/javase/7/docs/api/java/lang/Double.html


        System.out.println("input x value of p1:");
        double x1 = Double.parseDouble(br.readLine());
        System.out.println("input y value of p1:");
        double y1 = Double.parseDouble(br.readLine());
        Point2D p1 = new Point2D(x1, y1);

        System.out.println("input x value of p2:");
        double x2 = Double.parseDouble(br.readLine());
        System.out.println("input y value of p2:");
        double y2 = Double.parseDouble(br.readLine());
        Point2D p2 = new Point2D(x2, y2);
        
        System.out.println("Distanz: " + p1.distance(p2));
    }
}
