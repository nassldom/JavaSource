import java.util.Scanner;

public class AddUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int value = scan.nextInt();

        while (value != -999) {
            sum = sum + value;
            value = scan.nextInt();
        }

        System.out.println("Sum = " + sum);
    }
}