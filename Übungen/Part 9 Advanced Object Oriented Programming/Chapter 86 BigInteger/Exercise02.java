import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("M (start): ");
        long M = scan.nextLong();
        System.out.print("N (end)  : ");
        long N = scan.nextLong();

        // sicherstellen, dass M <= N
        if (M > N) {
            long tmp = M; M = N; N = tmp;
        }

        long seriesSum = 0;
        for (long i = M; i <= N; i++) {
            seriesSum += i;
        }

        long sum1toN   = N * (N + 1) / 2;
        long sum1toM_1 = (M - 1) * M / 2;
        long formulaSum = sum1toN - sum1toM_1;

        System.out.println("Series  Sum: " + seriesSum);
        System.out.println("Formula Sum: " + formulaSum);
    }
}