import java.util.Scanner;

public class SumOddIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }

        int nSquared = N * N;

        System.out.println("Sum of odd integers 1 to " + N + " = " + sum);
        System.out.println(N + " squared = " + nSquared);
    }
}