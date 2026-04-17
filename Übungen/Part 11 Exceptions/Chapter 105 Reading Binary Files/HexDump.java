import java.io.FileInputStream;
import java.io.IOException;

public class HexDump {
    private static char toHexChar(int nibble) {
        if (nibble >= 0 && nibble <= 9) {
            return (char) ('0' + nibble);
        } else {
            return (char) ('A' + (nibble - 10));
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java HexDump fileName");
            return;
        }

        try (FileInputStream in = new FileInputStream(args[0])) {
            int b;
            int count = 0;

            while ((b = in.read()) != -1) {
                int data = b & 0xFF;

                int highFour = (data & 0xF0) >>> 4;
                int lowFour  = data & 0x0F;

                System.out.print(toHexChar(highFour));
                System.out.print(toHexChar(lowFour));
                System.out.print(" ");

                count++;
                if (count == 16) {
                    System.out.println();
                    count = 0;
                }
            }

            if (count != 0) {
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}