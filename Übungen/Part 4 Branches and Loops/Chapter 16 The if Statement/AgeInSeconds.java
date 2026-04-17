import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter age in years: ");
        int years  = in.nextInt();
        System.out.print("Enter age in months: ");
        int months = in.nextInt();
        System.out.print("Enter age in days: ");
        int days   = in.nextInt();

        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;

        for (int i = 0; i < months; i++) {
            totalDays += daysPerMonth[i];
        }

        totalDays += days;
        totalDays += years * 365;

        long seconds = (long) totalDays * 24 * 60 * 60;
        double percentOfLife = 100.0 * seconds / 2_500_000_000.0;

        System.out.println("Your age in seconds: " + seconds);
        System.out.printf("Percentage of expected lifespan: %.2f%%%n", percentOfLife);
    }
}

