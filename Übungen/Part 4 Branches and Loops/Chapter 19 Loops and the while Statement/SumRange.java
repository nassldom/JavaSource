import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low  = in.nextInt();
        System.out.print("Enter high: ");
        int high = in.nextInt();

        // Summe 1..n mit Formel
        int sum(int n) {
            return n * (n + 1) / 2;
        }

        int sumHigh   = sum(high);
        int sumLowMin = sum(low - 1);   // Summe 1 bis (low-1)

        int total = sumHigh - sumLowMin;

        System.out.println("Sum = " + total);
    }
}