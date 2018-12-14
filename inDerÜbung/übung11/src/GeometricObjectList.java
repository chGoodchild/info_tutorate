import java.util.*;

// 5. Implementieren Sie die Klasse GeometricObjectList, die mehrere
// geometri- sche Objekte verwalten soll. Diese Klasse soll als
// Instanzvariable eine ArrayList ArrayList<GeometricObject> besitzen
// und folgende Methoden zur Verfü- gung stellen:
class GeometricObjectList {
    GeometricObjectList() {
        liste = new ArrayList<GeometricObject>();
    }
	
    // (a) void add(GeometricObject o) fügt ein Objekt in die ArrayList
    // ein.
    public void add(GeometricObject o) {
        liste.add(o);
    }
	
    // (b) double areaSum() berechnet die Summe des Flächeninhalts aller
    // Objekte in der ArrayList.
    public double areaSum() {
        double sum = 0;
        for (int i = 0; i < liste.size(); i++) {
            sum += liste.get(i).computeArea(); // In square wird der
                                               // Methodenaufruf
                                               // einfach
                                               // weitergereicht wobei
                                               // width = length
        }
        return sum; // Die gesammtflaeche
    }
	
    // (c) double circumferenceSum() berechnet die Summe des Umfangs aller
    // Objekte in der ArrayList.
    public double circumferenceSum() {
        double sum = 0;
        for (int i = 0; i < liste.size(); i++) {
            sum += liste.get(i).computeCircumference();
            // In square wird der
            // Methodenaufruf
            // einfach
            // weitergereicht wobei
            // width = length
        }
        return sum;
    }
	
    // Die Liste die wir verwalten.
   ArrayList<GeometricObject> liste;
}

