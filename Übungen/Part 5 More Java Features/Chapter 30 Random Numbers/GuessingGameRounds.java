import java.util.Random;
import java.util.Scanner;

public class GuessingGameRounds {
    public static boolean playRound(Random rand, Scanner scan) {
        int secret = rand.nextInt(10) + 1;
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");

        for (int attempt = 1; attempt <= 3; attempt++) {
            if (attempt == 1) System.out.print("Enter a guess: ");
            int guess = scan.nextInt();
            int diff = Math.abs(guess - secret);

            if (guess == secret) {
                System.out.println("RIGHT!");
                return true;
            } else if (diff == 1) {
                System.out.println("hot");
            } else if (diff == 2) {
                System.out.println("warm");
            } else {
                System.out.println("cold");
            }
        }

        System.out.println("wrong");
        System.out.println("The correct number was " + secret);
        return false;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int wins = 0;

        for (int r = 1; r <= 10; r++) {
            System.out.println("round " + r + ":");
            if (playRound(rand, scan)) wins++;
            System.out.println("You have won " + wins + " out of " + r + " rounds.\n");
        }

        System.out.println("Your rating: " +
            (wins <= 7 ? "amateur" :
             wins == 8 ? "advanced" :
             wins == 9 ? "professional" : "hacker"));
    }
}