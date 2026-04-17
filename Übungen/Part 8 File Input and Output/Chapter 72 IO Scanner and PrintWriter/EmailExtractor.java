import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EmailExtractor {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        System.out.print("Input file name: ");
        String inName = console.nextLine();
        System.out.print("Output file name: ");
        String outName = console.nextLine();

        Scanner in = new Scanner(new File(inName));
        PrintWriter out = new PrintWriter(outName);

        while (in.hasNext()) {
            String token = in.next();

            int atPos = token.indexOf('@');
            if (atPos != -1) {
                int dotPos = token.indexOf('.', atPos + 1);
                if (dotPos != -1) {
                    out.println(token);
                }
            }
        }

        in.close();
        out.close();
    }
}