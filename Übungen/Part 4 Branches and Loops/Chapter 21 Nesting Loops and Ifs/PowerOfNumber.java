import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter X");
        double x = in.nextDouble();
        System.out.println("Enter N");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("N must be a positive integer.");
            return;
        }

        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result *= x;
        }

        System.out.println(x + " raised to the power " + n + " is:  " + result);
    }
}