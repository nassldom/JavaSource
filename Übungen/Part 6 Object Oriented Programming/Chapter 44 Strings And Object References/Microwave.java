import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        String input = scan.nextLine().trim();

        String minutes;
        String seconds;

        if (input.length() <= 2) {
            minutes = "0";
            seconds = input;
        } else {
            minutes = input.substring(0, input.length() - 2);
            seconds = input.substring(input.length() - 2);
        }

        System.out.println("Your time-> " + minutes + ":" + seconds);
    }
}