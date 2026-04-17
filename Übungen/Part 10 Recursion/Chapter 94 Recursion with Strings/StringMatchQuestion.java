public class StringMatchQuestion {

    public static boolean match(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        return matchRec(a, b, 0);
    }

    private static boolean matchRec(String a, String b, int index) {
        if (index == a.length()) {
            return true;
        }

        char c1 = a.charAt(index);
        char c2 = b.charAt(index);

        boolean posMatches = (c1 == c2) || (c1 == '?') || (c2 == '?');

        if (!posMatches) {
            return false;
        }

        return matchRec(a, b, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(match("MOON", "M??N"));        // true
        System.out.println(match("W?zar?", "?izard"));    // true
        System.out.println(match("???", "???"));          // true
        System.out.println(match("??????snake", "rattle?????")); // true
    }
}