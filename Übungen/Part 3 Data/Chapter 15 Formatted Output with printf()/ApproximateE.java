import java.util.Scanner;

public class ApproximateE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = input.nextDouble();

        double value = Math.pow(1.0 + 1.0 / x, x);

        System.out.printf("Approximation to e: %.7f%n", value);

        input.close();
    }
}
/*
Enter x: 40000
Approximation to e: 2.7182479
*/