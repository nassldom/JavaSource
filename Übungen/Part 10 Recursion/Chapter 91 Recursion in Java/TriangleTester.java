import java.util.Scanner;

public class TriangleTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("N must be positive.");
        } else {
            TriangleCalc calc = new TriangleCalc();
            System.out.println("Triangle(" + n + ") = " + calc.triangle(n));
        }
    }
}

class TriangleCalc {
    public int triangle(int n) {
        if (n == 1)
            return 1;
        else
            return n + triangle(n - 1);
    }
}