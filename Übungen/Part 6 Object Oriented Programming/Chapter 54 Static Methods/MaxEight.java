public class MaxEight {
    public static int maxEight(int a, int b, int c, int d,
                               int e, int f, int g, int h) {

        int max1, max2, max3, max4;

        if (a > b) max1 = a; else max1 = b;           // 1
        if (c > d) max2 = c; else max2 = d;           // 2
        if (e > f) max3 = e; else max3 = f;           // 3
        if (g > h) max4 = g; else max4 = h;           // 4

        int maxLeft;
        if (max1 > max2) maxLeft = max1; else maxLeft = max2;  // 5

        int maxRight;
        if (max3 > max4) maxRight = max3; else maxRight = max4; // 6

        int max;
        if (maxLeft > maxRight) max = maxLeft; else max = maxRight; // 7

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxEight(1, 5, 3, 7, 2, 9, 4, 6)); // 9
    }
}