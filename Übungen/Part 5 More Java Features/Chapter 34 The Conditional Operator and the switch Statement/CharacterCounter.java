import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String line = scan.nextLine();

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

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

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces: " + spaces);
    }
}