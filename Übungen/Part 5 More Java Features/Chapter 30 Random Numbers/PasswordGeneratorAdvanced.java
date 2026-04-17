import java.util.Random;

public class PasswordGeneratorAdvanced {
    public static void main(String[] args) {
        Random rand = new Random();
        String choices = "abcdefghijklmnopqrstuvwxyz" +
                         "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                         "123456789012345678901234567890" +  // more digits
                         "!@#$%";                               // some punctuation

        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        int len = 8;
        StringBuilder pwd;
        boolean hasDigit;

        do {
            pwd = new StringBuilder();
            hasDigit = false;

            for (int i = 0; i < len; i++) {
                char c = choices.charAt(rand.nextInt(choices.length()));

                if (Character.isDigit(c)) {
                    hasDigit = true;
                }

                if (i > 0) {
                    char prev = pwd.charAt(i - 1);
                    if (consonants.indexOf(prev) != -1) {
                        // prev is a consonant → force vowel
                        c = vowels.charAt(rand.nextInt(vowels.length()));
                    }
                }

                pwd.append(c);
            }
        } while (!hasDigit);  // must have at least one digit

        System.out.println("Password: " + pwd);
    }
}