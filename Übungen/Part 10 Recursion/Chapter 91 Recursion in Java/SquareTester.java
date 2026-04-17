import java.util.Scanner;

public class SquareTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("N must be positive.");
        } else {
            System.out.println("square(" + n + ") = " + square(n));
        }
    }

    public static int square(int n) {
        if (n == 1)
            return 1;
        else
            return square(n - 1) + 2 * n - 1;
    }
}