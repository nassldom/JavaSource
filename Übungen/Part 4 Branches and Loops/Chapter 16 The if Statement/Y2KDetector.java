import java.util.Scanner;

public class Y2KDetector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Year of Birth: ");
        int birthYY = in.nextInt();
        System.out.print("Current year: ");
        int currYY  = in.nextInt();

        int birthYear = birthYY;
        int currYear  = currYY;

        if (currYY >= birthYY) {
            birthYear = birthYY + 1900;
            currYear  = currYY + 1900;
        } else {
            birthYear = birthYY + 1900;
            currYear  = currYY + 2000;
        }

        int age = currYear - birthYear;
        System.out.println("Your age: " + age);
    }
}
