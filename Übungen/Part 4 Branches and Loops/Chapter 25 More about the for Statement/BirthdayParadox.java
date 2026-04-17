import java.util.Scanner;

public class BirthdayParadox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of guests: ");
        int n = scan.nextInt();

        double noShared = 1.0;

        for (int i = 1; i < n; i++) {
            noShared = noShared * (365.0 - i) / 365.0;
        }

        double shared = 1.0 - noShared;

        System.out.println("Probability of no shared birthdays = " + noShared);
        System.out.println("Probability of at least one shared birthday = " + shared);

        int guests = 1;
        double pNoShared = 1.0;

        while (pNoShared > 0.50) {
            guests++;
            pNoShared = pNoShared * (365.0 - (guests - 1)) / 365.0;
        }

        System.out.println("Smallest group with no-shared probability <= 0.50: " + guests);
        System.out.println("So about a 50% chance of a shared birthday starts at: " + guests);
    }
}