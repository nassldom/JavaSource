import java.util.Scanner;

public class Extract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            if (line.startsWith("//")) {
                System.out.println(line);
            }
        }
    }
}