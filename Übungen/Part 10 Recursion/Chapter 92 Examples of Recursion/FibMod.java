public class FibMod {
    public static int fibMod(int n, int mod) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1 % mod;
        int a = fibMod(n - 1, mod);
        int b = fibMod(n - 2, mod);
        return (a + b) % mod;
    }

    public static void main(String[] args) {
        int mod = 10;
        for (int i = 1; i <= 15; i++) {
            System.out.print(fibMod(i, mod) + " ");
        }
    }
}