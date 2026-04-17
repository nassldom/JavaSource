import java.util.Scanner;

public class UnluckyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n;

        System.out.print("Enter a nonnegative integer (negative to quit): ");
        n = scan.nextLong();

        while (n >= 0) {
            if (isUnlucky(n))
                System.out.println(n + " is unlucky");
            else
                System.out.println(n + " is safe");

            System.out.print("Enter a nonnegative integer (negative to quit): ");
            n = scan.nextLong();
        }
    }

    public static boolean isUnlucky(long n) {
        boolean lastWas1 = false;

        if (n == 0) return false;

        while (n > 0) {
            long digit = n % 10;
            n = n / 10;

            if (digit == 3 && lastWas1) {
                return true;
            }

            lastWas1 = (digit == 1);
        }

        return false;
    }
}