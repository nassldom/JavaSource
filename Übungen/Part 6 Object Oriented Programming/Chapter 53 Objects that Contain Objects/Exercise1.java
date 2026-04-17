import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Jam goose = new Jam("Gooseberry", "7/4/86", 12);
        Jam apple = new Jam("Crab Apple", "9/30/99", 8);
        Jam rhub  = new Jam("Rhubarb", "10/31/99", 16);

        Pantry hubbard = new Pantry(goose, apple, rhub);

        System.out.println("Welcome to Mother Hubbard's Pantry!");
        System.out.println();

        while (true) {
            System.out.println("The jams are:");
            System.out.print(hubbard);

            System.out.println("Enter your selection (1, 2, or 3):");
            int choice = scan.nextInt();

            if (choice == -1) {
                System.out.println("Good-by");
                break;
            }

            if (!hubbard.select(choice)) {
                System.out.println("Selection not available");
                System.out.println();
                continue;
            }

            System.out.println("Enter amount to spread:");
            int amount = scan.nextInt();
            hubbard.spread(amount);
            System.out.println();
        }
    }
}