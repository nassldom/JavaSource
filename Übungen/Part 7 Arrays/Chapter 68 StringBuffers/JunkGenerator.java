import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JunkGenerator {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Usage: java JunkGenerator \"Name\" < junk.txt");
            return;
        }

        String name = args[0];

        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();

        while (line != null) {
            String replaced = line.replace("*", name);
            System.out.println(replaced);
            line = in.readLine();
        }
    }
}