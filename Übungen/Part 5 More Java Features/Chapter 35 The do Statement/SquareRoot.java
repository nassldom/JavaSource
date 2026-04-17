import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer;

        do {
            double number;

            do {
                System.out.print("Enter a number--> ");
                number = scan.nextDouble();

                if (number <= 0) {
                    System.out.println(">>>number must be positive<<<");
                }
            } while (number <= 0);

            System.out.println("Square root of " + number + " is " + Math.sqrt(number));

            do {
                System.out.print("Do you wish to continue (yes or no)? ");
                answer = scan.next();
                if (!answer.equals("yes") && !answer.equals("no")) {
                    System.out.println(">>>Please respond with (yes or no)<<<");
                }
            } while (!answer.equals("yes") && !answer.equals("no"));

        } while (answer.equals("yes"));

        System.out.println("Bye");
    }
}