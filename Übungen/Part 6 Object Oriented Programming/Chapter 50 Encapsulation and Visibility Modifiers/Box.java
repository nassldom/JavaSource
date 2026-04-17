public class Box {

    // Übung 1: private Felder, keine Setter → immutable
    private final double width;
    private final double height;
    private final double length;

    // Konstruktor: allgemeines Rechteck
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Konstruktor: Würfel (alle Seiten gleich)
    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    // Übung 3: Copy-Konstruktor
    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    // Übung 1: Volumen
    public double volume() {
        return width * height * length;
    }

    // Übung 2: Fläche mit privaten Hilfsmethoden
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    // Übung 2: private helper methods (nicht von außen aufrufbar)
    private double faceArea() { // Front: width × height
        return width * height;
    }

    private double topArea() {  // Deckel: width × length
        return width * length;
    }

    private double sideArea() { // Seite: height × length
        return height * length;
    }

    // Übung 3: Accessor-Methoden (Getter) – Objekt bleibt trotzdem immutable
    public double width()  { return width; }
    public double height() { return height; }
    public double length() { return length; }

    // Übung 4: 25% größere Box
    // (instanzmethode, nimmt eine gegebene Box und erzeugt eine neue)
    public Box biggerBox(Box oldBox) {
        return new Box(
            1.25 * oldBox.width(),
            1.25 * oldBox.height(),
            1.25 * oldBox.length()
        );
    }

    // Übung 4: 25% kleinere Box
    public Box smallerBox(Box oldBox) {
        return new Box(
            0.75 * oldBox.width(),
            0.75 * oldBox.height(),
            0.75 * oldBox.length()
        );
    }

    // Übung 5: Prüfen, ob this komplett in outsideBox passt (ohne Rotation)
    public boolean nests(Box outsideBox) {
        return this.width  < outsideBox.width()
            && this.height < outsideBox.height()
            && this.length < outsideBox.length();
    }
}