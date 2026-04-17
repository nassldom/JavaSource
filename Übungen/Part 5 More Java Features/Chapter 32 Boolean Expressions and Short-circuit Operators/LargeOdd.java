import java.util.Scanner;

public class LargeOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bestOdd = 0;           // „bester“ bisheriger Wert
        boolean foundOdd = false;  // wurde schon eine ungerade Zahl gefunden?

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int value = scan.nextInt();

            if (value % 2 != 0) {        // ungerade?
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