import java.util.Scanner;

public class NameEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine().trim();

        int space = name.indexOf(" ");

        if (space > 0) {
            String first = name.substring(0, space);
            String last = name.substring(space + 1).toUpperCase();
            System.out.println();
            System.out.println(first + " " + last);
        } else {
            System.out.println();
            System.out.println(name);
        }
    }
}