
/*
  Betrachten Sie einen Auszug aus der Klasse Circle

  1. Vervollständigen Sie den Konstruktor sowie die set- und get-
  Methoden der Klasse Circle.  

  2. Vervollständigen Sie die Methoden getArea und getCircumference, die
  den Flächeninhalt bzw. den Umfang des Kreises zurückgeben.
  
  3. Vervollständigen Sie die Methode distance, die den Abstand d zu
  einem anderen Kreis berechnet (siehe Abbildung). Sollten sich die
  Kreise überschneiden, soll eine negative Zahl zurückgegeben werden.

*/

class Circle {
    public Circle(Point2D middle, double rad) {
        this.center = middle;
        this.radius = rad;
    }

    public void setCenter(Point2D middle) {
        this.center = middle;
    }

    public Point2D getCenter() {
        return this.center;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double getArea() {
        // A = pi * r^2
        return Math.pow(this.radius, 2) * Math.PI;
    }
    
    public double getCircumference() {
        // C = 2 * pi * r
        return (2.0 * this.radius * Math.PI);
    }

    // Calculate the distance between the middles of the two points
    // and then subtract the value of both radius(es) (radii?)..
    public double distance(Circle c) {
        return ((center.distance(c.getCenter())) - c.getRadius() - this.radius);
    }
    
    private Point2D center;
    private double radius;
}
