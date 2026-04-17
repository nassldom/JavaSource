import java.util.Scanner;

public class SumSequentialIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = in.nextInt();

        // Berechnung mit Schleife
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        // Berechnung mit Formel: n*(n+1)/2
        int formulaSum = n * (n + 1) / 2;

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);
    }
}