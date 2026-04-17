public class EqualIgnoreVowels {

    public static boolean equalIgnoreVowels(String a, String b) {
        return equalRec(a, 0, b, 0);
    }

    private static boolean equalRec(String a, int i, String b, int j) {
        while (i < a.length() && isVowel(a.charAt(i))) i++;
        while (j < b.length() && isVowel(b.charAt(j))) j++;

        boolean endA = i >= a.length();
        boolean endB = j >= b.length();

        if (endA && endB) {
            return true;
        }

        if (endA) {
            return restAllVowels(b, j);
        }
        if (endB) {
            return restAllVowels(a, i);
        }

        if (a.charAt(i) != b.charAt(j)) {
            return false;
        }

        return equalRec(a, i + 1, b, j + 1);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
    }

    private static boolean restAllVowels(String s, int pos) {
        for (int k = pos; k < s.length(); k++) {
            if (!isVowel(s.charAt(k))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(equalIgnoreVowels("kangaroo", "kongeroo")); // true
        System.out.println(equalIgnoreVowels("kangaroo", "kaangaro")); // true
        System.out.println(equalIgnoreVowels("kangaroo", "kngr"));     // true
    }
}