public class InsertionSortRight {

    public static void insertionSortRight(int[] list) {
        for (int i = list.length - 2; i >= 0; i--) {
            int temp = list[i];
            int j = i;

            while (j < list.length - 1 && list[j + 1] < temp) {
                list[j] = list[j + 1];
                j++;
            }

            list[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 6, 1, 9, 2, 5};

        insertionSortRight(values);

        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}