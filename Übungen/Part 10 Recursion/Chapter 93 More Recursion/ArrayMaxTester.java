public class ArrayMaxTester {
    public static int max(int[] array) {
        return max(array, 0);
    }

    public static int max(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }

        int maxOfRest = max(array, index + 1);

        if (array[index] > maxOfRest) {
            return array[index];
        } else {
            return maxOfRest;
        }
    }

    public static void main(String[] args) {
        int[] testArray = {4, 7, 2, 9, 5};
        System.out.println("Max = " + max(testArray));
    }
}