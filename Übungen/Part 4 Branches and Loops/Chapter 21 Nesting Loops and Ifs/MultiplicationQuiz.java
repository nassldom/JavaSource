import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int correct = 0;
        int questions = 10;

        for (int i = 0; i < questions; i++) {
            int a = rand.nextInt(10); // 0..9
            int b = rand.nextInt(10);

            System.out.print("What is " + a + " * " + b + "?  ");
            int answer = in.nextInt();
            int product = a * b;

            if (answer == product) {
                System.out.println("Right!\n");
                correct++;
            } else {
                System.out.println("wrong.  " + a + " * " + b + " is " + product + "\n");
            }
        }

        System.out.println("You got " + correct + " out of " + questions + " questions correct!");
    }
}