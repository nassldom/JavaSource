import java.io.*;

public class FileCat {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileCat source0 source1 ... newFile");
            return;
        }

        File outFile = new File(args[args.length - 1]);

        if (outFile.exists()) {
            System.out.println("Output file already exists: " + outFile.getName());
            return;
        }

        for (int i = 0; i < args.length - 1; i++) {
            File inFile = new File(args[i]);
            if (!inFile.exists() || !inFile.isFile()) {
                System.out.println("Source file does not exist: " + args[i]);
                return;
            }
        }

        try (BufferedOutputStream out =
                     new BufferedOutputStream(new FileOutputStream(outFile))) {

            byte[] buffer = new byte[4096];

            for (int i = 0; i < args.length - 1; i++) {
                try (BufferedInputStream in =
                             new BufferedInputStream(new FileInputStream(args[i]))) {

                    int bytesRead;
                    while ((bytesRead = in.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}