import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class HeaderIntReader {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java HeaderIntReader fileName");
            return;
        }

        try (DataInputStream in =
                     new DataInputStream(new FileInputStream(args[0]))) {

            int bytesPerInt = in.readInt();
            System.out.println("Bytes per integer: " + bytesPerInt);

            while (true) {
                int value;
                switch (bytesPerInt) {
                    case 1:
                        value = in.readByte();
                        break;
                    case 2:
                        value = in.readShort();
                        break;
                    case 4:
                        value = in.readInt();
                        break;
                    default:
                        System.out.println("Unsupported header value: " + bytesPerInt);
                        return;
                }
                System.out.println(value);
            }

        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}