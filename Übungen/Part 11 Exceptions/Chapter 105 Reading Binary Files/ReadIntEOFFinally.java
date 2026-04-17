import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadIntEOFFinally {
    public static void main(String[] args) {
        DataInputStream in = null;

        try {
            in = new DataInputStream(new FileInputStream("ints.dat"));

            while (true) {
                int value = in.readInt();
                System.out.println(value);
            }

        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}