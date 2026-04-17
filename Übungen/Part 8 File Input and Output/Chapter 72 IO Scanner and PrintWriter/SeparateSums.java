import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SeparateSums {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        System.out.print("Input file name: ");
        String filename = console.nextLine();

        Scanner in = new Scanner(new File(filename));

        int sumX = 0;
        int sumY = 0;

        while (in.hasNext()) {
            String token = in.next(); // "x=" oder "y="
            int value = in.nextInt();

            if (token.equals("x=")) {
                sumX += value;
            } else if (token.equals("y=")) {
                sumY += value;
            }
        }

        in.close();

        System.out.println("Sum of x values = " + sumX);
        System.out.println("Sum of y values = " + sumY);
    }
}