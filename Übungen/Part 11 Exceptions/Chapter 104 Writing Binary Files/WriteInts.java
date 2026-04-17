import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInts {
    public static void main(String[] args) {
        try (DataOutputStream out =
                     new DataOutputStream(new FileOutputStream("ints.bin"))) {

            for (int i = 0; i <= 64; i++) {
                out.writeInt(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}