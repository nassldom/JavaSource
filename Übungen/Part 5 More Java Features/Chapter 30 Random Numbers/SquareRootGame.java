import java.util.Random;
import java.util.Scanner;

public class SquareRootGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("How many rounds? ");
        int rounds = scan.nextInt();
        scan.nextLine(); // consume newline

        System.out.print("First Player, sign in--> ");
        String p1 = scan.nextLine();
        System.out.print("Second Player, sign in--> ");
        String p2 = scan.nextLine();

        int score1 = 0, score2 = 0;

        for (int r = 1; r <= rounds; r++) {
            double num = 1.0 + 99 * rand.nextDouble(); // 1.0 .. 100.0
            double sqrt = Math.sqrt(num);

            System.out.printf("What is the square root of %f   ?%n", num);

            if (r % 2 == 1) {
                System.out.print(p1 + ", your guess: ");
                double g1 = scan.nextDouble();
                System.out.print(p2 + ", your guess: ");
                double g2 = scan.nextDouble();

                double d1 = Math.abs(g1 - sqrt);
                double d2 = Math.abs(g2 - sqrt);

                System.out.println("The correct square root: " + sqrt);
                System.out.println(p1 + " is " + d1 + " away");
                System.out.println(p2 + " is " + d2 + " away");

                if (d1 < d2) {
                    System.out.println(p1 + " wins!");
                    score1++;
                } else {
                    System.out.println(p2 + " wins!");
                    score2++;
                }
            } else {
                // reverse order
                System.out.print(p2 + ", your guess: ");
                double g2 = scan.nextDouble();
                System.out.print(p1 + ", your guess: ");
                double g1 = scan.nextDouble();

                double d1 = Math.abs(g1 - sqrt);
                double d2 = Math.abs(g2 - sqrt);

                System.out.println("The correct square root: " + sqrt);
                System.out.println(p1 + " is " + d1 + " away");
                System.out.println(p2 + " is " + d2 + " away");

                if (d1 < d2) {
                    System.out.println(p1 + " wins!");
                    score1++;
                } else {
                    System.out.println(p2 + " wins!");
                    score2++;
                }
            }
        }

        System.out.println("---- Final Score ----");
        System.out.println(p1 + ":  " + score1 + "   " + p2 + ":  " + score2);
    }
}