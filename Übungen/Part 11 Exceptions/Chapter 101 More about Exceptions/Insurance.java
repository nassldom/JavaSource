import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insurance {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter age: ");
            String line = in.readLine();
            int age = Integer.parseInt(line.trim());

            if (age < 0 || age > 120) {
                System.out.println("Invalid age.");
                return;
            }

            int premium = basePremium(age);

            System.out.println("Your annual premium is: " + premium);

        } catch (IOException e) {
            System.out.println("I/O error while reading input.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for age.");
            e.printStackTrace();
        }
    }

    private static int basePremium(int age) {
        if (age < 25) {
            return 1200;
        } else if (age < 40) {
            return 900;
        } else if (age < 65) {
            return 700;
        } else {
            return 950;
        }
    }
}