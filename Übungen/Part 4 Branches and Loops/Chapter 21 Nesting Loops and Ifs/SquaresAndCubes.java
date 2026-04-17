import java.util.Scanner;

public class SquaresAndCubes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Upper Limit: ");
        int n = in.nextInt();

        long sumSquares = 0;
        long sumCubes   = 0;

        for (int i = 1; i <= n; i++) {
            sumSquares += (long) i * i;
            sumCubes   += (long) i * i * i;
        }

        long formulaSquares = (long) n * (n + 1) * (2L * n + 1) / 6;
        long formulaCubes   = (long) n * n * (long) (n + 1) * (n + 1) / 4;

        System.out.println("The sum of Squares is  " + sumSquares);
        System.out.println("The sum of Cubes   is  " + sumCubes);
        System.out.println("Formula Squares    =  " + formulaSquares);
        System.out.println("Formula Cubes      =  " + formulaCubes);
    }
}