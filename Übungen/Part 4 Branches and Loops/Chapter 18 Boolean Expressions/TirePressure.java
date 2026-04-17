import java.util.Scanner;

public class TirePressure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input right front pressure: ");
        int rightFront = in.nextInt();
        System.out.print("Input left front pressure: ");
        int leftFront = in.nextInt();
        System.out.print("Input right rear pressure: ");
        int rightRear = in.nextInt();
        System.out.print("Input left rear pressure: ");
        int leftRear = in.nextInt();

        boolean frontOk = (rightFront == leftFront);
        boolean rearOk  = (rightRear == leftRear);

        if (frontOk && rearOk) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is BAD");
        }
    }
}