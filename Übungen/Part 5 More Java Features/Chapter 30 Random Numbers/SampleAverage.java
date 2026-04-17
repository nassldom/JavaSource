import java.util.Random;
import java.util.Scanner;

public class SampleAverage {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scan.nextInt();
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            sum += rand.nextInt(1001); // 0..1000
        }

        double avg = sum / N;
        System.out.println("Average of " + N + " random samples = " + avg);
    }
}