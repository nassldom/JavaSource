import java.util.Scanner;

public class TriangleSquareNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter upper limit: ");
        int limit = scan.nextInt();

        int triangle = 0;

        for (int n = 1; triangle <= limit; n++) {
            triangle = triangle + n;

            int root = (int)Math.sqrt(triangle);
            if (root * root == triangle) {
                System.out.println(triangle + " is both triangular and square.");
            }
        }
    }
}