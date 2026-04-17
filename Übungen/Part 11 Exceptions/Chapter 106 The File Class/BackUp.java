import java.io.*;

public class BackUp {
    public static void main(String[] args) {
        File currentDir = new File(".");
        String[] names = currentDir.list();

        if (names == null) {
            System.out.println("Cannot list current directory.");
            return;
        }

        int backupNumber = 0;
        File backupDir;

        do {
            backupDir = new File("backUp" + backupNumber);
            backupNumber++;
        } while (backupDir.exists());

        if (!backupDir.mkdir()) {
            System.out.println("Could not create backup directory.");
            return;
        }

        System.out.println("Created " + backupDir.getName());

        byte[] buffer = new byte[4096];

        for (String name : names) {
            File source = new File(name);

            if (source.isFile()) {
                if (!source.canRead()) {
                    System.out.println("Warning: cannot read " + source.getName());
                    continue;
                }

                File target = new File(backupDir, source.getName());

                try (BufferedInputStream in =
                             new BufferedInputStream(new FileInputStream(source));
                     BufferedOutputStream out =
                             new BufferedOutputStream(new FileOutputStream(target))) {

                    int bytesRead;
                    while ((bytesRead = in.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }

                } catch (IOException e) {
                    System.out.println("Warning: could not copy " + source.getName());
                }
            }
        }
    }
}