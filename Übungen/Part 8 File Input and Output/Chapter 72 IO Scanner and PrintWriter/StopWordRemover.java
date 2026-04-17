import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StopWordRemover {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        System.out.print("Input file name: ");
        String inName = console.nextLine();
        System.out.print("Output file name: ");
        String outName = console.nextLine();

        Scanner in = new Scanner(new File(inName));
        PrintWriter out = new PrintWriter(outName);

        Set<String> stop = new HashSet<>(Arrays.asList(
            "the", "a", "an", "of", "and", "to", "in"
        ));

        int tokensOnLine = 0;
        int maxPerLine = 10;

        while (in.hasNext()) {
            String token = in.next();

            String lower = token.toLowerCase();
            if (stop.contains(lower)) {
                continue;
            }

            if (tokensOnLine > 0) {
                out.print(" ");
            }
            out.print(token);
            tokensOnLine++;

            if (tokensOnLine >= maxPerLine) {
                out.println();
                tokensOnLine = 0;
            }
        }

        in.close();
        out.close();
    }
}