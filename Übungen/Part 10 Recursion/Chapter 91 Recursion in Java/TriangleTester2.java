import java.util.Scanner;

public class TriangleTester2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("N must be positive.");
        } else {
            System.out.println("Triangle(" + n + ") = " + triangle(n));
        }
    }

    public static int triangle(int n) {
        if (n == 1)
            return 1;
        else
            return n + triangle(n - 1);
    }
}