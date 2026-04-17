public class SortDoublesPrefix {

    public static void insertionSort(double[] list, int prefix) {
        if (prefix > list.length) {
            prefix = list.length;
        }

        for (int i = 1; i < prefix; i++) {
            double temp = list[i];
            int j = i;

            while (j > 0 && list[j - 1] > temp) {
                list[j] = list[j - 1];
                j--;
            }

            list[j] = temp;
        }
    }

    public static void main(String[] args) {
        double[] values = {8.4, 2.1, 9.7, 3.3, 1.0, 6.2};

        insertionSort(values, 4);

        for (double v : values) {
            System.out.print(v + " ");
        }
    }
}