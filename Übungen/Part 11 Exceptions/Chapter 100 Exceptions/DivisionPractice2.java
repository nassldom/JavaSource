import java.util.Scanner;

public class DivisionPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the numerator: ");
            String numInput = scan.nextLine();

            if (numInput.length() > 0 &&
                (numInput.charAt(0) == 'q' || numInput.charAt(0) == 'Q')) {
                break;
            }

            try {
                int numerator = Integer.parseInt(numInput);

                System.out.print("Enter the divisor:  ");
                String divInput = scan.nextLine();
                int divisor = Integer.parseInt(divInput);

                int result = numerator / divisor;
                System.out.println(numerator + " / " + divisor + " is " + result);
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                System.out.println();

            } catch (ArithmeticException e) {
                try {
                    int numerator = Integer.parseInt(numInput);

                    System.out.print("");
                    System.out.println("You can't divide " + numerator + " by 0");
                    System.out.println();
                } catch (NumberFormatException ex) {
                    System.out.println("You entered bad data.");
                    System.out.println("Please try again.");
                    System.out.println();
                }
            }
        }
    }
}