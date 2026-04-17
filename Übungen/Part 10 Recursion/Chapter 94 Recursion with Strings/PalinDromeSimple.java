public class PalinDromeSimple {

    public static boolean palindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        char first = s.charAt(0);
        char last  = s.charAt(s.length() - 1);

        if (first != last) {
            return false;
        }

        String middle = s.substring(1, s.length() - 1);
        return palindrome(middle);
    }

    public static void main(String[] args) {
        System.out.println(palindrome("abba"));   // true
        System.out.println(palindrome("abcba"));  // true
        System.out.println(palindrome("abca"));   // false
    }
}