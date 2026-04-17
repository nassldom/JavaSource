import java.util.Scanner;

public class SteamEngineEfficiency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter air temperature (K): ");
        double Tair = in.nextDouble();
        System.out.print("Enter steam temperature (K): ");
        double Tsteam = in.nextDouble();

        double efficiency = 0.0;

        if (Tsteam >= 373.0) {
            efficiency = 1.0 - Tair / Tsteam;
        }

        System.out.printf("Maximum efficiency: %.4f%n", efficiency);
    }
}