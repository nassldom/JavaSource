import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N (>=0): ");
        long n = in.nextLong();
        System.out.print("Enter R (0..N): ");
        long r = in.nextLong();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Error: N and R must be >= 0 and R <= N.");
            return;
        }

        long result = 1;
        // N! / (N-R)! = N * (N-1) * ... * (N-R+1)
        for (long k = 0; k < r; k++) {
            result *= (n - k);
        }

        System.out.println("Permutations (N! / (N-R)!): " + result);
    }
}