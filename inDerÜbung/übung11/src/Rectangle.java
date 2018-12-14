// 2. Vervollständigen Sie die Klasse Rectangle so, dass sie ebenfalls
// das Interface GeometricObject implementiert.

class Rectangle implements GeometricObject {
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double computeArea() {
        double area = length * width;
        return area;
    }

    public double computeCircumference() {
        double circ = (2 * length) + (2 * width);
        return circ;
    }

    protected double length;
    protected double width;
    // 4. Könnten die Instanzvariablen length und width auch als private
    // deklariert werden?
}
