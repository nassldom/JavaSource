public class TriFibonacci {
    public static long kFib(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2 || n == 3) return 1;
        return kFib(n - 1) + kFib(n - 2) + kFib(n - 3);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(kFib(i) + " ");
        }
    }
}