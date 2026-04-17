import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SumFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        System.out.print("Input file name: ");
        String filename = console.nextLine();

        Scanner in = new Scanner(new File(filename));

        long sum = 0;
        while (in.hasNextInt()) {
            int value = in.nextInt();
            sum += value;
        }

        in.close();
        System.out.println("Sum = " + sum);
    }
}