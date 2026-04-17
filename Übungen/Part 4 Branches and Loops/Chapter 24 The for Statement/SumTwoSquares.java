import java.util.Scanner;

public class SumTwoSquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scan.nextInt();

        boolean found = false;
        for (int a = 0; a * a <= N; a++) {
            for (int b = 0; b * b <= N; b++) {
                if (a * a + b * b == N) {
                    System.out.println(N + " = " + a + "^2 + " + b + "^2");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(N + " cannot be written as sum of two squares.");
        }
    }
}