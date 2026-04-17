public class IsSortedModified {

    public static int countOut(int[] array) {
        int outOfOrder = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                outOfOrder++;
            }
        }

        return outOfOrder;
    }

    public static double percentSorted(int[] array) {
        if (array.length < 2) {
            return 100.0;
        }

        int totalPairs = array.length - 1;
        int outOfOrder = countOut(array);
        int inOrder = totalPairs - outOfOrder;

        return 100.0 * inOrder / totalPairs;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};
        int[] c = {1, 3, 2, 4, 6, 5};

        System.out.println("a countOut = " + countOut(a));
        System.out.println("a percentSorted = " + percentSorted(a));

        System.out.println("b countOut = " + countOut(b));
        System.out.println("b percentSorted = " + percentSorted(b));

        System.out.println("c countOut = " + countOut(c));
        System.out.println("c percentSorted = " + percentSorted(c));
    }
}