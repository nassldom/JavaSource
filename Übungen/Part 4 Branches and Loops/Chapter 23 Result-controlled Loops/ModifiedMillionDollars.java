import java.util.Scanner;

public class ModifiedMillionDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter yearly interest rate (as decimal, e.g., 0.06): ");
        double rate = scan.nextDouble();

        System.out.print("Enter initial investment: ");
        double value = scan.nextDouble();

        System.out.print("Enter annual contribution: ");
        double contribution = scan.nextDouble();

        int year = 0;
        System.out.println("Year " + year + ": " + value);

        while (value < 1_000_000.0) {
            year++;
            value = value * (1 + rate) + contribution;
            System.out.println("Year " + year + ": " + value);
        }

        System.out.println("After " + year + " years, value is " + value);
    }
}