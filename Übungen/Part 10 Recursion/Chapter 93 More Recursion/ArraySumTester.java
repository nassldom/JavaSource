public class ArraySumTester {
    public static int sum(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + sum(array, index + 1);
    }

    public static void main(String[] args) {
        int[] testArray = {4, 7, 2, 9, 5};
        System.out.println("Sum = " + sum(testArray, 0));
    }
}