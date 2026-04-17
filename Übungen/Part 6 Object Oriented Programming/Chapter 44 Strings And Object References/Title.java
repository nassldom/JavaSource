import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name:");
        String name = scan.nextLine();

        while (name.length() > 0) {
            if (name.startsWith("Amy") ||
                name.startsWith("Buffy") ||
                name.startsWith("Cathy")) {
                System.out.println("Ms. " + name);
            } else if (name.startsWith("Elroy") ||
                       name.startsWith("Fred") ||
                       name.startsWith("Graham")) {
                System.out.println("Mr. " + name);
            } else {
                System.out.println(name);
            }

            System.out.println();
            System.out.println("Enter a name:");
            name = scan.nextLine();
        }
    }
}