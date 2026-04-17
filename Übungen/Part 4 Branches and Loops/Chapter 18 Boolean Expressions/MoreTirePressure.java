import java.util.Scanner;

public class MoreTirePressure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MIN_PRESSURE = 35;
        final int MAX_PRESSURE = 45;

        boolean goodPressure = true;

        System.out.print("Input right front pressure: ");
        int rightFront = in.nextInt();
        if (rightFront < MIN_PRESSURE || rightFront > MAX_PRESSURE) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input left front pressure: ");
        int leftFront = in.nextInt();
        if (leftFront < MIN_PRESSURE || leftFront > MAX_PRESSURE) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input right rear pressure: ");
        int rightRear = in.nextInt();
        if (rightRear < MIN_PRESSURE || rightRear > MAX_PRESSURE) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input left rear pressure: ");
        int leftRear = in.nextInt();
        if (leftRear < MIN_PRESSURE || leftRear > MAX_PRESSURE) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        if (goodPressure) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is BAD");
        }
    }
}