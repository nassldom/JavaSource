import java.util.Scanner;

public class LargeOddAnySign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bestOdd = 0;
        boolean foundOdd = false;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int value = scan.nextInt();

            // ungerade? (funktioniert auch für negative Zahlen)
            if (value % 2 != 0) {
                if (!foundOdd || value > bestOdd) {
                    bestOdd = value;
                    foundOdd = true;
                }
            }
        }

        if (foundOdd) {
            System.out.println("The largest odd integer was " + bestOdd);
        } else {
            System.out.println("No odd integer was entered.");
        }
    }
}