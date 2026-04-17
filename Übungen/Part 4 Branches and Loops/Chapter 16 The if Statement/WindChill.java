import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Wind Speed: ");
        double v      = in.nextDouble();
        System.out.print("Enter Temperature: ");
        double temp   = in.nextDouble();

        double wci = temp; // default

        if (v >= 3 && temp <= 50.0) {
            wci = 35.74 + 0.6215 * temp
                - 35.75 * Math.pow(v, 0.16)
                + 0.4275 * temp * Math.pow(v, 0.16);
        }

        System.out.println("Wind Chill: " + wci);
    }
}
