import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N  : ");
        long N = Long.parseLong(scan.nextLine());   // löst NumberFormatException bei "rats"

        long seriesSum = 0;
        for (long i = 1; i <= N; i++) {
            seriesSum += i;
        }

        long formulaSum = N * (N + 1) / 2;

        System.out.println("Series  Sum: " + seriesSum);
        System.out.println("Formula Sum: " + formulaSum);
    }
}