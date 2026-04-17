import java.util.Scanner;

public class PerrinTester {
    public static int perrin(int n) {
        if (n == 0) return 3;
        if (n == 1) return 0;
        if (n == 2) return 2;

        return perrin(n - 2) + perrin(n - 3);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("N must be nonnegative.");
        } else {
            System.out.println("perrin(" + n + ") = " + perrin(n));
        }
    }
}