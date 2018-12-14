// 3. Implementieren Sie eine Klasse Square, die von Rectangle
// abgeleitet ist. Die Seitenlänge des Quadrates soll im Konstruktor
// gesetzt werden.

class Square extends Rectangle {
    public Square(double length) {
        super(length, length);
    }
}
