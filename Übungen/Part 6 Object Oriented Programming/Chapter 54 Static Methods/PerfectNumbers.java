import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter upper limit: ");
        int limit = scan.nextInt();

        for (int n = 2; n < limit; n++) {
            if (isPerfect(n)) {
                System.out.println(n + " is perfect");
            }
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int d = 1; d < n; d++) {
            if (n % d == 0) {
                sum += d;
            }
        }

        return sum == n;
    }
}