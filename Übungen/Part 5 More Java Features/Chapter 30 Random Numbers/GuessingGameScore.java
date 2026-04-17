import java.util.Random;
import java.util.Scanner;

public class GuessingGameScore {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int secret = rand.nextInt(10) + 1;
        int score = 5;

        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("Try to guess the number.");
        System.out.println("Your beginning score is 5 points.");
        System.out.println("Each time you guess wrong, your score is decreased by one.");

        while (score >= 0) {
            System.out.print("Enter a guess: ");
            int guess = scan.nextInt();

            if (guess == secret) {
                System.out.println("You WON the game!");
                System.out.println("Your score is " + score);
                return;
            } else if (guess < secret) {
                System.out.println("Too Low! Your score is now " + --score);
            } else {
                System.out.println("Too High! Your score is now " + --score);
            }
        }

        System.out.println("You lost.");
        System.out.println("Your score is " + score);
    }
}