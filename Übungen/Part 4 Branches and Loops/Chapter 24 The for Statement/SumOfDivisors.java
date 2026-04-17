import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scan.nextInt();

        int sum = 0;
        for (int d = 1; d <= N / 2; d++) {
            if (N % d == 0) {
                sum += d;
            }
        }

        sum += N; // include N itself

        System.out.println("Sum of divisors of " + N + " = " + sum);

        if (sum == 2 * N) {
            System.out.println(N + " is a perfect number.");
        }
    }
}