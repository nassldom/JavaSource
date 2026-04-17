import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N  : ");
        long N = scan.nextLong();

        long sumOdds = 0;
        for (long k = 1; k <= N; k++) {
            long odd = 2 * k - 1;
            sumOdds += odd;
        }

        long nSquared = N * N;

        System.out.println("Sum of first N odds: " + sumOdds);
        System.out.println("N^2                : " + nSquared);
    }
}