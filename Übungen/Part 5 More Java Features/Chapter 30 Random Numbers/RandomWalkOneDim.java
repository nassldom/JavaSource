import java.util.Random;
import java.util.Scanner;

public class RandomWalkOneDim {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("How many iterations? ");
        int iters = scan.nextInt();
        double X = 0.0;

        for (int i = 0; i < iters; i++) {
            X += (2.0 * rand.nextDouble() - 1.0); // -1.0 .. 1.0
        }

        System.out.println("After " + iters + " moves X is now at " + X);

        // Optional: run until |X| reaches a threshold
        X = 0.0;
        System.out.print("Distance threshold? ");
        double threshold = scan.nextDouble();
        int count = 0;

        while (Math.abs(X) < threshold) {
            X += (2.0 * rand.nextDouble() - 1.0);
            count++;
        }

        System.out.println("Reached distance " + X + " in " + count + " steps.");
    }
}