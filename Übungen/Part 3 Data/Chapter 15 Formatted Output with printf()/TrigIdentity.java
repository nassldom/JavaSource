import java.util.Scanner;

public class TrigIdentity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an angle: ");
        double degrees = input.nextDouble();

        double radians = Math.toRadians(degrees);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);

        double sin2 = sin * sin;
        double cos2 = cos * cos;
        double sum  = sin2 + cos2;

        System.out.printf("sin(%.2f)   is:  %.2f%n", degrees, sin);
        System.out.printf("cos(%.2f)   is:  %.2f%n", degrees, cos);
        System.out.printf("sin(%.2f)^2 is:  %.2f%n", degrees, sin2);
        System.out.printf("cos(%.2f)^2 is:  %.2f%n", degrees, cos2);
        System.out.printf("sum          is:  %.2f%n", sum);

        input.close();
    }
}
/*
Input an angle: 37.5
sin(37.50)   is:  0.61
cos(37.50)   is:  0.79
sin(37.50)^2 is:  0.37
cos(37.50)^2 is:  0.63
sum          is:  1.00
*/
