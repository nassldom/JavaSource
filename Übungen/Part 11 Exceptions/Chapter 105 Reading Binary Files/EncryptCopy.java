import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncryptCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java EncryptCopy source dest");
            return;
        }

        try (FileInputStream in = new FileInputStream(args[0]);
             FileOutputStream out = new FileOutputStream(args[1])) {

            int b;
            while ((b = in.read()) != -1) {
                int enc = ~b;
                out.write(enc & 0xFF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}