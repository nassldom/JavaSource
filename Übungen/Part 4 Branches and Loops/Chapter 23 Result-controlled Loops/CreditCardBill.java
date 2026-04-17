import java.util.Scanner;
import java.text.DecimalFormat;

public class CreditCardBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat("#.#####");

        System.out.print("Enter beginning balance: ");
        double balance = scan.nextDouble();

        System.out.print("Enter monthly interest rate (as decimal, e.g., 0.015): ");
        double monthlyRate = scan.nextDouble();

        System.out.print("Enter monthly payment: ");
        double payment = scan.nextDouble();

        double totalPaid = 0.0;
        int month = 0;

        while (balance > 0) {
            month++;
            double interest = balance * monthlyRate;
            balance = balance + interest;

            double actualPayment = Math.min(payment, balance);
            balance = balance - actualPayment;
            totalPaid += actualPayment;

            System.out.println(
                "Month: " + month +
                "    balance: " + numform.format(balance) +
                "    total payments: " + numform.format(totalPaid)
            );
        }
    }
}