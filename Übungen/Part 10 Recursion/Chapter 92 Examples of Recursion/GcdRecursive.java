public class GcdRecursive {
    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(6, 9));   // 3
        System.out.println(gcd(25, 55)); // 5
    }
}