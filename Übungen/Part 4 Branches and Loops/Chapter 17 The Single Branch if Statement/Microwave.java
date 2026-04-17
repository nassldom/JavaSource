import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many items to heat: ");
        int items = in.nextInt();
        System.out.print("Time for one item: ");
        int inputTime = in.nextInt();

        // convert inputTime to seconds
        int totalSec;
        if (inputTime < 100) {
            totalSec = inputTime;
        } else {
            int minutes = inputTime / 100;
            int seconds = inputTime % 100;
            totalSec = minutes * 60 + seconds;
        }

        double ratio = 1.0; // 1 item = 100%

        if (items == 1) {
            ratio = 1.0;
        } else if (items == 2) {
            ratio = 1.5;
        } else if (items == 3) {
            ratio = 2.0;
        }

        int scaledSec = (items > 3) ? 0 : (int) (totalSec * ratio);

        if (items > 3) {
            System.out.println("Heating more than three items at once is not recommended.");
        } else {
            int minutes = scaledSec / 60;
            int seconds = scaledSec % 60;
            System.out.printf("Heat for %d minutes %d seconds%n", minutes, seconds);
        }
    }
}