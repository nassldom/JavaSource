import java.math.BigInteger;

public class PrimeImproved {
    public static boolean isPrime(BigInteger N) {
        if (N.compareTo(BigInteger.TWO) < 0) return false;
        if (N.equals(BigInteger.TWO)) return true;

        if (N.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            return false;
        }

        BigInteger trial = BigInteger.valueOf(3);

        while (trial.multiply(trial).compareTo(N) <= 0) {
            if (N.mod(trial).equals(BigInteger.ZERO)) {
                return false;
            }
            trial = trial.add(BigInteger.TWO); // nur ungerade Teiler
        }
        return true;
    }
}