import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double handling = 3.00;
        final double extraPerPound = 0.25;

        while (true) {
            System.out.print("Weight of Order: ");
            double weight = in.nextDouble();

            if (weight <= 0) {
                System.out.println("\nbye");
                break;
            }

            double shipping = handling;
            if (weight > 10) {
                shipping += (weight - 10) * extraPerPound;
            }

            System.out.printf("Shipping Cost: $%.2f%n%n", shipping);
        }
    }
}