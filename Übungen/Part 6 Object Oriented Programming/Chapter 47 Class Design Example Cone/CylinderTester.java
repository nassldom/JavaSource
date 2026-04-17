public class CylinderTester {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(3.0, 5.0);

        System.out.println("Radius: " + cyl.getRadius());
        System.out.println("Height: " + cyl.getHeight());
        System.out.println("Volume: " + cyl.volume());
        System.out.println("Surface Area: " + cyl.surfaceArea());

        cyl.setRadius(4.0);
        cyl.setHeight(10.0);

        System.out.println();
        System.out.println("After changes:");
        System.out.println("Radius: " + cyl.getRadius());
        System.out.println("Height: " + cyl.getHeight());
        System.out.println("Volume: " + cyl.volume());
        System.out.println("Surface Area: " + cyl.surfaceArea());
    }
}