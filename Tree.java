public class Tree {

    // instance variables
    private double x, y, z;
    private Cone branches;
    private Cylinder trunk;

    // constructor (Reihenfolge wie im Buch!)
    // trRad, trHeight, brRad, brHeight, x, y, z
    public Tree(double trRad, double trHeight,
                double brRad, double brHeight,
                double x, double y, double z) {

        trunk    = new Cylinder(trRad, trHeight);
        branches = new Cone(brRad, brHeight);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // methods
    public String toString() {
        double totalHeight = branches.getHeight() + trunk.getHeight();
        double width       = branches.getRadius();
        return "Tree: Height: " + totalHeight +
               ", width: " + width +
               ", area: " + area() +
               ", volume: " + volume();
    }

    // more methods
    public double volume() {
        // sum of trunk and branches volume
        return trunk.volume() + branches.volume();
    }

    public double area() {
        // sum of areas minus twice the area of the trunk's circular top
        double total  = trunk.area() + branches.area();
        double rad    = branches.getRadius();
        double circle = Math.PI * rad * rad;
        return total - 2 * circle;
    }

    public void grow(double rate) {
        // increase all dimensions by rate
        double bHeight = branches.getHeight();
        branches.setHeight(bHeight * (1.0 + rate));

        double bRadius = branches.getRadius();
        branches.setRadius(bRadius * (1.0 + rate));

        double tHeight = trunk.getHeight();
        trunk.setHeight(tHeight * (1.0 + rate));

        double tRadius = trunk.getRadius();
        trunk.setRadius(tRadius * (1.0 + rate));
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public double getZ() { return z; }

    public Cone getBranches() { return branches; }

    public Cylinder getTrunk() { return trunk; }
}
