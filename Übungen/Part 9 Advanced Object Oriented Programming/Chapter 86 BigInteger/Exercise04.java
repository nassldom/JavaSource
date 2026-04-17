import java.math.BigInteger;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N  : ");
        long N = scan.nextLong();

        long longFact = factorialLong(N);
        BigInteger bigFact = factorialBig(BigInteger.valueOf(N));

        System.out.println("Long Factorial: " + longFact);
        System.out.println("Big  Factorial: " + bigFact);

        System.out.print("R  : ");
        long R = scan.nextLong();

        BigInteger comb = combinations(N, R);
        System.out.println(N + " things taken " + R + " at a time = " + comb);
    }

    public static long factorialLong(long n) {
        if (n < 0) return -1;
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static BigInteger factorialBig(BigInteger n) {
        if (n.signum() < 0) return BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        BigInteger result = one;
        for (BigInteger i = one; i.compareTo(n) <= 0; i = i.add(one)) {
            result = result.multiply(i);
        }
        return result;
    }

    public static BigInteger combinations(long n, long r) {
        if (r < 0 || r > n) return BigInteger.ZERO;

        long k = Math.max(r, n - r);   // größerer von r, n-r
        long numStart = k + 1;         // Zähler startet bei k+1
        long numEnd   = n;             // Zähler geht bis n
        long denomEnd = n - k;         // Nenner geht von 1..(n-k)

        BigInteger numerator = BigInteger.ONE;
        for (long i = numStart; i <= numEnd; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }

        BigInteger denominator = BigInteger.ONE;
        for (long i = 1; i <= denomEnd; i++) {
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }

        return numerator.divide(denominator);
    }
}