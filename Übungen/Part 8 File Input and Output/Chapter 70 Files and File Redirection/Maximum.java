import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();
        int sum = value;
        int max = value;

        for (int i = 1; i < 5; i++) {
            value = scan.nextInt();
            sum = sum + value;

            if (value > max) {
                max = value;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);
    }
}