import java.util.Scanner;

public class TownDump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight of load (pounds): ");
        int weight = in.nextInt();

        double charge = 20.0; // first 200 lbs

        if (weight > 200) {
            int extraHundreds = (weight - 200 + 99) / 100; // ceil((weight-200)/100) in integer
            charge += 8.0 * extraHundreds;
        }

        System.out.printf("Charge: $%.2f%n", charge);
    }
}