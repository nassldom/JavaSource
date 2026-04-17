import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String trimmed = line.trim();

            if (trimmed.startsWith("if") || trimmed.startsWith("while")) {
                int idx = line.indexOf(" = ");
                if (idx != -1) {
                    System.out.println(line);
                }
            }
        }
    }
}