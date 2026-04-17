import java.util.Random;
import java.util.Scanner;

public class PigLikeDiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int playerScore = 0;
        int computerScore = 0;

        while (playerScore < 100 && computerScore < 100) {
            System.out.println("----------------------------");
            System.out.println("Computer score: " + computerScore);
            System.out.println("Player   score: " + playerScore);
            System.out.println();

            // ----- Computer-Turn -----
            int compTurn = roll3Dice(rand);
            computerScore += compTurn;
            System.out.println("Computer rolls three dice and gets " + compTurn +
                               " points this round.");
            System.out.println("Computer total score is now " + computerScore);
            System.out.println();

            if (computerScore >= 100) break;

            // ----- Spieler-Turn -----
            int turnSum = 0;
            boolean turnOver = false;

            System.out.println("Your turn.");
            System.out.println("At any point, type 'n' to stop rolling.");

            while (!turnOver) {
                System.out.print("Roll? (y/n): ");
                String answer = scan.next().trim().toLowerCase();
                if (answer.equals("n")) {
                    // Runde freiwillig beenden, Summe wird gutgeschrieben
                    playerScore += turnSum;
                    System.out.println("You stop. You add " + turnSum +
                                       " to your score.");
                    System.out.println("Your total score is now " + playerScore);
                    turnOver = true;
                } else {
                    int roll = rand.nextInt(6) + 1;
                    System.out.println("You rolled: " + roll);

                    if (roll == 1) {
                        System.out.println("You rolled a 1, you get 0 this round.");
                        turnSum = 0;
                        turnOver = true;
                    } else {
                        turnSum += roll;
                        System.out.println("Working sum this round: " + turnSum);
                    }
                }
            }
        }

        System.out.println("----------------------------");
        System.out.println("Final scores:");
        System.out.println("Computer: " + computerScore);
        System.out.println("Player  : " + playerScore);

        if (playerScore >= 100 && computerScore >= 100) {
            System.out.println("It's a tie (very unlikely)!");
        } else if (playerScore >= 100) {
            System.out.println("You WIN!");
        } else {
            System.out.println("Computer WINS!");
        }
    }

    private static int roll3Dice(Random rand) {
        int d1 = rand.nextInt(6) + 1;
        int d2 = rand.nextInt(6) + 1;
        int d3 = rand.nextInt(6) + 1;
        return d1 + d2 + d3;
    }
}