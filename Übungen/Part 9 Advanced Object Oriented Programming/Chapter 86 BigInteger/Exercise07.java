import java.math.BigInteger;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("M  : ");
        BigInteger M = new BigInteger(scan.nextLine());
        System.out.print("N  : ");
        BigInteger N = new BigInteger(scan.nextLine());

        BigInteger gcd1 = gcdBySubtraction(M, N);
        BigInteger gcd2 = M.gcd(N);

        System.out.println("GCD (subtraction) = " + gcd1);
        System.out.println("GCD (BigInteger)  = " + gcd2);
    }

    public static BigInteger gcdBySubtraction(BigInteger M, BigInteger N) {
        M = M.abs();
        N = N.abs();

        if (M.equals(BigInteger.ZERO)) return N;
        if (N.equals(BigInteger.ZERO)) return M;

        while (!M.equals(N)) {
            if (M.compareTo(N) > 0) {
                M = M.subtract(N);
            } else {
                N = N.subtract(M);
            }
        }
        return M;
    }
}