import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntCopy {
    public static void main(String[] args) {
        BufferedReader console =
                new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input file -->");
            String inputName = console.readLine();

            System.out.print("Output file -->");
            String outputName = console.readLine();

            try (BufferedReader in =
                         new BufferedReader(new FileReader(inputName));
                 DataOutputStream out =
                         new DataOutputStream(new FileOutputStream(outputName))) {

                String line;
                while ((line = in.readLine()) != null) {
                    line = line.trim();
                    if (line.length() == 0) {
                        continue;
                    }

                    try {
                        int value = Integer.parseInt(line);
                        out.writeInt(value);
                    } catch (NumberFormatException e) {
                        System.out.println("Poor input data:" + line);
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}