import java.util.Scanner;

public class DivisionPractice2Clean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the numerator: ");
            String numInput = scan.nextLine();

            if (numInput.length() > 0 &&
                (numInput.charAt(0) == 'q' || numInput.charAt(0) == 'Q')) {
                break;
            }

            int numerator;
            try {
                numerator = Integer.parseInt(numInput);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                System.out.println();
                continue;
            }

            System.out.print("Enter the divisor:  ");
            String divInput = scan.nextLine();

            int divisor;
            try {
                divisor = Integer.parseInt(divInput);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                System.out.println();
                continue;
            }

            if (divisor == 0) {
                System.out.println("You can't divide " + numerator + " by 0");
                System.out.println();
                continue;
            }

            System.out.println(numerator + " / " + divisor + " is " + (numerator / divisor));
            System.out.println();
        }
    }
}