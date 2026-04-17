public class ConeTester {
    public static void main(String[] args) {
        Cone cone = new Cone(3.0, 4.0);

        System.out.println("Radius: " + cone.getRadius());
        System.out.println("Height: " + cone.getHeight());
        System.out.println("Volume: " + cone.volume());
        System.out.println("Surface Area: " + cone.surfaceArea());
        System.out.println("Slant Height: " + cone.slantHeight());
        System.out.println("Angle (radians): " + cone.angle());
        System.out.println("Angle (degrees): " + Math.toDegrees(cone.angle()));
    }
}