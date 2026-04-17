import java.util.Scanner;

public class FactorialFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n;

        System.out.print("Enter n (negative to quit): ");
        n = scan.nextLong();

        while (n >= 0) {
            long f = factorial(n);

            if (f < 0) {
                System.out.println("Error: factorial undefined for " + n);
            } else {
                System.out.println(n + "! = " + f);
            }

            System.out.print("Enter n (negative to quit): ");
            n = scan.nextLong();
        }
    }

    public static long factorial(long n) {
        if (n < 0 || n > 20) {
            return -1;
        }

        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}