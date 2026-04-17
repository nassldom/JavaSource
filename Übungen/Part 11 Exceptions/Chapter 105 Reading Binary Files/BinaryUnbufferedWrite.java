import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryUnbufferedWrite {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try (DataOutputStream out =
                     new DataOutputStream(new FileOutputStream("ints_bin_unbuffered.dat"))) {
            for (int i = 1; i <= 1_000_000; i++) {
                out.writeInt(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Binary unbuffered write: " + (end - start) + " ms");
    }
}