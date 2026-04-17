import java.util.Scanner;

public class Transformer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            int pos = line.indexOf(":=");
            while (pos != -1) {
                String before = line.substring(0, pos);
                String after  = line.substring(pos + 2); // nach ":="
                line = before + "=" + after;
                pos = line.indexOf(":=");
            }

            System.out.println(line);
        }
    }
}