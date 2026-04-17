import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteShorts {
    public static void main(String[] args) {
        try (DataOutputStream out =
                     new DataOutputStream(new FileOutputStream("shorts.bin"))) {

            for (short i = 0; i <= 64; i++) {
                out.writeShort(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}