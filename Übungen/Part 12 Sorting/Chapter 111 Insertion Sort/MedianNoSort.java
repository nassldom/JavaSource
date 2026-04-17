public class MedianNoSort {

    public static double medianNoSort(int[] array) {
        int n = array.length;

        if (n % 2 == 1) {
            int target = n / 2;

            for (int i = 0; i < n; i++) {
                int less = 0;
                int equal = 0;

                for (int j = 0; j < n; j++) {
                    if (array[j] < array[i]) less++;
                    if (array[j] == array[i]) equal++;
                }

                if (less <= target && target < less + equal) {
                    return array[i];
                }
            }
        } else {
            int leftIndex = n / 2 - 1;
            int rightIndex = n / 2;

            Integer leftValue = null;
            Integer rightValue = null;

            for (int i = 0; i < n; i++) {
                int less = 0;
                int equal = 0;

                for (int j = 0; j < n; j++) {
                    if (array[j] < array[i]) less++;
                    if (array[j] == array[i]) equal++;
                }

                if (leftValue == null && less <= leftIndex && leftIndex < less + equal) {
                    leftValue = array[i];
                }

                if (rightValue == null && less <= rightIndex && rightIndex < less + equal) {
                    rightValue = array[i];
                }
            }

            return (leftValue + rightValue) / 2.0;
        }

        return 0.0;
    }

    public static void main(String[] args) {
        int[] a = {9, 1, 7, 3, 5};
        int[] b = {9, 1, 7, 3, 5, 11};

        System.out.println("Median a = " + medianNoSort(a));
        System.out.println("Median b = " + medianNoSort(b));
    }
}