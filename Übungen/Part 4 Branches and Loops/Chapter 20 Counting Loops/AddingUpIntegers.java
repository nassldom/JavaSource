import java.util.Scanner;

public class AddingUpIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many integers will be added: ");
        int n = in.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            int num = in.nextInt();
            sum += num;
        }

        System.out.println("\nThe sum is " + sum);
    }
}