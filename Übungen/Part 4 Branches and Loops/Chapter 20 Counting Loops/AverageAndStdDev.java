import java.util.Scanner;

public class AverageAndStdDev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = in.nextInt();

        double sum = 0.0;
        double sumSquares = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            double x = in.nextDouble();
            sum += x;
            sumSquares += x * x;
        }

        double avg = sum / n;
        double avgSquare = sumSquares / n;
        double variance = avgSquare - avg * avg;
        double stdDev = Math.sqrt(variance);

        System.out.printf("Average: %.4f%n", avg);
        System.out.printf("Standard deviation: %.8f%n", stdDev);
    }
}