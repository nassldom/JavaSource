import java.util.Scanner;

public class LogTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("N must be positive.");
        } else {
            System.out.println("log2(" + n + ") = " + log2(n));
        }
    }

    public static int log2(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + log2(n / 2);
    }
}