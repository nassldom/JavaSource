import java.util.Scanner;

public class OdiousEvil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n;

        System.out.print("Enter a nonnegative integer (negative to quit): ");
        n = scan.nextLong();

        while (n >= 0) {
            if (isOdious(n))
                System.out.println(n + " is odious");
            else
                System.out.println(n + " is evil");

            System.out.print("Enter a nonnegative integer (negative to quit): ");
            n = scan.nextLong();
        }
    }

    public static boolean isOdious(long n) {
        int ones = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                ones++;
            }
            n = n / 2;
        }

        return ones % 2 == 1;
    }
}