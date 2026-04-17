import java.util.Scanner;

public class CheckCharge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter checking account balance: ");
        double checking = in.nextDouble();
        System.out.print("Enter savings account balance: ");
        double savings = in.nextDouble();

        final double chargePerCheck = 0.15;
        double serviceCharge = 0.0;

        if (checking <= 1000.0 && savings <= 1500.0) {
            System.out.print("Number of checks written: ");
            int numChecks = in.nextInt();
            serviceCharge = numChecks * chargePerCheck;
        }

        System.out.printf("Service charge: $%.2f%n", serviceCharge);
    }
}