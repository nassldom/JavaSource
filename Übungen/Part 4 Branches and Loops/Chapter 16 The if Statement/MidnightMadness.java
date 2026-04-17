import java.util.Scanner;

public class MidnightMadness {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.print("Enter time (24h, e.g. 1200): ");
        int time = in.nextInt();

        int price;

        if (time > 2200) {
            if (age <= 13) {
                System.out.println("Children cannot purchase tickets after 2200.");
                return;
            }
            price = 4; // midnight price
        } else if (age <= 13) {
            // child, normal or matinee
            if (time < 1700) {
                price = 2; // matinee child
            } else {
                price = 4; // normal child
            }
        } else {
            // adult
            if (time < 1700) {
                price = 5; // matinee adult
            } else {
                price = 8; // normal adult
            }
        }

        System.out.println("Ticket price: $" + price);
    }
}
