import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;

public class BinaryUnbufferedRead {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = 0;

        try (DataInputStream in =
                     new DataInputStream(new FileInputStream("ints_bin_unbuffered.dat"))) {
            while (true) {
                int value = in.readInt();
                sum += value;
            }
        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Binary unbuffered read: " + (end - start) + " ms");
        System.out.println("Sum = " + sum);
    }
}