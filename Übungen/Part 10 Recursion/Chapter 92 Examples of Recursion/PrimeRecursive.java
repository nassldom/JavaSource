public class PrimeRecursive {
    public static boolean prime(int n) {
        if (n < 2) return false;
        return prime(n, 2);
    }

    private static boolean prime(int n, int d) {
        if (d * d > n) {
            return true;
        }
        if (n % d == 0) {
            return false;
        }
        return prime(n, d + 1);
    }

    public static void main(String[] args) {
        System.out.println(prime(7));   // true
        System.out.println(prime(35));  // false
        System.out.println(prime(12007)); // Vorsicht: viele Rekursionsschritte
    }
}