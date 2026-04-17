public class EqualX {

    public static boolean equalX(String a, String b) {
        return equalXRec(a, b, 0, 0);
    }

    private static boolean equalXRec(String a, String b, int i, int j) {
        boolean endA = i >= a.length();
        boolean endB = j >= b.length();

        if (endA && endB) {
            return true;
        }

        if (endA) {
            return noXInPrefix(b, j);
        }

        if (endB) {
            return noXInPrefix(a, i);
        }

        char cA = a.charAt(i);
        char cB = b.charAt(j);

        if (cA == 'X' && cB == 'X') {
            return equalXRec(a, b, i + 1, j + 1);
        }

        if (cA == 'X' && cB != 'X') return false;
        if (cA != 'X' && cB == 'X') return false;

        return equalXRec(a, b, i + 1, j + 1);
    }

    private static boolean noXInPrefix(String s, int start) {
        for (int k = start; k < s.length(); k++) {
            if (s.charAt(k) == 'X') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(equalX("X", "X"));                   // true
        System.out.println(equalX("aaaXaaaX", "abcXcbaX"));     // true
        System.out.println(equalX("XaXbXcX", "XtXoXpXdef"));    // true
        System.out.println(equalX("XaXbXcX", "XtXoXpXdXf"));    // false
        System.out.println(equalX("XXXX", "XX"));               // false
        System.out.println(equalX("aXaXbXcX", "XtXoXpX"));      // false
    }
}