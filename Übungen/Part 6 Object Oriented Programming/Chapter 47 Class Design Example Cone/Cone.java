public class Cone {
    private double radius;
    private double height;

    public Cone(double r, double h) {
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
        return Math.PI * radius * radius * height / 3.0;
    }

    public double surfaceArea() {
        double slant = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * radius + Math.PI * radius * slant;
    }

    public double slantHeight() {
        return Math.sqrt(radius * radius + height * height);
    }

    public double angle() {
        return Math.atan(radius / height);
    }
}