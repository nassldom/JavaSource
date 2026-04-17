import java.util.Scanner;

public class TwoSquaresTwoWays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N --> ");
        int N = scan.nextInt();

        int ways = 0;
        for (int a = 0; a * a <= N; a++) {
            for (int b = a; b * b <= N; b++) { // b >= a to avoid duplicates
                if (a * a + b * b == N) {
                    System.out.println(N + " == " + a + "*" + a + " + " + b + "*" + b);
                    ways++;
                }
            }
        }

        if (ways >= 2) {
            System.out.println(N + " is the sum of two squares in at least two different ways.");
        } else if (ways == 1) {
            System.out.println(N + " is the sum of two squares in exactly one way.");
        } else {
            System.out.println(N + " is not a sum of two squares.");
        }
    }
}