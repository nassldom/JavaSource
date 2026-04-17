import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MultiFileAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int grandSum = 0;
        int grandCount = 0;

        System.out.print("Enter file name (or quit): ");
        String fileName = console.nextLine();

        while (!fileName.equals("quit")) {
            try {
                Scanner inFile = new Scanner(new File(fileName));

                int sum = 0;
                int count = 0;

                while (inFile.hasNextInt()) {
                    int value = inFile.nextInt();
                    sum += value;
                    count++;
                }

                inFile.close();

                if (count > 0) {
                    double avg = (double) sum / count;
                    System.out.println("Average for " + fileName + " = " + avg);
                } else {
                    System.out.println(fileName + " contains no integers.");
                }

                grandSum += sum;
                grandCount += count;
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + fileName);
            }

            System.out.print("Enter file name (or quit): ");
            fileName = console.nextLine();
        }

        if (grandCount > 0) {
            double grandAvg = (double) grandSum / grandCount;
            System.out.println("Overall average = " + grandAvg);
        } else {
            System.out.println("No integers were processed.");
        }
    }
}