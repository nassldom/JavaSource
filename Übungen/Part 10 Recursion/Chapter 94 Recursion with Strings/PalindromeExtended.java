public class PalindromeExtended {

    public static boolean palindromeExtended(String s) {
        return palRec(s, 0, s.length() - 1);
    }

    private static boolean palRec(String s, int left, int right) {
        while (left <= right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        while (left <= right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

        if (left >= right) {
            return true;
        }

        char cLeft  = Character.toLowerCase(s.charAt(left));
        char cRight = Character.toLowerCase(s.charAt(right));

        if (cLeft != cRight) {
            return false;
        }

        return palRec(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println(palindromeExtended("Ah! Satan sees Natasha."));       // true
        System.out.println(palindromeExtended("Eva, can I see bees in a cave?"));// true
        System.out.println(palindromeExtended("Was it a car or a cat I saw?"));  // true
        System.out.println(palindromeExtended("Not a palindrome."));            // false
    }
}