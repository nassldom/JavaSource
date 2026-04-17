import java.util.Scanner;

public class HailstoneNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        long n = scan.nextLong();

        if (n <= 0) {
            System.out.println("N must be positive.");
            return;
        }

        long current = n;
        int length = 1;
        long max = current;

        System.out.print(current);

        while (current != 1) {
            if (current % 2 == 0) {
                current = current / 2;
            } else {
                current = 3 * current + 1;
            }

            System.out.print(" " + current);
            length++;
            if (current > max) {
                max = current;
            }
        }

        System.out.println();
        System.out.println("Length of sequence: " + length);
        System.out.println("Maximum value: " + max);
    }
}