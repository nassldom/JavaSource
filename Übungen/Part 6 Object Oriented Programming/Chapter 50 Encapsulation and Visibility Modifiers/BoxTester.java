public class BoxTester {
    public static void main(String[] args) {
        Box original = new Box(2.0, 4.0, 6.0);
        Box helper   = new Box(1.0); // wird nur benutzt, um Methoden aufzurufen

        Box bigger  = helper.biggerBox(original);
        Box smaller = helper.smallerBox(original);

        System.out.println("Original: " +
                original.width() + " × " +
                original.height() + " × " +
                original.length());

        System.out.println("Bigger: " +
                bigger.width() + " × " +
                bigger.height() + " × " +
                bigger.length());

        System.out.println("Smaller: " +
                smaller.width() + " × " +
                smaller.height() + " × " +
                smaller.length());

        System.out.println("Smaller nests in Original? " +
                smaller.nests(original));

        System.out.println("Original nests in Smaller? " +
                original.nests(smaller));
    }
}