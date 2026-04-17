import java.util.Scanner;

public class ReverseSent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input:  ");
        String line = scan.nextLine();

        String[] parts = line.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            String word = parts[i];
            StringBuilder rev = new StringBuilder(word);
            rev.reverse();
            result.append(rev);
            if (i < parts.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}