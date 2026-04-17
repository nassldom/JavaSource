import java.util.Scanner;

public class CubicSumTwoSquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter upper limit --> ");
        int limit = scan.nextInt();

        for (int N = 1; N <= limit; N++) {
            // Check if N is a perfect cube
            int root = (int) Math.round(Math.cbrt(N));
            if (root * root * root != N) {
                continue;
            }

            int ways = 0;
            for (int a = 0; a * a <= N; a++) {
                for (int b = a; b * b <= N; b++) {
                    if (a * a + b * b == N) {
                        ways++;
                    }
                }
            }

            if (ways >= 2) {
                System.out.println(N + " is a cube: " + root + "^3");
                System.out.println(N + " is the sum of 2 squares");
                for (int a = 0; a * a <= N; a++) {
                    for (int b = a; b * b <= N; b++) {
                        if (a * a + b * b == N) {
                            System.out.println(N + " == " + a + "*" + a + " + " + b + "*" + b);
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}