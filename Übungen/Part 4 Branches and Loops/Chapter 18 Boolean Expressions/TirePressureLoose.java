import java.util.Scanner;

public class TirePressureLoose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MIN_PRESSURE = 35;
        final int MAX_PRESSURE = 45;
        final int TOLERANCE    = 3;

        System.out.print("Input right front pressure: ");
        int rightFront = in.nextInt();
        System.out.print("Input left front pressure: ");
        int leftFront = in.nextInt();
        System.out.print("Input right rear pressure: ");
        int rightRear = in.nextInt();
        System.out.print("Input left rear pressure: ");
        int leftRear = in.nextInt();

        // Bereich prüfen
        boolean inRange = (rightFront  >= MIN_PRESSURE && rightFront  <= MAX_PRESSURE) &&
                          (leftFront   >= MIN_PRESSURE && leftFront   <= MAX_PRESSURE) &&
                          (rightRear   >= MIN_PRESSURE && rightRear   <= MAX_PRESSURE) &&
                          (leftRear    >= MIN_PRESSURE && leftRear    <= MAX_PRESSURE);

        // Vorn max. 3 psi Unterschied, Hinten max. 3 psi Unterschied
        boolean frontOk = Math.abs(rightFront - leftFront) <= TOLERANCE;
        boolean rearOk  = Math.abs(rightRear - leftRear) <= TOLERANCE;

        if (inRange && frontOk && rearOk) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is BAD");
        }
    }
}