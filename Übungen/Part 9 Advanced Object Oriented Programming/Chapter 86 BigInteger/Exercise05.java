import java.math.BigInteger;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N  : ");
        int N = scan.nextInt();

        BigInteger fibN = fibonacci(N);
        System.out.println("Fibonacci = " + fibN);
    }

    public static BigInteger fibonacci(int n) {
        if (n <= 0) return BigInteger.ZERO;
        if (n == 1 || n == 2) return BigInteger.ONE;

        BigInteger prev2 = BigInteger.ONE; // Fib(1)
        BigInteger prev1 = BigInteger.ONE; // Fib(2)
        BigInteger current = BigInteger.ZERO;

        for (int i = 3; i <= n; i++) {
            current = prev2.add(prev1);
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}