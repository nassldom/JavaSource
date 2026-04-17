import java.util.Scanner;

public class RectanglesArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Computer Aided Design Program");

        while (true) {
            System.out.print("First corner X coordinate: ");
            int x1 = in.nextInt();
            System.out.print("First corner Y coordinate: ");
            int y1 = in.nextInt();

            System.out.print("Second corner X coordinate: ");
            int x2 = in.nextInt();
            System.out.print("Second corner Y coordinate: ");
            int y2 = in.nextInt();

            int width  = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            int area   = width * height;

            System.out.printf("Width:  %d  Height: %d   Area: %d%n%n", width, height, area);

            if (width == 0 || height == 0) {
                System.out.println("finished");
                break;
            }
        }
    }
}