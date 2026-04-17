import java.util.Scanner;

public class Decode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNextLine()) {
            return;
        }

        String key = scan.nextLine();
        StringBuilder message = new StringBuilder();

        while (scan.hasNextInt()) {
            int index = scan.nextInt();
            if (index >= 0 && index < key.length()) {
                message.append(key.charAt(index));
            }
        }

        System.out.println();
        System.out.println(message.toString());
    }
}