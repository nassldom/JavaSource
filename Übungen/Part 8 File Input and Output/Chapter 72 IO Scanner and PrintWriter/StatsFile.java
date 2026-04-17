import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StatsFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        System.out.print("Input file name: ");
        String filename = console.nextLine();

        Scanner in = new Scanner(new File(filename));

        int count = 0;
        double sum = 0.0;
        double sumSQ = 0.0;

        while (in.hasNextDouble()) {
            double x = in.nextDouble();
            count++;
            sum += x;
            sumSQ += x * x;
        }
        in.close();

        if (count == 0) {
            System.out.println("No data.");
            return;
        }

        double avg   = sum / count;
        double avgSQ = sumSQ / count;
        double var   = avgSQ - avg * avg;
        double sd    = Math.sqrt(var);

        System.out.println("count = " + count);
        System.out.println("average = " + avg);
        System.out.println("standard deviation = " + sd);
    }
}