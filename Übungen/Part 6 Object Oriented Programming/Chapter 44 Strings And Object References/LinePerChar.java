import java.util.Scanner;

public class LinePerChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scan.nextLine();

        System.out.println();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}