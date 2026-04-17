import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Miles Per Gallon Program");

        while (true) {
            System.out.print("Initial miles: ");
            double initial = in.nextDouble();

            if (initial < 0) {
                System.out.println("bye");
                break;
            }

            System.out.print("Final miles: ");
            double fin = in.nextDouble();

            System.out.print("Gallons: ");
            double gallons = in.nextDouble();

            double mpg = (fin - initial) / gallons;
            System.out.println("Miles per Gallon: " + mpg);
            System.out.println();
        }
    }
}