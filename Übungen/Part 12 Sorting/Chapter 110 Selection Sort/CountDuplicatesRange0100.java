public class CountDuplicatesRange0100 {

    public static void printDuplicates(int[] array) {
        int[] count = new int[101];

        for (int value : array) {
            if (value >= 0 && value <= 100) {
                count[value]++;
            }
        }

        System.out.println("Values that appear more than once:");
        for (int i = 0; i <= 100; i++) {
            if (count[i] > 1) {
                System.out.println(i + " appears " + count[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        int[] values = {5, 8, 5, 7, 12, 8, 8, 44, 100, 44, 0, 0};
        printDuplicates(values);
    }
}