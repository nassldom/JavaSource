import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of purchases: ");
        int amountCents = in.nextInt();

        int discountedCents = amountCents;
        if (amountCents > 1000) { // > 1000 Cent = > 10.00$
            discountedCents = amountCents * 9 / 10; // 10% discount via integer arith.
        }

        System.out.println("Discounted price: " + discountedCents);
    }
}

