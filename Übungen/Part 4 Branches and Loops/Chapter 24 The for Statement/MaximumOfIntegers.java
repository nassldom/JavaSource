import java.util.Scanner;

public class MaximumOfIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int max;

        System.out.println("Enter 5 integers:");
        max = scan.nextInt(); // initialize max with first input
        sum = max;

        for (int i = 1; i < 5; i++) {
            int x = scan.nextInt();
            sum += x;
            if (x > max) {
                max = x;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
    }
}