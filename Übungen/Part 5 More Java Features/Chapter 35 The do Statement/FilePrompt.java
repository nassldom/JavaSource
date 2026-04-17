import java.util.Scanner;

public class FilePrompt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName;

        do {
            System.out.print("input file: ");
            fileName = scan.nextLine();

            if (!fileName.endsWith(".dat")) {
                System.out.println(">>>file name must end with .dat<<<");
            } else if (fileName.contains(" ")) {
                System.out.println(">>>file name must not contain spaces<<<");
            } else if (fileName.length() == 4) {   // nur ".dat"
                System.out.println(">>>file name missing<<<");
            } else {
                System.out.println("OK");
            }

        } while (!fileName.endsWith(".dat") ||
                 fileName.contains(" ") ||
                 fileName.length() == 4);
    }
}