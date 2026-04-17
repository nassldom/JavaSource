import java.util.Scanner;

public class RepeatedEcho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine();

        int times = word.length();

        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}