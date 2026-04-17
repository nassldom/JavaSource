public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}