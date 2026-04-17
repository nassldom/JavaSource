import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextBufferedRead {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long sum = 0;
        try (Scanner scan = new Scanner(new File("ints_text_buffered.txt"))) {
            while (scan.hasNextInt()) {
                sum += scan.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Text buffered read: " + (end - start) + " ms");
        System.out.println("Sum = " + sum);
    }
}