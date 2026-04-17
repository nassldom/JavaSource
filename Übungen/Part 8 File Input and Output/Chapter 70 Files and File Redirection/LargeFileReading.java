import java.util.Scanner;

public class LargeFileReading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        int previous = scan.nextInt();

        while (scan.hasNextInt()) {
            int current = scan.nextInt();

            if (previous == -999 && current == -999) {
                break;
            }

            sum = sum + previous;
            count++;

            previous = current;
        }

        System.out.println("Sum = " + sum);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average = " + average);
        } else {
            System.out.println("No data");
        }
    }
}