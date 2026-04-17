import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NumberFilter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        System.out.print("Input file name: ");
        String inName = console.nextLine();
        System.out.print("Positive output file: ");
        String posName = console.nextLine();
        System.out.print("Negative output file: ");
        String negName = console.nextLine();

        Scanner in = new Scanner(new File(inName));
        PrintWriter posOut = new PrintWriter(posName);
        PrintWriter negOut = new PrintWriter(negName);

        while (in.hasNextInt()) {
            int value = in.nextInt();
            if (value > 0) {
                posOut.println(value);
            } else if (value < 0) {
                negOut.println(value);
            }
        }

        in.close();
        posOut.close();
        negOut.close();
    }
}