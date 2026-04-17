import java.util.Scanner;

public class Remover {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String result = "";

            while (line.length() > 0) {
                int spacePos = line.indexOf(' ');
                String word;

                if (spacePos == -1) {
                    word = line;
                    line = "";
                } else {
                    word = line.substring(0, spacePos);
                    line = line.substring(spacePos + 1);
                }

                if (word.equalsIgnoreCase("a") ||
                    word.equalsIgnoreCase("the") ||
                    word.length() == 0) {
                    // Wort überspringen
                } else {
                    if (!result.isEmpty()) {
                        result = result + " ";
                    }
                    result = result + word;
                }
            }

            System.out.println(result);
        }
    }
}