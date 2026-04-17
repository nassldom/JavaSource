import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CholesterolStudy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter input file name: ");
        String fileName = console.nextLine();

        try {
            Scanner inFile = new Scanner(new File(fileName));

            int groups = inFile.nextInt();

            for (int group = 1; group <= groups; group++) {
                int subjects = inFile.nextInt();

                System.out.println("Group " + group + "  " + subjects + " subjects");

                if (subjects == 0) {
                    continue;
                }

                int startSum = 0;
                int endSum = 0;

                for (int person = 1; person <= subjects; person++) {
                    int start = inFile.nextInt();
                    int end = inFile.nextInt();

                    startSum += start;
                    endSum += end;
                }

                int avgStart = startSum / subjects;
                int avgEnd = endSum / subjects;
                int change = avgEnd - avgStart;

                System.out.println("  average starting cholesterol:  " + avgStart);
                System.out.println("  average final    cholesterol:  " + avgEnd);
                System.out.println("  change in        cholesterol:  " + change);
            }

            System.out.println("Done with processing.");
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}