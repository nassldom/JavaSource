public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Oberfläche des Zylinders
    public double area() {
        // 2πr² + 2πrh
        return 2.0 * Math.PI * radius * radius
             + 2.0 * Math.PI * radius * height;
    }

    // Volumen des Zylinders
    public double volume() {
        // πr²h
        return Math.PI * radius * radius * height;
    }
}
