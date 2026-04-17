import java.util.Scanner;

public class BetterExtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean inBlockComment = false;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            if (line.startsWith("//")) {
                System.out.println(line);
            } else if (line.startsWith("/*")) {
                inBlockComment = true;
                System.out.println(line);
            } else if (line.startsWith("*/")) {
                System.out.println(line);
                inBlockComment = false;
            } else if (inBlockComment) {
                System.out.println(line);
            }
        }
    }
}