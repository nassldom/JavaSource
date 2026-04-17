import java.util.Random;
import java.util.Scanner;

public class PasswordCracker {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a \"secret\" password--> ");
        String secret = scan.nextLine().trim();
        int nTries = 0;
        int maxLen = 5;

        if (secret.length() > maxLen) {
            System.out.println("Password too long (max 5).");
            return;
        }

        String choices = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder attempt = new StringBuilder();

        outer:
        while (true) {
            attempt.setLength(0);

            for (int len = 1; len <= maxLen; len++) {
                for (int i = 0; i < len; i++) {
                    attempt.append(
                        choices.charAt(rand.nextInt(choices.length()))
                    );
                }

                nTries++;

                if (attempt.toString().equals(secret)) {
                    break outer;
                }

                attempt.setLength(0);
            }
        }

        System.out.println("Here is your password: " + secret);
        System.out.println("It took " + nTries + " tries to guess it");
    }
}