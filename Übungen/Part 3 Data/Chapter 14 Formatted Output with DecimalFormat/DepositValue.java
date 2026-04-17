import java.util.Scanner;

public class DepositValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Initial deposit: ");
        double P = input.nextDouble();

        System.out.print("Interest rate  : ");
        double r = input.nextDouble(); // z.B. 0.04

        System.out.print("Times per year : ");
        double n = input.nextDouble();

        System.out.print("Number of years: ");
        double t = input.nextDouble();

        double V = P * Math.pow(1 + r / n, n * t);

        System.out.printf("Value: $%.2f%n", V);

        input.close();
    }
}