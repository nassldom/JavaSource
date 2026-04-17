import java.util.Scanner;

public class CombinationTester {
    public static long comb(int m, int n) {
        if (m < n) return 0;
        if (n < 0) return 0;
        if (n == 0) return 1;

        return comb(m - 1, n - 1) + comb(m - 1, n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("M: ");
        int m = scan.nextInt();
        System.out.print("N: ");
        int n = scan.nextInt();

        System.out.println("Comb(" + m + ", " + n + ") = " + comb(m, n));
    }
}