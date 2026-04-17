public class PineTree {
    public static void main(String[] args) {
        int height = 8; // number of rows in tree top
        int trunkHeight = 3;
        int trunkWidth = 3;

        int maxStars = 2 * height - 1; // bottom width of tree

        // tree top
        for (int row = 1; row <= height; row++) {
            int stars = 2 * row - 1;
            int spaces = (maxStars - stars) / 2;

            for (int s = 0; s < spaces; s++) System.out.print(" ");
            for (int st = 0; st < stars; st++) System.out.print("*");
            System.out.println();
        }

        // trunk
        int trunkSpaces = (maxStars - trunkWidth) / 2;
        for (int r = 0; r < trunkHeight; r++) {
            for (int s = 0; s < trunkSpaces; s++) System.out.print(" ");
            for (int st = 0; st < trunkWidth; st++) System.out.print("*");
            System.out.println();
        }
    }
}