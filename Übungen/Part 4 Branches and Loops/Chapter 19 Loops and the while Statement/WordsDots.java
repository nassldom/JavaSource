import java.util.Scanner;

public class WordsDots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String first = in.nextLine();
        System.out.print("Enter second word: ");
        String second = in.nextLine();

        int totalLength = first.length() + second.length();
        int dotCount = 30 - totalLength;

        System.out.print(first);
        for (int i = 0; i < dotCount; i++) {
            System.out.print(".");
        }
        System.out.println(second);
    }
}