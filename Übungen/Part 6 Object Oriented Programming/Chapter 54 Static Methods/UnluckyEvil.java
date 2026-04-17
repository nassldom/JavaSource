public class UnluckyEvil {
    public static void main(String[] args) {
        long limit = 1000; // oder vom Benutzer einlesen

        for (long i = 0; i <= limit; i++) {
            if (UnluckyNumbers.isUnlucky(i) && !OdiousEvil.isOdious(i)) {
                System.out.println(i + " is unlucky and evil");
            }
        }
    }
}