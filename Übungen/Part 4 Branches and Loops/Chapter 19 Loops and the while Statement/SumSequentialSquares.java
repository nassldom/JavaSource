import java.util.Scanner;

public class SumSequentialSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = in.nextInt();

        // Schleife: Summe von 1² bis n²
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i * i;
        }

        // Formel: n*(n+1)*(2*n+1)/6
        int formulaSum = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);

        // Zusatz: Summe der Kubikzahlen
        int cubeSumLoop = 0;
        for (int i = 1; i <= n; i++) {
            cubeSumLoop += i * i * i;
        }

        int triangle = n * (n + 1) / 2;
        int cubeSumFormula = triangle * triangle;

        System.out.println("Loop Sum of Cubes = " + cubeSumLoop);
        System.out.println("Formula Sum of Cubes = " + cubeSumFormula);
    }
}