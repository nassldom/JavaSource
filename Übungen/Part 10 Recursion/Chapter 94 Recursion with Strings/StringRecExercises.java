public class StringRecExercises {

    public static int countChar(String s, char ch) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int countHere = (s.charAt(0) == ch) ? 1 : 0;
        return countHere + countChar(s.substring(1), ch);
    }

    public static void main(String[] args) {
        System.out.println(countChar("XaaaYaaaZaaaYaaaaY", 'Y')); // 3
    }
}