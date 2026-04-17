import java.util.Scanner;

public class WordTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word -->");
        String word = scan.nextLine();

        String spaces = "";

        while (word.length() > 0) {
            System.out.println(spaces + word);

            if (word.length() == 1) {
                word = "";
            } else if (word.length() == 2) {
                word = "";
            } else {
                word = word.substring(1, word.length() - 1);
            }

            spaces = spaces + " ";
        }
    }
}