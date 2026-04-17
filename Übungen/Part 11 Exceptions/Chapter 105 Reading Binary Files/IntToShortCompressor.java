import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IntToShortCompressor {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java IntToShortCompressor inFile outFile");
            return;
        }

        try (DataInputStream in =
                     new DataInputStream(new FileInputStream(args[0]));
             DataOutputStream out =
                     new DataOutputStream(new FileOutputStream(args[1]))) {

            while (true) {
                int value = in.readInt();

                if (value < Short.MIN_VALUE || value > Short.MAX_VALUE) {
                    System.out.println("Out of range: " + value + " -> writing 0");
                    out.writeShort(0);
                } else {
                    out.writeShort((short) value);
                }
            }

        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}