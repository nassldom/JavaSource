import java.util.Scanner;

public class FloatFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        long n = in.nextLong();

        double fact = 1.0;
        for (long i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! ≈ " + fact);

        // N! / (N-1)!
        if (n > 1) {
            double factNminus1 = 1.0;
            for (long i = 1; i <= n - 1; i++) {
                factNminus1 *= i;
            }
            double ratio = fact / factNminus1;
            System.out.println("N! / (N-1)! ≈ " + ratio + " (should be " + n + ")");
        }
    }
}