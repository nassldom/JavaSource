import java.io.File;

public class Purge {
    public static void main(String[] args) {
        File currentDir = new File(".");
        File[] files = currentDir.listFiles();

        if (files == null) {
            System.out.println("Cannot list current directory.");
            return;
        }

        int maxNumber = -1;

        for (File f : files) {
            if (f.isDirectory()) {
                String name = f.getName();
                if (name.startsWith("backUp")) {
                    String rest = name.substring(6);
                    try {
                        int num = Integer.parseInt(rest);
                        if (num > maxNumber) {
                            maxNumber = num;
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }

        if (maxNumber == -1) {
            System.out.println("No backup directories found.");
            return;
        }

        for (File f : files) {
            if (f.isDirectory()) {
                String name = f.getName();
                if (name.startsWith("backUp")) {
                    String rest = name.substring(6);
                    try {
                        int num = Integer.parseInt(rest);
                        if (num != maxNumber) {
                            deleteRecursively(f);
                            System.out.println("Deleted " + f.getName());
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }

        System.out.println("Kept backUp" + maxNumber);
    }

    private static void deleteRecursively(File f) {
        if (f.isDirectory()) {
            File[] children = f.listFiles();
            if (children != null) {
                for (File child : children) {
                    deleteRecursively(child);
                }
            }
        }
        f.delete();
    }
}