import java.util.Scanner;

public class PieEatingContest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter contestant's weight: ");
        int weight = in.nextInt();

        int lowerBound = 220;   // 250 - 30
        int upperBound = 280;   // 250 + 30

        if (weight >= lowerBound && weight <= upperBound) {
            System.out.println("Contestant is allowed.");
        } else {
            System.out.println("Contestant is not allowed.");
        }
    }
}
