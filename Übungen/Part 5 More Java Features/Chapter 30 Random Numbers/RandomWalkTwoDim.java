import java.util.Random;
import java.util.Scanner;

public class RandomWalkTwoDim {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("How many iterations? ");
        int iters = scan.nextInt();
        double X = 0.0, Y = 0.0;

        for (int i = 0; i < iters; i++) {
            X += (2.0 * rand.nextDouble() - 1.0);
            Y += (2.0 * rand.nextDouble() - 1.0);
        }

        double dist = Math.sqrt(X*X + Y*Y);
        System.out.printf("After %d moves ant is at (%.4f, %.4f)%n", iters, X, Y);
        System.out.println("Distance from origin = " + dist);
    }
}