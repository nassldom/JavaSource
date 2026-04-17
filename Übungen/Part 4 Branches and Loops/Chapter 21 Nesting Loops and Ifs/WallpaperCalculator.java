import java.util.Scanner;

public class WallpaperCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // room dimensions in meters
        System.out.print("Room width (m): ");
        double width = in.nextDouble();
        System.out.print("Room length (m): ");
        double length = in.nextDouble();
        System.out.print("Room height (m): ");
        double height = in.nextDouble();

        System.out.print("Number of openings: ");
        int openings = in.nextInt();

        double openingsArea = 0.0;
        for (int i = 0; i < openings; i++) {
            System.out.println("Opening " + (i + 1) + " width (m): ");
            double ow = in.nextDouble();
            System.out.println("Opening " + (i + 1) + " height (m): ");
            double oh = in.nextDouble();
            openingsArea += ow * oh;
        }

        double wallArea = 2 * height * (width + length);
        double coverArea = wallArea - openingsArea;

        // Roll: 27 in wide, 4.5 yards long
        double rollWidthM = 0.6858;     // 27 in
        double rollLengthM = 4.1148;    // 4.5 yd
        double rollArea = rollWidthM * rollLengthM;

        double rollsNeeded = Math.ceil(coverArea / rollArea);

        System.out.println("Approximate rolls needed: " + (int) rollsNeeded);
    }
}