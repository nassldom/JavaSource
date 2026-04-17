import java.util.Scanner;

public class PentagonalTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("N must be positive.");
        } else {
            System.out.println("P(" + n + ") = " + pentagonal(n));
        }
    }

    public static int pentagonal(int n) {
        if (n == 1)
            return 1;
        else
            return pentagonal(n - 1) + 3 * n - 2;
    }
}