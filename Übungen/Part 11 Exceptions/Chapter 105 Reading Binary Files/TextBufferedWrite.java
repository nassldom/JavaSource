import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextBufferedWrite {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try (BufferedWriter out =
                     new BufferedWriter(new FileWriter("ints_text_buffered.txt"))) {
            for (int i = 1; i <= 1_000_000; i++) {
                out.write(Integer.toString(i));
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Text buffered write: " + (end - start) + " ms");
    }
}