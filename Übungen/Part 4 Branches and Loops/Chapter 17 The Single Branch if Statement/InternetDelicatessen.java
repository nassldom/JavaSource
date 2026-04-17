import java.util.Scanner;

public class InternetDelicatessen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the item: ");
        String item = in.nextLine();

        System.out.print("Enter the price: ");
        double price = in.nextDouble();

        System.out.print("Overnight delivery (0==no, 1==yes): ");
        int overnight = in.nextInt();

        double delivery = 0.0;
        if (price < 10.0) {
            delivery = 2.0;
        }
        if (overnight == 1) {
            delivery += 3.0;
        }

        double total = price + delivery;

        System.out.println("\nInvoice:");
        System.out.printf("  %-12s%6.2f%n", item, price);
        System.out.printf("  %-12s%6.2f%n", "delivery", delivery);
        System.out.printf("  %-12s%6.2f%n", "total", total);
    }
}