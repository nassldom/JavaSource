import java.util.Scanner;

public class TriangleRecursiveTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("N must be nonnegative.");
        } else {
            System.out.println("T(" + n + ") = " + triangle(n));
        }
    }

    public static int triangle(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n % 2 == 0) {
            int half = n / 2;
            return 2 * triangle(half) + half * half;
        } else {
            return triangle(n - 1) + n;
        }
    }
}