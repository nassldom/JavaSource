import java.io.*;

public class FileComp {
    public static void main(String[] args) {
        if (args.length < 2 || args.length > 3) {
            System.out.println("Usage: java FileComp file1 file2 [limit]");
            return;
        }

        int limit = Integer.MAX_VALUE;

        if (args.length == 3) {
            try {
                limit = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                System.out.println("Bad limit value.");
                return;
            }
        }

        try (BufferedReader in1 = new BufferedReader(new FileReader(args[0]));
             BufferedReader in2 = new BufferedReader(new FileReader(args[1]))) {

            String line1, line2;
            int lineNumber = 1;
            int differences = 0;

            while (true) {
                line1 = in1.readLine();
                line2 = in2.readLine();

                if (line1 == null && line2 == null) {
                    break;
                }

                boolean same;
                if (line1 == null || line2 == null) {
                    same = false;
                } else {
                    same = line1.equals(line2);
                }

                if (!same) {
                    System.out.println("Difference at line " + lineNumber + ":");
                    System.out.println("file1: " + line1);
                    System.out.println("file2: " + line2);
                    System.out.println();

                    differences++;
                    if (differences >= limit) {
                        break;
                    }
                }

                lineNumber++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}