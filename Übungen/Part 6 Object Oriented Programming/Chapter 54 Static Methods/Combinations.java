import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        long N = scan.nextLong();
        System.out.print("Enter R: ");
        long R = scan.nextLong();

        if (R < 0 || R > N) {
            System.out.println("Error: R must be between 0 and N.");
            return;
        }

        long nFact  = FactorialFlag.factorial(N);
        long rFact  = FactorialFlag.factorial(R);
        long nrFact = FactorialFlag.factorial(N - R);

        if (nFact < 0 || rFact < 0 || nrFact < 0) {
            System.out.println("Error: factorial out of range (N must be ≤ 20).");
        } else {
            long nCr = nFact / (rFact * nrFact);
            System.out.println("C(" + N + ", " + R + ") = " + nCr);
        }
    }
}