/*

In dieser Aufgabe soll eine Klasse Point2D erstellt werden, die
zwei-dimensionale Punkte darstellt, wobei die x- und y-Koordinaten
jeweils als double Variablen gespei- chert werden. Nutzen Sie die Java
API Dokumentation um sich ggf. mit den Methoden der Klasse
java.lang.Math vertraut zu machen, welche Sie zum Lösen dieser Aufgabe
benötigen.

1. Schreiben Sie die Klasse Point2D mit einem Konstruktor, der es
erlaubt die Ko- ordinaten zu setzen. Die Klasse soll zusätzlich über
Methoden zum Auslesen und Setzen der Koordinaten verfügen.

2. Erweitern Sie die Klasse Point2D um eine Methode zum Berechnen des
Euklidi- schen Abstands zu einem anderen Objekt der Klasse Point2D mit
dem folgenden Prototyp: double distance(Point2D pt);

3. Schreiben Sie ein Programm, das die erstellte Klasse
verwendet. Dieses Programm soll den Benutzer zur Eingabe zweier Punkte
auffordern. Anschließend sollen die Koordinaten der beiden Punkte
sowie deren Euklidischer Abstand auf dem Bild- schirm ausgegeben
werden.

*/


//   BufferedReader br = new BufferedReader(new InputStreamReader(Sytem.in));

public class Point2D {
    public Point2D(double coord_1, double coord_2) {
        x = coord_1;
        y = coord_2;
    }
    
    public void setX(double inX) {
        this.x = inX;
    }

    public void setY(double inY) {
        this.y = inY;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point2D p2) {
        return Math.sqrt((this.x - p2.getX()) * (this.x - p2.getX())
                         + (this.y - p2.getY()) * (this.y - p2.getY()));
    }
    
    private double x;
    private double y;
}
