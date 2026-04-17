public class StringRecExercises2 {

    public static String removeVowels(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        char c = s.charAt(0);
        String rest = removeVowels(s.substring(1));

        if (isVowel(c)) {
            return rest;
        } else {
            return c + rest;
        }
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("counterrevolutionaries")); // cntrrvltnrs
        System.out.println(removeVowels("AUDIOBOOK"));              // DBK
    }
}