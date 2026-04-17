import java.util.Scanner;

public class AddUpNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer (enter 0 to quit): ");
        int value = in.nextInt();

        if (value == 0) {
            System.out.println("No integers were entered.");
            System.out.println("bye");
            return;
        }

        int sum = value;

        System.out.print("Enter an integer (or 0 to quit): ");
        value = in.nextInt();

        while (value != 0) {
            sum += value;
            System.out.print("Enter an integer (or 0 to quit): ");
            value = in.nextInt();
        }

        System.out.println("Sum of the integers: " + sum);
        System.out.println("bye");
    }
}