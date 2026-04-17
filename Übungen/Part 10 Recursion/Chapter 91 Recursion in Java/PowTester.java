import java.util.Scanner;

public class PowTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("N must be nonnegative.");
        } else {
            System.out.println("pow(" + n + ") = " + pow(n));
        }
    }

    public static int pow(int n) {
        if (n == 0)
            return 1;
        else
            return 2 * pow(n - 1);
    }
}