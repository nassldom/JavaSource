import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int secret = rand.nextInt(10) + 1;

        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");

        for (int attempt = 1; attempt <= 3; attempt++) {
            if (attempt == 1) System.out.print("Enter a guess: ");
            else System.out.print("Enter a guess: ");

            int guess = scan.nextInt();

            if (guess == secret) {
                System.out.println("RIGHT!");
                System.out.println("You have won the game.");
                return;
            } else {
                System.out.println("wrong");
            }
        }

        System.out.println("The correct number was " + secret);
        System.out.println("You have lost the game.");
    }
}