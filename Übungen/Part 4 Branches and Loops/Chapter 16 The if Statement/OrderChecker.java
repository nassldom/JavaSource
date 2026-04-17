import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        final int boltPrice = 5;
        final int nutPrice   = 3;
        final int washerPrice = 1;

        Scanner in = new Scanner(System.in);

        System.out.print("Number of bolts: ");
        int bolts = in.nextInt();
        System.out.print("Number of nuts: ");
        int nuts = in.nextInt();
        System.out.print("Number of washers: ");
        int washers = in.nextInt();

        int totalCost = bolts * boltPrice
                      + nuts * nutPrice
                      + washers * washerPrice;

        boolean tooFewNuts    = nuts < bolts;
        boolean tooFewWashers = washers < 2 * bolts;

        if (tooFewNuts) {
            System.out.println("Check the Order: too few nuts");
        }
        if (tooFewWashers) {
            System.out.println("Check the Order: too few washers");
        }
        if (!tooFewNuts && !tooFewWashers) {
            System.out.println("Order is OK.");
        }

        System.out.println("Total cost: " + totalCost);
    }
}
