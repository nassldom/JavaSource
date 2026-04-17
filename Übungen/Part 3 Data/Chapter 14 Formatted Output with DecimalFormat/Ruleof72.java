import java.util.Scanner;

public class RuleOf72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate (%): ");
        double ratePercent = input.nextDouble();  // z.B. 10 für 10%

        double years = 72.0 / ratePercent;

        System.out.printf("Years to double: %.1f%n", years);

        input.close();
    }
}