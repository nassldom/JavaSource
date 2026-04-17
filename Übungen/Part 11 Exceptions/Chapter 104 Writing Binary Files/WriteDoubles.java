import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDoubles {
    public static void main(String[] args) {
        try (DataOutputStream out =
                     new DataOutputStream(new FileOutputStream("doubles.bin"))) {

            for (int i = 0; i <= 64; i++) {
                double d = (double) i;
                out.writeDouble(d);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}