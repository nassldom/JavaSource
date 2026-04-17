import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String password = scan.nextLine();

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLower = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            if (password.length() >= 7 && hasUpper && hasLower && hasDigit) {
                System.out.println("Acceptable password.");
                break;
            } else {
                System.out.println("That password is not acceptable.");
                System.out.println();
            }
        }
    }
}