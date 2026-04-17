public class CountDuplicatesUnsorted {

    public static int countDuplicates(int[] array) {
        int duplicateKinds = 0;

        for (int i = 0; i < array.length; i++) {
            boolean seenEarlier = false;

            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    seenEarlier = true;
                    break;
                }
            }

            if (seenEarlier) {
                continue;
            }

            boolean appearsAgain = false;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    appearsAgain = true;
                    break;
                }
            }

            if (appearsAgain) {
                duplicateKinds++;
            }
        }

        return duplicateKinds;
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 8, 2, 9, 3, 3, 11, 12, 12};

        System.out.println("Duplicate values = " + countDuplicates(values));
    }
}