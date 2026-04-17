import java.util.Scanner;

public class JetLagCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hours of travel: ");
        double hours = in.nextDouble();

        System.out.print("Time zones crossed: ");
        int zones = in.nextInt();

        System.out.print("Departure time (0-23): ");
        int dep = in.nextInt();

        System.out.print("Arrival time (0-23): ");
        int arr = in.nextInt();

        int departFactor = departFactor(dep);
        int arriveFactor = arriveFactor(arr);

        double days = (hours / 2.0 + (zones - 3) + departFactor + arriveFactor) / 10.0;

        System.out.println("Days of recovery needed: " + days);
    }

    private static int departFactor(int time) {
        if (time >= 8 && time < 12)  return 0;
        if (time >= 12 && time < 18) return 1;
        if (time >= 18 && time < 22) return 3;
        if (time >= 22 || time < 1)  return 4;
        // 1–8
        return 5;
    }

    private static int arriveFactor(int time) {
        if (time >= 8 && time < 12)  return 4;
        if (time >= 12 && time < 18) return 2;
        if (time >= 18 && time < 22) return 0;
        if (time >= 22 || time < 1)  return 1;
        // 1–8
        return 3;
    }
}