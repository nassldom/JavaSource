import java.util.Scanner;

public class CharacterCounterFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;
        int totalChars = 0;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                totalChars++;

                switch (ch) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        vowels++;
                        break;

                    case ' ':
                        spaces++;
                        break;

                    case '.': case ',': case ';': case ':':
                    case '!': case '?': case '\'': case '"':
                    case '(': case ')': case '-':
                        punctuation++;
                        break;

                    default:
                        if (Character.isLetter(ch)) {
                            consonants++;
                        }
                        break;
                }
            }
        }

        System.out.println("Raw counts:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces: " + spaces);
        System.out.println("Total characters counted: " + totalChars);

        if (totalChars > 0) {
            System.out.printf("Vowels: %.2f%%%n", 100.0 * vowels / totalChars);
            System.out.printf("Consonants: %.2f%%%n", 100.0 * consonants / totalChars);
            System.out.printf("Punctuation: %.2f%%%n", 100.0 * punctuation / totalChars);
            System.out.printf("Spaces: %.2f%%%n", 100.0 * spaces / totalChars);
        }
    }
}