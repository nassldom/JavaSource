import java.util.Scanner;

public class FantasyGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Yertle's Quest");
        System.out.print("Enter the name of your character: ");
        String name = in.nextLine();

        System.out.print("Enter strength (1-10): ");
        int strength = in.nextInt();
        System.out.print("Enter health (1-10): ");
        int health   = in.nextInt();
        System.out.print("Enter luck (1-10): ");
        int luck     = in.nextInt();

        int total = strength + health + luck;

        if (total > 15) {
            strength = 5;
            health   = 5;
            luck     = 5;
            System.out.println("You have given your character too many points! Default values have been assigned:");
        }

        System.out.printf("%s, strength: %d, health: %d, luck: %d%n", name, strength, health, luck);
    }
}