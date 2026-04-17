import java.util.Random;

public class ReverseTester {
    private static final String CHARS = "abcdefghijklmnopqrstuvwxyz ";

    public static String randomString(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARS.charAt(rand.nextInt(CHARS.length())));
        }
        return sb.toString();
    }

    public static String reverseWithBuffer(String s) {
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        return buffer.toString();
    }

    public static String reverseWithStrings(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i); // sehr ineffizient
        }
        return result;
    }

    public static void main(String[] args) {
        String text = randomString(1000);
        int times = 1000;

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            reverseWithBuffer(text);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuffer reverse: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            reverseWithStrings(text);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("String-only reverse: " + (end2 - start2) + " ms");
    }
}