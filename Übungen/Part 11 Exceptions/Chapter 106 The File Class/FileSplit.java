import java.io.*;

public class FileSplit {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java FileSplit bigFile baseName chunkSize");
            return;
        }

        File bigFile = new File(args[0]);
        String baseName = args[1];
        int chunkSize;

        if (!bigFile.exists() || !bigFile.isFile()) {
            System.out.println("Input file does not exist: " + args[0]);
            return;
        }

        try {
            chunkSize = Integer.parseInt(args[2]);
            if (chunkSize <= 0) {
                System.out.println("chunkSize must be positive.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Bad chunkSize.");
            return;
        }

        try (BufferedInputStream in =
                     new BufferedInputStream(new FileInputStream(bigFile))) {

            byte[] buffer = new byte[chunkSize];
            int part = 0;
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                File outFile = new File(baseName + part);

                try (BufferedOutputStream out =
                             new BufferedOutputStream(new FileOutputStream(outFile))) {
                    out.write(buffer, 0, bytesRead);
                }

                part++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}