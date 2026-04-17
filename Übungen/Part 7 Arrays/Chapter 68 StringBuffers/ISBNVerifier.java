import java.util.Scanner;

public class ISBNVerifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter ISBN-10 (with dashes): ");
        String isbnInput = scan.nextLine();

        // Bindestriche entfernen
        String isbn = isbnInput.replace("-", "");

        if (isbn.length() != 10) {
            System.out.println("Invalid ISBN length");
            return;
        }

        // erste 9 Ziffern prüfen
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            char ch = isbn.charAt(i);
            if (ch < '0' || ch > '9') {
                System.out.println("Invalid ISBN: non-digit in first 9 positions");
                return;
            }
            int digit = ch - '0';
            int weight = 10 - i;
            sum += digit * weight;
        }

        int remainder = sum % 11;
        int checkVal = 11 - remainder;
        char checkChar;

        if (checkVal == 10) {
            checkChar = 'X';
        } else if (checkVal == 11) {
            checkChar = '0';
        } else {
            checkChar = (char) ('0' + checkVal);
        }

        char last = isbn.charAt(9);

        if (last == checkChar) {
            System.out.println("ISBN is correct.");
        } else {
            System.out.println("ISBN is NOT correct.");
            System.out.println("Expected check digit: " + checkChar +
                               ", found: " + last);
        }
    }
}