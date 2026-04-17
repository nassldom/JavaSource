import java.util.Scanner;

public class ExSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scan.nextDouble();

        double sum = 1.0;              // first term = 1
        double term = 1.0;
        int n = 0;

        while (true) {
            n++;
            term = term * x / n;       // term = previous term * x/n
            sum = sum + term;

            if (Math.abs(term) < 1.0E-12) {
                break;
            }

            System.out.println("n:" + n +
                "     term: " + term +
                "               sum: " + sum);
        }

        System.out.println("my   e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));
    }
}